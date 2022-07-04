package st10198677_poe_prog;

//Code Attribute: JAVA PROGRAMMING(PRESCRIBED SCHOOL BOOK) )
//Author: JOYCE FARRELL
//MOST OF THE FOLLOWING CODE WAS MOSTLY REFERED FROM THE BOOK( JAVA PROGRAMMING)

import javax.swing.JOptionPane;
import java.util.Scanner ;
public class poeTask1{

    private static boolean checkUsername;// This varible has been made global
    
// URL :https://www.youtube.com/watch?v=xk4_1vDrzzo
//CODE ATTRIBUTE: Java Full Course ☕ -Learn to code today-【𝙁𝙧𝙚𝙚】
// YEAR: 9 NOV 2020
 public static void main(String[] agrs){ /*Farrel.(2019)*/
 // Declaration of variable.
 Scanner kb= new Scanner (System.in);
 String registerUser;
 String returnLoginStatus ;
 Login login = new Login ();//Classes have been inheritered .
 
 
   Login.firstName = JOptionPane.showInputDialog(null,"Please enter your firstname");
        Login.lastName = JOptionPane.showInputDialog(null,"Please enter your lastname");
        
      
        while (true){ /*see While loop java tutorial- Alex Lee,2019*/
// This loop will continue looping until the condition given is somehow false.      
       Login.username = JOptionPane.showInputDialog(null,"Please enter your username");
        if (Login.checkUsername() == true){
            JOptionPane.showMessageDialog(null, Login.registerUser());
            break;// Break means that if the condition are met the program will exit the loop .
        }
        else{
            JOptionPane.showMessageDialog(null, Login.registerUser());
        }
        }
        
        while (true){/*see While loop java tutorial- Alex Lee,2019*/
        Login.password = JOptionPane.showInputDialog(null,"Please enter your password");
      if (Login.checkPasswordComplexicity() == true){
            JOptionPane.showMessageDialog(null, Login.registerUser());
            break;// loop will exit if set condition is true if not will continue looping.
        }
      else {
          JOptionPane.showMessageDialog(null, Login.registerUser());
      }
        }
  while (true){/*see While loop java tutorial- Alex Lee,2019*/
         Login.testUsername = JOptionPane.showInputDialog(null, "Please enter your username for logging in") ;
       Login.testPassword = JOptionPane.showInputDialog(null, "Please enter your Password for logging in"); 
      if (Login.LoginUser() == true){
          JOptionPane.showMessageDialog(null,Login.returnLoginStatus());
          break; // loop will exit if condition is true if not will continue looping.
      }
      else{
          JOptionPane.showMessageDialog(null, Login.returnLoginStatus());
      }
    }
  }
}

           /* Reference list

Farrell, J. 2019. Java programming. 9th ed. Boston: Cengage. 

Java full course. 2020. YouTube video, added by Bro Code. [Online]. Available at:https://www.youtube.com/watch?v=xk4_1vDrzzo&t=37364s [Accessed 07 June 2022). 
    [Accessed at 10 June 2022] 

 While loop java tutorial.2019.Youtube video , added by Alex Lee.[Online].Available at: https://www.youtube.com/watch?v=SGJ9DpxGCkY 
 [Accessed 08 June 2022]

*/
