package factory.action;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author gmuniz
 */
public class ArvoreTipo {
    private String name;
    private Color color;
    private String otherTreeData;

    public ArvoreTipo(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void desenhar(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}