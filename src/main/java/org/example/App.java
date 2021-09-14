/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

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