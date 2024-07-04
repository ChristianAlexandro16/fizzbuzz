package test.ifg.soal4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.ifg.soal4.response.FizzBuzzFailResponse;
import test.ifg.soal4.services.FizzBuzzService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/controller_advice")
public class FizzzBuzzController {
    private final FizzBuzzService fizzBuzzService;

    @GetMapping("/{value}")
    public ResponseEntity<FizzBuzzFailResponse> checkValue(@PathVariable String value){
        return fizzBuzzService.resultValue(value);
    }
}
