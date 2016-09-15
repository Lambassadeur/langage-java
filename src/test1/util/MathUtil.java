/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static int carre(int nb) {
        return nb * nb;

    }

    public static int genRand()
    {    
        return (int) (Math.random()*100); 
    }

    public static int genRand(int min, int max)
    {    
        int gen = (int) Math.random();

        return (int)(min + Math.random()*(1+max-min));         
    }

    public static int exposant(int nombre, int puissance)
    {
        if(puissance<=0)
            return 1;
        
        int res=1;
        for(int i=1 ; i<=puissance ; i++)
        {
            res = res*nombre;
        }
        return res;
    }
    

    public static int puissance(int n, int p)
    {
        if(p<=1)
            return 1;

        return n * puissance(n, p-1);
    }

    
    public static int factorielle(int n)
    {        
        if(n<0)
            throw new RuntimeException("Erreur mathématique");
            
        if(n<0)
            return 1;
        
        int res=1;
        while(n>1)
            res = res * n--;
        
        return res;
    }

    public static int facto(int n)
    {
        if(n<0)
            throw new RuntimeException("Erreur mathématique");

        if(n<=1)
            return 1;
        else
            return n*facto(n-1);    
    }


}