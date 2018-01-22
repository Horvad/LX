import java.util.HashMap;
import java.util.Map;
//Card - корзина
public class Card {
    public HashMap<Integer, Good> mapCartGood = new HashMap<Integer, Good>() ;
    public HashMap<Integer, Integer> mapCart = new HashMap<Integer, Integer>(); //в корзине Ид товара и его колличество

    public void printCart() {
        for (Integer id : mapCartGood.keySet()){
            System.out.print(mapCartGood.get(id).name+" "+mapCart.get(id)+"\n");
        }
    }
}
