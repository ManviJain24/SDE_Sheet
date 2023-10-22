import java.util.*;

public class que2 {

    //Variation 1

    // public static long nCr(int n, int r) {
    //     long res = 1;

    //     // calculating nCr:
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }
    //public static int pascalTriangle1(int r, int c) {
    //     int element = (int) nCr(r - 1, c - 1);
    //     return element;
    // }
    // public static void main(String[] args) {
    //     int r = 5; // row number
    //     int c = 3; // col number
    //     int element = pascalTriangle(r, c);
    //     System.out.println("The element at position (r,c) is: " + element);
    // }


    //Variation 2

    // public static void pascalTriangle(int n) {
    //     // printing the entire row n:
    //     for (int c = 1; c <= n; c++) {
    //         System.out.print(nCr(n - 1, c - 1) + " ");
    //     }
    //     System.out.println();
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     pascalTriangle(n);
    // }



    // variation 3
     public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    
}  
       