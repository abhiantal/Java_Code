//accesModeFier

class Account{
    public String name;
    protected String email;
    private String password;

    //getters & Setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}



public class Day3_01 {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "ABHI";
        account.email = "abhi1234";
        // account.password = "1234567";
        account.setPassword("kumar1234");
        System.out.println(account.getPassword());
        }
    
}
