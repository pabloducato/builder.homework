import pl.kocan.builder.homework.FlightLeg;
import pl.kocan.builder.homework.FlightLeg2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Launching the app");

        FlightLeg leg = FlightLeg.builder()
                .from("Las Vegas")
                .to("Los Angeles")
                .price(50)
                .build();

        System.out.println(leg);

//        FlightLeg leg2 = FlightLeg.builder()
//                .from("Las Vegas")
//                .to("Los Angeles")
//                .build();
//
//        System.out.println(leg2);

//        FlightLeg2 leg3 = new FlightLeg2.FlightLegBuilder("Las Vegas", "Los Angeles").build();
        FlightLeg2 leg4 = new FlightLeg2.FlightLegBuilder("Las Vegas", "Los Angeles").price(20).build();

//        System.out.println(leg3);
        System.out.println(leg4);


    }

}
