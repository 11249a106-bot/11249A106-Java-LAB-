import java.awt.*;

public class BorderLayoutDemo extends Frame {
    public BorderLayoutDemo() {
        setTitle("Application Dashboard");
        setLayout(new BorderLayout());

        add(new Label("Header", Label.CENTER), BorderLayout.NORTH);
        add(new Label("Footer", Label.CENTER), BorderLayout.SOUTH);
        add(new Label("Menu", Label.CENTER), BorderLayout.WEST);
        add(new Label("Options", Label.CENTER), BorderLayout.EAST);
        add(new Label("Content Area", Label.CENTER), BorderLayout.CENTER);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
