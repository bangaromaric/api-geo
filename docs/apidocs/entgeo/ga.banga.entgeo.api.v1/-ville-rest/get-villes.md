//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[VilleRest](index.md)/[getVilles](get-villes.md)

# getVilles

[jvm]\

@GetMapping(value = ["villes"])

fun [getVilles](get-villes.md)(@RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Cette methode est utilisee pour retouner toutes les villes avec parent ou non.

[parent](get-villes.md) donne la possibilite de specifier si les parents sont inclues dans le retour.

#### Return

une collection d'entgeo ou entgeoDto
