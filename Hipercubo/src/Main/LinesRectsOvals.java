/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author pedro
 */
public class LinesRectsOvals  extends JFrame {

    public LinesRectsOvals() {
        super("Drawing lines, rectangles and ovals");

        setSize(400, 400);
        setVisible(true);
    }
    public void paint( Graphics g ){
        super.paint( g );
        g.setColor( Color.RED );
        g.drawLine( 10, 10, 390, 390 );
        g.setColor( Color.BLUE );
        g.drawRect( 50,50 , 100, 100 ); 
        
    }
    public static void main(String[] args) {
        LinesRectsOvals application = new LinesRectsOvals();
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

}
