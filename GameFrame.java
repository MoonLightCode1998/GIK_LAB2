package SG;

import javax.swing.*;

public class GameFrame extends JFrame {
    private final int width = 1600;
    private final int height = 900;

    GameFrame() {
        initUI();
    }

    private void initUI() {
        add(new Game());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(width, height);
        setTitle("SimpleGame");
        setVisible(true);

    }
}
