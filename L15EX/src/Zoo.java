import java.util.ArrayList ;

public class Zoo {
    public static int countZoo ;
    protected ArrayList<Visitor> zooVisitor = new ArrayList<Visitor>() ;
    private static ArrayList<Animal> zooAnimal = new ArrayList<Animal>() ;
    private static ArrayList<Cleaner> zooCleaner = new ArrayList<Cleaner>() ;
    private int stopedCleaner = 0 ;
    volatile static float zooMoney ;
    Zoo (){}
    Zoo (int countZoo, float zooMoney){
        this.countZoo = countZoo ;
        this.zooMoney = zooMoney ;
    }
    //-----------------------------------------------------------------------------------------------
    public void addAnimal (Animal animal){
        zooAnimal.add(animal) ;

    }

    public void addVisitor (Visitor visitor){
        zooVisitor.add(visitor) ;
    }

    public void addCleaner (Cleaner cleaner){
        zooCleaner.add(cleaner) ;

    }
    //-----------------------------------------------------------------------------------------------------------
    public void clean () {
        for (Cleaner cleaner: zooCleaner){
            stopedCleaner = stopedCleaner+cleaner.clean ;
            if (zooMoney<cleaner.salary){
                IllegalArgumentException errorCleanerSalary = new IllegalArgumentException("НЕТ ДЕНЕГ НА ЗАРПЛАТУ") ;
                throw errorCleanerSalary ;
            }
            zooMoney = zooMoney-cleaner.salary ;
            cleaner.money = cleaner.money+cleaner.salary ;
        }
        if (stopedCleaner>0){
            for (Animal animal: zooAnimal){
                stopedCleaner = stopedCleaner-animal.countShit ;
                if (stopedCleaner<0){
                    animal.countShit = Math.abs(stopedCleaner);
                    break ;
                }
                animal.countShit = 0 ;
            }
        } else {
            IllegalArgumentException errorClean = new IllegalArgumentException("НЕТ УБОРЩИКОВ") ;
            throw errorClean ;
        }
    }
    //---------------------------------------------------------------------------------------------------
    public void visit(){
        for(Visitor visitor: zooVisitor){
            boolean happy = true ;
            int pecentVisitation = (int)Math.random()*visitor.happiness ;
            if (pecentVisitation<10){
                continue;
            }
            if (visitor.money<countZoo){
                zooVisitor.remove(visitor) ;
                continue;
            }
            for (Animal animal:zooAnimal) {
                if (animal.countShit==0){
                    if (visitor.happiness<100){
                        visitor.happiness = visitor.happiness +visitor.percentLikeAnimal ;
                    }
                    if (visitor.happiness>100){
                        visitor.happiness = 100 ;
                    }
                } else {
                    visitor.happiness = visitor.happiness-visitor.percentUpsetHhit*animal.countShit ;
                    if (visitor.happiness <0 ) {
                        visitor.happiness = 0 ;
                        happy = false ;
                    }
                }
            }
            visitor.money = visitor.money - countZoo ;
            zooMoney = zooMoney+countZoo ;
            if (happy == false){
                zooVisitor.remove(visitor) ;
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void animalEat (){
        for (Animal animal: zooAnimal){
            animal.consumeDay();
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public int slaryClener () { //зарплата рабочих в день
        int money = 0 ;
        for (Cleaner cleaner:zooCleaner){
            money = money+cleaner.salary ;
        }
        return money ;
    }
    //------------------------------------------------------------------------------------------------------------------

    public int moneyFoodAnimals () { //еда на день для содержания животных
        int money = 0 ;
        for (Animal animal: zooAnimal){
            if ((animal.food-animal.percentForEatDay)<animal.pecentForEat){
                money = money + animal.priceForEatAnimal ;
            }
        }
        return money ;
    }


}
