package Encapsulation;

public class Person {

    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name; // get harus mengemblikan variable name
    }
    
    // Setter
    public void setName(String newName) {
        this.name = newName; // set harus 
    }
    
}


