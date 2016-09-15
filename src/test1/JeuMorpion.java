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
public class JeuMorpion {
    
    private char tab[][];
    
    public static void main(String[] args) throws IOException {
        
        JeuMorpion jm = new JeuMorpion();
                
        jm.InitJeuMorpion(3, '.');
        jm.DispArray();

        int l=0, c=0, v=0;
        
        do
        {
            for(int p=1;p<=2;p++)
            {
                l = ConsoleUtil.ReadInt("Joueur " + p + " : ligne ?");
                c = ConsoleUtil.ReadInt("Joueur " + p + " : colonne ?");
                jm.set(l, c, p==1?'X':'O' );
                jm.DispArray();
                
                v=jm.CheckVictory();
                if(v>0)
                    return;
            }
                        
        }while(true);
    }

    public boolean set(int l, int c, char v)
    {
        boolean ret = (l>=0 && l<tab.length && c>=0 && c<tab[l].length );
        
        // If valid
        if (ret)
            if (tab[l][c] == '.')
                tab[l][c] = v;
            else
            {
                System.out.println( "case " + l + "," + c + " non vide" );
                ret = false;
            }
        return ret;
    }
    
    public JeuMorpion()
    {
        InitJeuMorpion(3, '0');
    }
    
    public JeuMorpion(char def)
    {
        InitJeuMorpion(3, def);
    }

    public JeuMorpion(int size, char def)
    {
        InitJeuMorpion(size, def);
    }

    private void InitJeuMorpion(int size, char def)
    {
        tab = new char[size][size];
        
        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
                tab[i][j] = def;    //MathUtil.genRand(min, max);
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
    
    public int DispVictory(int cross, int dot)
    {
        if (cross==3){
            System.out.println("Victory for cross");
            int i = func(cross,dot);
            return 1;
        }
        
        if (dot==3){
            System.out.println("Victory for dot");
            return 2;
        }
        return 0;
    }
    
    public int CheckVictory()   //return victorious player
    {
        int cross=0;
        int dot=0;
        int vic=0;
        
        // Check lines
        for(int i=0;i<tab.length;i++)
        {
            cross=0;            dot=0;

            for(int j=0;j<tab.length;j++)
            {
                switch(tab[i][j])
                {
                    case 'X':   cross++;    break;
                    case 'O':   dot++;      break;
                }           
            }
            vic=DispVictory(cross, dot);
            if (vic>0)return (vic);
        }
        
        // Check columns
        for(int j=0;j<tab.length;j++)
        {
            cross=0;            dot=0;

            for(int i=0;i<tab.length;i++)
            {
                switch(tab[i][j])
                {
                    case 'X':   cross++;    break;
                    case 'O':   dot++;      break;
                }           
            }
            vic=DispVictory(cross, dot);
            if (vic>0)return (vic);            
        }
        
        // Check diagonals
        cross=0;        dot=0;
        for(int i=0;i<tab.length;i++)
        {
            switch(tab[i][i])
            {
                case 'X':   cross++;    break;
                case 'O':   dot++;      break;
            }           
        }
        vic=DispVictory(cross, dot);
        if (vic>0)return (vic);


        cross=0;        dot=0;
        for(int i=0;i<tab.length;i++)
        {
            switch(tab[i][tab.length-1 - i])
            {
                case 'X':   cross++;    break;
                case 'O':   dot++;      break;
            }           
        }
        vic=DispVictory(cross, dot);
        if (vic>0)return (vic);
        
        return(vic);
    }

    private int func(int cross, int dot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
