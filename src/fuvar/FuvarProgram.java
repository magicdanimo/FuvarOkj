/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author win7
 */
public class FuvarProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fuvar.csv");
        Scanner scr = new Scanner(file);
        ArrayList<Fuvar> fuvarok = new ArrayList<>();
        scr.nextLine();
        while (scr.hasNextLine()) {            
            fuvarok.add(new Fuvar(scr.nextLine()));
        }
    }
    
}
