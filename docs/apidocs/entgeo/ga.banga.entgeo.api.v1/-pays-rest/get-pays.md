//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[PaysRest](index.md)/[getPays](get-pays.md)

# getPays

[jvm]\

@GetMapping(value = ["pays"])

fun [getPays](get-pays.md)(): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt;

Cette methode est utilisee pour retouner toutes les pays avec parent ou non.

parent donne la possibilite de specifier si les parents sont inclues dans le retour

#### Return

une collection d'entgeo ou entgeoDto
