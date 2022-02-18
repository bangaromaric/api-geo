package ga.banga.entgeo.domain.repositories;

import ga.banga.entgeo.domain.entities.TypeEntGeo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TypeEntGeoRepository : JpaRepository<TypeEntGeo, Long> {
    fun findTypeEntGeoByNom(nom: String): Optional<TypeEntGeo>

}