public class NamedEntity {
    private String name ;

    NamedEntity(String name){
        this.name = name ;
    }

    @Override
    public String toString() {
        return name ;
    }
}
