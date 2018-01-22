public class Good {
    String name ;
    int price ;

    Good (String name, int price){
        this.name = name ;
        this.price = price ;
    }

    public void tooString() {
        System.out.println(" "+name+" "+price);
    }
}
