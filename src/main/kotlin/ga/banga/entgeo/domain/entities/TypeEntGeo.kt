package ga.banga.entgeo.domain.entities

//import io.swagger.annotations.ApiModel
import io.swagger.v3.oas.annotations.media.Schema
import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@Schema(description = "Model pour specifier le type entité géographique")
data class TypeEntGeo(
    @Id @GeneratedValue
//    val id: UUID = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"),
    val id: Long = 0,
    var nom: String
) : Serializable
