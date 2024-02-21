import java.util.Scanner;

public class Personel {
    String firstName;
    String lastName;
    int baseMonthlyIncome;
    String workPlace;
    int additionalIncome;
    public Personel(String firstName, String lastName, int baseMonthlyIncome, String workPlace, int additionalIncome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseMonthlyIncome = baseMonthlyIncome;
        this.workPlace = workPlace;
        this.additionalIncome = additionalIncome;
    }
    Scanner scanner = new Scanner(System.in);
    public String getPersonelInfo(){
        String personelInfo = firstName +" "+lastName+" Work place:"+workPlace+" Base income:"+baseMonthlyIncome;
        return personelInfo;
    }
    public void personelInfo(){
        String info = getPersonelInfo();
        System.out.println(info);
    }
    public int getPersonelIncome(){
        int income = (baseMonthlyIncome * 12) + (4 * additionalIncome);
        return income;
    }
    public void personelIncome(){
        int income = getPersonelIncome();
        System.out.println("Czy chcesz zobaczyć roczny dochód? y/n");
        String s = scanner.nextLine();
        if(s.equals("y")){
            System.out.println("Year income:"+income);
        }
    }
}
