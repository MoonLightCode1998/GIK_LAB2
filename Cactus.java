package SG;

import javax.swing.*;
import java.awt.*;


public class Cactus {
    static {
        ImageIcon ii = new ImageIcon("cactus2.jpg");
        cactus = ii.getImage();
    }

    private static Image cactus;
    private int xPos;
    private int yPos;

    Cactus(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setxPos(int xPos) {
        this.xPos += xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Rectangle getBounds() {
        return new Rectangle(this.getxPos(), this.getyPos(), 50, 100);
    }

    public static Image getCactus() {
        return cactus;
    }
}
