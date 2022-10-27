public class Bus extends Transport {
    public Bus(String make, String model,
               int yearOfManufacture, String countryOfManufacture,
               String bodyColor, float maximumSpeedOfMovement) {
        super(make, model, yearOfManufacture,
                countryOfManufacture, bodyColor, maximumSpeedOfMovement);
    }

    @Override
    public void refill() {
        System.out.println( "можно заправлять бензином или дизелем на заправке ");
    }
}
