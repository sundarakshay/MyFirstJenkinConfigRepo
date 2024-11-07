package javaexamples;

class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

public class ProgramThirty  
{  
  
    // method to check the age  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new InvalidAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    

	public static void main(String[] args) {
        try  
        {  
            // calling the method   
            validate(17);  
        }  
        catch (InvalidAgeException e)  
        {      
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + e);  
        }  
  
        System.out.println("rest of the code...");    
    } 
	}
