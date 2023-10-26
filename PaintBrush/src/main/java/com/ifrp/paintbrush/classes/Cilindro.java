package com.ifrp.paintbrush.classes;

import java.awt.Graphics;

/**
 *
 * @author vitorsergio
 */

public class Cilindro extends D3{
    public int raio, X2, Y2;
    
    public float areaCirculo(){ return (float) ((Math.PI) * (raio^2)); }
    
    public float perimetroCirculo(){ return (float) (2* (Math.PI) * raio); }
    
    @Override public float area(){ return 2*areaCirculo() + perimetroCirculo() * altura; }
    
    @Override public float volume(){ return (float) (altura * 2 * (Math.PI) * raio);    }
    
    public void desenhar (Graphics g){
        
        altura = Y2 - super.y;
        int base = X2 - super.x;
        int diametro = raio*2;
        super.desenhar(g);
        
        //Plotando o desenho do retangulo
        g.setColor(super.corInterna);
        g.fillRect(super.x, super.y, base, altura);
        g.setColor(cor);
        g.drawRect(super.x, super.y, base, altura);
        
        //Plotando o desenho do circulo de cima
        g.setColor(super.corInterna);
        g.fillOval(super.x, super.y - (altura)/10, diametro , 2* (altura)/10);
        g.setColor(super.cor);
        g.drawOval(super.x, super.y - (altura)/10, diametro, 2* (altura)/10);
        
        //Plotando o desenho do circulo da base
        g.setColor(super.corInterna);
        g.fillOval(super.x, super.y + altura - (altura)/10, diametro, 2*(altura)/10);
        g.setColor(super.cor);
        g.drawOval(super.x, super.y + altura - (altura)/10, diametro, 2* (altura)/10);
        
    }
}