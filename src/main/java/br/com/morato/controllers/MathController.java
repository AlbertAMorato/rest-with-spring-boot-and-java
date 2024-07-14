package br.com.morato.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.morato.converters.NumberConverter;
import br.com.morato.exceptions.UnsupportMathOperationException;
import br.com.morato.math.SimpleMath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MathController {
    
    @GetMapping("/sum/{numberOne}/{numberTwo}")    
    public Double sum(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/sub/{numberOne}/{numberTwo}")    
    public Double sub(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.substraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/mult/{numberOne}/{numberTwo}")    
    public Double mult(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/div/{numberOne}/{numberTwo}")    
    public Double div(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/med/{numberOne}/{numberTwo}")    
    public Double med(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping("/square/{numberOne}")    
    public Double square(
        @PathVariable(value = "numberOne") String numberOne
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.square(NumberConverter.convertToDouble(numberOne));
    }

    
}
