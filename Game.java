package main;

public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game() {
        gamePanel = new GamePanel();                      // gamePaned object (slika)
        gameWindow = new GameWindow(gamePanel);          // gameWindow object (okvir)
        gamePanel.requestFocus();                       // fokusira se na gamePanel
        
    }
}