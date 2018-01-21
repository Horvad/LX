public class ZooVisit extends Thread {
    private Zoo zoo ;

    ZooVisit(Zoo zoo){
        this.zoo = zoo ;
    }

    public void run(){
        zoo.visit();
    }
}
