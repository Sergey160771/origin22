package anima;

public class Perod extends Bird {
    public Perod(String name) {
        super (name);
    }

    @Override
    public String toString() {
        return "Воробей";
    }

    @Override
    public String feed() {
        return "Зерно";
    }
}
