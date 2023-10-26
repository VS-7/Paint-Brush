package com.ifrp.paintbrush.classes;

import java.awt.Graphics;

public class Borracha extends Ponto {
    private int tamanhoBorracha = 50; // Tamanho padrão

    public void setTamanhoBorracha(int tamanhoBorracha) {
        this.tamanhoBorracha = tamanhoBorracha;
    }

    @Override 
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawRect(x - tamanhoBorracha/2, y - tamanhoBorracha/2, tamanhoBorracha, tamanhoBorracha);
        g.fillRect(x - tamanhoBorracha/2, y - tamanhoBorracha/2, tamanhoBorracha, tamanhoBorracha);
    }
}