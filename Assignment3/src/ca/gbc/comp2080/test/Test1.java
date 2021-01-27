package ca.gbc.comp2080.test;
/***********************************
*
* COMP2080 - Fundamentals of Data Structures
* File name: Test1.java
*
************************************/
import java.io.*; 	// to read/write files

import ca.gbc.comp2080.assign3.AVLTree;
import ca.gbc.comp2080.datastructures.TreePrint;

public class Test1 {

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


	  t.insert(30, 30);
        t.insert(40, 40);
        t.insert(50, 50);

        t.insert(60, 60);
        t.insert(70, 70);

        t.insert(80, 80);

        t.insert(90, 90);
        printOutput(t);


        //System.out.println("Input: 30, 40, 50, 60, 70, 80, 90");
        //System.out.println();

   } // method main

} // class myProgram
