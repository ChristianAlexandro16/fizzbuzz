package test.ifg.soal4.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import test.ifg.soal4.response.FizzBuzzFailResponse;

@Service
@RequiredArgsConstructor
public class FizzBuzzService {
    public ResponseEntity<FizzBuzzFailResponse> resultValue(String value) {

        FizzBuzzFailResponse response = new FizzBuzzFailResponse();
        if (value.equals("Fizz")){
            response.setMessage("Fizz exception has been thrown");
            response.setErrorReason("Internal Server Error");
            return new ResponseEntity<FizzBuzzFailResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (value.equals("Buzz")){
            response.setMessage("Buzz exception has been thrown");
            response.setErrorReason("Bad Request");
            return new ResponseEntity<FizzBuzzFailResponse>(response, HttpStatus.BAD_REQUEST);
        }

        if (value.equals("FizzBuzz")){
            response.setMessage("FizzBuzz exception has been thrown");
            response.setErrorReason("Insufficient Storage");
            return new ResponseEntity<FizzBuzzFailResponse>(response, HttpStatus.INSUFFICIENT_STORAGE);
        }

        response.setMessage("Successfully completed fizzbuzz test");
        response.setErrorReason("200");
        return new ResponseEntity<FizzBuzzFailResponse>(response, HttpStatus.OK);
    }
}
