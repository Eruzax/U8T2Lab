import java.util.ArrayList;

public class Algorithm2DArrays
{
    /** Return true if target is found in the 2D array arr, false otherwise.
     *  For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     *  and target is 5, this method returns true. If target is 15, returns false
     *
     *  @param arr  2D array of ints
     *  @param target  target value to be searched for in arr
     *  @return  true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target)
    {
        for (int[] ints : arr)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (ints[j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *  For example, if arr is:
     *                  {{"hi", "bye", "howl", "goo"},
     *                   {"time", "owl", "you", "good"},
     *                   {"map", "low", "bow", "mom"}};
     *  and searchStr is "ow", this method returns 4, because 4 strings in arr
     *  contain "ow" as a substring.
     *
     *  @param arr  2D array of Strings
     *  @param searchStr  searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int counter = 0;
        for (String[] str : arr)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (str[j].contains(searchStr))
                {
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It also returns the number of changes that were made.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr)
    {
        int counter = 0;
        for (int[] ints : arr)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (ints[j] % 2 == 0)
                {
                    ints[j] = 0;
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Return the sum of all elements of arr that are in the one particular row,
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row will be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row

     */
    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++)
        {
            sum += arr[row][i];
        }
        return sum;
    }

    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i][col];
        }
        return sum;
    }

    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, and also returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Print each element with a single space in between.
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols)
    {
        int[][] arr = new int[rows][cols];
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = counter;
                counter++;
            }
        }
        for (int[] ints : arr)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        return arr;
    }

    /** Creates and returns a square 2D array of Strings of size n x n; the
     *  elements in the 2D array alternate between "X" and "O" (letter),
     *  starting with "X"
     *
     *  For example, if n = 5, this method should return the following 2D array
     *  (with 5 rows and 5 columns):
     *  X O X O X
     *  O X O X O
     *  X O X O X
     *  O X O X O
     *  X O X O X
     *
     *  @param n  number of rows and columns (creating a square 2D array of size n x n)
     *  @return  a 2D array of Strings that alternate between "X" and "O"
     */
    public static String[][] gridOfXandO(int n)
    {
        String tracker = " ";
        String[][] grid = new String[n][n];
        for (int i = 0; i <grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (i == 0 && j == 0)
                {
                    grid[i][j] = "X";
                    tracker = "X";
                }
                else if(tracker.equals("X"))
                {
                    grid[i][j] = "O";
                    tracker = "O";
                }
                else
                {
                    grid[i][j] = "X";
                    tracker = "X";
                }
            }
        }
        return grid;
    }

    /** Searches through the 2D array wordChart and finds all strings with
     *  length len; these strings are added to an ArrayList and returned.
     *  If no strings have that length, return an empty ArrayList
     *
     *  @param wordChart  2D array of Strings
     *  @param len  the length of strings to search for
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len)
    {
        ArrayList<String> str = new ArrayList<>();
        for (String[] strings : wordChart)
        {
            for (int j = 0; j < wordChart[0].length; j++)
            {
                if (strings[j].length() == len)
                {
                    str.add(strings[j]);
                }
            }
        }
        return str;
    }
}
