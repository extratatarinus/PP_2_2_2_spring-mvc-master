package web.controller.model;

public class Car {
    private String carName;
    private int series;
    private String ovner;

    public Car(String carName, int series, String ovner) {
        this.carName = carName;
        this.series = series;
        this.ovner = ovner;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOvner() {
        return ovner;
    }

    public void setOvner(String ovner) {
        this.ovner = ovner;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", series=" + series +
                ", ovner='" + ovner + '\'' +
                '}';
    }
}
