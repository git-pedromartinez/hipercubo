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
    private String name="";

    public Coordenadas(String name,int x, int y) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
