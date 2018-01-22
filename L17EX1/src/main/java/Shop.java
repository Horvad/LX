import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<Integer, Good> mapGood = new HashMap<Integer, Good>() ; //список ИД, товары
    Map<Integer, Integer> mapGoodIdCount = new HashMap<Integer, Integer>() ; //список ИД, колличество товаров
    Map<Integer, Account> mapAccounts = new HashMap<Integer, Account>() ; //список аккаунтов
}
