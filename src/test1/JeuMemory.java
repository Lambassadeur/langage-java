/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

//import java.util.Collections;

/**
 *
 * @author admin
 */
public class JeuMemory {

    private char tab[][];
    
    public static void main(String[] args)  {
        JeuMemory jm = new JeuMemory();
    }

    public JeuMemory() {
    }
    
    
    private void InitJeuMemory(int size)
    {
        tab = new char[size][size];
        
//        List<char> pairs;
        
        for(char c='A';c<'Z';c++)
            //pairs.add(c)
                    ;
        
        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
            {
                // choix aléatoire lettre
//                max = 0; // pairs.length;
//                int idx = MathUtil.genRand(0, max);
                
                tab[i][j] = '.';
            }
            
        
        
        
    }
    
    public void DispArray()
    {
        for(int i=0;i<tab.length;i++)
        {
            for(int j=0;j<tab.length;j++)
                System.out.print( tab[i][j] + " " );
            System.out.println( );            
        }
    }

}
