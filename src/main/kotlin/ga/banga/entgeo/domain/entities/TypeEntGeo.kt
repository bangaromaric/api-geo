package ga.banga.entgeo.domain.entities

//import io.swagger.annotations.ApiModel
import io.swagger.v3.oas.annotations.media.Schema
import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * cette classe responsable de la structure de la table type_ent_geo
 *
 * @author Romaric BANGA
 * @since 2/13/22
 * @version 1.0
 *
 * @property id l'identifiant
 * @property nom le nom
 */
@Entity(name = "type_ent_geo")
@Schema(description = "Model pour specifier le type entité géographique")
data class TypeEntGeo(
    @Id @GeneratedValue
    val id: Long = 0,
    var nom: String
) : Serializable
