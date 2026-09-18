public class Main{
    public static void main(String[] args) {
        System.out.println("javuh.");
        Customer tetoCustomer=new Customer();
        Customer mikuCustomer=new Customer();

        tetoCustomer.name="Teto";
        tetoCustomer.customerType=2;
        tetoCustomer.gallonsUsed=18000;
        mikuCustomer.name="Miku";
        mikuCustomer.customerType=1;
        mikuCustomer.gallonsUsed=9000;

        System.out.println(tetoCustomer.name);
        tetoCustomer.calculateBill();
        System.out.println(mikuCustomer.name);
    }
}