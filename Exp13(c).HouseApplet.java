import java.applet.Applet;
import java.awt.*;

public class HouseApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(100, 150, 200, 150);

        g.setColor(Color.RED);
        int x[] = {80, 200, 320};
        int y[] = {150, 50, 150};
        g.fillPolygon(x, y, 3);

        g.setColor(Color.BLUE);
        g.fillRect(175, 220, 50, 80);

        g.setColor(Color.WHITE);
        g.fillRect(120, 180, 40, 40);
        g.fillRect(240, 180, 40, 40);

        g.setColor(Color.BLACK);
        g.drawRect(120, 180, 40, 40);
        g.drawRect(240, 180, 40, 40);

        g.drawLine(140, 180, 140, 220);
        g.drawLine(120, 200, 160, 200);
        g.drawLine(260, 180, 260, 220);
        g.drawLine(240, 200, 280, 200);
    }
}
