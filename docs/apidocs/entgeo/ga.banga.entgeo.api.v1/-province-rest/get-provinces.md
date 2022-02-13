//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[ProvinceRest](index.md)/[getProvinces](get-provinces.md)

# getProvinces

[jvm]\

@GetMapping(value = ["provinces"])

fun [getProvinces](get-provinces.md)(@RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Cette methode est utilisee pour retouner toutes les provinces avec parent ou non.

[parent](get-provinces.md) donne la possibilite de specifier si les parents sont inclues dans le retour

#### Return

une collection d'entgeo ou entgeoDto
