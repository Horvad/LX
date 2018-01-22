import java.util.Map;

import static spark.Spark.get ;
public class Controller {
    Controller(){}
    Shop shop = new Shop() ;

    //------------------------------------------------------------------------------------------------------------------
    public String addToShop(String name, int price, int count) {
        Good good = new Good(name,price) ;
        boolean newGood = true ;
        if (shop.mapGood.size() == 0) {
            shop.mapGood.put(0, good);
            shop.mapGoodIdCount.put(0, count);
        } else {

            for(Integer id : shop.mapGood.keySet()){
                Good tmpGood = shop.mapGood.get(id) ;
                if (tmpGood.name.equals(good.name)) {
                    Integer countMap = shop.mapGoodIdCount.get(id) ;
                    shop.mapGoodIdCount.put(id, countMap+count) ;
                    newGood = false ;
                    break;
                }
            }

            if (newGood){
                Integer id = shop.mapGood.size() ;
                shop.mapGood.put(id,good) ;
                shop.mapGoodIdCount.put(id,count) ;
            }
        }
        return name+" "+price+" "+count ;
    }

    //------------------------------------------------------------------------------------------------------------------
    public Integer getGood(String name, int count){
        boolean errorDontName = true ;
        Integer idGood = null;
        for (Integer id : shop.mapGood.keySet()){
            Good good = shop.mapGood.get(id) ;
  //          System.out.print(good.name);
            if (good.name.equals(name)){
                int countMap = shop.mapGoodIdCount.get(id) ;
                if (countMap<count){
                    IllegalArgumentException errorCount = new IllegalArgumentException("Такого колличесво товара в магазине нет") ;
                    throw errorCount ;
                } else {
                    shop.mapGoodIdCount.put(id,countMap-count) ;
                    errorDontName = false ;
                    idGood = id ;
                    break;
                }
            }
        }
        if (errorDontName){
            IllegalArgumentException errorName = new IllegalArgumentException("Такого товара нет в магазине") ;
            throw errorName ;
        }
        return idGood ;
    }

    //------------------------------------------------------------------------------------------------------------------

    public void addNewAccount (String name){
        boolean errorName = false ;
        for (Integer id : shop.mapAccounts.keySet()) {
            Account account = shop.mapAccounts.get(id) ;
            if (name.equals(account.name)){
                errorName = true ;
                IllegalArgumentException errorNameAccount = new IllegalArgumentException("Такой аккаунт уже существует") ;
                throw errorNameAccount ;
            }
        }
        if (!errorName){
            shop.mapAccounts.put(shop.mapAccounts.size(),new Account(name)) ;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public void addToCart(String accountName, String goodName, int goodCount){
        boolean errorAccountName = true ;
        for (Integer id : shop.mapAccounts.keySet()){
            Account account = shop.mapAccounts.get(id) ;
//            System.out.print(account.name);
            if (accountName.equals(account.name)){
                Integer idGood = getGood(goodName,goodCount);
 //               int tmp = account.card.mapCart.size() ;
 //               System.out.print(tmp);
                account.card.mapCart.put(idGood,goodCount) ;
                account.card.mapCartGood.put(idGood,shop.mapGood.get(idGood));
                errorAccountName = false ;
                break;
            }
        }
        if (errorAccountName){
            IllegalArgumentException errurAccountNameCart = new IllegalArgumentException("Такого поьлзователя не существеет") ;
            throw errurAccountNameCart ;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public int buy(String accountName){
        int money = 0;
        boolean errorAccountName = true ;
        for (Integer id : shop.mapAccounts.keySet()){
 //           System.out.print(shop.mapAccounts.get(id).name);
            if (accountName.equals(shop.mapAccounts.get(id).name)){
                Account account = shop.mapAccounts.get(id) ;
                if (account.card.mapCartGood.size()==0){
                    IllegalArgumentException errorCart = new IllegalArgumentException("Корзина пуста") ;
                    throw errorCart ;
                }
                for (Integer idCart : account.card.mapCart.keySet()){
     //               System.out.println(account.card.mapCartGood.get(idCart).price);
     //               System.out.println(account.card.mapCart.get(idCart));
                    int moneyPriceCard = account.card.mapCartGood.get(idCart).price ;
                    int countCardGood = account.card.mapCart.get(idCart) ;
   //                 System.out.print(moneyPriceCard+" "+countCardGood+" "+moneyPriceCard*countCardGood+"\n");
                    money = money+moneyPriceCard*countCardGood ;//account.card.mapCart.get(idCart)account.card.mapCartGood.get(id).price ;
  //                  System.out.print(money);
                }
            }
        }
        //System.out.print(money+" ");
        return money ;
    }

    //-----------------------return
    public void toStirngGood(){
        for (Integer ID: shop.mapGood.keySet()){
            System.out.print(shop.mapGoodIdCount.get(ID)+" ");
            shop.mapGood.get(ID).tooString();
        }
    }

    public void PrintCart(){
        for (Integer id : shop.mapAccounts.keySet()){
            System.out.print(shop.mapAccounts.get(id).name+" ");
            shop.mapAccounts.get(id).card.printCart();
        }
    }
}
