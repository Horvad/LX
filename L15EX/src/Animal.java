public class Animal {
    private final String type ;
    public final int pecentForEat ;       //когда нужно кормить
    public final int percentForFood ;     //когда срет после какого колличества переработанной еды
    public final int percentForEatDay ;   //ест в день
    public final int percentFood ;        //процент ед в какашку
    public int priceForEatAnimal ;          //цена одной пайки
    public int food = 100 ;               //сытось
    volatile int countShit = 0 ;        //какашка
    private int foodShit = 0;

    Animal(String type, int priceForEatAnimal, int pecentForEat, int percentForFood, int percentForEatDay, int percentFood){
        this.type = type ;
        this.priceForEatAnimal = priceForEatAnimal ;
        this.pecentForEat = pecentForEat ;
        this.percentForFood = percentForFood ;
        this.percentForEatDay = percentForEatDay ;
        this.percentFood = percentFood ;
    }

    public void consumeDay (){
        if (Zoo.zooMoney>priceForEatAnimal){
            if ((food-percentForEatDay)<pecentForEat){
                food = food+percentForEatDay;
            } else {
                food = food-100+percentForEatDay ;
                Zoo.zooMoney = Zoo.zooMoney-priceForEatAnimal ;
            }
            int tmpFood = ((foodShit+(int)(percentForEatDay*percentFood)/100)) ;
            if (tmpFood>percentForFood){
                foodShit = tmpFood ;
            } else {
                foodShit = 0 ;
                countShit = countShit + 1;
            }
        }else {
            IllegalArgumentException errorZooMoney = new IllegalArgumentException("НЕТ ДЕНЕГ В ДЛЯ ЕДЫ В ЗООПАРКЕ") ;
            throw errorZooMoney ;
        }
    }
}