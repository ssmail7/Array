//************************************************************
//  Author: Steven Smail
//
//  Array.java
//
//  This program creates an array of user-defined strings
//  and lists them individually in forwards and reverse order.
//************************************************************

import java.util.Scanner;

public class Array
        Scanner scanner = new Scanner(System.in);

        //String Number Prompt
        System.out.print("How many strings do you have? ");

        int limit = scanner.nextInt();
        //'Pitfall' Prevention
        String junk = scanner.nextLine();

        //Declaring String Array
        String[] words = new String[limit];

        //Enter String Loop
        for (int index = 0; index < words.length; index++)
                              (index + 1) + ": ");
        }

        System.out.println();

        //Array List Statement & Loop
        System.out.println("The array contains:");
        for (int index = 0; index < words.length; index++)

        System.out.println();

        //Reverse Array List Statement & Loop

    }
}