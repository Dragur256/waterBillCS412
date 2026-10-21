import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Customer sf=new SingleFamily();
        sf.customerInput();
        sf.generateBill();

        Duplex dp=new Duplex();
        dp.customerInput();
        dp.generateBill();

        System.out.println(Customer.getAllCustomers());

        for(int i=0;i<Customer.getAllCustomers().size();i++){
            System.out.println(Customer.getAllCustomers().get(i));
        }
        //for(data type name:collection)
        for(Customer c:Customer.getAllCustomers()){
            System.out.println(c);
        }
    }
}