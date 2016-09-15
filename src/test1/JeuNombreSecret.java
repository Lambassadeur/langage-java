/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {
    
    public static void main(String argv[]) throws IOException {

//int res = 0;

//res = MathUtil.exposant(2, 6);
//res = MathUtil.puissance(2, 6);
//res = MathUtil.factorielle(8);
//res = MathUtil.facto(8);

//res = MathUtil.genRand(5, -10);

//System.out.println(res);

        int min  = Integer.valueOf( ConsoleUtil.lireTexte("Saisir le minimum : ") );
        int max  = Integer.valueOf( ConsoleUtil.lireTexte("Saisir le maximum : ") );
        
        int nbSecret = MathUtil.genRand(min, max);

        System.out.println("nbSecret : " + nbSecret);
        
        int saisie;
        int tentative=0;
        
//        for(;;)
        do
        {
            saisie = Integer.valueOf( ConsoleUtil.lireTexte("Devinez le nombre secret : ") );
            tentative++;

            if (saisie>nbSecret)
                System.out.println("plus petit");
            else if (saisie<nbSecret)
                System.out.println("plus grand");
            else
            {
                System.out.printf("Bravo, réussi en %d essai\n", tentative);
                
                if(tentative<3)
                    System.out.println("GENIAL");
                else if(tentative<6)
                    System.out.println("SUPER");
                else if(tentative<9)
                    System.out.println("COOL");
                else if(tentative<12)
                    System.out.println("PAS MAL");
                else
                    System.out.println("NUL");                    
                return;
            }
        } while(saisie != nbSecret);


    }
}
