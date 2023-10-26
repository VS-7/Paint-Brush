package com.ifrp.paintbrush.classes;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author vitorsergio
 */
public class Poligono extends D2 {

    //public Color corInterna;
    public ArrayList<Ponto> listaPontos;

    public Poligono() {
        listaPontos = new ArrayList();
    }
    
    @Override public float area() { return -1; }
    @Override public float perimetro() { return -1; }

    public void adicionarPontos(int x, int y) {
        Ponto p = new Ponto();
        p.x = x;
        p.y = y;
        listaPontos.add(p);
    }

    public void limparPontos() {
        listaPontos.clear();
    }

    @Override
    public void desenhar(Graphics g) {
        int[] pontosX = new int[listaPontos.size()];
        int[] pontosY = new int[listaPontos.size()];
        for (int i = 0; i < listaPontos.size(); i++) {
            pontosX[i] = listaPontos.get(i).x;
            pontosY[i] = listaPontos.get(i).y;
        }
        
        g.setColor(corInterna);
        g.fillPolygon(pontosX, pontosY, listaPontos.size());
        g.setColor(cor);
        g.drawPolygon(pontosX, pontosY, listaPontos.size());
        limparPontos();
    }
}
