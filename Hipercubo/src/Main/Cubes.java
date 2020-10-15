/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pedro
 */
public class Cubes extends JPanel {

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
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.GREEN);
        g2d.setStroke(new BasicStroke(6.0f));

        int x = 50, y = 100;
        int longitud_vertice = 125;

        Coordenadas cuboA[] = new Coordenadas[8];
        cuboA[0] = new Coordenadas(x, y);//arista de cubo A: 0 000=0
        cuboA[1] = new Coordenadas(x + longitud_vertice, y);//arista de cubo A: 0 001=1
        cuboA[2] = new Coordenadas(x + longitud_vertice / 2, y + longitud_vertice / 2);//arista de cubo A: 0 010=2
        cuboA[3] = new Coordenadas(cuboA[2].getX() + longitud_vertice, cuboA[2].getY());//arista de cubo A: 0 011=3
        cuboA[4] = new Coordenadas(x, y + longitud_vertice);//arista de cubo A: 0 100=4
        cuboA[5] = new Coordenadas(x + longitud_vertice, y + longitud_vertice);//arista de cubo A: 0 101=5
        cuboA[6] = new Coordenadas(cuboA[2].getX(), cuboA[2].getY() + longitud_vertice);//arista de cubo A: 0 110=6
        cuboA[7] = new Coordenadas(cuboA[2].getX() + longitud_vertice, cuboA[2].getY() + longitud_vertice);//arista de cubo A: 0 111=7
        
        x = x+550;
        //y = 100;
        Coordenadas cuboB[] = new Coordenadas[8];
        cuboB[0] = new Coordenadas(x, y);//arista de cubo B: 0 000=0
        cuboB[1] = new Coordenadas(x + longitud_vertice, y);//arista de cubo B: 0 001=1
        cuboB[2] = new Coordenadas(x + longitud_vertice / 2, y + longitud_vertice / 2);//arista de cubo B: 0 010=2
        cuboB[3] = new Coordenadas(cuboB[2].getX() + longitud_vertice, cuboB[2].getY());//arista de cubo B: 0 011=3
        cuboB[4] = new Coordenadas(x, y + longitud_vertice);//arista de cubo B: 0 100=4
        cuboB[5] = new Coordenadas(x + longitud_vertice, y + longitud_vertice);//arista de cubo B: 0 101=5
        cuboB[6] = new Coordenadas(cuboB[2].getX(), cuboB[2].getY() + longitud_vertice);//arista de cubo B: 0 110=6
        cuboB[7] = new Coordenadas(cuboB[2].getX() + longitud_vertice, cuboB[2].getY() + longitud_vertice);//arista de cubo B: 0 111=7
  

//        g2d.draw(new Line2D.Double(cuboA[0].getX(), cuboA[0].getY(), cuboA[1].getX(), cuboA[1].getY()));//cuboA: 0 a 1
//        g2d.draw(new Line2D.Double(cuboA[0].getX(), cuboA[0].getY(), cuboA[2].getX(), cuboA[2].getY()));//cuboA: 0 a 2
//        g2d.draw(new Line2D.Double(cuboA[0].getX(), cuboA[0].getY(), cuboA[4].getX(), cuboA[4].getY()));//cuboA: 0 a 4

        int radio = 16;
        for (Coordenadas arista : cuboA) {
            int x_center = arista.getX() - (radio / 2);
            int y_center = arista.getY() - (radio / 2);

            g2d.drawOval(x_center, y_center, radio, radio);
            g2d.fillOval(x_center, y_center, radio, radio);
        }
        
        g2d.setPaint(Color.ORANGE);
        for (Coordenadas arista : cuboB) {
            int x_center = arista.getX() - (radio / 2);
            int y_center = arista.getY() - (radio / 2);

            g2d.drawOval(x_center, y_center, radio, radio);
            g2d.fillOval(x_center, y_center, radio, radio);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(900, 600);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Cubes cubes = new Cubes();
        cubes.setVisible(true);
        cubes.setSize(850, 550);
        cubes.setLocation(0, 0);

        frame.add(cubes);

    }

    private void setBorder(float BOTTOM_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
