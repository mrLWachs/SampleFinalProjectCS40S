
/** Required package class namespace */
package controllers;

/** Required import statements */
import data.Globals;
import data.User;
import java.awt.List;
import javax.swing.JTextField;
import tools.Dialogs;
import tools.Numbers;
import view.LoginUI;

 
/**
 * LoginController.java - this is the controller class for the user interface
 * (UI) view controlling all the logic connected to that view. This is a 
 * modification of a programming design paradigm like the MVC process.
 * 
 * @author Mr. Wachs
 * @since 27-Jan-2022, 11:15:51 AM
 */
public class LoginController 
{

    // References to the corresponding UI view objects
    private LoginUI    loginUI;
    private JTextField nameText;
    private JTextField passwordText;
    private List       list;
    
    
    /**
     * Default class constructor, sets class properties
     * 
     * @param loginUI the UI frame view 
     * @param nameText the name text box
     * @param passwordText the password text box
     * @param list the list box of all users
     */
    public LoginController(
            LoginUI loginUI, 
            JTextField nameText, 
            JTextField passwordText, 
            List list) {
        // Make connections from the view to the controller object references
        this.loginUI      = loginUI;
        this.nameText     = nameText;
        this.passwordText = passwordText;
        this.list         = list;
                
        // Apply some view UI property changes
        loginUI.setResizable(false);         // The frame (form) cannot be sized
        loginUI.setLocationRelativeTo(null); // Center the frame on the screen
        loginUI.setVisible(true);            // display the frame to the user
    }

    /**
     * Adds a new user to the database
     */
    public void add() {
        // Create a new user, but first we need the name and password from the 
        // text field objects (using one of the methods built into that object)
        String name = nameText.getText();              
        // Error check to make sure they have filled out a name
        if (name == null || name.equals("")) {            
            // Message the user    
            Dialogs.output("Please enter a name");  
            // Exit the method right here
            return;
        }        
        // Do this all over again with the password
        String password = passwordText.getText();        
        if (password == null || password.equals("")) {
            Dialogs.output("Please enter a password");      // Message user
            return;                                         // Leave method
        }        
        // Make sure the password is only numbers by incorperationg a method
        // from the "Numbers" class we brought in from the class "Help" page
        // on Mr. Wachs' website
        if (Numbers.isInteger(password) == false) {
            Dialogs.output("Password must be numbers only!");   // Message user
            return;                                             // Leave method
        }        
        // The code will get to here if I pass the above error checks....        
        // Build a user (object)
        User user = new User(name, password);        
        // Add this to the collection
        Globals.users.add(user);        
        // Add to the listbox
        list.add(user.toString());        
        // Clear out the text boxes for the next time
        nameText.setText("");
        passwordText.setText("");        
        // Set the "focus" (the flashing cursor) to the textbox
        nameText.requestFocus();     
    }

    /**
     * Removes a user from the database
     */
    public void delete() {        
        // Get the index number from the listbox using a built-in listbox method
        int index = list.getSelectedIndex(); 
        // Check to make sure they actually selected something in the listbox
        if (index == -1) {
            Dialogs.output("Please select a user!");    // Message user
            return;                                     // Leave method
        }
        // Use another built-in listbox method to remove it from the listbox
        list.remove(index);        
        // Also remove the user from the collection LinkedList object
        Globals.users.remove(index);  
    }

    /**
     * Get the name and password from dialog inputs (again using the
     * Dialogs class we brought into this project from our Help page
     */
    public void login() {
        // Get the name and password
        String name     = Dialogs.input("Please enter user name");
        String password = Dialogs.input("Please enter user password");        
        // Now build a temporay user to check for
        User user = new User(name, password);        
        // Check if this user is in the database (collection) by calling a 
        // custom method that we will write lower in this code
        if (isInDatabase(user) == true) {
            Dialogs.output("Log in successful!");
            // Potentially, the code could move on to other parts of a final
            // project right here!!!!
        }
        else {
            Dialogs.output("User not in database!");
        }      
    }
     
    /**
     * Checks if the passed user is in the array of all user who have 
     * registered or not
     * 
     * @param user the user to check
     * @return they are in the database (true) or they aren't (false)
     */
    private boolean isInDatabase(User user) {
        // Loop through the collection
        for (int i = 0; i < Globals.users.size(); i++) {
            // Pull out a user from the collection
            User userInArray = Globals.users.get(i);  
            // Now call a method in the User class to compare 2 users
            if (user.equals(userInArray) == true) {
                return true;                            // They are the same
            }   
        }
        // After the loop, no user was found to be the same, so the user is 
        // not in the database (the collection)
        return false;
    }
    
}