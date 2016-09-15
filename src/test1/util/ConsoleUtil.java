/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class ConsoleUtil {

    public static String lireTexte(String message) throws IOException {
        System.out.print(message);
        DataInputStream inp = new DataInputStream(System.in);
        String texte = inp.readLine();
        return texte;
    }

    public static int ReadInt(String message) throws IOException {

        return Integer.valueOf( lireTexte(message) );
    }
    
}
