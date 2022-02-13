//[entgeo](../../../index.md)/[ga.banga.entgeo.services](../index.md)/[IServices](index.md)

# IServices

[jvm]\
interface [IServices](index.md)

## Functions

| Name | Summary |
|---|---|
| [deleteEntGeoById](delete-ent-geo-by-id.md) | [jvm]<br>abstract fun [deleteEntGeoById](delete-ent-geo-by-id.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [deleteTypeEntGeoById](delete-type-ent-geo-by-id.md) | [jvm]<br>abstract fun [deleteTypeEntGeoById](delete-type-ent-geo-by-id.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [findByIdAndTypeEntGeo_Nom](find-by-id-and-type-ent-geo_-nom.md) | [jvm]<br>abstract fun [findByIdAndTypeEntGeo_Nom](find-by-id-and-type-ent-geo_-nom.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findByNomContainingIgnoreCaseAndTypeEntGeo_Nom](find-by-nom-containing-ignore-case-and-type-ent-geo_-nom.md) | [jvm]<br>abstract fun [findByNomContainingIgnoreCaseAndTypeEntGeo_Nom](find-by-nom-containing-ignore-case-and-type-ent-geo_-nom.md)(nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), nomTypeEntGeo: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findByTypeEntGeo_Nom](find-by-type-ent-geo_-nom.md) | [jvm]<br>abstract fun [findByTypeEntGeo_Nom](find-by-type-ent-geo_-nom.md)(nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findEntGeoById](find-ent-geo-by-id.md) | [jvm]<br>abstract fun [findEntGeoById](find-ent-geo-by-id.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findEntGeos](find-ent-geos.md) | [jvm]<br>abstract fun [findEntGeos](find-ent-geos.md)(): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findEntGeosByNomContaining](find-ent-geos-by-nom-containing.md) | [jvm]<br>abstract fun [findEntGeosByNomContaining](find-ent-geos-by-nom-containing.md)(nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), typeEntGeo: [TypeEntGeo](../../ga.banga.entgeo.domain.entities/-type-ent-geo/index.md)): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findEntGeosByParent](find-ent-geos-by-parent.md) | [jvm]<br>abstract fun [findEntGeosByParent](find-ent-geos-by-parent.md)(entGeo: [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findEntGeosByParentIsNull](find-ent-geos-by-parent-is-null.md) | [jvm]<br>abstract fun [findEntGeosByParentIsNull](find-ent-geos-by-parent-is-null.md)(): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)&gt; |
| [findTypeEntGeoById](find-type-ent-geo-by-id.md) | [jvm]<br>abstract fun [findTypeEntGeoById](find-type-ent-geo-by-id.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)&lt;[TypeEntGeo](../../ga.banga.entgeo.domain.entities/-type-ent-geo/index.md)&gt; |
| [findTypeEntGeoByNom](find-type-ent-geo-by-nom.md) | [jvm]<br>abstract fun [findTypeEntGeoByNom](find-type-ent-geo-by-nom.md)(nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Optional](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)&lt;[TypeEntGeo](../../ga.banga.entgeo.domain.entities/-type-ent-geo/index.md)&gt; |
| [findTypeEntGeos](find-type-ent-geos.md) | [jvm]<br>abstract fun [findTypeEntGeos](find-type-ent-geos.md)(): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)&lt;[TypeEntGeo](../../ga.banga.entgeo.domain.entities/-type-ent-geo/index.md)&gt; |
| [insertEntGeo](insert-ent-geo.md) | [jvm]<br>abstract fun [insertEntGeo](insert-ent-geo.md)(entGeo: [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md)): [EntGeo](../../ga.banga.entgeo.domain.entities/-ent-geo/index.md) |
| [insertTypeEntGeo](insert-type-ent-geo.md) | [jvm]<br>abstract fun [insertTypeEntGeo](insert-type-ent-geo.md)(typeEntGeo: [TypeEntGeo](../../ga.banga.entgeo.domain.entities/-type-ent-geo/index.md)): [TypeEntGeo](../../ga.banga.entgeo.domain.entities/-type-ent-geo/index.md) |

## Inheritors

| Name |
|---|
| [ServiceImpl](../-service-impl/index.md) |
