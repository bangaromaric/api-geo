package ga.banga.entgeo.domain.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class ResourceNotFoundException
/**
 * Instantiates a new Resource not found exception.
 *
 * @param message the message
 */
    (message: String?) : RuntimeException(message) {
    companion object {
        private const val serialVersionUID = 4318969560862647687L
    }
}