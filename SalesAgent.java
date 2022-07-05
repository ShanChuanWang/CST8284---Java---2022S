package CST8284_301_Lab5;

// This is Lab 5. Follow all instructions stated in the Lab slides.

/**
 * This class shows a Sales Agent with a name and age.
 */
public class SalesAgent
{  
   private String name;
   private int age;

   /**
      This portion constructs a SalesAgent object.
      @param n the name of the Sales Agent
      @param a the age of the Sales Agent
   */
   public SalesAgent(String n, int a) {
      name = n;
      age = a;
   }

   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString() {
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
}