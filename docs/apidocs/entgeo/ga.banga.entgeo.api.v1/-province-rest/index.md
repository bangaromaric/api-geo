//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[ProvinceRest](index.md)

# ProvinceRest

[jvm]\
@CrossOrigin(origins = ["*"])

@RestController

@RequestMapping(value = ["api/v1/"])

class [ProvinceRest](index.md)

Cette classe est responsable de l'affichage des villes

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [ProvinceRest](-province-rest.md) | [jvm]<br>fun [ProvinceRest](-province-rest.md)() |

## Functions

| Name | Summary |
|---|---|
| [getProvinceById](get-province-by-id.md) | [jvm]<br>@GetMapping(value = ["province/{id}"])<br>fun [getProvinceById](get-province-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour retouner une provinces en fonction de son ID. [parent](get-province-by-id.md) donne la possibilite de specifier si les parents sont inclues dans le retour |
| [getProvinces](get-provinces.md) | [jvm]<br>@GetMapping(value = ["provinces"])<br>fun [getProvinces](get-provinces.md)(@RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;<br>Cette methode est utilisee pour retouner toutes les provinces avec parent ou non. |

## Properties

| Name | Summary |
|---|---|
| [entGeoMapper](ent-geo-mapper.md) | [jvm]<br>@Autowired<br>lateinit var [entGeoMapper](ent-geo-mapper.md): [EntGeoMapper](../../ga.banga.entgeo.domain.mapper/-ent-geo-mapper/index.md) |
| [iServices](i-services.md) | [jvm]<br>@Autowired<br>lateinit var [iServices](i-services.md): [IServices](../../ga.banga.entgeo.services/-i-services/index.md) |
