package Composition_Part2__3;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherbaord motherbaord;

    public PC(Case theCase, Monitor monitor, Motherbaord motherbaord) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherbaord = motherbaord;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "Yellow");
    }
}
