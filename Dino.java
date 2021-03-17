package SG;

import javax.swing.*;
import java.awt.*;

public class Dino {
    static {
        ImageIcon ii = new ImageIcon("dino3.png");
        dino = ii.getImage();

    }

    private static Image dino;
    private int xPos;
    private int yPos;
    private int dx;
    private int dy;
    private boolean upDown = true;
    private boolean startJump;

    Dino(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void dinoMovePlease(int speed) {
        if (this.yPos == 740)
            startJump = true;
        this.setDy(speed);
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public boolean getUpdown() {
        return upDown;
    }


    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy += dy;
    }

    public static Image getDino() {
        return dino;
    }


    public void setUpDown(boolean upDown) {
        this.upDown = upDown;
    }

    public boolean isStartJump() {
        return startJump;
    }

    public void setStartJump(boolean startJump) {
        this.startJump = startJump;
    }

    public Rectangle getBounds() {
        return new Rectangle(this.getxPos(), this.getyPos(), 50, 50);
    }
}
