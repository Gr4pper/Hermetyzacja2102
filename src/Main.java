public class Main {
    public static void main(String[] args) {
        Client client = new Client("Beata", "Nowak", 352153165, 5000);
        Client client2 = new Client("Wojciech", "Kowalski", 552623637, 5300);
        Client client3 = new Client("Jakub", "Jakubowski", 845197510, 4800);
        Personel personel = new Personel("Adam", "Abacki", 5200, "Cashier", 350);
        Personel personel2 = new Personel("Barbara", "Babacka", 4200, "Cleaner", 100);
        Personel personel3 = new Personel("Celina", "Cabacka", 5500, "Secretary", 400);
        BankAccount acc = new BankAccount("Beata", "Nowak", 352153165, 5000, 1200, 149957729, 2345);
        BankAccount acc2 = new BankAccount( "Wojciech", "Kowalski", 552623637, 5300, 1200, 149957729, 2345);
        BankAccount acc3 = new BankAccount("Jakub", "Jakubowski", 845197510, 4800, 1200, 149957729, 2345);
        System.out.println("Pracownicy:");
        personel.personelInfo();
        personel.personelIncome();
        personel2.personelInfo();
        personel2.personelIncome();
        personel3.personelInfo();
        personel3.personelIncome();
        System.out.println("Klienci");
        client.accountInfo();
        client.yearIncome();
        client2.accountInfo();
        client2.yearIncome();
        client3.accountInfo();
        client3.yearIncome();
        if(acc.getAccount() == 352153165){
            acc.account();
        }else if(acc2.getAccount() == 552623637){
            acc2.account();
        }else if(acc3.getAccount() == 845197510){
            acc3.account();
        }



    }
}