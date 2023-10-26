package com.ifrp.paintbrush.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vitorsergio
 */
public class Spray extends Ponto {
    private int tamanhoSpray = 50; // Tamanho padrão

    public void setTamanhoSpray(int tamanhoSpray) {
        this.tamanhoSpray = tamanhoSpray;
    }

    
    public void desenhar(Graphics g){
        int valorMax = tamanhoSpray;
        int randomNumX, randomNumY;

        ThreadLocalRandom trl = ThreadLocalRandom.current();

        for(int i = 0; i < 10; i++){
            randomNumX = trl.nextInt(-valorMax, valorMax + 1);
            randomNumY = trl.nextInt(-valorMax, valorMax + 1);

            float pitagoras = (float) Math.sqrt(Math.pow(randomNumX, 2) + Math.pow(randomNumY, 2));

            if (pitagoras <= tamanhoSpray){
                g.setColor(cor);
                g.drawLine(randomNumX + this.x, randomNumY + this.y, randomNumX + this.x, randomNumY + this.y);
            }
        }
    }
}



