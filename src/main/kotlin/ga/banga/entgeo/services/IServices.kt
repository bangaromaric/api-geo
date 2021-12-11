package ga.banga.entgeo.services

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.entities.TypeEntGeo
import java.util.*

interface IServices {


    fun findTypeEntGeos(): Collection<TypeEntGeo>

    fun insertTypeEntGeo(typeEntGeo: TypeEntGeo): TypeEntGeo

    fun findTypeEntGeoById(id: Long): Optional<TypeEntGeo>

    fun findTypeEntGeoByNom(nom: String): Optional<TypeEntGeo>

    fun deleteTypeEntGeoById(id: Long)

    fun findEntGeos(): Collection<EntGeo>

    fun findEntGeosByParent(entGeo: EntGeo): Collection<EntGeo>

    fun findEntGeosByParentIsNull(): Collection<EntGeo>

    fun findEntGeosByNomContaining(nom: String, typeEntGeo: TypeEntGeo): Collection<EntGeo>

    fun insertEntGeo(entGeo: EntGeo): EntGeo

    fun findEntGeoById(id: Long): Optional<EntGeo>

    fun deleteEntGeoById(id: Long)

    fun findByIdAndTypeEntGeo_Nom(id: Long, nom: String): Optional<EntGeo>

    fun findByTypeEntGeo_Nom(nom: String): Collection<EntGeo>
    
    
}