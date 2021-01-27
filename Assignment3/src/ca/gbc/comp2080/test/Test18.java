package ca.gbc.comp2080.test;
/***********************************
* COMP2080 - Fundamentals of Data Structures
* File name: Test18.java
*
************************************/
import java.io.*;       // to read/write files

import ca.gbc.comp2080.assign3.AVLTree;
import ca.gbc.comp2080.datastructures.TreePrint;

public class Test18 {

   public static void printOutput(AVLTree t){
        //System.out.print("Inorder  : ");
        //TreePrint.inorderPrint(t, t.root());
        //System.out.println();

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
        int numItems = 100;
        for( int i = 37; i != 0; i = ( i + 37 ) % numItems )
	   t.insert( i, i );

        printOutput(t);


	//System.out.print( "Input: " );
    //    for( int i = 37; i != 0; i = ( i + 37 ) % numItems )
	//   System.out.print( i + " " );
	//System.out.println();

   }  // end main


}  // end class

