package ga.banga.entgeo.domain.repositories

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.entities.TypeEntGeo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EntGeoRepository : JpaRepository<EntGeo, Long> {
    fun findEntGeosByParentIsNull(): Collection<EntGeo>

    fun findEntGeosByParent(entGeo: EntGeo): Collection<EntGeo>

    fun findFirst5EntGeosByNomContainingIgnoreCase(nom: String): Collection<EntGeo>

    fun findFirst5EntGeosByNomContainingIgnoreCaseAndTypeEntGeo(
        nom: String,
        typeEntGeo: TypeEntGeo
    ): Collection<EntGeo>


    fun findEntGeosByNomContainingIgnoreCase(nom: String): Collection<EntGeo>

    fun findByIdAndTypeEntGeo_Nom(id: Long, nom: String): Optional<EntGeo>

    fun findByTypeEntGeo_Nom(nom: String): Collection<EntGeo>


    fun findByNomContainingIgnoreCaseAndTypeEntGeo_Nom(nom: String, nomTypeEntGeo: String): Collection<EntGeo>

}