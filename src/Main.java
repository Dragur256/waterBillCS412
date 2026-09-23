public class Main{
    public static void main(String[] args) {
        Customer neru=new Customer();
        neru.setGallonsUsed(-1000000);
        neru.customerInput();
        System.out.println(neru.getGallonsUsed());
        neru.calculateBill();
        neru.printBill();
    }
}