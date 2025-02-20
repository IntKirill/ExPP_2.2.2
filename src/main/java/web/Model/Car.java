package web.Model;

import org.springframework.stereotype.Component;


public class Car {

    private String modelCar;
    private String colorCar;
    private int engineCapacity;

    public Car(String modelCar, String colorCar, int engineCapacity) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.engineCapacity = engineCapacity;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
