package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1999, 11, 5);
        
        Person person = new Person("Alejandro", date); 
        System.out.println(person.getName()+" tiene: " 
                + person.getAge() + " años");
    }    
}