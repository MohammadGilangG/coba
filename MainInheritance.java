/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Pewarisan;

/**
 *
 * @author MOHAMMAD GILANG
 */
public class MainInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musuh ms = new Musuh();
        Robot rb = new Robot();
        
        rb.attack();
        rb.defend();
        rb.fly();
    }
    
}
