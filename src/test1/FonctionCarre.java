/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class FonctionCarre {
    
    public static void main(String[] args) throws IOException{
        System.out.println("Nombre à élever au carré");

        Integer nb = Integer.valueOf( new DataInputStream(System.in).readLine() );        
        System.out.println(MathUtil.carre(nb));        
    }
    
    
}
