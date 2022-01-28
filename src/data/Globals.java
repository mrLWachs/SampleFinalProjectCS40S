
/** Required package class namespace */
package data;

/** Required import statements */
import collections.LinkedList;

 
/**
 * Globals.java - a class to store global variables available across all 
 * classes in this project
 *
 * @author Mr. Wachs
 * @since 25-Jan-2022, 11:15:55 AM
 */
public class Globals 
{

    // Makes a global variable across all classes in this project and the word 
    // "static" which essentially means "shared"
    public static LinkedList<User> users = new LinkedList<>();
    
    // Constants for saving to a permanent data file
    private static String FIRST_NAME = "/data/";
    private static String LAST_NAME  = ".txt";
    
    public static String FILE_NAME1 = FIRST_NAME + "names"     + LAST_NAME;
    public static String FILE_NAME2 = FIRST_NAME + "passwords" + LAST_NAME;      
    
}