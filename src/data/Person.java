  
/** Required package class namespace */
package data;

/** 
 * Person.java - represents a person. This is a class with properties (things
 * about the class, adjective, descriptors) and methods (things it can do, 
 * verbs, actions). Classes can be created (instantiated) into objects
 * (which are instances of that class).
 *
 * @author Mr. Wachs 
 * @since 13-Oct-2021 
*/
public abstract class Person 
{

    // Properties: (things about it, adjectives, descriptors).............
    
    /**
     * Properties that use the "modifier" word "public" can be accessed and
     * changed outside of this class by anther class "using" this class
     */
    public  String  name;
    public  String  gender;
    
    /**
     * Properties that use the "modifier" word "private" will "encapsulate"
     * this property so that it can only be accessed inside the class (like 
     * a "private room") - this is the concept of encapsulation
     */
    private int age;
    
    /** 
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class 
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean isAlive;
    
    
    // Methods: (things it can do, verbs, actions)........................
    
    /**
     * Class constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it. Constructor methods with no 
     * parameters are called "default" constructors.
     */
    public Person() {
        isAlive = true;
        age     = 0;
        gender  = "female";
        name    = "Jane Doe";
    }
    
    /**
     * Constructor method (overloaded) changes object properties
     * 
     * @param name the name for this person 
     */
    public Person(String name) {
        isAlive   = true;
        age       = 0;
        gender    = "female";
        this.name = name;
    }
    
    /**
     * Constructor method changes object properties
     * 
     * @param name the name for this person 
     * @param age the age for this person 
     * @param gender the identified gender for this person 
     */
    public Person(String name, int age, String gender) {
        isAlive     = true;
        this.age    = age;
        this.gender = gender;
        this.name   = name;
    }
    
    /**
     * When a person dies
     */
    public void die() {
        isAlive = false;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
        if (isAlive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooo!!!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * Accessor method (or "getters") that gives you (or 'reads') the age of 
     * this person (which is a private property of this class which cannot 
     * be read outside the class)
     * 
     * @return the person's current age value to "see" (access)
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Mutator method (or "setters") that 'changes' the encapsulated property
     * of this person (which is a private property of this class which cannot 
     * be changed outside the class)
     * 
     * @param age the new age to set (mutate) the property into
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Accessor method (or "getters") that 'gives' you (or 'reads') the gender 
     * of this person (which is a private property of this class which cannot 
     * be read outside the class)
     * 
     * @return the person's current gender to "see" (access)
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Mutator method (or "setters") that 'changes' the encapsulated property
     * of this person (which is a private property of this class which cannot 
     * be changed outside the class)
     * 
     * @param gender the new gender to set (mutate) the property into
     */
    public void setGender(String gender) {
        // A programmer could potentially write error checking code here..
        this.gender = gender;
    }
        
    /**
     * String representation of this object
     * 
     * @return the object represented as a String
     */
    @Override
    public String toString() {
        return name + " is " + age + " identifies " + gender;
    }
        
    /**
     * Deep comparison, determines if two objects are"equal" in this context
     * 
     * @param object the object to compare to
     * @return the object are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // Shallow comparison might be code like: return true;        
        // We want to turn the object parameter into a "Person"
        // object - use casting to turn into a person
        Person that = (Person)object;
        // compare the things (properties) we want to compare
        if (this.isAlive != that.isAlive)          return false;
        if (this.age     != that.getAge())         return false;
        if (!this.name.equals(that.name))          return false;
        if (!this.gender.equals(that.getGender())) return false;
        return true;
    }

    /**
     * A "static" method means the method is "shared" by all objects of the 
     * class - it can also be called from the class itself, you can use the 
     * class name then a dot to call static methods
     */
    public static void endTheWorld() {
        System.out.println("Booom!!!!");
    }
    
}
