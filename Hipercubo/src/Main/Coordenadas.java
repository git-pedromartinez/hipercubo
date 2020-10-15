/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author pedro
 */
public class Coordenadas {
    private int x=0;
    private int y=0;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenadas() {
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
