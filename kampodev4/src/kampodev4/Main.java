package kampodev4;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        SalesManager salesManager = new SalesManager();
        CampaignManager campaignManager = new CampaignManager();

        Customer customer = new Customer(1,1986,"999999999999","Mehmet","UySal","5656565656562356");
        Product product = new Product(1,85,"PES 2021","Futbol Smilasyonu");
        Campaign campaign = new Campaign(10);

        customerManager.add(customer);
        salesManager.Sell(customer,product);
        campaignManager.addDiscount(product,campaign);
        campaignManager.updateDiscount(product,campaign,20);
        campaignManager.removeDiscount(product,campaign);
    }
}