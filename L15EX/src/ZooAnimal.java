public class ZooAnimal extends Thread {
    private Zoo zoo ;

    ZooAnimal (Zoo zoo) {
        this.zoo = zoo ;
    }

    public void run () {
        zoo.animalEat();
    }
}
