//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[DepartementRest](index.md)

# DepartementRest

[jvm]\
@CrossOrigin(origins = ["*"])

@RestController

@RequestMapping(value = ["api/v1/"])

class [DepartementRest](index.md)

Cette classe est responsable de l'affichage des villes

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [DepartementRest](-departement-rest.md) | [jvm]<br>fun [DepartementRest](-departement-rest.md)() |

## Functions

| Name | Summary |
|---|---|
| [getDepartement](get-departement.md) | [jvm]<br>@GetMapping(value = ["departements"])<br>fun [getDepartement](get-departement.md)(@RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour retouner toutes les departements avec parent ou non. |
| [getEntGeoById](get-ent-geo-by-id.md) | [jvm]<br>@GetMapping(value = ["departement/{id}"])<br>fun [getEntGeoById](get-ent-geo-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour retouner une departements en fonction de son ID. [parent](get-ent-geo-by-id.md) donne la possibilite de specifier si les parents sont inclues dans le retour. |

## Properties

| Name | Summary |
|---|---|
| [entGeoMapper](ent-geo-mapper.md) | [jvm]<br>@Autowired<br>lateinit var [entGeoMapper](ent-geo-mapper.md): [EntGeoMapper](../../ga.banga.entgeo.domain.mapper/-ent-geo-mapper/index.md) |
| [iServices](i-services.md) | [jvm]<br>@Autowired<br>lateinit var [iServices](i-services.md): [IServices](../../ga.banga.entgeo.services/-i-services/index.md) |
