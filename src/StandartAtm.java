import java.util.Scanner;

public class StandartAtm {
    
    public void apply(Account account){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hosgeldiniz!!!");
        System.out.println("**************");
        
        String transactions = "1 : Bakiye goruntule\n "
                            + "2 : Para yatir\n"
                            + "3 : Para cek\n"
                            + "4 : Cikis";
        
        System.out.println(transactions);
        System.out.println("***************");
        
        while (true) {
            System.out.print("Lütfen yapmak istediginiz islemi seciniz : ");
            String process = input.nextLine();
            
            if (process.equals("4")) {
            	
            	break;
            }
            else if (process.equals("1")) {
            	
            	System.out.println(" Bakiye : " + account.getBalance());
            	break;
            }
            else if (process.equals("2")) {
            	
                System.out.print("Yatirmak istediginiz miktari giriniz : ");
                int amount = input.nextInt();
                input.nextLine();
                account.depositMoney(amount);
                break;

                }
            else if (process.equals("3")) {
            	
            	System.out.print("Çekmek istediðiniz miktarý giriniz: ");
            	int amount = input.nextInt();
            	input.nextLine();
            	account.withdrawMoney(amount);
            	break;
            }
            else {
            	
            	System.out.println("Geçersiz islem lütfen tekrar deneyiniz!!! ");
            }
        }
    }
}
