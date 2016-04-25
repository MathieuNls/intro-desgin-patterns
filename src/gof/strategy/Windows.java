/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.strategy;

import gof.composite.AShape;
import java.util.List;

/**
 *
 * @author je591116
 */
public class Windows implements IExplodeBehaviour{

    @Override
    public void explode(List<AShape> shapes) {
        for(int i = shapes.size() - 1; i >= 0; i--){
           shapes.get(i).explode();
        }
    }
    
}
