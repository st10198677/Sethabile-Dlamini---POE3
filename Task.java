package st10198677_poe_prog;


/*Adapted code: JAVA PROGRAMMING(PRESCRIBED SCHOOL BOOK) )
Author: JOYCE FARRELL*/

//MOST OF THE FOLLOWING CODE WAS MOSTLY REFERED FROM THE BOOK( JAVA PROGRAMMING)

// URL :https://www.youtube.com/watch?v=xk4_1vDrzzo
//CODE ATTRIBUTE: Java Full Course ☕ -Learn to code today-【𝙁𝙧𝙚𝙚】
// YEAR: 9 NOV 2020
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Task { 
    // These Strings and  boolean are made globle so that is can carry out the values through out the program.
    public static boolean Description;
    public static String description;
    public static String taskName;
    public static int taskNumber;
    public static String taskDetails;
    public static int duration;
    public static String developersName;
    public static String developersSurname;
    public static String idTask;
    public static String taskStatus;
   
     public static boolean checkTaskDescription(){ /*see Java-Method-Boolean Returns Value ,Steve Sweenyn.2016. */
        boolean Description = false;
        if( description.length () <= 50 ) {
            Description = true;
        }else {
            Description = false;
         }
        return Description;
    }
     
    
    
      public static String [] createTaskID(){   /*see Java-Method-Boolean Returns Value ,Steve Sweenyn.2016.*/           
          String taskID = taskName;
          String firstTwoChar = "";
          taskName =taskName.toUpperCase();
          String devName = developersName;
          String lastThreeChar = "";
          developersName = developersName.toUpperCase();
         if (taskID.length() > 2){
             firstTwoChar =taskID.substring(0,2); // substrings only read the part that you want the program to read
         }
         else if(devName.length() > 3 ){
             lastThreeChar = devName.substring(devName.length() -3);
         }
         
         else {
             firstTwoChar = taskID ;
             lastThreeChar = devName ;
         }
                  
                  
        return null;
          }

      public static String  printTaskDetails(){ // This method is suppose to read and display all information in case one         
          
          String taskDetails = " ";
          JOptionPane.showMessageDialog(null,"Task Status : "+ taskStatus+"\n"+"Developers details: "+developersName+" "+developersSurname + "\n"+ "Task Number: " + 
                                           taskNumber + "\n" + "Task Name: " + taskName + "\n"+ "Task Description: " + description + "\n" +
                                        "\n" + "Task ID: "+ taskName.substring(0,2).toUpperCase() +":" + taskNumber +":" + developersName.substring(developersName.length() - 3).toUpperCase() + "\n"+ "Duration: " + duration);
          return taskDetails;
            }
      
            
            public static int returnTotalHours(int a , int b){// This method will add the duration for both of the tasks all the total of the method will be added in duration string.
               duration = a+b;
     
          return duration;  
            }
}
  
/*  Reference list 
 Farrel , J.2019. Java Programming .9th ed. Boston:Cengage
   Java full course .2020.YouTube video ,added by Bro Code [Online]. Available at :https://www.youtube.com/watch?v=xk4_1vDrzzo&t=39467s
   [Accessed 08 June 2022]
Java - Methods - Boolean Return Value. 2016. YouTube video,added by Steve Sweenyn [Online]: Available at :https://www.youtube.com/watch?v=XjJz1H0BqIw&t=328s 
   [Accessed 08 June 2022]
 How to use String Method.2018.YouTube video, added by Alex Lee [Online]: Available at: https://www.youtube.com/watch?v=vbZ85D8Hvh0&t=2s
    [Accessed 08 June 2022]

*/

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    

