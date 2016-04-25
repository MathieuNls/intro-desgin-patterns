/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.composite;

import gof.strategy.IExplodeBehaviour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author je591116
 */
public class ComplexShape extends AShape{

    private List<AShape> shapes;
    
    public ComplexShape(IExplodeBehaviour behaviour){
        super(behaviour);
        shapes = new ArrayList<AShape>();
    }
    
    public void addShape(AShape shape){
        this.shapes.add(shape);
    }
    
    public void removeShape(AShape shape){
        this.shapes.remove(shape);
    }
    
    @Override
    public void explode() {
       System.out.println("Je suis une forme Complexe Composée de :");
       this.explodeBehaviour.explode(shapes);
    }
    
}
