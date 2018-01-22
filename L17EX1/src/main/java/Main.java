import static spark.Spark.get ;
import static spark.Spark.post ;

public class Main {
    public static void main(String [] args){
        final Controller controller = new Controller() ;

        get("/addToShop",(request, response) -> {
            String name = request.queryParams("name");
            Integer price = Integer.parseInt(request.queryParams("price"));
            Integer count = Integer.parseInt(request.queryParams("count"));
            String result = controller.addToShop(name, price, count);
            return "ok";
        })  ;

        get("/addNewAccount", (request, response) ->{
            String name = request.queryParams("name") ;
            controller.addNewAccount(name);
            return "ok" ;
        });

        get("/AddToCart",(request, response) -> {
            String accountName = request.queryParams("accountName") ;
            String goodName = request.queryParams("goodName") ;
            Integer goodCount = Integer.parseInt(request.queryParams("goodCount")) ;
            controller.addToCart(accountName,goodName,goodCount);
            return "ok" ;
        }) ;

        get("/buy", (request,responce) -> {
            String accountName = request.queryParams("accountName") ;
            int buy = controller.buy(accountName) ;
            return "Вы дожны заплатить: "+buy ;
        });




        /*        controller.addToShop("Свекла", 12, 12);
        //controller.toStirngGood();
        controller.addToShop("Apple",24,7);
        //controller.toStirngGood();
        controller.addToShop("Orange",60,2);
        controller.addToShop("Orange",60,2);
        //controller.toStirngGood();
        controller.addNewAccount("Zzz");
        //controller.addNewAccount("Zzz");
        controller.addToCart("Zzz","Apple",3);
 //       System.out.print(controller.buy("Zzz")) ;
//        controller.PrintCart();
        System.out.print(controller.buy("Zzz")) ;

  */  }
}
