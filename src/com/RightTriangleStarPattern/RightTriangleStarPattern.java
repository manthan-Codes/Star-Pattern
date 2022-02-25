package com.RightTriangleStarPattern;
/*

    j
    ↓
i-> *
    **
    ***
    ****
    *****

printing the above pattern in the program

 */
class RightTriangleStarPattern {

    public static void main(String[] args) {
        // variable i will correspond to row and j will correspond to column as shown above
        int i,j;
        //Adding first for loop for traversing the rows
        for(i=1;i<=5;i++){
            //another loop for traversing columns
            for(j=1;j<=i;j++){
                //printing star pattern at appropriate position
                System.out.print("*");
            }
            //going to next line
            System.out.println();
        }

    }
}
