/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julka;

import java.util.Scanner;

/**
 *
 * @author rahimgng
 */
public class Julka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2;
        int a = 0, b = 0, c = 0;
        try {
            while (s.hasNext()) {
                n1 = s.nextInt();
                n2 = s.nextInt();
                b = n1;

                while ((b - a) != n2) {
                    if ((a + b) == n1) {
                        a += 1;
                        b -= 1;
                    }
                    if (a % 2 != 0 && b == 0) {
                        break;
                    }
                }
                if (a % 2 != 0 && b == 0) {
                    System.out.println("" + ((float) a) / 2 + "\n" + ((float) a) / 2);

                } else {
                    System.out.println("" + b + "\n" + a);
                }

                a = 0;
                b = 0;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }/*t = 10
while t :
 t -= 1
 x = int( raw_input( ) )
 y = int( raw_input( ) )
 z = ( x + y ) / 2
 print z
 z = x - z
 print z*/
    }
}
