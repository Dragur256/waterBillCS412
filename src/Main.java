import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        try {
            Customer.getHighestCustomer();
        }catch(NoCustomerException e){
            System.out.println(e.getMessage());
        }
    }
}