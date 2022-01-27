
/** Required package class namespace */
package tools;

 
/**
 * Text.java - a collection of useful methods for working with text
 *
 * @author Mr. Wachs
 * @since Nov. 25, 2019, 3:17:33 p.m.
 */
public class Text 
{
    
    // Encapsulated global class properties below..............................
    
    private static final char   ALPHA_LOW     = 'a';
    private static final char   ALPHA_HIGH    = 'z';
    private static final String ARRAY_START   = "[";
    private static final String ARRAY_DIVIDE  = ",";
    private static final String ARRAY_END     = "]";
    private static final String MATRIX_DIVIDE = "\t";
    private static final String LINE_BREAK    = "\n";
    
     
    // Public and static (shared, does not an object) methods below............ 
     
    /**
     * Generates a random character in a range
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    public static char random(char low, char high) {
        return (char)(Numbers.random((int)low,(int)high));
    }
        
    /**
     * Generate a random string of alphabetical characters
     * 
     * @param length the length of the string to generate
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return a random string of characters
     */
    public static String random(int length, char low, char high) {
        String text = "";                   // Variable to store string
        for (int i = 0; i < length; i++) {  // Loop to the length wanted
            text += random(low, high);      // Attach random character to string
        }
        return text;                        // Return completed string
    }
    
    /**
     * Generate a random string of alphabetical characters (between a-z)
     * 
     * @param length the length of the string to generate
     * @return a random string of characters
     */
    public static String random(int length) {
        return random(length, ALPHA_LOW, ALPHA_HIGH);
    }    
    
    /**
     * Generates an array of random characters in the range between low and high
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @param size the size to make the array
     * @return an array of random characters
     */
    public static char[] random(char low, char high, int size) {
        char[] numbers = new char[size];    // Create empty array 
        for (int i = 0; i < size; i++) {    // Traverse array size
            numbers[i] = random(low,high);  // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }
    
    /**
     * Generates an array of random strings  of alphabetical characters
     * 
     * @param low the lowest character in the range
     * @param high the highest character in the range
     * @param length the length of the string to generate
     * @param size the size to make the array
     * @return an array of random strings
     */
    public static String[] random(char low, char high, int length, int size) {
        String[] strings = new String[size]; // Create empty array 
        for (int i = 0; i < size; i++) {     // Traverse array size
            strings[i] = random(length);     // Assign random value to index
        }
        return strings;                      // Return completed array
    }       
    
    /**
     * Generates a matrix of random characters in the range between low and high
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return a matrix of random characters
     */
    public static char[][] random(int rows, int columns, char low, char high) {
        char[][] matrix = new char[rows][columns];      // Create empty matrix
        for (int row = 0; row < rows; row++) {          // Traverse rows
            matrix[row] = random(low, high, columns);   // Create random row
        }
        return matrix;                              // Return completed matrix
    }
    
    /**
     * Generates a matrix of random characters in the range between low and high
     * 
     * @param rows the number of rows for the matrix
     * @param columns the number of columns for the matrix 
     * @param length the size to make the random string
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return a matrix of random characters
     */
    public static String[][] random(int rows, int columns, int length, char low, 
            char high) {
        String[][] matrix = new String[rows][columns];  // Create empty matrix
        for (int row = 0; row < rows; row++) {          // Traverse rows
            matrix[row] = random(low, high, length, columns);   // Create row
        }
        return matrix;                              // Return completed matrix
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(int[] array) {
        String text = ARRAY_START;                  // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ARRAY_DIVIDE;        // Attach index to variable
        }
        return text + array[array.length-1] + ARRAY_END;    // Attach last index
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(double[] array) {
        String text = ARRAY_START;                  // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ARRAY_DIVIDE;        // Attach index to variable
        }
        return text + array[array.length-1] + ARRAY_END;    // Attach last index
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(char[] array) {
        String text = ARRAY_START;                  // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ARRAY_DIVIDE;        // Attach index to variable
        }
        return text + array[array.length-1] + ARRAY_END;    // Attach last index
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(String[] array) {
        String text = ARRAY_START;                  // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ARRAY_DIVIDE;        // Attach index to variable
        }
        return text + array[array.length-1] + ARRAY_END;    // Attach last index
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public static String toString(int[][] matrix) {
        String text = "";                           // Variable to store matrix
        for (int row = 0; row < matrix.length; row++) {     // Traverse matrix
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;    // Attach value
            }
            text += LINE_BREAK;                             // Attach line break
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public static String toString(double[][] matrix) {
        String text = "";                           // Variable to store matrix
        for (int row = 0; row < matrix.length; row++) {     // Traverse matrix
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;    // Attach value
            }
            text += LINE_BREAK;                             // Attach line break
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public static String toString(char[][] matrix) {
        String text = "";                           // Variable to store matrix
        for (int row = 0; row < matrix.length; row++) {     // Traverse matrix
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;    // Attach value
            }
            text += LINE_BREAK;                             // Attach line break
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the matrix to format
     * @return a string of formatted text
     */
    public static String toString(String[][] matrix) {
        String text = "";                           // Variable to store matrix
        for (int row = 0; row < matrix.length; row++) {     // Traverse matrix
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + MATRIX_DIVIDE;    // Attach value
            }
            text += LINE_BREAK;                             // Attach line break
        }
        return text;
    }
        
}