import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 65, 130);
        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 220, 150);
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 150, 200);
        g.drawString("Line", 85, 220);
        g.setColor(Color.MAGENTA);
        int x[] = {220, 180, 260};
        int y[] = {200, 270, 270};
        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 195, 290);
    }
}
