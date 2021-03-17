package SG;

import java.awt.*;

public class SimpleGame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame();

            }
        });
    }
}
