/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kvadratinismasyvas;

import java.util.Arrays;

/**
 *
 * @author tavar
 */
public class KvadratinisMasyvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] m = {1, 2, 3};
        int[][] r = new int[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
//                r[i][(i + j) % m.length] = m[j]; 
                  r[i][j] = m[(i+j)%m.length];
            }
        }
        System.out.println(Arrays.deepToString(r));

//        System.out.println(Arrays.toString(m)); mano veikiantis varinats
//        for (int i = 0; i < m.length - 1; i++) {
//            int[] m2 = new int[m.length];
//            int s = m[m.length - 1];
////            m2[i + 1] = m[i];
//            m2[0] = s;
//
//            for (int j = 0; j < m.length - 1; j++) {
////                int l = m2[m2.length - 1];
//                m2[j + 1] = m[j];
////                m2[0] = l;
//            }
//            m = m2;
//            System.out.println(Arrays.toString(m2));
//
//        }
    }
}
