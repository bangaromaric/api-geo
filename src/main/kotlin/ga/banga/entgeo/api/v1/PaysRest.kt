package ga.banga.entgeo.api.v1

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.exceptions.ResourceNotFoundException
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
@Tag(name = "Pays", description = "") // it description of api at top  http://localhost:8080/swagger-ui.html
@RestController
@RequestMapping("api/v1/")
class PaysRest {
    @Autowired
    lateinit var iServices: IServices


    /**
     * Cette methode est utilisee pour retouner toutes les pays avec parent ou non.
     *
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "Liste des pays", description = "") //it description of api
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200", description = "pays trouvés", content = [
                    (Content(
                        mediaType = "application/json", array = (
                                ArraySchema(schema = Schema(implementation = EntGeo::class)))
                    ))]
            ),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
            ApiResponse(responseCode = "404", description = "Did not find any Pays", content = [Content()])]
    )
    @GetMapping("pays")
    fun getPays(): Collection<EntGeo> {
        return iServices.findEntGeosByParentIsNull()
    }


    /**
     * Cette methode est utilisee pour retouner une pays en fonction de son ID.
     * [parent] donne la possibilite de specifier si les parents sont inclues dans le retour
     * @return une collection d'entgeo ou entgeoDto
     */
    @Operation(summary = "recherche par id")
    @GetMapping("pays/{id}")
    fun getPaysById(
        @Parameter(description = "son id")
        @PathVariable(value = "id") id: Long, request: HttpServletRequest
    ): ResponseEntity<EntGeo> {
        return iServices.findByIdAndTypeEntGeo_Nom(id, "Pays")
            .map { oldValue -> ResponseEntity<EntGeo>(oldValue, HttpStatus.OK) }
            .orElseThrow { ResourceNotFoundException("Pays non trouvé avec comme id: $id") }
    }

}

