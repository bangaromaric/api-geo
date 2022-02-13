//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[ProvinceRest](index.md)/[getProvinceById](get-province-by-id.md)

# getProvinceById

[jvm]\

@GetMapping(value = ["province/{id}"])

fun [getProvinceById](get-province-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Cette methode est utilisee pour retouner une provinces en fonction de son ID. [parent](get-province-by-id.md) donne la possibilite de specifier si les parents sont inclues dans le retour

#### Return

une collection d'entgeo ou entgeoDto
