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
public interface IExplodeBehaviour {
    public void explode(List<AShape> shapes);
}
