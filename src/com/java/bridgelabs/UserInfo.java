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

}
