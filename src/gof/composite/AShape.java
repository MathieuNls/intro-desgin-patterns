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
public abstract class AShape {
    protected IExplodeBehaviour explodeBehaviour;
    
    public AShape(IExplodeBehaviour explodeBehaviour){
        this.explodeBehaviour = explodeBehaviour;
    }
    
    public void explode(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        return "Je suis un(e) " + this.getClass().getSimpleName();
    }
}
