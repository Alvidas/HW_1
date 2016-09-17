/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Альвидас
 */
public class HW_1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scan = new Scanner(new File("in.txt"));
        scan.useLocale(Locale.US);
        
        while (scan.hasNext()) {
            scan.next();
            
            if (scan.hasNextInt()) {
                System.out.println("int = " + scan.nextInt());
            }
            if(scan.hasNextDouble()){
                System.out.println("double = " + scan.nextDouble());
            }
           
            // scan.next();
           
        }
        scan.close();
    }
}
