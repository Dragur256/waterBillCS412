import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class Customer {

    final int TIER2_CUTOFF = 13000;
    final double GALLONS = 1000.0;

    private String name;
    private int gallonsUsed;
    private int customerType; // 1 is single-family, 2 is a duplex
    private double bill;

    static private ArrayList<Customer> allCustomers=new ArrayList<Customer>();

    public Customer(){
        System.out.println("Hello!");
    }
    public Customer(String name,int gallonsUsed){
        setName(name);
        setGallonsUsed(gallonsUsed);
    }

    // GETTER allows classes to get information
    public int getGallonsUsed(){
        return gallonsUsed;
    }
    public double getBill() {
        return bill;
    }

    public static ArrayList<Customer> getAllCustomers(){
        return allCustomers;
    }

    public String getName() {
        return name;
    }

    public int getCustomerType() {
        return customerType;
    }

    // SETTER allows for us to set a value
    public void setGallonsUsed(int gallonsUsed){
        if(gallonsUsed<0){
            System.out.println("Gallons must be positive.");
        }
        else {
            this.gallonsUsed = gallonsUsed;
        }
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public void setName(String name) {
        if(name.equals("")||name==null){
            System.out.println("Name can not be empty");
        }
        else {
            this.name = name;
        }
    }

    protected void registerCustomer(){
        allCustomers.add(this);
    }

    public void customerInput(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Enter Customer Name: ");
            setName(bufferedReader.readLine());
            System.out.print("Enter Customer Type (1: SingleFamily, 2: Duplex): ");
            customerType = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter gallons used: ");
            setGallonsUsed(Integer.parseInt(bufferedReader.readLine()));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printBill(){
        System.out.println("Bill total: " + bill);
    }

    protected abstract double calculateBill();

    public void generateBill(){
        double calculated=calculateBill();
        double finalBill=applyDiscount(calculated);
        if(finalBill<0){
            System.out.println("Bill must be positive.");
        }
        this.bill=finalBill;
        registerCustomer();
    }

    protected double applyDiscount(double calculatedBill){
        return calculatedBill;
    }

    @Override
    public String toString(){
        return "Name "+getName();
    }
    static public Customer getHighestCustomer(){
        return null;
    }
}
