import java.util.ArrayList;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] twodarray){
        for (int[] row : twodarray){
            for (int col : row){
                System.out.println(col + " ");
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] twodarray){
        int sum = 0;
        for (int[] row : twodarray){
            for (int col : row){
                sum += col;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] twodarray){ // DOUBLE BECAUSE YOU'RE DIVIDING THE #S!
        int sum = 0;
        int count = 0;
        for (int row[] : twodarray ){
            for (int col : row){
                sum += col;
                count++;
            }
        }
        return (double) sum / count; // DOUBLE BECAUSE YOU'RE DIVIDING THE #S!
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] twodarray){
        int minValue = twodarray[0][0];
        for (int row[] : twodarray){
            for (int col : row){
                if (col < minValue){
                    minValue = col;
                }
            }
        }
        return minValue;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] twodarray){
        int maxValue = twodarray[0][0];
        for (int row[] : twodarray){
            for (int col : row){
                if (col > maxValue){
                    maxValue = col;
                }
            }
        }
        return maxValue;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int [][] twodarray){
        int evenCount = 0;
        for (int i = 0; i<twodarray.length;i++){
            for (int j = 0; j<twodarray[i].length; j++){
                if (twodarray[i][j]%2 == 0){
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] twodarray){
        int evenCount = 0;
        for (int row[] : twodarray){
            for (int col : row){
                if (col%2 == 0){
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] twodarray){ // misunderstanding: positive != even
        for (int row[] : twodarray){
            for (int col : row){
                if (col <= 0){
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int [][] twodarray){
        int sumArray[] = new int[twodarray.length];
        for (int i = 0; i<twodarray.length; i++){
            int rowSum = 0;
            for (int col : twodarray[i]){
                rowSum += col;
            }
            sumArray[i] = rowSum;
        }
        return sumArray;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] twodarray){
        int sumArray[] = new int[twodarray.length];
        for (int col = 0; col<twodarray[0].length; col++){
            for (int row = 0; row<twodarray.length; row++){
                sumArray[col] += twodarray[row][col];
            }
        }
        return sumArray;
    }
}
