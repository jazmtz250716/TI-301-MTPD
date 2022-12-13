/*
 * ITESS-TICS 
 * Ago-Dic2022
 * MPTD
 * Description: Inventario modelo EOQ
 * by FJMP
 * frajavimopu@gmail.com
 */
package test;

import eoq.*;

public class EOQTest {
     public static void main(String[] args) {
         System.out.println("EOQ testing defalut constructor ---------------");
         EOQ eoqDefault = new EOQ();
         
         eoqDefault.print();
         eoqDefault.setK(5.0f);
         eoqDefault.setH(0.08f);
         eoqDefault.setD(500.0f);
         
         eoqDefault.print();
         System.out.println("solucion EOQ: " + eoqDefault.solve());
         
         
         System.out.println("EOQ testing parameters constructor ---------------");
         EOQ eoqParams = new EOQ(5.0f, 0.08f, 500.0f);
         
         eoqParams.print();
         System.out.println("solucion EOQ: " + eoqParams.solve());
         
     }
}
