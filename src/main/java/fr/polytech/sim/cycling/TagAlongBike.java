package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.Vehicle;
import fr.polytech.sim.transport.Wheel;

public class TagAlongBike extends Bike {
    @Override
    public double getPush() {
        return 0;
    }

    TagAlongBike() {
        components.add(new Wheel(this));
        components.add(new Wheel(this));
        components.add(new SimpleBike());
    }
}
