import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//<applet code="TrafficSignal" width=500 height=500></applet>

public class TrafficSignal extends Applet{
    final int RED_TIMER=10;
    final int YELLOW_TIMER=10;
    final int GREEN_TIMER=10;
    
    private void drawRedCircle(Graphics g,Color color) {
        g.setColor(color);
        g.fillOval(210,60,80,80);
    }
    private void drawYellowCircle(Graphics g,Color color) {
        g.setColor(color);
        g.fillOval(210,150,80,80);
    }
    private void drawGreenCircle(Graphics g,Color color) {
        g.setColor(color);
        g.fillOval(210,240,80,80);
    }

    private void sleepAndDisplay(Graphics g, int secs) throws InterruptedException{
        g.setColor(Color.BLACK);
        while(secs!=0) {
            g.drawString(secs+"", 236, 40);
            secs--;
            Thread.sleep(1000);
            g.setColor(Color.WHITE);
            g.fillRect(235, 20, 40, 20);
            g.setColor(Color.BLACK);
        }
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(200, 50, 100, 280);
        g.fillRect(235,330,30,70);

        drawRedCircle(g, Color.BLACK);
        drawYellowCircle(g, Color.BLACK);
        drawGreenCircle(g, Color.BLACK);

        while(true) {
            try {
                drawRedCircle(g, Color.RED);
                sleepAndDisplay(g, RED_TIMER);
                drawRedCircle(g, Color.BLACK);
                drawGreenCircle(g, Color.GREEN);
                sleepAndDisplay(g, GREEN_TIMER);
                drawGreenCircle(g, Color.BLACK);
                drawYellowCircle(g, Color.YELLOW);
                sleepAndDisplay(g, YELLOW_TIMER);
                drawYellowCircle(g, Color.BLACK);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
