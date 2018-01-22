public class Account {
    final String name ;
    Card card = new Card();


    Account (String name){
        this.name = name ;
    }

    public String accountInfo (){
        return "Пользователь "+name ;
    }
}
