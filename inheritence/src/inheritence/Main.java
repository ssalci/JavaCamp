package inheritence;

public class Main {

	public static void main(String[] args) {
      IndividualCustomer engin = new IndividualCustomer();
      engin.customerNumber="123456";
      
      CorporateCustomer hepsiBurada = new CorporateCustomer();
      hepsiBurada.customerNumber="789654";
      
      SendikaCustomer abc = new SendikaCustomer();
      abc.customerNumber="99999";
      
      CustomerManager customerManager = new CustomerManager();
      //customerManager.add(hepsiBurada);
      //customerManager.add(engin);
      //customerManager.add(abc);
      
      Customer[] customers = {engin,abc,hepsiBurada};
      
      customerManager.addMultiple(customers);
      
	}

}
