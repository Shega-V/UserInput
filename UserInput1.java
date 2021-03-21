/*
*
* @author  Shega Vala
* @since   2021-02-15
* ITSC1213 140 
* Module 3 - UserInput coding activity
* With the user input activity i ask the user to enter the info which will be stored in a different data types//description 
*
*/
package userinput1;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author shegavala
 */
public class UserInput1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int testScore1;
        int testScore2;
        int testScore3;
        int averageScore;
        String cityName;
        int age;
       
        
        Scanner scnr = new Scanner (System.in);
        System.out.println("Please enter your first test score ");
        testScore1 = scnr.nextInt();
        System.out.println("Also your second test score ");
        testScore2 = scnr.nextInt();
        System.out.println("and the third test score ");
        testScore3 = scnr.nextInt();
        averageScore= (testScore1 + testScore2 +testScore3 )/3;
        System.out.println("Your average test score is   "  + averageScore);
        
        System.out.println("***************************************");
        
        
        System.out.println("What is the name of your favorite city?");
        cityName = scnr.next();
        System.out.println("I think " + cityName +" is a beautiful city");
        
        int count = 0;
        
        for(int i = 0; i < cityName. length(); i++) {
            
        if(cityName. charAt(i) != ' ')
            count++;
        
            }
        System.out.println("The number of characters in the city name is: "+ count);
        System.out.println("The name of the city in all upper case letters will be");
        System.out.println(cityName.toUpperCase());
        System.out.println("The name of the city in all lower case letters will be");
        System.out.println(cityName.toLowerCase());  
        char first = cityName.charAt(0);
        System.out.println("The first character in the city name will be - " + first);
        
        System.out.println("********************************************");
        
        System.out.println("What is your name?");
        String name = scnr.next();
        System.out.print("How old are you?" );
        age = scnr.nextInt();
        System.out.println("What is your annual salery");
        long annualSalery = scnr.nextLong();        
        System.out.println("My name is " +name+ ", and I am " +age+ " years old. My annual salery is $" + annualSalery+ ".");
        
        System.out.println("********************************************");
        
            
        System.out.println("The name of your College?");
        String college = scnr.next();
        System.out.println("Write the name of your profession in one word?");
        String profession = scnr.next();
        System.out.println("What kind of pet do you have?");
        String petType = scnr.next();
        System.out.println("What is your pets name?");
        String petName = scnr.next();
        
        System.out.println("Here is your story ....");
        System.out.println("There once was a person named " +name+ " who lived in "
                +cityName+ ". At the age of " + age + ", " + name+ " went to college at "
                + college + "." +name+ " graduated and went to work as a " + profession +
                ". Then," + name + " addopted a(n) " +petType + " named "
                + petName +". They both lived happyily ever after !");
     

    
    }
    }//end of class

