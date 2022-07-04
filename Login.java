package st10198677_poe_prog;

//Code Attribute: JAVA PROGRAMMING(PRESCRIBED SCHOOL BOOK) )
//Author: Farrell (2019) 
//MOST OF THE FOLLOWING CODE WAS MOSTLY REFERED FROM THE BOOK( JAVA PROGRAMMING)
import javax.swing.JOptionPane;



public class Login {

 // URL :https://www.youtube.com/watch?v=xk4_1vDrzzo
 //CODE ATTRIBUTE: Java Full Course ☕ -Learn to code today-【𝙁𝙧𝙚𝙚】
 // YEAR: 9 NOV 2020
    
    
    // Variable are made global, this is so that the variable will remain constant through out the program.
    public static String username;
     public static String password;
    public static String firstName;
   public static String lastName;
   public static String  registerUser ;
      public static      boolean checkpassword = false;
     public static    boolean checkUppercase = false;
      public static   boolean checkDigit = false;
      public static   boolean checkSpecialChar = false;
      public static String testPassword;
      public static String testUsername;
            
    
  
    public static boolean checkUsername(){  // Boolean method converts values of an object ,and return to be true or false   
        boolean result; //inorder for checkUsername to be correct, 
                      // the conditions in the if statement must be kept. else a false result will be returned.
        if(username.length() <= 5 && username.contains("_")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean checkPasswordComplexicity(){   
// THIS METHOD IS GIVES TRUE OR FALSE SATEMENT .
// IF AND ELSE STATEMENT ARE TO GUIDE DECISION THAT ARE BASED ON A SPECIFIED CRITIREA . 

            for( char ch: password.toCharArray()) {

            if(Character.isUpperCase(ch)){
              checkUppercase = true; 
            }

            else if(Character.isDigit(ch)){
              checkDigit = true; 
            }

            else if((Character.isDigit(ch) && Character.isAlphabetic(ch)) == false){
              checkSpecialChar = true; 
            }
          }
            
          if(checkUppercase && checkDigit && checkSpecialChar && (password.length() >= 8)) {
                checkpassword = true;
          }
       return checkpassword ;
    }
     
    
    
    
    
    public static String registerUser(){/* see -if statement with string condition- mheidenry(2015)*/
        
//  THE STRING METHOD WILL RETURN THE TOTAL NUMBER OF CHARACTERS 

      
       // A nested if-else statement is used, 
       // meaning that  there is an if-else state within a if-else statement 
       if (password == null){
         if(checkUsername() == true) {
       
            registerUser = "Username successfully captured";
          } 
          else {
            registerUser = "Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length";  
          }
       }
         else if (password != null){
             
     if(checkPasswordComplexicity() == true){
       registerUser = "Password successfully captured";
 }
     else{
         registerUser = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character."; 
     }
     
    }
       return registerUser; //registerUser string is being returned. 
    }
     
    public static boolean LoginUser(){//Method converts value of variable to boolean ,return true or false
     boolean check = false;
  // In order for the user to be able to login the below conditions must be met.
     if(testUsername.equals(username) && (testPassword.equals(password))){

      check = true;
     
     }// If not the user will not be able to login.
     else {
     check = false;
     }   
    
       return check;
    } 
   
    
            public static String returnLoginStatus(){
                // if the conditions are met then you will discover that the the result will display the information below.
                String returnLoginStatus = "";
                if(LoginUser() == true ){ 
                returnLoginStatus= "Welcome ,"+firstName +" "+ lastName +" "+"It's great to see again, Successful Login";
                
            }
                else{
                
            returnLoginStatus ="Information unreconised ,please re-enter the correct information to login";
                }
               // the method will return a string variable.    
               return returnLoginStatus;      
            }
}
           /* Reference list

Farrell, J. 2019. Java programming. 9th ed. Boston: Cengage. 

Java full course. 2020. YouTube video, added by Bro Code. [Online]. Available at:https://www.youtube.com/watch?v=xk4_1vDrzzo&t=37364s [Accessed 07 June 2022). 
    [Accessed at 10 June 2022]

if statement with string condition.2015.Youtube video,added by mheidenry .[Online]. Available at : https://www.youtube.com/watch?v=Z5qkGCgK70g
[Accessed 10 June 2022]

*/
           





