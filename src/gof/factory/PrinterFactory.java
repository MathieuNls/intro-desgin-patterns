/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.factory;

/**
 *
 * @author je591116
 */
public class PrinterFactory {
    public static IPrinter createsPrinter(EPrinters printerType){
        switch(printerType){
            case A2:
                return new A2Printer();
            case A3:
                return new A3Printer();
            case A4:
                return new A4Printer();
            default:
                return null;
        }
    }
}
