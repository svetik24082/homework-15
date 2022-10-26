import java.time.LocalDate;

public class Car extends Transport {


    private double engineCapacity;   // объем движка
    private String transmission;  // кор перед
    private final String bodyType;  //тип кузова
    private String registrationNumber;     // рег. номер
    private final int numberOfSeats;   // кол.мест
    private boolean summerTyres;

    public Car(String make,
               String model,
               int yearOfManufacture,
               String countryOfManufacture,
               String bodyColor,
               float maximumSpeedOfMovement,
               double engineCapacity,
               String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, boolean summerTyres) {
        super(make, model, yearOfManufacture, countryOfManufacture, bodyColor, maximumSpeedOfMovement);
        this.engineCapacity = engineCapacity > 0.0f ? engineCapacity : 1.5f;
        this.transmission = validOrDefault(transmission, "МКПП");
        this.bodyType = validOrDefault(bodyType, "универсал");
        this.registrationNumber = validOrDefault(registrationNumber, "х000хх000");
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 5;
        this.summerTyres = summerTyres;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validOrDefault(transmission, "МКПП");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return validOrDefault(registrationNumber, "х000хх000");
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(//boolean summerTyres) {
    ) {
        //this.summerTyres = summerTyres;
        int currentMonth = LocalDate.now().getMonthValue();
        this.summerTyres = currentMonth >= 4 || currentMonth <= 11;
    }


    public boolean isCorrectRegistrationNumber() {
        // x000xx000
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;

        }

        return true;
    }

    @Override
    public String toString() {
        return "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", countryOfManufacture='" + getCountryOfManufacture() + '\'' +
                ", bodyColor='" + getBodyColor() + '\'' +
                ", maximumSpeedOfMovement=" + getMaximumSpeedOfMovement() +
                "engineCapacity=" + engineCapacity +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTyres=" + summerTyres +
                '}';
    }

    public void changeTires() {
        summerTyres = !summerTyres;

    }
}






