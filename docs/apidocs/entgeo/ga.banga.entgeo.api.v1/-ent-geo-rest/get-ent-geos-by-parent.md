//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[EntGeoRest](index.md)/[getEntGeosByParent](get-ent-geos-by-parent.md)

# getEntGeosByParent

[jvm]\

@GetMapping(value = ["entgeos/parent/{id}"])

fun [getEntGeosByParent](get-ent-geos-by-parent.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): ResponseEntity&lt;[Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;&gt;

Cette methode permet de lister des entites geographiques en fonction du parent id.

[parent](get-ent-geos-by-parent.md) donne la possibilite de specifier si les parents sont inclues dans le retour.

#### Return

une collection d'entgeo ou entgeoDto
