package com.deflate.bros;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Welcome to deflate !");
        Scanner inputScanner = new Scanner(System.in);
        boolean exit = false;
        String inputString;

        while (!exit) {
            System.out.println("Enter command:");
            inputString = inputScanner.nextLine();

            switch(inputString){
                case "exit":
                    exit = true;
                    break;
                case "comp":
                    comp();
                    break;
                case "decomp":
                    decomp();
                    break;
                case "about":
                    about();
                    break;
                default:
                    System.out.println("Bad input!");
            }
        }
    }

    public static void comp(){
        System.out.println("comp");
    }

    public static void decomp(){
        System.out.println("comp");
    }

    public static void about() {
        System.out.println("Oto Ģigulis 211RDB***");
        System.out.println("Jānis Aveniņš 211RDB020");
    }
}
