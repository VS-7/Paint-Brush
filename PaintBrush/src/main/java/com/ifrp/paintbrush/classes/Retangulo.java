
package com.ifrp.paintbrush.classes;

import java.awt.Graphics;

/**
 *
 * @author vitorsergio
 */
public class Retangulo extends D2{
    public int base, altura;
    
    @Override
    public float area() { return base * altura;}
    
    @Override
    public float perimetro() { return 2 * (base + altura); }
    
    @Override public void desenhar(Graphics g){
        
        super.desenhar(g); // para plotar a area
        g.setColor(corInterna);
        g.fillRect(x, y, base, altura);
        g.setColor(cor);
        g.drawRect(x, y, base, altura);
        
    }
}
