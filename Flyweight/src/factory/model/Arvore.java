package factory.model;

import factory.action.ArvoreTipo;
import java.awt.Graphics;

/**
 * @author gmuniz
 */
public class Arvore {
    
    private int x;
    private int y;
    private ArvoreTipo type;

    public Arvore(int x, int y, ArvoreTipo type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void desenhar(Graphics g) {
        type.desenhar(g, x, y);
    }
}