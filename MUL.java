/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmultiplication;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author rahimgng
 */
public class FastMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int boyut = s.nextInt();
        BigInteger n1 = new BigInteger("1");
        BigInteger n2 = new BigInteger("1");
        BigInteger result = new BigInteger("1");
        for (int i = 0; i < boyut; i++) {
                n1 = s.nextBigInteger();
                n2 = s.nextBigInteger();
                
                result = n1.multiply(n2);
                System.out.println(""+result);
        }

    }

}
