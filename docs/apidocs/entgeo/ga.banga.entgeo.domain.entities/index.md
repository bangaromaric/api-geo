//[entgeo](../../index.md)/[ga.banga.entgeo.domain.entities](index.md)

# Package ga.banga.entgeo.domain.entities

## Types

| Name | Summary |
|---|---|
| [EntGeo](-ent-geo/index.md) | [jvm]<br>@Entity(name = "ent_geo")<br>data class [EntGeo](-ent-geo/index.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parent: [EntGeo](-ent-geo/index.md)?, typeEntGeo: [TypeEntGeo](-type-ent-geo/index.md)) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)<br>cette classe responsable de la structure de la table ent_geo |
| [TypeEntGeo](-type-ent-geo/index.md) | [jvm]<br>@Entity(name = "type_ent_geo")<br>data class [TypeEntGeo](-type-ent-geo/index.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)<br>cette classe responsable de la structure de la table type_ent_geo |
