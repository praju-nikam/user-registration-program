package com.java.bridgelabs;

import java.util.Scanner;
import java.util.regex.Pattern;
/*
  * purpose : Use of java Regular Expression Patterns to Solve User Registration Problem.
  * @author : Prajakta
  * @Since : 01-04-2022
 */
public class UserInfo
{
     Scanner scanner = new Scanner(System.in);
    /*
       Added  first name method to check first name
    */
    public  void userFirstName()
    {
        System.out.println("Enter first name : ");
        String firstName = scanner.next();
        boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName);
        if (result)
        {
            System.out.println("Correct");
        }
        else{
            System.out.println("Please enter valid first name : ");
        }

    }

    /*
         Added last name method to check last name
     */
    public void userLastName()
    {
        System.out.println("Enter last name : ");
        String lastName = scanner.next();
        boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName);
        if(result)
        {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter valid last name : ");
        }
    }

    /*
     Added email id method to check email id
   */
    public void userEmailId()
    {
        System.out.println("Enter email id : ");
        String emailId = scanner.next();
        boolean result = Pattern.matches("[a-z A-Z 0-9]+[@][a-z A-Z 0-9]+[.][a-z]{2,3}$",emailId);
        if (result)
        {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter correct email id : " );
        }
    }
}
