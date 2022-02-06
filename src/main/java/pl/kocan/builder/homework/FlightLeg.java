package pl.kocan.builder.homework;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class FlightLeg {

    String from;
    String to;
    boolean delayed = false;
    @NonNull
    Integer price;

}
