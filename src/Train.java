public class Train extends Transport {
    public float tripPrice;      // цена поездки
    public float tripTim;  // время поездки
    public String departureStationName;  // назв станции отбывания
    public String finalStop;  //конечн остан
    public int numberOfCars;   //кол вагонов


    public Train(String make, String model,
                 int yearOfManufacture,
                 String countryOfManufacture,
                 String bodyColor, float maximumSpeedOfMovement,
                 float tripPrice, float tripTim,
                 String departureStationName, String finalStop, int numberOfCars) {
        super(make, model, yearOfManufacture, countryOfManufacture, bodyColor, maximumSpeedOfMovement);
        this.departureStationName = validOrDefault(departureStationName, "Информация не указана");
        this.finalStop = validOrDefault(finalStop, "Информация не указана");
        this.tripPrice = tripPrice > 0.0f ? tripPrice : 20f;
        this.tripTim = tripTim > 0.0f ? tripTim : 1f;
        this.numberOfCars = numberOfCars > 0 ? numberOfCars : 10;

    }

    public float getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(float tripPrice) {
        this.tripPrice = tripTim > 0.0f ? tripTim : 1f;
    }

    public float getTripTim() {
        return tripTim;
    }

    public void setTripTim(float tripTim) {
        this.tripTim = tripPrice > 0.0f ? tripPrice : 20f;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = validOrDefault(departureStationName, "Информация не указана");
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = validOrDefault(finalStop, "Информация не указана");
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars > 0 ? numberOfCars : 10;
    }

    @Override
    public String toString() {
        return "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", countryOfManufacture='" + getCountryOfManufacture() + '\'' +
                ", bodyColor='" + getBodyColor() + '\'' +
                ", maximumSpeedOfMovement=" + getMaximumSpeedOfMovement() +
                "tripPrice=" + tripPrice +
                ", tripTim=" + tripTim +
                ", departureStationName='" + departureStationName + '\'' +
                ", finalStop='" + finalStop + '\'' +
                ", numberOfCars=" + numberOfCars;
    }
}

