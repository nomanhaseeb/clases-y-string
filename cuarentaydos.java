/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda;

/**
 *
 * @author dario
 */
public class cuarentaydos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int representantes = 3, meses = 12, productos = 4, n = 0, suma, ventaTOTAL = 0;
        int ventas[][][] = new int[representantes][meses][productos];
        int total[][] = new int[meses][productos];

        for (int i = 0; i < representantes; i++) {

            System.out.println("");
            for (int j = 0; j < meses; j++) {

                System.out.println("");
                for (int k = 0; k < productos; k++) {

                    ventas[i][j][k] = (int) (Math.random() * 10) + 1;
                    System.out.print(ventas[i][j][k] + " ");

                }

            }

        }
        System.out.println("");

        System.out.println("----------------------");

        for (int i = 0; i < meses; i++) {
            System.out.println(" ");
            for (int j = 0; j < productos; j++) {
                suma = 0;

                for (int k = 0; k < representantes; k++) {
                    suma += ventas[k][i][j];
                    total[i][j] = suma;

                }
                System.out.print(total[i][j] + " ");
            }

        }

    }

}
