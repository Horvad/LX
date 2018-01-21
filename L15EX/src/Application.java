public class Application {
    public static void main(String [] args){
        Zoo zoo = new Zoo(15,1500) ;
        Animal banny = new Animal("Заяц", 10, 40, 20, 30, 20) ;
        Animal beer = new Animal("Медведь", 30, 15, 40, 60, 40) ;
        Animal wolf = new Animal("Волк", 20, 5, 50, 30, 15) ;
        Animal fox = new Animal("Лиса", 50, 5, 60, 45, 30) ;
        Animal banny1 = new Animal("Заяц", 10, 40, 20, 30, 20) ;
        Animal beer1 = new Animal("Медведь", 30, 15, 40, 60, 40) ;
        Animal wolf1 = new Animal("Волк", 20, 5, 50, 30, 15) ;
        Animal fox1 = new Animal("Лиса", 50, 5, 60, 45, 30) ;
        Animal banny2 = new Animal("Заяц", 10, 40, 20, 30, 20) ;
        Animal beer2 = new Animal("Медведь", 30, 15, 40, 60, 40) ;
        Animal wolf2 = new Animal("Волк", 20, 5, 50, 30, 15) ;
        Animal fox2 = new Animal("Лиса", 50, 5, 60, 45, 30) ;
        zoo.addAnimal(banny);
        zoo.addAnimal(banny1);
        zoo.addAnimal(banny2);
        zoo.addAnimal(beer);
        zoo.addAnimal(beer1);
        zoo.addAnimal(beer2);
        zoo.addAnimal(wolf);
        zoo.addAnimal(wolf1);
        zoo.addAnimal(wolf2);
        zoo.addAnimal(fox);
        zoo.addAnimal(fox1);
        zoo.addAnimal(fox2);
        /*
        public int priceForEatAnimal ;          //цена одной пайки
        public final int pecentForEat ;       //когда нужно кормить
        public final int percentForFood ;     //когда срет после какого колличества переработанной еды
        public final int percentForEatDay ;   //ест в день
        public final int percentFood ;        //процент ед в какашку

        public int food = 100 ;               //сытось
        protected int countShit = 0 ;        //какашка
  */

        //--------------------------------------------------------------------------------------------------------------
        Cleaner cleaner = new Cleaner(2,15,0) ;
        Cleaner cleaner1 = new Cleaner(2,15,0) ;
        Cleaner cleaner2 = new Cleaner(2,15,0) ;
        zoo.addCleaner(cleaner);
        zoo.addCleaner(cleaner1);
        zoo.addCleaner(cleaner2);
        //-------------------------------------------------------------------------------------------------------------

        Visitor visitor = new Visitor("Zzzz", 5,10, 50) ;
        Visitor visitor1 = new Visitor("Zzzz", 10,10, 20) ;
        Visitor visitor2 = new Visitor("Zzzz", 5,10, 10) ;
        Visitor visitor3 = new Visitor("Zzzz", 10,10, 170) ;
        Visitor visitor4 = new Visitor("Zzzz", 10,10, 220) ;
        //-------------------------------------------------------------------------------------------------------------
        ZooAnimal zooAnimal = new ZooAnimal(zoo) ;
        Thread ZooVisit = new ZooVisit(zoo) ;
        int moneyAnimal = zoo.moneyFoodAnimals() ;
        int moneyCleaner = zoo.slaryClener() ;
        while(zoo.zooMoney>(moneyAnimal+moneyCleaner)){
            zoo.clean();
            zoo.animalEat();
            zoo.visit();

 /*           zooAnimal.start();
            ZooVisit.start();
            try {
                zooAnimal.join();
                ZooVisit.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
*/
            moneyAnimal = zoo.moneyFoodAnimals() ;
        }
        System.out.print(Zoo.zooMoney);
    }
}
