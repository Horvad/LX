public class Visitor {
    private final String name ;
    protected final int percentUpsetHhit ; //расстройство за какашку
    protected final int percentLikeAnimal ; //счастье за животное
    protected int happiness = 100 ;
    protected int money ;
    public boolean happyVisit = true ;


    Visitor(String name, int percentLikeAnimal, int percentUpsetHhit, int money){
        this.name = name ;
        this.percentLikeAnimal = percentLikeAnimal ;
        this.percentUpsetHhit = percentUpsetHhit ;
        this.money = money ;
    }

    public String toString() {
        return super.toString();
    }
}
