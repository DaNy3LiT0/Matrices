/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.com.itse.programacion_2.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Matriz extends JFrame {

    public Matriz() {

        initComponents();
        this.setLocationRelativeTo(null);
        generarMatrizRandom();
    }

    JButton celdaAux[][];
    JButton celdas[][];
    int NumMax = 0;
    int NumMin = 100;
    int Mayor_i = 0;
    int Mayor_j = 0;
    int Menor_i = 0;
    int Menor_j = 0;
    int auxi = 0;
    int auxj = 9;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMatriz = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniNuevaMatriz = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniMatrizMinMax = new javax.swing.JMenuItem();
        mniMatrizEspiral = new javax.swing.JMenuItem();
        mniDiagonales = new javax.swing.JMenuItem();
        mniTrianguloInf = new javax.swing.JMenuItem();
        mniFilaPar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlMatrizLayout = new javax.swing.GroupLayout(pnlMatriz);
        pnlMatriz.setLayout(pnlMatrizLayout);
        pnlMatrizLayout.setHorizontalGroup(
            pnlMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlMatrizLayout.setVerticalGroup(
            pnlMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        mniNuevaMatriz.setText("Nueva Matriz");
        mniNuevaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevaMatrizActionPerformed(evt);
            }
        });
        jMenu1.add(mniNuevaMatriz);

        mniSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mniSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ejecutar");

        mniMatrizMinMax.setText("Matriz Maximo/Minimo");
        mniMatrizMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMatrizMinMaxActionPerformed(evt);
            }
        });
        jMenu2.add(mniMatrizMinMax);

        mniMatrizEspiral.setText("Matriz Espiral");
        mniMatrizEspiral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMatrizEspiralActionPerformed(evt);
            }
        });
        jMenu2.add(mniMatrizEspiral);

        mniDiagonales.setText("Matriz Diagonales");
        mniDiagonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiagonalesActionPerformed(evt);
            }
        });
        jMenu2.add(mniDiagonales);

        mniTrianguloInf.setText("Matriz Triangulo Inferior");
        mniTrianguloInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrianguloInfActionPerformed(evt);
            }
        });
        jMenu2.add(mniTrianguloInf);

        mniFilaPar.setText("Matriz Fila Par");
        mniFilaPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFilaParActionPerformed(evt);
            }
        });
        jMenu2.add(mniFilaPar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        mniAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniAbout.setText("About");
        mniAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAboutActionPerformed(evt);
            }
        });
        jMenu3.add(mniAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        JOptionPane.showMessageDialog(this,
                """
                The Matrix version 1.0
                
                by Programation II
                
                """
                + Calendar.getInstance().get(Calendar.YEAR)
                + ". Open Source Code.\n\n"
                + "info@programation2.com.ar\n\n"
                + "https://github.com/DaNy3LiT0/Matrices.git",
                "About",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mniAboutActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.out.println("Final.");
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed
  
    private void mniMatrizEspiralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMatrizEspiralActionPerformed
        pnlMatriz.removeAll();
        pnlMatriz.revalidate();
        pnlMatriz.repaint();
        
        celdaAux = new JButton[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            JButton tempo = new JButton();
            tempo.setText(celdas[i][j].getText());
            celdaAux[i][j] = tempo;
            pnlMatriz.add(celdaAux[i][j]);
            }
        }
        
        // Define los colores inicial y final
        Color colorInicial = Color.cyan;
        Color colorFinal = Color.black;

        // Calcula los incrementos para cada componente de color
        int incrementoRojo = (colorFinal.getRed() - colorInicial.getRed()) / (10 * 10);
        int incrementoVerde = (colorFinal.getGreen() - colorInicial.getGreen()) / (10 * 10);
        int incrementoAzul = (colorFinal.getBlue() - colorInicial.getBlue()) / (10 * 10);

        // Inicializa los componentes del color actual
        int rojoActual = colorInicial.getRed();
        int verdeActual = colorInicial.getGreen();
        int azulActual = colorInicial.getBlue();

        // Recorre la matriz en forma de caracol
        for (int nivel = 0; nivel < 5; nivel++) {
            
            for (int j = nivel; j < 10 - nivel; j++) {
                celdaAux[nivel][j].setBackground(new Color(rojoActual, verdeActual, azulActual));
                rojoActual += incrementoRojo;
                verdeActual += incrementoVerde;
                azulActual += incrementoAzul;
            }
            for (int i = nivel + 1; i < 10 - nivel; i++) {
                celdaAux[i][10 - nivel - 1].setBackground(new Color(rojoActual, verdeActual, azulActual));
                rojoActual += incrementoRojo;
                verdeActual += incrementoVerde;
                azulActual += incrementoAzul;
            }
            for (int j = 10 - nivel - 2; j >= nivel; j--) {
                celdaAux[10 - nivel - 1][j].setBackground(new Color(rojoActual, verdeActual, azulActual));
                rojoActual += incrementoRojo;
                verdeActual += incrementoVerde;
                azulActual += incrementoAzul;
            }
            for (int i = 10 - nivel - 2; i > nivel; i--) {
                celdaAux[i][nivel].setBackground(new Color(rojoActual, verdeActual, azulActual));
                rojoActual += incrementoRojo;
                verdeActual += incrementoVerde;
                azulActual += incrementoAzul;
            }
        
    }//GEN-LAST:event_mniMatrizEspiralActionPerformed
    
        pnlMatriz.setVisible(true);
        System.out.println("mniMatrizEspiralActionPerformed(java.awt.event.ActionEvent evt)");
    }
    
    private void mniDiagonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiagonalesActionPerformed
                
        pnlMatriz.removeAll();
        pnlMatriz.revalidate();
        pnlMatriz.repaint();
        
        celdaAux = new JButton[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            JButton tempo = new JButton();
            tempo.setText(celdas[i][j].getText());
            celdaAux[i][j] = tempo;
            pnlMatriz.add(celdaAux[i][j]);
            }
        }
        
        
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 10) {
                
                boolean color1 = (i == j);
                if (color1) {
                    celdaAux[i][j].setBackground(Color.cyan);
                }
                boolean color2 = (i == auxi && j == auxj);
                if (color2) {
                    celdaAux[i][j].setBackground(Color.pink);
                    auxi = auxi + 1;
                    auxj = auxj - 1;
                }
                j++;
            }
            i++;
        }

        pnlMatriz.setVisible(true);
        System.out.println("mniDiagonalesActionPerformed(java.awt.event.ActionEvent evt)");
        
    }//GEN-LAST:event_mniDiagonalesActionPerformed

    private void mniMatrizMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMatrizMinMaxActionPerformed
        
        pnlMatriz.removeAll();
        pnlMatriz.revalidate();
        pnlMatriz.repaint();
        
        
        celdaAux = new JButton[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                JButton tempo = new JButton();
                tempo.setText(celdas[i][j].getText());
                celdaAux[i][j] = tempo;
                pnlMatriz.add(celdaAux[i][j]);
                }
            }
        
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 10) {
                JButton tempo1 = new JButton();
                tempo1.setText(String.valueOf(i) + "," + String.valueOf(j));
                String cadena = celdaAux[i][j].getText();
                int a = Integer.parseInt(cadena);
                
                if (a > NumMax) {
                    NumMax = a;
                    Mayor_i = i;
                    Mayor_j = j;
                }
                if (a < NumMin) {
                    NumMin = a;
                    Menor_i = i;
                    Menor_j = j;
                }
                j++;
            }
            i++;
        }
        
        celdaAux[Mayor_i][Mayor_j].setBackground(Color.blue);
        celdaAux[Menor_i][Menor_j].setBackground(Color.yellow);
                
        pnlMatriz.setVisible(true);
        System.out.println("mniMatrizMinMaxActionPerformed(java.awt.event.ActionEvent evt)");
    }//GEN-LAST:event_mniMatrizMinMaxActionPerformed

    private void mniTrianguloInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrianguloInfActionPerformed
        pnlMatriz.removeAll();
        pnlMatriz.revalidate();
        pnlMatriz.repaint();
        
        celdaAux = new JButton[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            JButton tempo = new JButton();
            tempo.setText(celdas[i][j].getText());
            celdaAux[i][j] = tempo;
            pnlMatriz.add(celdaAux[i][j]);
            }
        }
        
        int inij=0;
        int topj=9;
        int i=9;
        //int j=0;
        while (i>=i/2){
            while (i<=topj){
                int j=inij;
                while(j<=topj){
                    celdaAux[i][j].setBackground(Color.green);
                    j=j+1;                
                }
            
            i--;
            topj--;
            inij++;
               
            }            
       }
        pnlMatriz.setVisible(true);  
        System.out.println("mniTrianguloInfActionPerformed(java.awt.event.ActionEvent evt)");
    }//GEN-LAST:event_mniTrianguloInfActionPerformed

    private void mniFilaParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFilaParActionPerformed
        pnlMatriz.removeAll();
        pnlMatriz.revalidate();
        pnlMatriz.repaint();
        
        celdaAux = new JButton[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            JButton tempo = new JButton();
            tempo.setText(celdas[i][j].getText());
            celdaAux[i][j] = tempo;
            pnlMatriz.add(celdaAux[i][j]);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0) {
                celdaAux[i][j].setBackground(Color.WHITE); 
                }
            }       
        }
        
        pnlMatriz.setVisible(true);
        System.out.println("mniFilaParActionPerformed(java.awt.event.ActionEvent evt)");
        
    }//GEN-LAST:event_mniFilaParActionPerformed

    private void mniNuevaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevaMatrizActionPerformed
        
        pnlMatriz.removeAll();
        pnlMatriz.revalidate();
        pnlMatriz.repaint();
        
        pnlMatriz.setLayout(new GridLayout(10, 10));
        celdas = new JButton[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numaleatorio = random.nextInt(100);
                JButton tempo = new JButton();
                tempo.setText(String.valueOf(numaleatorio));
                celdas[i][j] = tempo;
                pnlMatriz.add(celdas[i][j]);
            }
        }
    }//GEN-LAST:event_mniNuevaMatrizActionPerformed

    private void generarMatrizRandom(){
        pnlMatriz.setLayout(new GridLayout(10, 10));
        celdas = new JButton[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numaleatorio = random.nextInt(100);
                JButton tempo = new JButton();
                tempo.setText(String.valueOf(numaleatorio));
                celdas[i][j] = tempo;
                pnlMatriz.add(celdas[i][j]);
            }
        }
    }
    

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniDiagonales;
    private javax.swing.JMenuItem mniFilaPar;
    private javax.swing.JMenuItem mniMatrizEspiral;
    private javax.swing.JMenuItem mniMatrizMinMax;
    private javax.swing.JMenuItem mniNuevaMatriz;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniTrianguloInf;
    private javax.swing.JPanel pnlMatriz;
    // End of variables declaration//GEN-END:variables

    
}
