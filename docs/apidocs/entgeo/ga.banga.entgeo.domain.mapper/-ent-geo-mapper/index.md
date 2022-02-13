//[entgeo](../../../index.md)/[ga.banga.entgeo.domain.mapper](../index.md)/[EntGeoMapper](index.md)

# EntGeoMapper

[jvm]\
abstract class [EntGeoMapper](index.md)

Cette classe est responsable des transformations lie a la classe [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md) en generant du code a la compilation

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [EntGeoMapper](-ent-geo-mapper.md) | [jvm]<br>fun [EntGeoMapper](-ent-geo-mapper.md)() |

## Functions

| Name | Summary |
|---|---|
| [entGeoDtoToEntGeo](ent-geo-dto-to-ent-geo.md) | [jvm]<br>abstract fun [entGeoDtoToEntGeo](ent-geo-dto-to-ent-geo.md)(entGeoDto: [EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md)): [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)<br>Cette methode permet de transformer une classe [EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md) en classe [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md) |
| [entGeosToEntGeosDto](ent-geos-to-ent-geos-dto.md) | [jvm]<br>abstract fun [entGeosToEntGeosDto](ent-geos-to-ent-geos-dto.md)(entGeos: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt;): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md)&gt;<br>Cette methode permet de transformer une liste de classe [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md) en liste de classe [EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md) |
| [entGeoToEntGeoDto](ent-geo-to-ent-geo-dto.md) | [jvm]<br>abstract fun [entGeoToEntGeoDto](ent-geo-to-ent-geo-dto.md)(entGeo: [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)): [EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md)<br>Cette methode permet de transformer une classe [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md) en classe [EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md) |
| [updateEntGeoFromEntGeoDto](update-ent-geo-from-ent-geo-dto.md) | [jvm]<br>abstract fun [updateEntGeoFromEntGeoDto](update-ent-geo-from-ent-geo-dto.md)(entGeoDto: [EntGeoDto](../../ga.banga.entgeo.domain.dto/-ent-geo-dto/index.md), entGeo: [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)) |
