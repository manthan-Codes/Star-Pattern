package com.Pyramid;

/*this pattern

   *
  ***
 *****
*******

 */

public class Pyramid {
    public static void main(String arg[]){
        int i,j,k,l;
        //i=rows, j=columns
        for(i=1;i<=4;i++){
            //for leading spaces
            for(j=3;j>=i;j--){
                System.out.print(" ");
            }
            //for printing star pattern (left triangle pattern)
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            //for post stars (right triangle pattern)
            for (l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
