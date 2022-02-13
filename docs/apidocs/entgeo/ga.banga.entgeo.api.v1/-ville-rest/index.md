//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[VilleRest](index.md)

# VilleRest

[jvm]\
@CrossOrigin(origins = ["*"])

@RestController

@RequestMapping(value = ["api/v1/"])

class [VilleRest](index.md)

Cette classe est responsable de l'affichage des villes

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [VilleRest](-ville-rest.md) | [jvm]<br>fun [VilleRest](-ville-rest.md)() |

## Functions

| Name | Summary |
|---|---|
| [getVilleById](get-ville-by-id.md) | [jvm]<br>@GetMapping(value = ["ville/{id}"])<br>fun [getVilleById](get-ville-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour retouner une ville en fonction de son ID. [parent](get-ville-by-id.md) donne la possibilite de specifier si les parents sont inclues dans le retour |
| [getVilleByNomContaining](get-ville-by-nom-containing.md) | [jvm]<br>@GetMapping(value = ["ville/nom/{nom}"])<br>fun [getVilleByNomContaining](get-ville-by-nom-containing.md)(@PathVariablenom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour rechercher une ou des villes en fonction de son Nom. [parent](get-ville-by-nom-containing.md) donne la possibilite de specifier si les parents sont inclues dans le retour |
| [getVilles](get-villes.md) | [jvm]<br>@GetMapping(value = ["villes"])<br>fun [getVilles](get-villes.md)(@RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour retouner toutes les villes avec parent ou non. |

## Properties

| Name | Summary |
|---|---|
| [entGeoMapper](ent-geo-mapper.md) | [jvm]<br>@Autowired<br>lateinit var [entGeoMapper](ent-geo-mapper.md): [EntGeoMapper](../../ga.banga.entgeo.domain.mapper/-ent-geo-mapper/index.md)<br>il permet de faire des transformations sur l'entite Entgeo. voir [EntGeoMapper](../../ga.banga.entgeo.domain.mapper/-ent-geo-mapper/index.md) pour plus de detail. |
| [iServices](i-services.md) | [jvm]<br>@Autowired<br>lateinit var [iServices](i-services.md): [IServices](../../ga.banga.entgeo.services/-i-services/index.md)<br>il permet de faire des appels vers les repositories |
