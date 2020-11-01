package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


public class Person {
    
    private final String name;
    private final Date birthday = null;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    private final LocalDate fn;
            
    public Person(String name, LocalDate fn) {
        this.name = name;
        this.fn =fn;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return Period.between(fn, LocalDate.now()).getYears();
    }
    private long miliSencondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
    
}
