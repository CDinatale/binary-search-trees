package ca.gbc.comp2080.test;
/***********************************
*
* COMP2080 - Fundamentals of Data Structures
* File name: Test15.java
*
************************************/
import java.io.*;       // to read/write files

import ca.gbc.comp2080.assign3.AVLTree;
import ca.gbc.comp2080.datastructures.TreePrint;

public class Test15 {

   public static void printOutput(AVLTree t){
        System.out.print("Preorder: ");
        TreePrint.preorderPrint(t, t.root());
        //System.out.println();
        //System.out.print("Postorder: ");
        //TreePrint.postorderPrint(t, t.root());
        //System.out.println();
        //System.out.println();
   }


   public static void main (String[] args) throws IOException{



        AVLTree t4 = new AVLTree();

	  t4.insert(35, 35);
        t4.insert(20, 20);
        t4.insert(50, 50);

        t4.insert(40, 40);
        t4.insert(45, 45);
        printOutput(t4);

        //System.out.println("Input: 35, 20, 50, 40, 45");
        //System.out.println();

   }  // end main


}  // end class

