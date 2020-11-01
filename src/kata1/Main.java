package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alejandro Ortega",new Date(99,12,23));
        System.out.println(person.getName()+" tiene: " 
                + person.getAge() + " años");
    }    
}