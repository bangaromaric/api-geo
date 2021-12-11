package ga.banga.entgeo.domain.entities

//import io.swagger.annotations.ApiModel
import io.swagger.v3.oas.annotations.media.Schema
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Schema(description = "Model pour creer une Entités geographique")
@Table(uniqueConstraints = [UniqueConstraint(columnNames = ["nom", "type_ent_geo_id"])])
@Entity
data class EntGeo(
    @Id @GeneratedValue
//     val id : UUID = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"),
     val id : Long = 0,
    var nom : String,
    @ManyToOne
     var parent : EntGeo? = null,
    @ManyToOne
     var typeEntGeo: TypeEntGeo
    ) : Serializable
