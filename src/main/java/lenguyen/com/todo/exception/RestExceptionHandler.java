package lenguyen.com.todo.exception;

import lenguyen.com.todo.config.Constants;
import lenguyen.com.todo.dto.ApiErrorDto;
import lenguyen.com.todo.exception.customException.InvalidTodoEventTimeException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidTodoEventTimeException.class)
    protected ResponseEntity<Object> handleInvalidTodoEventTimeException (InvalidTodoEventTimeException ex) {
        ApiErrorDto apiErrorDto = new ApiErrorDto( HttpStatus.BAD_REQUEST, Constants.FALSE,ex.getMessage());
        return  new ResponseEntity<>(apiErrorDto, HttpStatus.BAD_REQUEST);

    }
}
