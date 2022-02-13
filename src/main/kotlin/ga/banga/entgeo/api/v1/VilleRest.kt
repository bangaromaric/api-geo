package ga.banga.entgeo.api.v1

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.exceptions.ResourceNotFoundException
import ga.banga.entgeo.domain.mapper.EntGeoMapper
import ga.banga.entgeo.services.IServices
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

/**
 * Cette classe est responsable de l'affichage des villes
 * @author Romaric BANGA
 * @since 2/13/22
 * @version 1.0
 */
@CrossOrigin(origins = ["*"])
@Tag( name = "Ville", description = "") // it description of api at top  http://localhost:8080/swagger-ui.html
@RestController
@RequestMapping("api/v1/")
class VilleRest {

    /**
     * il permet de faire des appels vers les repositories
     */
    @Autowired
    lateinit var iServices: IServices

    /**
     * il permet de faire des transformations sur l'entite Entgeo. voir [EntGeoMapper] pour plus de detail.
     */
    @Autowired
    lateinit var entGeoMapper: EntGeoMapper


    /**
     * Cette methode est utilisee pour retouner toutes les villes avec parent ou non.
     *
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour.
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "Liste des villes", description = "") //it description of api
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "ville trouvées", content = [
            (Content(mediaType = "application/json", array = (
                    ArraySchema(schema = Schema(implementation = EntGeo::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "404", description = "Did not find any ville", content = [Content()])]
    )
    @GetMapping("villes")
    fun getVilles(@RequestParam(defaultValue ="true or false") parent: Boolean = false): Collection<Any> {
        return if (parent) iServices.findByTypeEntGeo_Nom("Ville") else entGeoMapper.entGeosToEntGeosDto(iServices.findByTypeEntGeo_Nom("Ville"))
    }

    /**
     * Cette methode est utilisee pour retouner une ville en fonction de son ID.
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "recherche par id")
    @GetMapping("ville/{id}")
    fun getVilleById(@Parameter(description = "son id")
                      @PathVariable(value = "id") id: Long, @RequestParam(defaultValue ="true or false") parent: Boolean = false): ResponseEntity<Any> {
        return iServices.findByIdAndTypeEntGeo_Nom(id,"Ville")
            .map { oldValue -> if (parent) ResponseEntity<Any>(oldValue, HttpStatus.OK) else ResponseEntity<Any>(entGeoMapper.entGeoToEntGeoDto(oldValue), HttpStatus.OK) }
            .orElseThrow { ResourceNotFoundException("Ville non trouvée avec comme id: $id") }
    }

    /**
     * Cette methode est utilisee pour rechercher une ou des villes en fonction de son Nom.
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "rechercher par le nom de la ville")
    @GetMapping(value = ["ville/nom/{nom}"])
    fun getVilleByNomContaining(@Parameter(description = "nom de la ville")
                                  @PathVariable nom: String,
                                  @RequestParam(defaultValue ="true or false") parent: Boolean = false): Collection<Any> {
        return if (parent) iServices.findByNomContainingIgnoreCaseAndTypeEntGeo_Nom(nom,"Ville") else entGeoMapper.entGeosToEntGeosDto(iServices.findByNomContainingIgnoreCaseAndTypeEntGeo_Nom(nom,"Ville"))

    }

}

