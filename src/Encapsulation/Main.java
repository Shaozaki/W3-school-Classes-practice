package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John"); // error
        System.out.println(myObj.getName()); // error
    }
}
