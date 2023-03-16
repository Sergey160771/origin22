package anima;

public abstract class Predator extends Animal implements Speakable {

    public Predator(String name) {
        super (name);

    }

    @Override
    public String feed() {
        return "meat";
    }
}
