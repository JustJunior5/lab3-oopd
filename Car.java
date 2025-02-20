import java.awt.*;

public class Car implements Movable {

    //TODO everything should be private
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private int turningAngle;
    private double x;
    private double y;

    public Car(int nrdoors, Color incolor, double enginepower, String modelname){
        nrDoors = nrdoors;
        enginePower = enginepower;
        currentSpeed = 0;
        color = incolor;
        modelName = modelname;
        turningAngle = 0;
        x = 0;
        y = 0;
    }

    public String getModelName(){ return modelName; }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public int getTurningAngle(){
        return turningAngle;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setPosition(double newX, double newY){
        x = newX;
        y = newY;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    //TODO Could be abstract, not saying this is necessarily wrong but abstract is a bit more skill expressive
    protected double speedFactor(){
        return enginePower * 0.01;
    }

    //TODO should be private
    private void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    //TODO should be private
    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void gas(double amount){
        if(amount <= 100 && amount >= 0 && getCurrentSpeed() > 0){
            incrementSpeed(amount);
        }
    }

    public void brake(double amount){
        if(amount <= 100 && amount >= 0) {
            decrementSpeed(amount);
        }
    }

    public double deltaDist(Car a, Car b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(),2));
    }

    // Använder currentSpeed från objektet samt turningAngle för att bestämma hastighet och riktning
   public void move() {
        double rad = Math.toRadians(turningAngle);
        x += Math.round((currentSpeed * Math.cos(rad)) * 1000.0) / 1000.0;
        y += Math.round((currentSpeed * Math.sin(rad)) * 1000.0) / 1000.0;
   }

      // Ändrar turningAngle positiv för att simulera svängning mot vänster
    public void turnLeft(int angle) {
        if (angle > 180) {
            angle = 180;
        }
        turningAngle += angle;
        if (turningAngle >= 360) {
            turningAngle -= 360;
        }
    }

    // Ändrar turningAngle negativ för att simulera svängning mot höger
   public void turnRight(int angle) {
       if (angle > 180) {
           angle = 180;
       }
       turningAngle -= angle;

       if (turningAngle < 0){
           turningAngle += 360;
       }
   }
}
