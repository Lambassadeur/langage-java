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
public class Variables {
    
    public static void main(String[] args) {
        int entier1 = 123, entier2 = 456;

        double d = 1;
        char c = 'c';
        boolean b = true;
        long l = 0x1234;

        String s = "autjdk";
        s = Long.toString(123);
        
        System.out.printf("%d\n", entier1 + entier2);

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\n", i);
        }

        Float f = (float)123.0;
        
        Integer i = 123;
        s = i.toString();
System.out.println(s);

        l = Long.valueOf(s);
        l += 100;
        String s2 = Long.toString(l);
        
//        System.out.println("%l  ", l);

        String s3 = Integer.toString(123);
        long l2 = Long.valueOf(s3);

    }
}
