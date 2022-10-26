public class Transport {
    private final String make;
    private final String model;
    private final int yearOfManufacture;  // год выпуска
    private final String countryOfManufacture; // стр произв
    private String bodyColor;                   // цв кузова
    private float maximumSpeedOfMovement;       //макс скор

    public Transport(String make, String model,
                     int yearOfManufacture,
                     String countryOfManufacture,
                     String bodyColor, float maximumSpeedOfMovement) {
        this.make = validOrDefault(make, " Информация не указана ");
        this.model = validOrDefault(model, " Информация не указана ");
        this.yearOfManufacture = yearOfManufacture > 0 ? yearOfManufacture : 2000;
        this.countryOfManufacture = validOrDefault(countryOfManufacture, " Информация не указана ");
        this.bodyColor = validOrDefault(bodyColor, " белый ");
        this.maximumSpeedOfMovement = maximumSpeedOfMovement > 0 ? maximumSpeedOfMovement : 150f;
    }

    public String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = " белый ";
        }
    }

    public double getMaximumSpeedOfMovement() {
        return maximumSpeedOfMovement;
    }

    public void setMaximumSpeedOfMovement(float maximumSpeedOfMovement) {
        if (maximumSpeedOfMovement != 0f) {
            this.maximumSpeedOfMovement = maximumSpeedOfMovement;
        } else {
            this.maximumSpeedOfMovement = 150f;

        }
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", countryOfManufacture='" + countryOfManufacture + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maximumSpeedOfMovement=" + maximumSpeedOfMovement +
                '}';
    }
}
