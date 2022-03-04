package com.DownwardPyramid;
/*
*********
 *******
  *****
   ***
    *
 */
public class DownwardPyramid {
    public static void main(String arg[]){
        int i,j,k,l;
        //i=rows, j=columns
        for (i=1;i<=5;i++){
            //for spaces
            for(j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //for stars(right mirrored Star pattern)
            for(k=5;k>=i;k--){
                System.out.print("*");
            }
            //for stars(left mirrored Star pattern)
            for(l=4;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        DownwardPyramid dp= new DownwardPyramid();
        dp.StarPattern();

    }
    /*

* * * * *
 * * * *
  * * *
   * *
    *
     */

    public void StarPattern(){
        int i,j,k;
        for(i=1;i<=5;i++){
            //for spaces
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            //print pattern
            for(j=5;j>=i;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
