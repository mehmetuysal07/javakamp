package kampodev4;

public class CustomerManager {
    public void add(Customer customer){
        if (CustomerValidator.isValid(customer)){
            System.out.println("Sisteme hoþ geldin "+customer.getFirstName());
        }else{
            System.out.println("Bilgileriniz yanlýþ");
        }
    }
}