import pl.kocan.builder.homework.FlightLeg;

public class Main {

    public static void main(String[] args) {
        System.out.println("Launching the app");

        FlightLeg leg = FlightLeg.builder()
                .from("Las Vegas")
                .to("Los Angeles")
                .price(50)
                .build();

        System.out.println(leg);

        FlightLeg leg2 = FlightLeg.builder()
                .from("Las Vegas")
                .to("Los Angeles")
                .build();

        System.out.println(leg2);


    }

}
