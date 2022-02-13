//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[EntGeoRest](index.md)

# EntGeoRest

[jvm]\
@CrossOrigin(origins = ["*"])

@RestController

@RequestMapping(value = ["api/v1/"])

class [EntGeoRest](index.md)

Cette classe est responsable de l'affichage des villes

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [EntGeoRest](-ent-geo-rest.md) | [jvm]<br>fun [EntGeoRest](-ent-geo-rest.md)() |

## Functions

| Name | Summary |
|---|---|
| [getEntGeosByParent](get-ent-geos-by-parent.md) | [jvm]<br>@GetMapping(value = ["entgeos/parent/{id}"])<br>fun [getEntGeosByParent](get-ent-geos-by-parent.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;&gt;<br>Cette methode permet de lister des entites geographiques en fonction du parent id. |

## Properties

| Name | Summary |
|---|---|
| [entGeoMapper](ent-geo-mapper.md) | [jvm]<br>@Autowired<br>lateinit var [entGeoMapper](ent-geo-mapper.md): [EntGeoMapper](../../ga.banga.entgeo.domain.mapper/-ent-geo-mapper/index.md) |
| [iServices](i-services.md) | [jvm]<br>@Autowired<br>lateinit var [iServices](i-services.md): [IServices](../../ga.banga.entgeo.services/-i-services/index.md) |
