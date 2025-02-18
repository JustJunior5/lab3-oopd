import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Car_Transport extends Car{
    private Boolean rampIsUp = false;
    private ArrayList<Car> loadedCars = new ArrayList<Car>();
    
    public Car_Transport(){
        super(2, Color.orange, 80, "Transporter");
        stopEngine();
    }

    public ArrayList<Car> getCarList(){
        return loadedCars;
    }

    public void startEngine(){
        if(rampIsUp) super.startEngine();
    }
    public void rampUp(){
        rampIsUp = true;
    }
    public void rampDown(){
        if(getCurrentSpeed() == 0){
            rampIsUp = false;
        }
    }
    
    public void loadCar(Car_Transport transport, Car car){
        if(deltaDist(car, transport) < 2 && getCurrentSpeed() == 0 && !rampIsUp && car.getCurrentSpeed() == 0 && !Objects.equals(car.getModelName(), "Transporter")){
            loadedCars.add(car);
            car.setPosition(getX(),getY());
        }
    }
    public void unloadCar(){
        Car unloadedCar = loadedCars.getLast();
        if(getCurrentSpeed() == 0 && !rampIsUp){
            loadedCars.remove(unloadedCar);
            unloadedCar.setPosition(getX() - 2 * (Math.round(Math.cos(Math.toRadians(getTurningAngle())) * 1000.0) / 1000.0), getY() - 2 * (Math.round(Math.sin(Math.toRadians(getTurningAngle())) * 1000.0) / 1000.0));
        }
    }
    
    public void move() {
        super.move();
        for(Car c: loadedCars){
            c.setPosition(getX(),getY());
        }
    }
    public void turnLeft(int angle) {
        super.turnLeft(angle);
        for(Car c: loadedCars){
            c.turnLeft(angle);
        }
    }
    public void turnRight(int angle) {
        super.turnRight(angle);
        for(Car c: loadedCars){
            c.turnRight(angle);
        }
    }
}
