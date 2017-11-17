import java.util.Scanner ;
public class Lesson3 {
    public static Scanner in = new Scanner(System.in) ;
    public static int Production_max ;
    public static int GoodsBuyShops1 ;
    public static int GoodsBuyShops2 ;
    public static int GoodsBuyShops3 ;
    int zzzzzz;
    public static void main (String [] args)
    {
        int shopNumber ;
        produceGoods();
        int AllGodsShops ;
        boolean goodsShops = false ;
        while (goodsShops == false)
        {
            getGoodsForShop(1);
            getGoodsForShop(2);
            getGoodsForShop(3);
            AllGodsShops = GoodsBuyShops2+GoodsBuyShops3+GoodsBuyShops1 ;
            if (AllGodsShops>Production_max) {System.out.println("!!!Yours data incorrect!!! Re-enter ");}
            else {goodsShops=true ;}
        }
        int moneyFactory =0;
        moneyFactory = moneyFactory+sellGoods(1) ;
        moneyFactory = moneyFactory+sellGoods(2) ;
        moneyFactory = moneyFactory+sellGoods(3) ;
        int allSoulDetails = GoodsBuyShops1+GoodsBuyShops2+GoodsBuyShops3 ;
        System.out.println("------------------------------------------------------------");
        printReport(allSoulDetails, moneyFactory);
    }
    public static void produceGoods ()
    {
            System.out.print("Enter released by the factory details: ");
            Production_max = in.nextInt();
            System.out.println("Factory produced by "+Production_max+" deteils ");
    }

    public static void getGoodsForShop (int shopNumber)
    {
          if (shopNumber == 1)
          {
              System.out.print("Enter goods for "+shopNumber+" magazine ");
              GoodsBuyShops1 = in.nextInt() ;
          }
          if (shopNumber == 2)
          {
              System.out.print("Enter goods for "+shopNumber+" magazine ");
              GoodsBuyShops2 = in.nextInt() ;
          }
          if (shopNumber == 3)
          {
              System.out.print("Enter goods for "+shopNumber+" magazine ");
              GoodsBuyShops3 = in.nextInt() ;
          }
    }

    public static int sellGoods (int shopNumber)
    {
        System.out.print("Enter price for detail for "+shopNumber+" shop ");
        int priceDeteilShop = in.nextInt() ;
        int priceAll = 0 ;
        if (shopNumber==1)
        {
            priceAll = GoodsBuyShops1*priceDeteilShop ;
            System.out.println("Shop #"+shopNumber+" bougth "+GoodsBuyShops1+" by "+priceAll+" money");
        }
        if (shopNumber==2)
        {
            priceAll = GoodsBuyShops2*priceDeteilShop ;
            System.out.println("Shop #"+shopNumber+" bougth "+GoodsBuyShops2+" by "+priceAll+" money");
        }
        if (shopNumber==3)
        {
            priceAll = GoodsBuyShops3*priceDeteilShop ;
            System.out.println("Shop #"+shopNumber+" bougth "+GoodsBuyShops3+" by "+priceAll+" money");
        }
        return priceAll;
    }


    public static void printReport (int soldGodsCount, int earnedMoney)
    {
            System.out.print("Factory sold "+ soldGodsCount+" deteils. Total quantity received money: "+earnedMoney);
            double middleMoneyForDetails ;
            double doubleSoldGodsGount =soldGodsCount ;
            double doubleEarnedMoney = earnedMoney ;
            middleMoneyForDetails = doubleEarnedMoney/doubleSoldGodsGount ;
            System.out.print(". Middle price for one detail: "+middleMoneyForDetails);
    }
}
