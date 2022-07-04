//NAME :SETHABILE DLAMINI
//EMAIL ADDRESS:ST10198677@VCCONNECT.EDU.ZA
//POE TASK 2.
package st10198677_poe_prog;

/*Adapted code: JAVA PROGRAMMING(PRESCRIBED SCHOOL BOOK) )
Author: JOYCE FARRELL*/

//MOST OF THE FOLLOWING CODE WAS MOSTLY REFERED FROM THE BOOK( JAVA PROGRAMMING)

import javax.swing.JOptionPane; 
import java.util.Scanner;

public  class poeTask2 extends Login {
      public static boolean exit ;


    public static void main(String[] args) {
// DECLARE VARIABLE
         Task task = new Task ();
         Scanner kb = new Scanner(System.in);
         String input;
         int decision;
         boolean quit;
         
       Login.username = JOptionPane.showInputDialog(null, "Please enter your username to login");
       Login.password = JOptionPane.showInputDialog(null, "Please enter your password to login");

    while (!exit){ // THIS LOOP WILL CONTINUE LOOPING UNTIL  THE EXIT LOOP CASE IS ENTERED 
        String Opt[]= { "Option1)Add tasks" , "Option2)Show report" , "Option3)Quit" };
        JOptionPane.showInputDialog(null,"Welcome to EasyKanban"+ "\n"+Opt[0] + "\n" + Opt[1] + "\n" + Opt[2]+"\n"+"Please enter option number" );
       /*see */        
 
     
         System.out.println("Please re-enter your selected option in the dialog box");                 
         decision = kb.nextInt();// A SCANNER HAS BEEEN IMPLIMENTED HENCE, FIRST YOU NEED TO TYPE THE NUMBER 
                                  // ON THE SCANNER AND TYPE IN THE NUMBER ON THE JOptionPane dialog box in order for you to continue with the program.

 //URL:https://www.youtube.com/watch?v=25kUc_ammbw
//Adapted from: Basic menu system in java
// NAME : Intro in Computer Science 
     
         switch (decision){ // Ensure that you always re enter you answer for switch statements in the space provided
             
        case 1:
            
            
           Task.taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount of task you wish to enter"));
           for (int i = 0; i <Task.taskNumber; i++){
            Task.taskName= JOptionPane.showInputDialog (null,"Please enter the name of your task");
           
       
            while(true){ /*see While loop java tutorial- Alex Lee,2019*/
                //THIS LOOP WILL EXERCUTE UNTIL REQUIRED CONDITION IN TRUE .AS LONG AS THE CONDITION IS NO MET THE LOOP WILL CONTINUE LOOPING.
                Task.description = JOptionPane.showInputDialog (null, "Please enter  a short description of the task(this description should not exceed 50 characters in length.)" );
                if(Task.checkTaskDescription() == true){
                    JOptionPane.showMessageDialog (null,"Task successfully captured");      
                 break;
                    }
                else{
                    JOptionPane.showMessageDialog (null, "Please enter description of less than 50 characters");
                  }
             }
            Task.developersName = JOptionPane.showInputDialog(null, "Please enter the developers name"); 
            Task.developersSurname= JOptionPane.showInputDialog(null, "Please enter the developers surname");
             Task.duration= Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the estimated duration :"));
                    
            String taskStatus []= {"1)To Do" , "2) Done", "3) Doing"};
         Task.taskStatus = JOptionPane.showInputDialog(null, "Please enter the task status" +"\n"+taskStatus[0]+ "\n"+ taskStatus[1]+ "\n"+taskStatus[2]);

            // A SCANNER HAS BEEEN IMPLIMENTED HENCE, FIRST YOU NEED TO TYPE THE NUMBER 
                                  // ON THE SCANNER AND TYPE IN THE NUMBER ON THE JOptionPane dialog box in order for you to continue with the program.
                                 
                    switch (Task.taskStatus){ /*see Basic menu system in java - Intro in Computer Science,2015*/
                         case "1":
                            JOptionPane.showMessageDialog(null,"1)To do"); 
                         break;
                         
                         case "2": 
                            JOptionPane.showMessageDialog(null,"2) Done");
                         break ;
                         
                         case "3":
                            JOptionPane.showMessageDialog(null,"3)Doing");
                         break ;
                         default :
                            JOptionPane.showMessageDialog(null,"Error");
                         break;
                     
                     }     

     JOptionPane.showMessageDialog(null, Task.printTaskDetails());
           }
     JOptionPane.showMessageDialog(null,"The total number for all entered task are: " + Task.duration + " hours");
               
     break;
           
     case 2:
         
              JOptionPane.showMessageDialog(null,"Coming Soon");
         break;
    
         
        case 3:
            exit = true ;
             JOptionPane.showMessageDialog(null,"End of program !!");
         break;
       
         default:
                 JOptionPane.showMessageDialog(null,"Invaild option");
    }
           } 
}         
 }

 /*  

Reference list 
   Farrel , J.2019. Java Programming .9th ed. Boston:Cengage
   Java full course .2020.YouTube video ,added by Bro Code [Online]. Available at :https://www.youtube.com/watch?v=xk4_1vDrzzo&t=39467s
   [Accessed 07 June 2022]
   Basic menu system in java.2015.YouTube video, added by Intro in Computer Science .[Online].Available at: https://www.youtube.com/watch?v=25kUc_ammbw
    [Accessed 08 June 2022]      
 While loop java tutorial.2019.Youtube video , added by Alex Lee.[Online].Available at: https://www.youtube.com/watch?v=SGJ9DpxGCkY 
 [Accessed 08 June 2022]
Java Array Tutorial.2018,YouTube video, added by Alex Lee.[Online]Availble at : https://www.youtube.com/watch?v=xzjZy-dHHLw
[Accessed 08 June 2022]


*/
     
   
                   
    


