//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[VilleRest](index.md)/[getVilleByNomContaining](get-ville-by-nom-containing.md)

# getVilleByNomContaining

[jvm]\

@GetMapping(value = ["ville/nom/{nom}"])

fun [getVilleByNomContaining](get-ville-by-nom-containing.md)(@PathVariablenom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @RequestParam(defaultValue = "true or false")parent: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;

Cette methode est utilisee pour rechercher une ou des villes en fonction de son Nom. [parent](get-ville-by-nom-containing.md) donne la possibilite de specifier si les parents sont inclues dans le retour

#### Return

une collection d'entgeo ou entgeoDto
