package ga.banga.entgeo.api.v1

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.exceptions.ResourceNotFoundException
import ga.banga.entgeo.domain.mapper.EntGeoMapper
import ga.banga.entgeo.domain.services.IServices
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

/**
 * Cette classe est responsable de l'affichage des villes
 * @author Romaric BANGA
 * @since 2/13/22
 * @version 1.0
 */
@CrossOrigin(origins = ["*"])
@Tag(name = "Province", description = "") // it description of api at top  http://localhost:8080/swagger-ui.html
@RestController
@RequestMapping("api/v1/")
class ProvinceRest {
    @Autowired
    lateinit var iServices: IServices

    @Autowired
    lateinit var entGeoMapper: EntGeoMapper


    /**
     * Cette methode est utilisee pour retouner toutes les provinces avec parent ou non.
     *
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "Liste des Provinces", description = "") //it description of api
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200", description = "Province trouvées", content = [
                    (Content(
                        mediaType = "application/json", array = (
                                ArraySchema(schema = Schema(implementation = EntGeo::class)))
                    ))]
            ),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
            ApiResponse(responseCode = "404", description = "Did not find any Province", content = [Content()])]
    )
    @GetMapping("provinces")
    fun getProvinces(@RequestParam(defaultValue = "true or false") parent: Boolean = false): Collection<Any> {
        return if (parent) iServices.findByTypeEntGeo_Nom("Province") else entGeoMapper.entGeosToEntGeosDto(
            iServices.findByTypeEntGeo_Nom(
                "Province"
            )
        )
    }

    /**
     * Cette methode est utilisee pour retouner une provinces en fonction de son ID.
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "recherche par id")
    @GetMapping("province/{id}")
    fun getProvinceById(
        @Parameter(description = "son id")
        @PathVariable(value = "id") id: Long,
        @RequestParam(defaultValue = "true or false") parent: Boolean = false
    ): ResponseEntity<Any> {
        return iServices.findByIdAndTypeEntGeo_Nom(id, "Province")
            .map { oldValue ->
                if (parent) ResponseEntity<Any>(oldValue, HttpStatus.OK) else ResponseEntity<Any>(
                    entGeoMapper.entGeoToEntGeoDto(oldValue),
                    HttpStatus.OK
                )
            }
            .orElseThrow { ResourceNotFoundException("Province non trouvée avec comme id: $id") }
    }

}

