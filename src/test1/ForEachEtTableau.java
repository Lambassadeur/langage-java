/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class ForEachEtTableau {
    
    public static void main(String[] args) {
        int[] tab = new int[100];
        
        // !! Read Only !!
        for(int elem : tab){
            elem = 1;           // !! Don't change tab
        }

        for(int idx=0 ; idx<tab.length ; idx++){
            tab[idx] = 1;
        }
        
        
        for(int elem : tab){
            System.out.println( elem );
        }
        
    }
}
