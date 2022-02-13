//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[DepartementRest](index.md)/[getEntGeoById](get-ent-geo-by-id.md)

# getEntGeoById

[jvm]\

@GetMapping(value = ["departement/{id}"])

fun [getEntGeoById](get-ent-geo-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Cette methode est utilisee pour retouner une departements en fonction de son ID. [parent](get-ent-geo-by-id.md) donne la possibilite de specifier si les parents sont inclues dans le retour.

#### Return

une collection d'entgeo ou entgeoDto
