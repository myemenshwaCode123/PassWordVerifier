import java.util.Scanner;
/**
 * 
 * @author Michael Yemenshwa 
 * Description: Write a program that verifies a password and outputs whether it is valid or not
 *
 */


public class Verifier { 
	
	  public static void main(String[] args)
      {
              String input;  // To hold input

              // Create a Scanner object for keyboard input.
              Scanner keyboard = new Scanner(System.in);

              // Get a password.
              System.out.print("Enter a password: ");
              input = keyboard.nextLine();

              // Check the password.
              if (isValid1(input))
                      System.out.println("Valid password.");
              else
                      System.out.println("InValid password.");
      }





//constructor 	
public static boolean isValid1(String str)
	{
		boolean hasUpper = false;//making sure these are false, so that the only way for the code to run 
		boolean hasLength = false;//and print out valid is if every variable turns true 
		boolean hasLower = false;
		boolean hasDigit = false;
		
		for (int i = 0; i < str.length(); i++) 
		{ 
			if(Character.isUpperCase(str.charAt(i)))
		        {
				hasUpper = true;
		        }
		
		
		    if (str.length() >= 6)
			hasLength = true;
		
		    if(Character.isLowerCase(str.charAt(i)))
			hasLower = true;
		
		    if(Character.isDigit(str.charAt(i)))
			hasDigit = true;
		
		}
		return (hasUpper && hasLength && hasLower && hasDigit);//return statement only runs when everything is true
	}

	
	

}










			
	

	