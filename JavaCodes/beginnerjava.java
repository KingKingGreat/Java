// Beginner Java Code By KingLordXD

public class BeginnerJava {
  // Prints out the value of username
  public static void main(String[] args) {
    // Creates variable with type String named Username with value "Your Name"
    String username = "Your Name";
    
    // Prints username to the console
    System.out.println("Your username is " + username);
    
    // Calls the printName function with parameter value "King"
    printName("King");
  }
  
  // Creates a custom function with return type void and named printName with parameter name
  public void printName(name) {
    // Prints out the value of parameter name
    System.out.println("Your name is " + name);
  }
}

// Results :

/*
  Your username is Your Name
  Your name is King
*/
