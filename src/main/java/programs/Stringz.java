package programs;

import java.util.Scanner;

public class Stringz {

    String input;
    boolean flag = false;

    public Stringz() {

        System.out.println("Please enter a string...");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        this.input = input;

        if (input.length() > 10) {
            this.flag = true;
        }
    }

    public String getInput() {
        return input;
    }

    public void splitInput() {
        String input = this.input;

        String[] splitInput = input.split("");

        for (String s : splitInput) {
            System.out.println(s + " " + s.);
        }

    }

    public String substringInput() {
        return this.input.substring(3, 8);
    }


    public void runReport() {
        System.out.println(this.getInput());
        this.splitInput();
        System.out.println(this.substringInput());

    }

    public static void main(String[] args) {

        Stringz TEST = new Stringz();

        TEST.runReport();



    }

}

