package kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate fn;
        fn = LocalDate.of(1999, 11, 5);
        
        Person person = new Person("Alejandro", fn); 
        System.out.println(person.getName()+" tiene: " 
                + person.getAge() + " años");
    }    
}