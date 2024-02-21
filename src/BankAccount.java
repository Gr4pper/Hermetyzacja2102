import java.util.Scanner;

public class BankAccount extends Client{
    int sallary;
    int cardNumber;
    int pin;
    public BankAccount(String firstName, String lastName, int accountNumber, int monthlyIncome, int sallary, int cardNumber, int pin) {
        super(firstName, lastName, accountNumber, monthlyIncome);
        this.sallary = sallary;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    Scanner scanner = new Scanner(System.in);
    public int getAccount(){
        int i = 0;
        int login = 0;
        while(i < 1){
            System.out.print("Podaj numer konta: ");
            int num = scanner.nextInt();
            if (num == accountNumber){
                login = num;
                i++;
            }else{
                System.out.println("Nie ma takiego konta");
            }
        }
        i = 0;
        while (i < 1){
            System.out.print("Podaj pin: ");
            int pinNum = scanner.nextInt();
            if(pinNum == pin){
                int accPin = pin;
                i++;
            }else{
                System.out.println("Niepoprawny pin");
            }
        }
       int log = login;

        return log;
    }
    public void account(){
        System.out.println("Zalogowano "+ firstName +" "+lastName+ " Numer konta: "+ accountNumber);
    }
}
