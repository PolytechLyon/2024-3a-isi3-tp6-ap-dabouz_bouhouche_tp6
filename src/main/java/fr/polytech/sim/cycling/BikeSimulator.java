package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.log.LoggerFactory;
import fr.polytech.sim.utils.Context;

import java.util.Iterator;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = LoggerFactory.createLogger("Vehicle");

    public void run() {
        // Utilisation de la méthode injectAll() pour obtenir un itérateur sur tous les types de vélos disponibles
        Iterator<Bike> bikeIterator = Context.injectAll(Bike.class);

        // Parcours de tous les types de vélos et simulation
        while (bikeIterator.hasNext()) {
            Bike bike = bikeIterator.next();
            this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
            this.logger.log("Bike's mass %.2f Kg.", bike.getMass());
        }
    }
}
