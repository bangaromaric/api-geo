//[entgeo](../../../index.md)/[ga.banga.entgeo.api.v1](../index.md)/[PaysRest](index.md)

# PaysRest

[jvm]\
@CrossOrigin(origins = ["*"])

@RestController

@RequestMapping(value = ["api/v1/"])

class [PaysRest](index.md)

Cette classe est responsable de l'affichage des villes

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [PaysRest](-pays-rest.md) | [jvm]<br>fun [PaysRest](-pays-rest.md)() |

## Functions

| Name | Summary |
|---|---|
| [getPays](get-pays.md) | [jvm]<br>@GetMapping(value = ["pays"])<br>fun [getPays](get-pays.md)(): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt;<br>Cette methode est utilisee pour retouner toutes les pays avec parent ou non. |
| [getPaysById](get-pays-by-id.md) | [jvm]<br>@GetMapping(value = ["pays/{id}"])<br>fun [getPaysById](get-pays-by-id.md)(@PathVariable(value = "id")id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), request: HttpServletRequest): ResponseEntity&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt;<br>Cette methode est utilisee pour retouner une pays en fonction de son ID. parent donne la possibilite de specifier si les parents sont inclues dans le retour |

## Properties

| Name | Summary |
|---|---|
| [iServices](i-services.md) | [jvm]<br>@Autowired<br>lateinit var [iServices](i-services.md): [IServices](../../ga.banga.entgeo.services/-i-services/index.md) |
