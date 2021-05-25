/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

import java.util.Scanner;

/**
 *
 * @author rahimgng
 */
public class Rectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            for (int j = i; j <= (num / i) ; j++) {
                if (i * j <= num) {
                    sum++;
                    //System.out.println("here");
                }
            }
            
        }if(num == 1)
            sum = 1;
        System.out.println("" + sum);

    }

}
