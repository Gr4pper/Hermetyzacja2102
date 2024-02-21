public class Client {
    String firstName;
    String lastName;
    int accountNumber;
    int monthlyIncome;
    public Client(String firstName, String lastName, int accountNumber, int monthlyIncome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.monthlyIncome = monthlyIncome;
    }

   public String getAccountInfo(){
        String accountInfo = firstName +" "+lastName+" Account number:"+accountNumber+" Income:"+monthlyIncome;
        return accountInfo;
   }
   public void accountInfo(){
        String info = getAccountInfo();
        System.out.println(info);
   }
   public int getYearIncome(){
        int yearIncome = monthlyIncome * 12;
        return yearIncome;
   }
   public void yearIncome(){
        int yearIncome = getYearIncome();
        System.out.println("Year income value: "+yearIncome);
   }


}
