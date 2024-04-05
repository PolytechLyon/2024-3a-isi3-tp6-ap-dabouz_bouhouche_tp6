package fr.polytech.sim.log;

/**
 * Console logger.
 */
class ConsoleLogger extends NamedLogger {

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
    public ConsoleLogger(String name) {
        super(name);
    }

    @Override
    public void logAux(String message) {
        System.out.print(message);
    }
}
