package ga.banga.entgeo.domain.entities

import io.swagger.v3.oas.annotations.media.Schema
import java.io.Serializable
import javax.persistence.*

/**
 * cette classe responsable de la structure de la table ent_geo
 *
 * @author Romaric BANGA
 * @since 2/13/22
 * @version 1.0
 *
 * @property id identifiant
 * @property nom le nom de l'entite geographique
 * @property parent le parent qui sera associe
 * @property typeEntGeo le type ex: ville, province, pays
 */
@Schema(description = "Model pour creer une Entités geographique")
@Table(uniqueConstraints = [UniqueConstraint(columnNames = ["nom", "type_ent_geo_id"])])
@Entity(name = "ent_geo")
data class EntGeo(
    @Id @GeneratedValue
    val id: Long = 0,
    var nom: String,
    @ManyToOne
    var parent: EntGeo? = null,
    @ManyToOne
    var typeEntGeo: TypeEntGeo
) : Serializable
