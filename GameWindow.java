package main;

import javax.swing.JFrame;

public class GameWindow{

    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {           // konstruktor
    
        jframe = new JFrame();      // jframe object
    
        jframe.setSize(400, 400);           // 400x400px
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // terminiranje programa ob zapiranju aplikacije
        jframe.add(gamePanel);              // jpanel dodamo na frame (okvir in slika)
        jframe.setVisible(true);                       // vidno polje
    }

    
}
