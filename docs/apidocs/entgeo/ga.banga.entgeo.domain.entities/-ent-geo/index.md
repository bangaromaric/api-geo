//[entgeo](../../../index.md)/[ga.banga.entgeo.domain.entities](../index.md)/[EntGeo](index.md)

# EntGeo

[jvm]\
@Entity(name = "ent_geo")

data class [EntGeo](index.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parent: [EntGeo](index.md)?, typeEntGeo: [TypeEntGeo](../-type-ent-geo/index.md)) : [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)

cette classe responsable de la structure de la table ent_geo

#### Author

Romaric BANGA

#### Since

2/13/22

## Constructors

| | |
|---|---|
| [EntGeo](-ent-geo.md) | [jvm]<br>fun [EntGeo](-ent-geo.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = 0, nom: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), parent: [EntGeo](index.md)? = null, typeEntGeo: [TypeEntGeo](../-type-ent-geo/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [id](id.md) | [jvm]<br>val [id](id.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = 0<br>identifiant |
| [nom](nom.md) | [jvm]<br>var [nom](nom.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>le nom de l'entite geographique |
| [parent](parent.md) | [jvm]<br>var [parent](parent.md): [EntGeo](index.md)? = null<br>le parent qui sera associe |
| [typeEntGeo](type-ent-geo.md) | [jvm]<br>var [typeEntGeo](type-ent-geo.md): [TypeEntGeo](../-type-ent-geo/index.md)<br>le type ex: ville, province, pays |
