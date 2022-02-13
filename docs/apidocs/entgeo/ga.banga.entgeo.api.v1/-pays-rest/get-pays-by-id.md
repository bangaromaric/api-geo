//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[PaysRest](index.md)/[getPaysById](get-pays-by-id.md)

# getPaysById

[jvm]\

@GetMapping(value = ["pays/{id}"])

fun [getPaysById](get-pays-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), request: HttpServletRequest): ResponseEntity&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt;

Cette methode est utilisee pour retouner une pays en fonction de son ID. parent donne la possibilite de specifier si les parents sont inclues dans le retour

#### Return

une collection d'entgeo ou entgeoDto
