package nl.reza.vehicle.api;

import nl.reza.vehicle.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ProblemDetail handleNotFoundException(NotFoundException exc) {
        var detail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);

        detail.setDetail(exc.getMessage());
        detail.setTitle("NOT FOUND");

        return detail;
    }


}
