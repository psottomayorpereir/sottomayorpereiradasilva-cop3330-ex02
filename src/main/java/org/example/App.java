package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String name;
        int count=0;
        System.out.print("What is the input string? ");
        name=sc.nextLine();
        count=name.length();
        System.out.println(name + " has " + count + " characters.");
    }
}
