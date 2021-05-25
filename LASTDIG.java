/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastdigit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author rahimgng
 */
public class Lastdigit {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner s = new Scanner(System.in);
        int boyut = s.nextInt();
        
        int a, b;
        double last;
        try {
            if (boyut < 31) {
                for (int i = 0; i < boyut; i++) {
                    a = s.nextInt();
                    b = s.nextInt();

                    last = (Math.pow(a, b) % 10);

                    System.out.println("" + (int) last);
                }
            }

        } catch (Exception e) {
        }*/
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        BigInteger a;
        BigInteger b;
        BigInteger last;

        for (int i = 0; i < size; i++) {
            a = s.nextBigInteger();
            b = s.nextBigInteger();

            last = a.modPow(b, BigInteger.TEN);

            System.out.println(last);
        }
    }

}
