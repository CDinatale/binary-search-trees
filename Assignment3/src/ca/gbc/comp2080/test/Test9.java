package ca.gbc.comp2080.test;
/***********************************
*
* COMP2080 - Fundamentals of Data Structures
* File name: Test9.java
*
************************************/
import java.io.*;       // to read/write files

import ca.gbc.comp2080.assign3.AVLTree;
import ca.gbc.comp2080.datastructures.TreePrint;

public class Test9 {

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

        AVLTree t = new AVLTree();


	  t.insert(40, 40);
        t.insert(30, 30);
        t.insert(50, 50);


        t.insert(35, 35);
        t.insert(38, 38);
        printOutput(t);

        //System.out.println("Input: 40, 30, 50, 35, 38");
        //System.out.println();


   }  // end main


}  // end class

