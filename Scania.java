import java.awt.*;

public class Scania extends Car {

    private int bedAngle = 0;

    public Scania() {
        super(2, Color.blue, 80, "Scania");
        stopEngine();
    }

    public int getBedAngle(){
        return bedAngle;
    }

    public void raiseBed(int amount){
        if (getCurrentSpeed() != 0){
            return;
        }

        bedAngle += amount;
        if (bedAngle > 70){
            bedAngle = 70;
        }
    }

    public void lowerBed(int amount){
        if (getCurrentSpeed() != 0){
            return;
        }

        bedAngle -= amount;
        if (bedAngle < 0){
            bedAngle = 0;
        }
    }

    public void startEngine(){
        if (bedAngle > 0){
            return;
        }
        super.startEngine();
    }

    public void gas(double amount){
        if (bedAngle > 0){
            return;
        }
        super.gas(amount);
    }
}
