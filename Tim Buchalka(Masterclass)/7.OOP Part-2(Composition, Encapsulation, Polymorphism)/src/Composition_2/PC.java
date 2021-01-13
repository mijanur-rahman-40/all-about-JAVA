package Composition_2;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherbaord motherbaord;

    public PC(Case theCase, Monitor monitor, Motherbaord motherbaord) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherbaord = motherbaord;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherbaord getMotherbaord() {
        return motherbaord;
    }
    
}
