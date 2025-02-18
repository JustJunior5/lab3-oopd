/*import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//TODO better test coverage
class CarTest {

    private Saab95 saab;
    private Volvo240 volvo;
    private Scania scania;
    private Car_Transport transport;

    @BeforeEach
    void createCar() {
        saab = new Saab95();
        volvo = new Volvo240();
        scania = new Scania();
        transport = new Car_Transport();
    }

    @Test
    void testSpeedSaab() {
        assertEquals(0, saab.getCurrentSpeed());

        saab.startEngine();
        assertEquals(0.1, saab.getCurrentSpeed());

        saab.setTurboOn();
        assertEquals(1.3, saab.turbo);

        saab.gas(1);
        assertEquals(1.725, saab.getCurrentSpeed());

        saab.move();
        assertNotEquals(0, saab.getY());
        assertEquals(0, saab.getX());

        saab.setTurboOff();
        assertEquals(1, saab.turbo);

        saab.stopEngine();
        assertEquals(0, saab.getCurrentSpeed());
    }

    @Test
    void testSpeedVolvo() {
        assertEquals(0, volvo.getCurrentSpeed());

        volvo.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed());

        volvo.gas(1);
        assertEquals(1.35, volvo.getCurrentSpeed());

        volvo.move();
        assertNotEquals(0, volvo.getY());
        assertEquals(0, volvo.getX());

        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed());
    }

   @Test
    void testTurnLeft() {
        saab.startEngine();
        saab.gas(1);
        saab.turnLeft(45);
        saab.move();

        assertEquals(saab.getX() * -1, saab.getY());

        saab.turnLeft(450);
        assertEquals(315, saab.getTurningAngle());

        saab.turnLeft(450);
        assertEquals(135, saab.getTurningAngle());
    }

    @Test
    void testTurnRight() {
        volvo.startEngine();
        volvo.gas(1);
        volvo.turnRight(45);
        volvo.move();

        assertEquals(volvo.getX(), volvo.getY());

        volvo.turnRight(450);
        assertEquals(225, volvo.getTurningAngle());
    }

    @Test
    void testGas(){
        saab.startEngine();
        saab.gas(1.0);

        double speed = saab.getCurrentSpeed();

        assertEquals(1.35, saab.getCurrentSpeed());

        saab.gas(3.0);
        assertEquals(saab.getCurrentSpeed(), speed);

        saab.gas(-3.0);
        assertEquals(saab.getCurrentSpeed(), speed);

        scania.raiseBed(1);
        scania.startEngine();
        scania.gas(1);

        assertEquals(0, scania.getCurrentSpeed());

        scania.lowerBed(1);
        scania.startEngine();
        scania.gas(1);
        scania.lowerBed(1);

        assertEquals(0.9, scania.getCurrentSpeed());

        scania.raiseBed(1);
        assertEquals(0, scania.getBedAngle());

        scania.stopEngine();
        scania.gas(1);

        scania.raiseBed(80);
        assertEquals(70, scania.getBedAngle());

        scania.lowerBed(80);
        assertEquals(0, scania.getBedAngle());

    }

    @Test
    void testBrake(){
        volvo.startEngine();

        volvo.brake(3.0);
        assertEquals(0.1, volvo.getCurrentSpeed());

        volvo.brake(-3.0);
        assertEquals(0.1, volvo.getCurrentSpeed());


        volvo.brake(1.0);
        assertEquals(0, volvo.getCurrentSpeed());
    }

    @Test
    void testMissingGets(){
        int doors = volvo.getNrDoors();
        assertEquals(4, doors);

        double engine = volvo.getEnginePower();
        assertEquals(100, engine);

        Color colour = volvo.getColor();
        assertEquals(Color.black, colour);

        volvo.setColor(Color.green);
        assertEquals(Color.green, volvo.getColor());
    }

    @Test
    void testTransporter(){
        transport.startEngine();
        assertEquals(transport.getCurrentSpeed(),0);

        transport.rampUp();
        transport.startEngine();

        assertEquals(transport.getCurrentSpeed(),0.1);

        transport.stopEngine();
        transport.rampDown();
        transport.loadCar(transport, volvo);

        assertEquals(transport.getCarList().getFirst().getModelName(),"Volvo240");

        transport.rampUp();
        transport.unloadCar();
        transport.startEngine();
        transport.gas(1);
        transport.unloadCar();
        transport.rampDown();

        assertEquals(0.9, transport.getCurrentSpeed());

        transport.move();
        assertEquals(volvo.getY(),0.9);

        transport.move();
        assertEquals(volvo.getY(),1.8);

        transport.move();
        assertEquals(volvo.getY(),2.7);

        transport.loadCar(transport, saab);

        transport.turnLeft(135);
        transport.turnRight(45);

        assertEquals(180, transport.getTurningAngle());

        transport.stopEngine();
        transport.rampDown();
        transport.unloadCar();

        assertEquals(2.7, transport.getY());
        assertEquals(volvo.getY(),2.7);

        Car_Transport transport2 = new Car_Transport();
        transport = new Car_Transport();

        transport.loadCar(transport,transport2);
        transport2.rampUp();
        transport2.startEngine();
        transport.loadCar(transport,transport2);
        transport.rampUp();
        transport.loadCar(transport,transport2);
        transport.startEngine();
        transport.loadCar(transport,transport2);

        assertEquals(0, transport.getCarList().size());
    }

    @Test
    void testWorkshop(){
        Workshop<Volvo240> volvo240Workshop = new Workshop<>(1);

        Volvo240 volvo2 = new Volvo240();

        volvo240Workshop.storeCar(volvo);
        assertTrue(volvo240Workshop.getStored().contains(volvo));

        volvo240Workshop.storeCar(volvo);

        volvo240Workshop.storeCar(volvo2);
        assertEquals(1, volvo240Workshop.getStored().size());

        volvo240Workshop.removeCar(volvo);
        assertFalse(volvo240Workshop.getStored().contains(volvo));

        volvo240Workshop.removeCar(volvo);
        assertEquals(0, volvo240Workshop.getStored().size());

        Workshop<Car> carWorkshop = new Workshop<>(3);
        carWorkshop.storeCar(volvo);
        carWorkshop.storeCar(saab);
        carWorkshop.storeCar(scania);

        assertTrue(carWorkshop.getStored().contains(volvo));
        assertTrue(carWorkshop.getStored().contains(saab));
        assertTrue(carWorkshop.getStored().contains(scania));
    }
}*/


