package com.ifrp.paintbrush.gui;

import com.ifrp.paintbrush.classes.Borracha;
import com.ifrp.paintbrush.classes.Cilindro;
import com.ifrp.paintbrush.classes.Circulo;
import com.ifrp.paintbrush.classes.Piramide;
import com.ifrp.paintbrush.classes.Poligono;
import com.ifrp.paintbrush.classes.Ponto;
import com.ifrp.paintbrush.classes.Reta;
import com.ifrp.paintbrush.classes.Retangulo;
import com.ifrp.paintbrush.classes.Spray;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrPaint extends javax.swing.JFrame {

    private enum TipoFigura {
        tfPonto, tfReta, tfCirculo, tfRetangulo, tfSpray, tfBorracha, tfPiramide, tfCilindro, tfPoligono
    }

    private TipoFigura tipoFigura = TipoFigura.tfPonto; // variável controladora do tipo figura
    
    private Ponto p = new Ponto();
    private Retangulo retangulo = new Retangulo();
    private Circulo circulo = new Circulo();
    private Reta reta = new Reta();
    private Poligono poligono = new Poligono();
    private Cilindro cilindro = new Cilindro();
    private Piramide piramide = new Piramide();
    private Spray spray = new Spray();
    private Borracha borracha = new Borracha();

    public FrPaint() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        chkArea = new javax.swing.JCheckBoxMenuItem();
        chkPerimetro = new javax.swing.JCheckBoxMenuItem();
        chkVolume = new javax.swing.JCheckBoxMenuItem();
        chkComprimento = new javax.swing.JCheckBoxMenuItem();
        pnlPainel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSpray = new javax.swing.JLabel();
        btnPonto = new javax.swing.JLabel();
        btnReta = new javax.swing.JLabel();
        btnCirculo = new javax.swing.JLabel();
        btnRetangulo = new javax.swing.JLabel();
        btnCilindro = new javax.swing.JLabel();
        btnPiramide = new javax.swing.JLabel();
        pnlCabecalho = new javax.swing.JPanel();
        lblFechar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JLabel();
        corDeFundo = new javax.swing.JLabel();
        btnOpcoes = new javax.swing.JLabel();
        btnPoligono = new javax.swing.JLabel();
        btnBorracha = new javax.swing.JLabel();
        btnEscolherCorExterna = new javax.swing.JPanel();
        btnEscolherCorInterna = new javax.swing.JPanel();
        pnlPaint = new javax.swing.JPanel();
        tamanhoSprayBorracha = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        chkArea.setSelected(true);
        chkArea.setText("Mostrar Área");
        chkArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkAreaItemStateChanged(evt);
            }
        });
        chkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAreaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(chkArea);

        chkPerimetro.setSelected(true);
        chkPerimetro.setText("Mostrar Perímetro");
        chkPerimetro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPerimetroItemStateChanged(evt);
            }
        });
        chkPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPerimetroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(chkPerimetro);

        chkVolume.setSelected(true);
        chkVolume.setText("Mostrar Volume");
        jPopupMenu1.add(chkVolume);

        chkComprimento.setSelected(true);
        chkComprimento.setText("Mostrar Comprimento");
        jPopupMenu1.add(chkComprimento);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlPainel.setBackground(new java.awt.Color(51, 51, 51));
        pnlPainel.setForeground(new java.awt.Color(255, 255, 255));
        pnlPainel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlPainelMouseDragged(evt);
            }
        });
        pnlPainel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPainelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlPainelMouseReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cor Interna");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cor Externa");

        btnSpray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Spray.png"))); // NOI18N
        btnSpray.setAlignmentY(0.1F);
        btnSpray.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnSprayMouseDragged(evt);
            }
        });
        btnSpray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSprayMouseClicked(evt);
            }
        });

        btnPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ponto.png"))); // NOI18N
        btnPonto.setAlignmentY(0.1F);
        btnPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPontoMouseClicked(evt);
            }
        });

        btnReta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Reta.png"))); // NOI18N
        btnReta.setAlignmentY(0.1F);
        btnReta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetaMouseClicked(evt);
            }
        });

        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Circulo.png"))); // NOI18N
        btnCirculo.setAlignmentY(0.1F);
        btnCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCirculoMouseClicked(evt);
            }
        });

        btnRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Retangulo.png"))); // NOI18N
        btnRetangulo.setAlignmentY(0.1F);
        btnRetangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetanguloMouseClicked(evt);
            }
        });

        btnCilindro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cilindro.png"))); // NOI18N
        btnCilindro.setAlignmentY(0.1F);
        btnCilindro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCilindroMouseClicked(evt);
            }
        });

        btnPiramide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pyramid 2.png"))); // NOI18N
        btnPiramide.setAlignmentY(0.1F);
        btnPiramide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiramideMouseClicked(evt);
            }
        });

        pnlCabecalho.setBackground(new java.awt.Color(0, 0, 0));

        lblFechar.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 12)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(255, 255, 255));
        lblFechar.setText("X");
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Fira Sans", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Paint Brush");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salvar.png"))); // NOI18N
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        corDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dia-e-noite-20.png"))); // NOI18N
        corDeFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corDeFundoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCabecalhoLayout = new javax.swing.GroupLayout(pnlCabecalho);
        pnlCabecalho.setLayout(pnlCabecalhoLayout);
        pnlCabecalhoLayout.setHorizontalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corDeFundo)
                .addGap(735, 735, 735)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCabecalhoLayout.setVerticalGroup(
            pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(pnlCabecalhoLayout.createSequentialGroup()
                .addGroup(pnlCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corDeFundo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Opções.png"))); // NOI18N
        btnOpcoes.setAlignmentY(0.1F);
        btnOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpcoesMouseClicked(evt);
            }
        });

        btnPoligono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Poligono.png"))); // NOI18N
        btnPoligono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPoligonoMouseClicked(evt);
            }
        });
        btnPoligono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPoligonoKeyPressed(evt);
            }
        });

        btnBorracha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Borracha.png"))); // NOI18N
        btnBorracha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrachaMouseClicked(evt);
            }
        });

        btnEscolherCorExterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEscolherCorExternaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEscolherCorExternaLayout = new javax.swing.GroupLayout(btnEscolherCorExterna);
        btnEscolherCorExterna.setLayout(btnEscolherCorExternaLayout);
        btnEscolherCorExternaLayout.setHorizontalGroup(
            btnEscolherCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        btnEscolherCorExternaLayout.setVerticalGroup(
            btnEscolherCorExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btnEscolherCorInterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEscolherCorInternaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEscolherCorInternaLayout = new javax.swing.GroupLayout(btnEscolherCorInterna);
        btnEscolherCorInterna.setLayout(btnEscolherCorInternaLayout);
        btnEscolherCorInternaLayout.setHorizontalGroup(
            btnEscolherCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        btnEscolherCorInternaLayout.setVerticalGroup(
            btnEscolherCorInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlPaint.setBackground(new java.awt.Color(51, 51, 51));
        pnlPaint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlPaintMouseDragged(evt);
            }
        });
        pnlPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlPaintMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlPaintLayout = new javax.swing.GroupLayout(pnlPaint);
        pnlPaint.setLayout(pnlPaintLayout);
        pnlPaintLayout.setHorizontalGroup(
            pnlPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPaintLayout.setVerticalGroup(
            pnlPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );

        tamanhoSprayBorracha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamanhoSprayBorrachaStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escolher tamanho");

        javax.swing.GroupLayout pnlPainelLayout = new javax.swing.GroupLayout(pnlPainel);
        pnlPainel.setLayout(pnlPainelLayout);
        pnlPainelLayout.setHorizontalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBorracha)
                    .addComponent(btnSpray)
                    .addComponent(btnPoligono)
                    .addComponent(btnPiramide)
                    .addComponent(btnPonto)
                    .addComponent(btnOpcoes)
                    .addComponent(btnReta)
                    .addComponent(btnCirculo)
                    .addComponent(btnRetangulo)
                    .addComponent(btnCilindro))
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPainelLayout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(tamanhoSprayBorracha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(174, 174, 174)))
                        .addComponent(btnEscolherCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEscolherCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(708, Short.MAX_VALUE))))
        );
        pnlPainelLayout.setVerticalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addComponent(pnlCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlPaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPainelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(17, 17, 17))
                            .addComponent(btnEscolherCorInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEscolherCorExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPainelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tamanhoSprayBorracha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))))
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnOpcoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReta)
                        .addGap(6, 6, 6)
                        .addComponent(btnCirculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPoligono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCilindro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPiramide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorracha)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAreaActionPerformed
        
    }//GEN-LAST:event_chkAreaActionPerformed

    private void chkAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkAreaItemStateChanged
        if (chkArea.isSelected()) {
            // Código para mostrar a área
        } else {
            // Código para ocultar a área
        }
    }//GEN-LAST:event_chkAreaItemStateChanged

    private void chkPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPerimetroActionPerformed

    private void chkPerimetroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPerimetroItemStateChanged
        if (chkPerimetro.isSelected()) {
            // Código para mostrar o perímetro
        } else {
            // Código para ocultar o perímetro
        }
    }//GEN-LAST:event_chkPerimetroItemStateChanged

    private void pnlPainelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPainelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlPainelMouseReleased

    private void pnlPainelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPainelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlPainelMousePressed

    private void btnEscolherCorInternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEscolherCorInternaMouseClicked
        Color selectedColor = JColorChooser.showDialog(this, "Escolha uma Cor", Color.BLACK);

        if (selectedColor != null) {
            btnEscolherCorInterna.setBackground(selectedColor);
        }
    }//GEN-LAST:event_btnEscolherCorInternaMouseClicked

    private void btnEscolherCorExternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEscolherCorExternaMouseClicked
        Color selectedColor = JColorChooser.showDialog(this, "Escolha uma Cor", Color.BLACK);

        if (selectedColor != null) {
            btnEscolherCorExterna.setBackground(selectedColor);
        }
    }//GEN-LAST:event_btnEscolherCorExternaMouseClicked

    //Botão de Salvar a imagem
    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Imagens PNG", "png"));

        int escolha = chooser.showSaveDialog(this);

        if (escolha == JFileChooser.APPROVE_OPTION) {
            File arquivo = chooser.getSelectedFile();
            try {
                salvarComoPNG(arquivo);
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void corDeFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corDeFundoMouseClicked
        Color novaCor = JColorChooser.showDialog(this, "Escolha uma Cor", pnlCabecalho.getBackground());
        if (novaCor != null) {
            pnlPaint.setBackground(novaCor);
            pnlPainel.setBackground(novaCor);
        }
        /*Color corAtual = pnlPaint.getBackground();

        if (corAtual.equals(Color.WHITE)) {
            pnlPaint.setBackground(Color.DARK_GRAY);
        } else {
            pnlPaint.setBackground(Color.WHITE);
        }*/
    }//GEN-LAST:event_corDeFundoMouseClicked

    private void btnOpcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) { // Verifica se foi um clique com o botão esquerdo do mouse
            jPopupMenu1.show(btnOpcoes, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_btnOpcoesMouseClicked

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            // Se o usuário escolher "Sim", fecha o programa
            System.exit(0);
        }
    }//GEN-LAST:event_lblFecharMouseClicked
    
    private void btnPiramideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiramideMouseClicked
        tipoFigura = TipoFigura.tfPiramide;
    }//GEN-LAST:event_btnPiramideMouseClicked

    private void btnCilindroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCilindroMouseClicked
        tipoFigura = TipoFigura.tfCilindro;
    }//GEN-LAST:event_btnCilindroMouseClicked

    private void btnRetanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetanguloMouseClicked
        tipoFigura = TipoFigura.tfRetangulo;
    }//GEN-LAST:event_btnRetanguloMouseClicked

    private void btnCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCirculoMouseClicked
        tipoFigura = TipoFigura.tfCirculo;
    }//GEN-LAST:event_btnCirculoMouseClicked

    private void btnRetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetaMouseClicked
        tipoFigura = TipoFigura.tfReta;
    }//GEN-LAST:event_btnRetaMouseClicked

    private void btnPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPontoMouseClicked
        tipoFigura = TipoFigura.tfPonto;
    }//GEN-LAST:event_btnPontoMouseClicked

    private void btnSprayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSprayMouseClicked
        tipoFigura = TipoFigura.tfSpray;
    }//GEN-LAST:event_btnSprayMouseClicked

    private void btnBorrachaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrachaMouseClicked
        tipoFigura = TipoFigura.tfBorracha;
    }//GEN-LAST:event_btnBorrachaMouseClicked

    private void pnlPainelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPainelMouseDragged

    }//GEN-LAST:event_pnlPainelMouseDragged

    private void pnlPaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMousePressed
       
        if (tipoFigura == TipoFigura.tfPonto) {
            p.cor = btnEscolherCorInterna.getBackground();
            p.x = evt.getX();
            p.y = evt.getY();
            p.desenhar(pnlPaint.getGraphics());
            
        } else if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.cor = btnEscolherCorExterna.getBackground();
            retangulo.corInterna = btnEscolherCorInterna.getBackground();
            retangulo.exibirArea = chkArea.isSelected();
            retangulo.exibirPerimetro = chkPerimetro.isSelected();
            retangulo.x = evt.getX();
            retangulo.y = evt.getY();
            
        } else if (tipoFigura == TipoFigura.tfCirculo) {
            circulo.cor = btnEscolherCorExterna.getBackground();
            circulo.corInterna = btnEscolherCorInterna.getBackground();
            circulo.exibirArea = chkArea.isSelected();
            circulo.exibirPerimetro = chkPerimetro.isSelected();
            circulo.x = evt.getX();
            circulo.y = evt.getY();
            
        } else if (tipoFigura == TipoFigura.tfReta) {
            reta.cor = btnEscolherCorExterna.getBackground();
            reta.exibirComprimento = chkComprimento.isSelected();
            reta.x = evt.getX();
            reta.y = evt.getY();
          
        } else if (tipoFigura == TipoFigura.tfPoligono){
             // Aqui é onde você pode adicionar os pontos ao polígono
            poligono.cor = btnEscolherCorExterna.getBackground();
            poligono.corInterna = btnEscolherCorInterna.getBackground();
            poligono.adicionarPontos(evt.getX(), evt.getY());
            poligono.exibirArea = chkArea.isSelected();
            poligono.exibirPerimetro = chkPerimetro.isSelected();
            
            if( poligono.listaPontos.size() >= 2 && evt.getButton() == MouseEvent.BUTTON3){
                poligono.desenhar(pnlPaint.getGraphics());
            }
            
        } else if (tipoFigura == TipoFigura.tfCilindro){
            cilindro.x = evt.getX();
            cilindro.y = evt.getY();
            cilindro.exibirArea = chkArea.isSelected();
            cilindro.exibirVolume = chkVolume.isSelected();
        
        } else if (tipoFigura == TipoFigura.tfPiramide) {
            piramide.x = evt.getX();
            piramide.y = evt.getY();
            piramide.exibirArea = chkArea.isSelected();
            piramide.exibirVolume = chkVolume.isSelected();
    }//GEN-LAST:event_pnlPaintMousePressed
    
    }
    private void pnlPaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMouseReleased

        if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.base = evt.getX() - retangulo.x;
            retangulo.altura = evt.getY() - retangulo.y;
            retangulo.desenhar(pnlPaint.getGraphics());
            
        } else if (tipoFigura == TipoFigura.tfCirculo) {
            circulo.raio = (evt.getX() - circulo.x)/2;
            circulo.desenhar(pnlPaint.getGraphics());
            
        } else if(tipoFigura == TipoFigura.tfReta){
            reta.X1 = evt.getX();
            reta.Y1 = evt.getY();
            reta.desenhar(pnlPaint.getGraphics());
            
        } else if (tipoFigura == TipoFigura.tfCilindro){
            cilindro.X2 = evt.getX();
            cilindro.Y2 = evt.getY();
            cilindro.cor = btnEscolherCorExterna.getBackground();
            cilindro.corInterna = btnEscolherCorInterna.getBackground();
            cilindro.raio = (evt.getX() - cilindro.x)/2;
            cilindro.desenhar(pnlPaint.getGraphics());
            
        } else if (tipoFigura == TipoFigura.tfPiramide) {
            piramide.X2 = evt.getX();
            piramide.Y2 = evt.getY();
            piramide.cor = btnEscolherCorExterna.getBackground();
            piramide.corInterna = btnEscolherCorInterna.getBackground();
            piramide.desenhar(pnlPaint.getGraphics());

        }
    }//GEN-LAST:event_pnlPaintMouseReleased

    private void pnlPaintMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaintMouseDragged
        if (tipoFigura == TipoFigura.tfBorracha) {
            borracha.x = evt.getX();
            borracha.y = evt.getY();
            borracha.cor = pnlPaint.getBackground();
            borracha.desenhar(pnlPaint.getGraphics());
        }  else if (tipoFigura == TipoFigura.tfSpray){
        spray.cor = btnEscolherCorExterna.getBackground();

        // A cada evento, vai chamar a função desenha 10 vezes.
        for(int i = 0; i < 10; i++){
            spray.x = evt.getX();
            spray.y = evt.getY();
            spray.desenhar(pnlPaint.getGraphics());
        }
    }
        
    }//GEN-LAST:event_pnlPaintMouseDragged

    private void btnSprayMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSprayMouseDragged
        
    }//GEN-LAST:event_btnSprayMouseDragged

    private void tamanhoSprayBorrachaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamanhoSprayBorrachaStateChanged
        int tamanho = tamanhoSprayBorracha.getValue();
        spray.setTamanhoSpray(tamanho);
        borracha.setTamanhoBorracha(tamanho);
    }//GEN-LAST:event_tamanhoSprayBorrachaStateChanged

    private void btnPoligonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPoligonoMouseClicked
         tipoFigura = TipoFigura.tfPoligono;
    }//GEN-LAST:event_btnPoligonoMouseClicked

    private void btnPoligonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPoligonoKeyPressed

    }//GEN-LAST:event_btnPoligonoKeyPressed

    private void salvarComoPNG(File arquivo) throws IOException {
        BufferedImage imagem = new BufferedImage(pnlPaint.getWidth(), pnlPaint.getHeight(), BufferedImage.TYPE_INT_ARGB);
        pnlPaint.paint(imagem.getGraphics());
        ImageIO.write(imagem, "png", arquivo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBorracha;
    private javax.swing.JLabel btnCilindro;
    private javax.swing.JLabel btnCirculo;
    private javax.swing.JPanel btnEscolherCorExterna;
    private javax.swing.JPanel btnEscolherCorInterna;
    private javax.swing.JLabel btnOpcoes;
    private javax.swing.JLabel btnPiramide;
    private javax.swing.JLabel btnPoligono;
    private javax.swing.JLabel btnPonto;
    private javax.swing.JLabel btnReta;
    private javax.swing.JLabel btnRetangulo;
    private javax.swing.JLabel btnSalvar;
    private javax.swing.JLabel btnSpray;
    private javax.swing.JCheckBoxMenuItem chkArea;
    private javax.swing.JCheckBoxMenuItem chkComprimento;
    private javax.swing.JCheckBoxMenuItem chkPerimetro;
    private javax.swing.JCheckBoxMenuItem chkVolume;
    private javax.swing.JLabel corDeFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlPainel;
    private javax.swing.JPanel pnlPaint;
    private javax.swing.JSlider tamanhoSprayBorracha;
    // End of variables declaration//GEN-END:variables
}
