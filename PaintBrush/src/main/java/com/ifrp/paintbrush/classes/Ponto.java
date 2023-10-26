package com.ifrp.paintbrush.classes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author vitorsergio
 */
public class Ponto {
    
    public int x, y;
    public Color cor;
     

     
    public void desenhar (Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }
}
