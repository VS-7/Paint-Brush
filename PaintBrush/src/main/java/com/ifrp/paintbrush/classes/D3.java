package com.ifrp.paintbrush.classes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author vitorsergio
 */
public abstract class D3 extends Ponto {
    public Color corInterna;
    public int altura;
    public boolean exibirVolume = false;
    public boolean exibirArea = false;
     
    abstract public float area();
    abstract public float volume();
    
    public void desenhar (Graphics g){
        g.setColor(cor);
        if(exibirVolume) g.drawString("Volume: " + Float.toString(volume()), x, y);
        if(exibirArea) g.drawString("Área: " + Float.toString(area()), x, y);
    }
}
