package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;                // narediš objekt za input miške (ker maš mouseEvent in mouseMotionEvent)
    
    private int xDelta = 100;
    private int yDelta = 100;
    
    public GamePanel() {

        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }


    public void changeXDelta(int value) {           // spreminjanje x pozicije modela
        this.xDelta += value;
        repaint();                                      // na novo nariše model na novi lokaciji
    }

    public void changeYDelta(int value) {           // spreminjanje y pozicije modela
        this.yDelta += value;
        repaint();                                      // na novo nariše model na novi lokaciji
    }


    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }




    public void paintComponent(Graphics g) {            // graphics object
        super.paintComponent(g);                // calls super class

        g.fillRect(xDelta, yDelta, 200, 50);
        
    }
    
}
