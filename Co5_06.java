import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Co5_06 extends Applet implements ActionListener {
    Button rectangleButton;
    Button triangleButton;
    Button squareButton;
    Button circleButton;

    String selectedShape;

    public void init() {
        rectangleButton = new Button("Rectangle");
        triangleButton = new Button("Triangle");
        squareButton = new Button("Square");
        circleButton = new Button("Circle");

        rectangleButton.addActionListener(this);
        triangleButton.addActionListener(this);
        squareButton.addActionListener(this);
        circleButton.addActionListener(this);

        add(rectangleButton);
        add(triangleButton);
        add(squareButton);
        add(circleButton);
    }

    public void paint(Graphics g) {
        if (selectedShape != null) {
            if (selectedShape.equals("Rectangle")) {
                g.drawRect(50, 50, 200, 100);
            } else if (selectedShape.equals("Triangle")) {
                int[] xPoints = {150, 50, 250};
                int[] yPoints = {50, 150, 150};
                g.drawPolygon(xPoints, yPoints, 3);
            } else if (selectedShape.equals("Square")) {
                g.drawRect(50, 50, 100, 100);
            } else if (selectedShape.equals("Circle")) {
                g.drawOval(100, 100, 150, 150);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        Button clickedButton = (Button) e.getSource();
        selectedShape = clickedButton.getLabel();
        repaint();
    }
}