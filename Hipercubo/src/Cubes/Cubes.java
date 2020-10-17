/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cubes;

import Cubes.Coordenadas;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pedro
 */
public class Cubes extends JPanel {

    private Coordenadas cuboA[];
    private Coordenadas cuboB[];

    private int[] camino_hipercubo;

    public Cubes(LayoutManager lm, boolean bln) {
        super(lm, bln);
    }

    public Cubes(LayoutManager lm) {
        super(lm);
    }

    public Cubes(boolean bln) {
        super(bln);
    }

    public Cubes() {
        this.setBackground(Color.MAGENTA);
        //System.out.println("Posibles destinos de la arista 0: " + Arrays.toString(posibles_caminos(binarioDeTresPosiciones(entero_a_binario(0)))));

    }

    public Cubes(int[] camino_hipercubo) {
        this.setBackground(Color.MAGENTA);
        this.camino_hipercubo = camino_hipercubo;
        //System.out.println("Posibles destinos de la arista 0: " + Arrays.toString(posibles_caminos(binarioDeTresPosiciones(entero_a_binario(0)))));
    }

    public int binario_a_entero(String binario) {
        int num_entero = 0;
        int digitos = binario.length();
        for (int i = 0; i < binario.length(); i++) {
            digitos--;
            int digito = Integer.parseInt(Character.toString(binario.charAt(digitos)));
            num_entero += digito * (Math.pow(2, i));
        }
        return num_entero;

    }

    public int[] posibles_caminos(String binario) {
        String vector_de_caminos[] = new String[3];
        for (int i = 0; i < binario.length(); i++) {
            String binario_aux = "";
            for (int j = 0; j < binario.length(); j++) {
                if (i == j) {
                    if (binario.charAt(j) == '0') {
                        binario_aux += '1';
                    } else {
                        binario_aux += '0';
                    }
                } else {
                    binario_aux += binario.charAt(j);
                }

            }
            vector_de_caminos[i] = binario_aux;
        }
        int caminos[] = new int[3];
        for (int i = 0; i < vector_de_caminos.length; i++) {
            caminos[i] = binario_a_entero(vector_de_caminos[i]);
        }
//        System.out.println(caminos[0]);
//        System.out.println(caminos[1]);
//        System.out.println(caminos[2]);

        return caminos;

    }

    public String binarioDeTresPosiciones(String binario) {

        switch (binario.length()) {
            case 1: {
                return "00" + binario;
            }
            case 2: {
                return "0" + binario;
            }
            default: {
                return binario;
            }
        }

    }

    public String entero_a_binario(int n) {
        if (n == 0) {
            return Integer.toString(0);
        }

        if (n == 1) {
            return Integer.toString(1);
        }

        //if (n > 1) {
        return entero_a_binario(n / 2) + "" + Integer.toString(n % 2);
        //}
    }

    public void pintarCamino(Graphics2D g2d, Coordenadas[] cuboA, Coordenadas[] cuboB) {
        int[] camino = this.camino_hipercubo;

        int arista_inicial = camino[0];
        int arista_final = camino[camino.length - 1];

        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(9.0f));

        for (int i = 1; i < camino.length; i++) {
            arista_final = camino[i];
            System.out.println(arista_inicial + " a " + arista_final);
            if (arista_inicial <= 7 && arista_final <= 7) {
                //cuboA
                g2d.draw(new Line2D.Double(cuboA[arista_inicial].getX(), cuboA[arista_inicial].getY(), cuboA[arista_final].getX(), cuboA[arista_final].getY()));
                arista_inicial = camino[i];
            } else if (arista_inicial >= 7 && arista_final >= 7) {
                //cuboB
                //g2d.draw(new Line2D.Double(cuboA[arista_inicial].getX(), cuboA[arista_inicial].getY(), cuboA[arista_final].getX(), cuboA[arista_final].getY()));
                arista_inicial = camino[i];
            } else {
                //salto
            }
        }
    }

    public void pintarSaltos(Graphics2D g2d, Coordenadas[] cuboA, Coordenadas[] cuboB) {
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3.0f));
        int alto_arco = 200;
        int arista_actual = 0;
        for (int i = 0; i < cuboA.length; i++) {
            arista_actual = i;
            if (arista_actual <= 3) {
                g2d.draw(new QuadCurve2D.Float(
                        cuboA[arista_actual].getX(), cuboA[arista_actual].getY(),
                        cuboA[arista_actual].getX() + ((cuboB[arista_actual].getX() - cuboA[arista_actual].getX()) / 2), cuboA[arista_actual].getY()
                        - alto_arco,
                        cuboB[arista_actual].getX(), cuboB[arista_actual].getY()));
            } else {
                g2d.draw(new QuadCurve2D.Float(
                        cuboA[arista_actual].getX(), cuboA[arista_actual].getY(),
                        cuboA[arista_actual].getX() + ((cuboB[arista_actual].getX() - cuboA[arista_actual].getX()) / 2), cuboA[arista_actual].getY()
                        + alto_arco,
                        cuboB[arista_actual].getX(), cuboB[arista_actual].getY()));
            }

        }
    }

    public void pintarVertices(Graphics2D g2d, Coordenadas[] cuboA, Coordenadas[] cuboB) {
        g2d.setPaint(Color.BLACK);
        g2d.setStroke(new BasicStroke(3.0f));
        for (int i = 0; i < cuboA.length; i++) {
            int[] caminos = posibles_caminos(binarioDeTresPosiciones(entero_a_binario(i)));
            for (int j = 0; j < caminos.length; j++) {
                g2d.draw(new Line2D.Double(cuboA[i].getX(), cuboA[i].getY(), cuboA[caminos[j]].getX(), cuboA[caminos[j]].getY()));
            }
        }
        for (int i = 0; i < cuboB.length; i++) {
            int[] caminos = posibles_caminos(binarioDeTresPosiciones(entero_a_binario(i)));
            for (int j = 0; j < caminos.length; j++) {
                g2d.draw(new Line2D.Double(cuboB[i].getX(), cuboB[i].getY(), cuboB[caminos[j]].getX(), cuboB[caminos[j]].getY()));
            }
        }
    }

    public void pintarAristas(Graphics2D g2d, Coordenadas[] cuboA, Coordenadas[] cuboB) {
        int radio = 16;
        g2d.setPaint(Color.GREEN);
        g2d.setStroke(new BasicStroke(6.0f));
        for (Coordenadas arista : cuboA) {
            int x_center = arista.getX() - (radio / 2);
            int y_center = arista.getY() - (radio / 2);
            g2d.drawOval(x_center, y_center, radio, radio);
            g2d.fillOval(x_center, y_center, radio, radio);
            g2d.drawString(arista.getName(), arista.getX(), arista.getY());
        }
        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(6.0f));
        for (Coordenadas arista : cuboA) {
            g2d.drawString(arista.getName(), arista.getX(), arista.getY());
        }

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(6.0f));
        for (Coordenadas arista : cuboB) {
            int x_center = arista.getX() - (radio / 2);
            int y_center = arista.getY() - (radio / 2);

            g2d.drawOval(x_center, y_center, radio, radio);
            g2d.fillOval(x_center, y_center, radio, radio);
        }
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        for (Coordenadas arista : cuboB) {
            g2d.drawString(arista.getName(), arista.getX(), arista.getY());
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        int x = 50, y = 150;
        int longitud_vertice = 125;

        Coordenadas cuboA[] = new Coordenadas[8];
        cuboA[0] = new Coordenadas("0", x, y);//arista de cubo A: 0 000=0
        cuboA[1] = new Coordenadas("1", x + longitud_vertice, y);//arista de cubo A: 0 001=1
        cuboA[2] = new Coordenadas("2", x + longitud_vertice / 2, y + longitud_vertice / 2);//arista de cubo A: 0 010=2
        cuboA[3] = new Coordenadas("3", cuboA[2].getX() + longitud_vertice, cuboA[2].getY());//arista de cubo A: 0 011=3
        cuboA[4] = new Coordenadas("4", x, y + longitud_vertice);//arista de cubo A: 0 100=4
        cuboA[5] = new Coordenadas("5", x + longitud_vertice, y + longitud_vertice);//arista de cubo A: 0 101=5
        cuboA[6] = new Coordenadas("6", cuboA[2].getX(), cuboA[2].getY() + longitud_vertice);//arista de cubo A: 0 110=6
        cuboA[7] = new Coordenadas("7", cuboA[2].getX() + longitud_vertice, cuboA[2].getY() + longitud_vertice);//arista de cubo A: 0 111=7
        this.cuboA = cuboA;

        x = x + 550;
        //y = 100;
        Coordenadas cuboB[] = new Coordenadas[8];
        cuboB[0] = new Coordenadas("8", x, y);//arista de cubo B: 0 000=0
        cuboB[1] = new Coordenadas("9", x + longitud_vertice, y);//arista de cubo B: 0 001=1
        cuboB[2] = new Coordenadas("10", x + longitud_vertice / 2, y + longitud_vertice / 2);//arista de cubo B: 0 010=2
        cuboB[3] = new Coordenadas("11", cuboB[2].getX() + longitud_vertice, cuboB[2].getY());//arista de cubo B: 0 011=3
        cuboB[4] = new Coordenadas("12", x, y + longitud_vertice);//arista de cubo B: 0 100=4
        cuboB[5] = new Coordenadas("13", x + longitud_vertice, y + longitud_vertice);//arista de cubo B: 0 101=5
        cuboB[6] = new Coordenadas("14", cuboB[2].getX(), cuboB[2].getY() + longitud_vertice);//arista de cubo B: 0 110=6
        cuboB[7] = new Coordenadas("15", cuboB[2].getX() + longitud_vertice, cuboB[2].getY() + longitud_vertice);//arista de cubo B: 0 111=7
        this.cuboB = cuboB;

        pintarSaltos(g2d, this.cuboA, this.cuboB);
        pintarVertices(g2d, this.cuboA, this.cuboB);

        pintarCamino(g2d, this.cuboA, this.cuboB);

        pintarAristas(g2d, this.cuboA, this.cuboB);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Simulacion de hipercubos");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(900, 600);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int[] vector = {0, 1, 3, 7, 15, 13, 12, 8};
        //Cubes cubes = new Cubes();
        Cubes cubes = new Cubes(vector);

        cubes.setVisible(true);
        cubes.setSize(850, 550);
        cubes.setLocation(0, 0);

        frame.add(cubes);

    }

    private void setBorder(float BOTTOM_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
