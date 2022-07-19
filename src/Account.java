public class Account {
    
    private String password;
    private String userName;
    private int balance;
    
    public Account(String password, String userName, int balance){
        
        this.password = password;
        this.userName = userName;
        this.balance = balance;
}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }  
    public void depositMoney(int amount){
        
        balance += amount;
        System.out.println("Islem basarili!");
        System.out.println("Yeni bakiye : " + balance);
    }
        public void withdrawMoney(int amount){
        
        if( balance - amount < 0)
        {
        	System.out.println("Ýslem basarisiz!");
            System.out.println("Yetersiz bakiye");
        }
        else
        {
            balance -= amount;
            System.out.println("Islem basarili!");
            System.out.println("Yeni bakiye : " + balance);
        }
    
    }
}