package ca.gbc.comp2080.test;
/***********************************
*
* COMP2080 - Fundamentals of Data Structures
* File name: Test14.java
*
************************************/
import java.io.*;       // to read/write files

import ca.gbc.comp2080.assign3.AVLTree;
import ca.gbc.comp2080.datastructures.TreePrint;

public class Test14 {

   public static void printOutput(AVLTree t){
        //System.out.print("Preorder : ");
        //TreePrint.preorderPrint(t, t.root());
        //System.out.println();
        System.out.print("Postorder: ");
        TreePrint.postorderPrint(t, t.root());
        //System.out.println();
        //System.out.println();
   }


   public static void main (String[] args) throws IOException{


        AVLTree t3 = new AVLTree();

	  t3.insert(35, 35);
        t3.insert(20, 20);
        t3.insert(50, 50);

        t3.insert(30, 30);
        t3.insert(25, 25);
        printOutput(t3);

        //System.out.println("Input: 35, 20, 50, 30, 25");
        //System.out.println();


   }  // end main


}  // end class

