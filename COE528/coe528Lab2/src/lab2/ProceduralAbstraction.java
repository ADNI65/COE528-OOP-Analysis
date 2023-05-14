/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Adeel's GPC
 */
public class ProceduralAbstraction {
    
    //Ex1: implementation of reversefactorial procedure
    public static int reverseFactorial(int x) {
            //returns 1, if x is 0 or less
            if (x <= 0) {
                    return 1;
            }
            int n = 1, tot = 1;
            //starts from 1 and mulitplies for every instance tot is less than x
            while (tot < x) {
                    n++;
                    tot = tot * n;
            }
            return n;
    }
    
    //Ex2: implementaion for isMatrixNice procedure
    public static boolean isMatrixNice(int[][] arr) {
            //return false if arr is null or empty.
            if (arr == null || arr.length == 0) {
                    return false;
            }
            int sum = 0;
            //checking each row
            for (int i = 0; i < arr.length; i++) {
                    //checking row, returning false
                    if (arr[i].length != arr.length) {
                            return false;
                    }
                    //finding sum of values
                    int srow = 0;
                    for (int j = 0; j < arr[i].length; j++) {
                            srow += arr[i][j];
                    }
                    //if i is 0 (first row), setting s as sum
                    if (i == 0) {
                            sum = srow;
                    }
                    //otherwise if sum is not equal to sum of current row, return false
                    else if (sum != srow) {
                            return false;
                    }
            }
            //finding sum of each columns
            for (int i = 0; i < arr.length; i++) {
                    int scol = 0;
                    for (int j = 0; j < arr.length; j++) {
                            scol += arr[j][i];
                    }
                    //if sum of current column is not equal to sum, returning false
                    if (scol != sum) {
                            return false;
                    }
            }
            //finding sum of diagonals
            int s1 = 0, s2 = 0;
            for (int i = 0; i < arr.length; i++) {
                    s1 += arr[i][i];
                    s2 += arr[arr.length - 1 - i][i];
            }
            //checking if diagonals and sum are equal, else return false
            if (s1 != sum || s2 != sum) {
                    return false;
            } else {
                    //else printing sum and returning true
                    System.out.println("the similar sum is: " + sum);
                    return true;
            }
        } 
       
    public static void main(String[] args) {
        System.out.println("reverseFactorial(36): " + reverseFactorial(24));
        System.out.println("reverseFactorial(118): " + reverseFactorial(118));

        int matrix1[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        if (isMatrixNice(matrix1)) {
                System.out.println("Nice matrix");
        } else {
                System.out.println("Not a nice matrix");
        }
        int matrix2[][] = { { 3, 7, 8 }, { 2, 2, 2 }, { 4, -3, 2 } };
        if (isMatrixNice(matrix2)) {
                System.out.println("Nice matrix");
        } else {
                System.out.println("Not a nice matrix");
        }

    }
}
