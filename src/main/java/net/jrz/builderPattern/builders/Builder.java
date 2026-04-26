package net.jrz.builderPattern.builders;

import net.jrz.builderPattern.cars.CarType;
import net.jrz.builderPattern.components.Engine;
import net.jrz.builderPattern.components.GPSNavigator;
import net.jrz.builderPattern.components.Transmission;
import net.jrz.builderPattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
