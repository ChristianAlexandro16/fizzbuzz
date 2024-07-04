package test.ifg.soal4.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FizzBuzzFailResponse {

    @JsonProperty("messsage")
    private String message;

    @JsonProperty("error_reason")
    private String errorReason;
}
