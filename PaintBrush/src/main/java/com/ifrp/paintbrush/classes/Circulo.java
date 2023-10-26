package com.ifrp.paintbrush.classes;

import java.awt.Graphics;

/**
 *
 * @author vitorsergio
 */
public  class Circulo extends D2{
    public int raio;
    
    @Override public float area() { return (float) ((raio^2)*(Math.PI)); }
    
     @Override public float perimetro() { return (float) (2*(Math.PI)*raio); }

    @Override public void desenhar(Graphics g) {
        
        super.desenhar(g);
        
        g.setColor(super.corInterna);
        g.fillOval(super.x, super.y, raio*2, raio*2);
        g.setColor(super.cor);
        g.drawOval(super.x, super.y, raio*2, raio*2);
    }
}
