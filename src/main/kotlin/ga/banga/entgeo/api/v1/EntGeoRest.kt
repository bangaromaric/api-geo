package ga.banga.entgeo.api.v1

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.exceptions.ResourceNotFoundException
import ga.banga.entgeo.domain.mapper.EntGeoMapper
import ga.banga.entgeo.services.IServices
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest


@CrossOrigin(origins = ["*"])
@Tag( name = "Utilitaire", description = "") // it description of api at top  http://localhost:8080/swagger-ui.html
@RestController
@RequestMapping("api/v1/")
class EntGeoRest {
    @Autowired
    lateinit var iServices: IServices

    @Autowired
    lateinit var entGeoMapper: EntGeoMapper



//    @Operation(summary = "Liste EntGeos", description = "Permet de lister les pays, province") //it description of api
//    @ApiResponses(value = [
//        ApiResponse(responseCode = "200", description = "EntGeo trouvés", content = [
//            (Content(mediaType = "application/json", array = (
//                    ArraySchema(schema = Schema(implementation = EntGeo::class)))))]),
//        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
//        ApiResponse(responseCode = "404", description = "Did not find any entgeo", content = [Content()])]
//    )
//    @GetMapping("entgeos")
//    fun entGeos(): ResponseEntity<Collection<EntGeo>> {
//    val result = iServices.findEntGeos()
//        return  if  (result.isEmpty())
//                    ResponseEntity(result,HttpStatus.NO_CONTENT)
//                else
//                    ResponseEntity(result,HttpStatus.OK)
//    }


//    @Operation(summary = "rechercher par le nom de ville")
//    @GetMapping(value = ["entgeo/nom/{nom}"])
//    fun getEntGeosByNomContaining(@Parameter(description = "nom de la ville")
//                                  @PathVariable nom: String): Collection<EntGeo> {
//        val type: TypeEntGeo = iServices.findTypeEntGeoByNom("Ville").orElseThrow()
//        return iServices.findEntGeosByNomContaining(nom, type)
//    }

//    @Operation(summary = "recherche par id")
//    @GetMapping("entgeo/{id}")
//    fun getEntGeoById(@Parameter(description = "son id")
//                      @PathVariable(value = "id") id: Long, request : HttpServletRequest): ResponseEntity<EntGeo> {
//
//
//        return iServices.findEntGeoById(id)
//            .map { oldValue -> ResponseEntity<EntGeo>(oldValue, HttpStatus.OK) }
//            .orElseThrow { ResourceNotFoundException("Ressource not found on :: $id") }
//    }


    @Operation(summary = "liste des entites geographiques en fonction du parent id")
    @GetMapping("entgeos/parent/{id}")
    fun getEntGeosByParent(@PathVariable(value = "id") id: Long,
                           @RequestParam(defaultValue ="true or false") parent: Boolean = false):  ResponseEntity<Collection<Any>> {
        //verifie sur id existe
        return iServices.findEntGeoById(id)
            .map { oldValue ->
                  val result = if (parent) iServices.findEntGeosByParent(oldValue) else entGeoMapper.entGeosToEntGeosDto(iServices.findEntGeosByParent(oldValue))
                if (result.isNotEmpty())
                    ResponseEntity<Collection<Any>>(result, HttpStatus.OK)
                else
                    ResponseEntity<Collection<Any>>(HttpStatus.NO_CONTENT)
            }
            .orElseThrow { ResourceNotFoundException("Ressource non trouvée avec comme id: $id") }
    }





//    @ApiOperation(value = "Ajout d'un EntGeo")
//    @PostMapping(value = ["entgeo/add"])
//    fun addEntGeo(@RequestBody entGeo: @Valid EntGeo): ResponseEntity<EntGeo> {
//        val newObjject: EntGeo = iServices.insertEntGeo(entGeo)
//        return ResponseEntity(newObjject, HttpStatus.CREATED)
//    }

//    @ApiOperation(value = "modification d'un EntGeo")
 /*   @PutMapping(value = ["entgeo/{id}"])
    fun updateEntGeo(
        @PathVariable(value = "id") uuid: UUID,
        @RequestBody newObject: @Valid EntGeo
    ): ResponseEntity<EntGeo> {
        return iServices.findEntGeoById(uuid)
            .map { oldValue ->
                oldValue.nom = newObject.nom
                oldValue.parent = newObject.parent
                oldValue.typeEntGeo = newObject.typeEntGeo
                iServices.insertEntGeo(oldValue)
                ResponseEntity<EntGeo>(oldValue, HttpStatus.OK)
            }
            .orElseThrow { ResourceNotFoundException("Ressource not found on :: $uuid") }
    }

  */

//    @ApiOperation(value = "suppression d'un EntGeo")
 /*   @DeleteMapping(value = ["entgeo/{id}"])
    fun delEntGeo(@PathVariable id: UUID): ResponseEntity<String> {
        return iServices.findEntGeoById(id)
            .map { entGeo ->
                iServices.deleteEntGeoById(id)
                ResponseEntity<String>("ok", HttpStatus.OK)
            }
            .orElseThrow { ResourceNotFoundException("Ressource not found on :: $id") }
    }

  */
}

