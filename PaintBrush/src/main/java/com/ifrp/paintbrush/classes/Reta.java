package com.ifrp.paintbrush.classes;

import java.awt.Graphics;
import static java.lang.Math.sqrt;


/**
 *
 * @author vitorsergio
 */
public class Reta extends Ponto {
    public int X1, Y1;
     public boolean exibirComprimento = false;
    
    public float comprimento(){
        int a = (X1 - super.x)^2;
        int b = (Y1 - super.y)^2;
        return (float) sqrt(a + b);
    }
    
    @Override public void desenhar(Graphics g) {
        
        super.desenhar(g);
        if(exibirComprimento) g.drawString("Comprimento: " + Float.toString(comprimento()), x, y);
        g.setColor(super.cor);
        g.drawLine(super.x, super.y, X1, Y1);    
    }
}
