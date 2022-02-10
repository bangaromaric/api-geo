package ga.banga.entgeo.domain.mapper

import ga.banga.entgeo.domain.dto.EntGeoDto
import ga.banga.entgeo.domain.entities.EntGeo
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class EntGeoMapper {

    abstract fun entGeoDtoToEntGeo(entGeoDto: EntGeoDto): EntGeo
    abstract fun entGeoToEntGeoDto(entGeo: EntGeo): EntGeoDto
    abstract fun entGeosToEntGeosDto(entGeos: Collection<EntGeo>): Collection<EntGeoDto>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun updateEntGeoFromEntGeoDto(entGeoDto: EntGeoDto, @MappingTarget entGeo: EntGeo)
}