/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.paintDotGof;

import gof.composite.AShape;
import gof.composite.ComplexShape;
import gof.composite.Ligne;
import gof.factory.EPrinters;
import gof.factory.IPrinter;

import gof.factory.PrinterFactory;
import gof.strategy.IExplodeBehaviour;
import gof.strategy.Windows;

/**
 *
 * @author je591116
 */
public class PaintDotGof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IExplodeBehaviour behaviour = new Windows();
        
        System.out.println("Je dessine une forme simple");
        AShape line = new Ligne(behaviour, 5, 5, 10, 10);
        line.explode();
        
        System.out.println("Je dessine une forme Complexe");
        ComplexShape complexeForm = new ComplexShape(behaviour);
        complexeForm.addShape(line);
        complexeForm.addShape(new Ligne(behaviour, 10, 10, 20, 20));
        complexeForm.explode();
        
        System.out.println("Je dessine une forme très Complexe");
        ComplexShape veryComplexShape = new ComplexShape(behaviour);
        veryComplexShape.addShape(complexeForm);
        veryComplexShape.addShape(line);
        veryComplexShape.explode();
        
        System.out.println("Je choisi l'imprimante A2");
        IPrinter printer = PrinterFactory.createsPrinter(EPrinters.A2);
        printer.print();
    }
}
