package anima;

public class Dog extends Predator implements Runable{
    public Dog(String name) {
        super (name);
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString ();
    }
    @Override
    public String Speak() {
        return "Гав";
    }

    @Override
    public int SppedOfRun() {
        return 30;
    }
}
