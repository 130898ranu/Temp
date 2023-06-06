package com.bridglabz.PracticePrograme;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {

            (Scanner Scanner  = new Scanner(System.in)) {
                System.out.print(" Enter user name => ");
                String userName = Scanner.nextLine();

                System.out.print(" Enter password => ");
                String password = Scanner.nextLine();

                if ("ramesh".equals(userName) && "password".equals(password)) {
                    System.out.println(" User successfully logged-in.. ");
                } else {
                    System.out.println(" In valid userName of password ");
                }
            }
        }
    }

}

