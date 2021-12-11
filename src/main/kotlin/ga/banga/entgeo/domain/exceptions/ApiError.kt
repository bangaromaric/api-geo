package ga.banga.entgeo.domain.exceptions

import lombok.Getter
import lombok.Setter
import org.springframework.http.HttpStatus
import java.util.*

@Getter
@Setter
class ApiError {
    private var status: HttpStatus? = null
    private var statusCode = 0
    private var message: String? = null
    private var errors: HashMap<String, String>? = null
    private var errorss: List<String>? = null

    //    public ApiError(HttpStatus status, String message, List<String> errors) {
    //        super();
    //        this.status = status;
    //        this.message = message;
    //        this.errors = errors;
    //    }
    constructor() {}
    constructor(status: HttpStatus?, statusCode: Int, message: String?, errors: HashMap<String, String>?) : super() {
        this.status = status
        this.statusCode = statusCode
        this.message = message
        this.errors = errors
    }

    constructor(status: HttpStatus?, statusCode: Int, message: String?, error: String) : super() {
        this.status = status
        this.statusCode = statusCode
        this.message = message
        errorss = Arrays.asList(error)
    }
}