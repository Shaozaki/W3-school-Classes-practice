package mypack;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username : ");
        String Username = input.nextLine();

        System.out.println("Username mu adalah :" + Username);
        input.close();
    }
}
