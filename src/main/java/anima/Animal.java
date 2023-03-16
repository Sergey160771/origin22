package anima;

public abstract class  Animal {
    public Animal(String name) {
        this.name=name;
    }
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' + "feed " + feed () +
                '}';
    }
    public abstract String feed();




}
