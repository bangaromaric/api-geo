package ga.banga.entgeo.domain.mapper

import ga.banga.entgeo.domain.dto.EntGeoDto
import ga.banga.entgeo.domain.entities.EntGeo
import org.mapstruct.*

/**
 * Cette classe est responsable des transformations lie a la classe [EntGeo] en generant du code a la compilation
 *
 * @author Romaric BANGA
 * @since 2/13/22
 * @version 1.0
 *
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
abstract class EntGeoMapper {

    /**
     * Cette methode permet de transformer une classe [EntGeoDto] en classe [EntGeo]
     *
     * @param entGeoDto l'object qui subira une transformation
     * @return une classe transformee en [EntGeo]
     */
    abstract fun entGeoDtoToEntGeo(entGeoDto: EntGeoDto): EntGeo

    /**
     * Cette methode permet de transformer une classe [EntGeo] en classe [EntGeoDto]
     *
     * @param entGeo l'object qui subira une transformation
     * @return une classe transformee en [EntGeoDto]
     */
    abstract fun entGeoToEntGeoDto(entGeo: EntGeo): EntGeoDto

    /**
     * Cette methode permet de transformer une liste de classe [EntGeo] en liste de classe [EntGeoDto]
     *
     * @param entGeos liste d'object qui subira une transformation
     * @return une liste de classe transformee en [EntGeoDto]
     */
    abstract fun entGeosToEntGeosDto(entGeos: Collection<EntGeo>): Collection<EntGeoDto>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun updateEntGeoFromEntGeoDto(entGeoDto: EntGeoDto, @MappingTarget entGeo: EntGeo)
}