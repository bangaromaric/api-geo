//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[DepartementRest](index.md)/[getDepartement](get-departement.md)

# getDepartement

[jvm]\

@GetMapping(value = ["departements"])

fun [getDepartement](get-departement.md)(@RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Cette methode est utilisee pour retouner toutes les departements avec parent ou non.

[parent](get-departement.md) donne la possibilite de specifier si les parents sont inclues dans le retour.

#### Return

une collection d'entgeo ou entgeoDto
