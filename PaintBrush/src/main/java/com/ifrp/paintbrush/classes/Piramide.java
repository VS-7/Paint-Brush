package com.ifrp.paintbrush.classes;

import java.awt.Graphics;


public class Piramide extends D3{
    public int X2, Y2;
    
    @Override public float volume(){
        int base = X2 - super.x;
        int largura = Y2 - super.y;
        
        return altura * base * largura /3;
    }
    
    public float areaQuadrado(float lado){ return (lado*lado); }
    
    public float areaTriangulo (float base) { return (base + altura)/2; }
    
    @Override public float area(){
        int base = X2 - super.x;
        
        return areaQuadrado(base)+ 4*areaTriangulo(base);
    }
    
    public void desenhar(Graphics g){
        
        super.desenhar(g);
        
        altura = Y2 - super.y;
        
        int tamX = X2 - x;
        int tamY = Y2 - y;
        int meioX= x + tamX/2;
        
        int p1X = super.x;
        int p1Y = Y2;
        
        int p2X = X2;
        int p2Y = Y2;
        
        int p3X = X2 + tamX/10;
        int p3Y = Y2 - tamY/10;
        
        int p4X = super.x + tamX/10;
        int p4Y = Y2 - tamY/10;
        
        int [] baseX = {p1X, p2X, p3X, p4X};
        int [] baseY = {p1Y, p2Y, p3Y, p4Y};
        
        int [] t1X = {p1X, meioX ,p2X};
        int [] t1Y = {p1Y, y     ,p2Y};

        int [] t2X = {p2X, meioX ,p3X};
        int [] t2Y = {p2Y, y     ,p3Y};

        int [] t3X = {p3X, meioX ,p4X};
        int [] t3Y = {p3Y, y     ,p4Y};

        int [] t4X = {p4X, meioX ,p1X};
        int [] t4Y = {p4Y, y     ,p1Y};
        
        
        g.setColor((super.corInterna));
        g.fillPolygon(baseX, baseY, 4);
        
        g.fillPolygon(t1X, t1Y, 3);
        g.fillPolygon(t2X, t2Y, 3);
        g.fillPolygon(t3X, t3Y, 3);
        g.fillPolygon(t4X, t4Y, 3);
        
        g.setColor(cor);
        
        g.drawPolygon(baseX, baseY, 4);
         g.drawPolygon(t1X, t1Y, 3);
        g.drawPolygon(t2X, t2Y, 3);
        g.drawPolygon(t3X, t3Y, 3);
        g.drawPolygon(t4X, t4Y, 3);
    }
    
    
}


