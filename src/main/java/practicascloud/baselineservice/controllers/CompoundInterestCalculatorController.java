package practicascloud.baselineservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import practicascloud.baselineservice.models.CompoundInterestCalculatorModel;
import practicascloud.baselineservice.models.ResposeListModel;
import practicascloud.baselineservice.services.CompoundInterestCalculatorService;

@RestController

public class CompoundInterestCalculatorController {
    @Autowired
    CompoundInterestCalculatorService serviceCIC;

    @PostMapping("/CIC")
    public List<ResposeListModel> calculator(@RequestBody CompoundInterestCalculatorModel data){
        return this.serviceCIC.calculator(data);
    }

    @ControllerAdvice
    public class InvestmentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { IllegalArgumentException.class })
    protected ResponseEntity<Object> handleInvalidRequest(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "Dato de inversión invalido: " + ex.getMessage();
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
}