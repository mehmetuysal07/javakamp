package kampodev4;

public class CustomerValidator {
    public static boolean isValid(Customer customer){
        if (!customer.getTcNo().isEmpty() && !customer.getFirstName().isEmpty() && !customer.getLastName().isEmpty() && customer.getBirthYear() != null){
            return true;
        }else{
            return false;
        }
    }
}