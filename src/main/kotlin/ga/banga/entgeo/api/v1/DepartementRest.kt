package ga.banga.entgeo.api.v1

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.entities.TypeEntGeo
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


@CrossOrigin(origins = ["*"])
@Tag( name = "Département", description = "") // it description of api at top  http://localhost:8080/swagger-ui.html
@RestController
@RequestMapping("api/v1/")
class DepartementRest {
    @Autowired
    lateinit var iServices: IServices

    @Autowired
    lateinit var entGeoMapper: EntGeoMapper


    @Operation(summary = "Liste des departements", description = "") //it description of api
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "departement trouvées", content = [
            (Content(mediaType = "application/json", array = (
                    ArraySchema(schema = Schema(implementation = EntGeo::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "404", description = "Did not find any departements", content = [Content()])]
    )
    @GetMapping("departements")
    fun getDepartement(@RequestParam(defaultValue ="true or false") parent: Boolean = false): Collection<Any> {
        return if (parent) iServices.findByTypeEntGeo_Nom("Département") else entGeoMapper.entGeosToEntGeosDto(iServices.findByTypeEntGeo_Nom("Département"))
    }

    @Operation(summary = "recherche par id")
    @GetMapping("departement/{id}")
    fun getEntGeoById(@Parameter(description = "son id")
                      @PathVariable(value = "id") id: Long,
                      @RequestParam(defaultValue ="true or false") parent: Boolean = false): ResponseEntity<Any> {
        return iServices.findByIdAndTypeEntGeo_Nom(id,"Département")
            .map { oldValue -> if (parent) ResponseEntity<Any>(oldValue, HttpStatus.OK) else ResponseEntity<Any>(entGeoMapper.entGeoToEntGeoDto(oldValue), HttpStatus.OK) }
            .orElseThrow { ResourceNotFoundException("Département non trouvée avec comme id: $id") }
    }

}

