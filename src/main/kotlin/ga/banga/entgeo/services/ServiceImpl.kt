package ga.banga.entgeo.services

import ga.banga.entgeo.domain.entities.EntGeo
import ga.banga.entgeo.domain.entities.TypeEntGeo
import ga.banga.entgeo.repositories.EntGeoRepository
import ga.banga.entgeo.repositories.TypeEntGeoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ServiceImpl : IServices {

    @Autowired
    lateinit var typeEntGeoRepository: TypeEntGeoRepository

    @Autowired
    lateinit var entGeoRepository: EntGeoRepository


    override fun findTypeEntGeos(): Collection<TypeEntGeo> {
        return typeEntGeoRepository.findAll()
    }

    override fun insertTypeEntGeo(typeEntGeo: TypeEntGeo): TypeEntGeo {
        return typeEntGeoRepository.save(typeEntGeo)
    }

    override fun findTypeEntGeoById(id: Long): Optional<TypeEntGeo> {
        return typeEntGeoRepository.findById(id)
    }

    override fun findTypeEntGeoByNom(nom: String): Optional<TypeEntGeo> {
        return typeEntGeoRepository.findTypeEntGeoByNom(nom)
    }

    override fun deleteTypeEntGeoById(id: Long) {
        typeEntGeoRepository.deleteById(id)
    }

    override fun findEntGeos(): Collection<EntGeo> {
        return entGeoRepository.findAll()
    }

    override fun findEntGeosByParent(entGeo: EntGeo): Collection<EntGeo> {
        return entGeoRepository.findEntGeosByParent(entGeo)
    }

    override fun findEntGeosByParentIsNull(): Collection<EntGeo> {
        return entGeoRepository.findEntGeosByParentIsNull()
    }


    override fun findEntGeosByNomContaining(nom: String, typeEntGeo: TypeEntGeo): Collection<EntGeo> {
        return entGeoRepository.findFirst5EntGeosByNomContainingIgnoreCase(nom)
    }

    override fun insertEntGeo(entGeo: EntGeo): EntGeo {
        return entGeoRepository.save(entGeo)
    }

    override fun findEntGeoById(id: Long): Optional<EntGeo> {
        return entGeoRepository.findById(id)
    }

    override fun deleteEntGeoById(id: Long) {
        entGeoRepository.deleteById(id)
    }


}