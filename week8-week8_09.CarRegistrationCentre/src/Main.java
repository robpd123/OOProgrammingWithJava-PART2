
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate r1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate r2 = new RegistrationPlate("FI", "ABC-122");
        
        System.out.println("" + r1.equals(r2));
        
        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
