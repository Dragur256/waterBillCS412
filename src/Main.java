import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        System.out.println("javuh.");
        Customer tetoCustomer=new Customer();
        Customer mikuCustomer=new Customer();

        tetoCustomer.name="Teto";
        tetoCustomer.customerType=2;
        tetoCustomer.gallonsUsed=18000;
        mikuCustomer.name="Miku";

        System.out.println(tetoCustomer.name);
        tetoCustomer.calculateBill();
        System.out.println(mikuCustomer.name);

    }
}