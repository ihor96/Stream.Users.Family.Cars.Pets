import java.util.Comparator;

public class Car  {
    private String CarMarka;
    private String CarModel;
    private int CarYear;
    Engine CarEngine;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (CarYear != car.CarYear) return false;
        if (CarMarka != null ? !CarMarka.equals(car.CarMarka) : car.CarMarka != null) return false;
        if (CarModel != null ? !CarModel.equals(car.CarModel) : car.CarModel != null) return false;
        return CarEngine != null ? CarEngine.equals(car.CarEngine) : car.CarEngine == null;
    }

    @Override
    public int hashCode() {
        int result = CarMarka != null ? CarMarka.hashCode() : 0;
        result = 31 * result + (CarModel != null ? CarModel.hashCode() : 0);
        result = 31 * result + CarYear;
        result = 31 * result + (CarEngine != null ? CarEngine.hashCode() : 0);
        return result;
    }

    public String getCarMarka() {
        return CarMarka;
    }

    public void setCarMarka(String carMarka) {
        CarMarka = carMarka;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public int getCarYear() {
        return CarYear;
    }

    public void setCarYear(int carYear) {
        CarYear = carYear;
    }

    public Engine getCarEngine() {
        return CarEngine;
    }

    public void setCarEngine(Engine carEngine) {
        CarEngine = carEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarMarka='" + CarMarka + '\'' +
                ", CarModel='" + CarModel + '\'' +
                ", CarYear=" + CarYear +
                ", CarEngine=" + CarEngine +
                '}';
    }

    public Car(String carMarka, String carModel, int carYear, Engine carEngine) {
        CarMarka = carMarka;
        CarModel = carModel;
        CarYear = carYear;
        CarEngine = carEngine;
    }

}