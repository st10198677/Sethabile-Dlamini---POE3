
package st10198677_poe_prog;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class poeTask3 extends poeTask2{
public static boolean exit;
  
    public static void main(String[] args) {

//THIS PROGRAM HAS BEEN MODIFIED , AND HAS BEEN SET ON TO IMPROVEMENT ACCORDING TO THE PREVIOUS  POE TASK.
                Scanner kb = new Scanner(System.in);
       
            while (!exit){ // THIS LOOP WILL CONTINUE LOOPING UNTIL  THE EXIT LOOP CASE IS ENTERED 
       String Opt[]= { "Option1)Add tasks" , "Option2)Show report" , "Option3)Quit" };
       String decision= JOptionPane.showInputDialog(null,"Welcome to EasyKanban"+ "\n"+Opt[0] + "\n" + Opt[1] + "\n" + Opt[2]+"\n"+"Please enter option number" );
       /*see */        
 //URL:https://www.youtube.com/watch?v=25kUc_ammbw
//Adapted from: Basic menu system in java
// NAME : Intro in Computer Science 
     
       switch (decision){ // Ensure that you always re enter you answer for switch statements in the space provided
             
        case "1":
                 
           Task.taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount of task you wish to enter"));
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
            String Status = JOptionPane.showInputDialog(null, "Please enter the task status" +"\n"+taskStatus[0]+ "\n"+ taskStatus[1]+ "\n"+taskStatus[2]);
            Task.taskStatus = Status;
                              
                    switch (Status){ /*see Basic menu system in java - Intro in Computer Science,2015*/
                        case "1":
                            JOptionPane.showMessageDialog(null,"To Do"); 
                         break;
                         
                         case "2": 
                            JOptionPane.showMessageDialog(null,"Done");
                         break ;
                         
                         case "3":
                            JOptionPane.showMessageDialog(null,"Doing");
                         break ;
                         default :
                            JOptionPane.showMessageDialog(null,"Error");
                         break;
                     
                     }     
               
                       JOptionPane.showMessageDialog(null, Task.printTaskDetails());
       JOptionPane.showMessageDialog(null,"The total number for all entered task are: " + Task.duration + " hours");           
                                  
     break;
     
      case "2":
         //CASE 2 IS A IMPLIMETATION OF POE3. HENCE ALL INFORMATION IS STORED FIRST IN CASE ONE(1) THEN THEY ARE MODIFIED IN CASE TWO(2) ACCORDING TO WHAT THE USER WANTS.
        String taskModify[]= { "Option1)Display completed tasks" , "Option2)Display longest task " , "Option3)Search for task" , "Option4)Delete a task" , "Option5)Show full report" , "Option6)Return to main menu" };
        String modify = JOptionPane.showInputDialog(null,taskModify[0] + "\n" + taskModify[1] + "\n" + taskModify[2]+"\n"+taskModify[3]+"\n"+taskModify[4]+"\n"+taskModify[5]+"\n"+"Please select an option number" );
                    //THE FOLLOWING CASES ALLOWS USER TO CHOOSE IN WHAT WHY WOULD THEY WANT TO MODIFY THE PROGRAM.              
                 switch (modify){ /*see Basic menu system in java - Intro in Computer Science,2015*/
                       case "1" :
                           JOptionPane.showMessageDialog(null, "Developers Name:"+" "+Task.developersName+" "+Task.developersSurname+"\n"+ "Task Name: "+Task.taskName +"\n"+"Duration: "+ Task.duration); //Wanna display developer,task names,and duration
                       break;
                       case "2": 
                          if (Task.duration <= Task.duration)
                          JOptionPane.showMessageDialog(null, "Developers Name:"+" "+Task.developersName+" "+Task.developersSurname+ "\n" +"Duration: "+Task.duration );// display developer(name and surname) and duration
                       break ;
                       case "3":
                           //ALLOW USER TO SEARCH FOR TASK THEY WANT TO BE DISPLAYED
                           String taskSearch []= {"Option1)Search by Task Name" ,"Option2)Search by Developers Name"};
                           String Search = JOptionPane.showInputDialog(null, taskSearch[0] +"\n"+ taskSearch[1]+"\n"+"Please enter an option");
                             switch(Search){//have to put if statements if task inserted cannot be found
                                  case "1":
                                       String name=JOptionPane.showInputDialog(null,"Please enter the task name");
                                               name = Task.taskName;
                                             if(Task.taskName .equals (name)==false){
                                             JOptionPane.showMessageDialog (null,"Task name was not successfully captured,please ensure you enter the correct task name");      
                                              break;}
                                            else 
                                             {
                                      JOptionPane.showMessageDialog(null,"Task Name: "+Task.taskName +"\n"+"Developers Name:"+" "+Task.developersName+" "+Task.developersSurname+"\n"+"Duration: "+Task.duration );
                                                }
                                  break;
                                  case "2":
                                     String develop = JOptionPane.showInputDialog(null,"Please enter the developers name");
                                                        develop = Task.developersName;
                                            if(Task.developersName.equals(develop) == false){
                                             JOptionPane.showMessageDialog (null,"Developers name was not successfully captured,please ensure you enter the correct task name");      
                                            break;
                                            }                                         
                                            else
                                            {
                                             JOptionPane.showMessageDialog(null,"Task Name: "+Task.taskName +"\n"+"Task Status: " +Task.taskStatus );
                                            break;} 
                                          }
                       break;
                       case "4":
                            //ALLOWS USER TO SIMPLY WRITE THE TASK NAME TO DELETE TASK.
                            /*see Remove an element fo an array in java - Bethany Petr (2020)*/
                            String delete =JOptionPane.showInputDialog(null,"Please enter the of task you want to delete");
                            String[]word = {"", "" };
                            removeWord(word);
                            word = removeWord(word);
                            delete = Task.taskName ;
                             // ENSURE THAT YOU ENTER THE CORRECT TASK NUMBER ELSE PROGRAM WILL CRASH
                            //NOTE :IF MESSAGE HAS BEEN DISPLAYED THIS MEANS YOU HAVE SUCCESSFULLY DELETED YOU TASK YOU WOULD THEN HAVE TO PRESS ENTER TWICE/Thrice TO CONTINUE
                        break;
                        case "5":
                            //DISPLAY ALL INFORMATION OF TASK CAPTURED BY USER
                            JOptionPane.showMessageDialog(null,"Show full report");
                            JOptionPane.showMessageDialog(null, Task.printTaskDetails());//i'll assume it runs since it's giving me an error saying its because system has no captured anything
                          
                        break;
                        case "6":
                            //RETURNS BACK TO MAIN MENU!!
                          JOptionPane.showMessageDialog(null,"THANK YOU FOR USING OUR PROGRAM!!");//Should allow you to exit the loop
                         break;
                        default:
                            //THE FOLLOWING MESSAGE WILL SHOW UP IF USER HAS ENTER AN INCORRECT NUMBER
                          JOptionPane.showMessageDialog(null,"Selected option not available");
                        break;
                                  }  
                 
                 break;
                 case "3":// THIS WILL APPEAR IF HAS EXITTED THE PROGRAM
                  exit = true ;
                  JOptionPane.showMessageDialog(null,"End of program !!");
                 break;
       
                 default:
                 JOptionPane.showMessageDialog(null,"Invaild option");
    }
              } 
 
          
            }
public static String [] removeWord(String[]word){ // THIS METHOD ALLOW FOR ARRAYS TO BE REMOVED, THIS IS WHERE ALL THE WORK IS DONE!!
/*see Remove an element fo an array in java - Bethany Petr (2020)*/
String[]lessWord = new String[word.length -1];
Scanner kb = new Scanner(System.in);
String wordToRemove = kb.nextLine();

int indexLess =0;

for (int i=0;i<word.length;i++)
    //System.out.println("What word to remove : ");
{
if (!word[i].equalsIgnoreCase(wordToRemove)){
    lessWord[indexLess]= word[i];
    indexLess++;
      }
 } 
return word;}
}
  /* Reference List

   Farrel , J.2019. Java Programming .9th ed. Boston:Cengage
   Java full course .2020.YouTube video ,added by Bro Code [Online]. Available at :https://www.youtube.com/watch?v=xk4_1vDrzzo&t=39467s
   [Accessed 07 June 2022]
   Basic menu system in java.2015.YouTube video, added by Intro in Computer Science .[Online].Available at: https://www.youtube.com/watch?v=25kUc_ammbw
    [Accessed 08 June 2022]      
 While loop java tutorial.2019.Youtube video , added by Alex Lee.[Online].Available at: https://www.youtube.com/watch?v=SGJ9DpxGCkY 
 [Accessed 08 June 2022]
Java Array Tutorial.2018,YouTube video, added by Alex Lee.[Online]Availble at : https://www.youtube.com/watch?v=xzjZy-dHHLw
[Accessed 08 June 2022]
Remove an element from array in java .2020,YouTube video , added by Bethany Petr [Online]. Availble at : https://www.youtube.com/watch?v=4VRvHdVrd1Y 
[Accessed on 7 July 2022]


*/  

    



    
    

