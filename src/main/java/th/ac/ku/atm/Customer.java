package th.ac.ku.atm;

public class Customer {

    private int id;
    private String name;
    private int pin;

    private BankAccount account;

    public Customer(int id, String name, int pin) {
        this(id, name,pin,0);
    }
    public Customer(int id, String name, int pin, double balance){
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id, name,balance);
    }
    public boolean checkPin(int inputPin){
        return this.pin==inputPin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }
}
