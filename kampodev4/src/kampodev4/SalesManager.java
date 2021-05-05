package kampodev4;

public class SalesManager {
    public void Sell(Customer customer, Product product){
        System.out.println(customer.getFirstName()+" "+product.getName()+" oyununu "+product.getPrice()+" fiyatýna satýn aldý");
    }
}