/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.composite;

import gof.strategy.IExplodeBehaviour;

/**
 *
 * @author je591116
 */
public class Ligne extends AShape{
    Point x;
    Point y;
   
    public Ligne(IExplodeBehaviour explodeBehaviour, int xa, int ya, int xb, int yb){
        super(explodeBehaviour);
        this.x = new Point(xa, ya);
        this.y = new Point(xb, yb);
    }

}