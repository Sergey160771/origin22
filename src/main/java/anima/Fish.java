package anima;

public abstract class Fish extends Animal implements SpeedOfSwimable {
    public Fish(String name) {
        super (name);
    }

    @Override
    public String feed() {
        return "shellfish";
    }
}
