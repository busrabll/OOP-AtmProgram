import java.util.Scanner;

public class Login {
    
    public boolean Login(Account account){
        
        Scanner input = new Scanner(System.in);
        
        String UserName;
        String Password;
        
        System.out.println("Kullanici adini giriniz : ");
        UserName = input.nextLine();
        
        System.out.println("Sifrenizi giriniz : ");
        Password = input.nextLine();
        
        if (account.getUserName().equals(UserName) && account.getPassword().equals(Password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
}