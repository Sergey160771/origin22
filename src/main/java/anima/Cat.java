package anima;

public class Cat extends Predator implements Runable {

    public Cat(String name) {
        super (name);
    }

    @Override
    public String toString() {
        return "Cat{"+Climd ()+"} " + super.toString ();
    }
    @Override
    public String feed() {
        return "mouse "+super.feed ();
    }
    public String Climd () {
        return "Я лазаю по деревьям";
    }
    @Override
    public String Speak() {
        return "Мяу";
    }

    @Override
    public int SppedOfRun() {
        return 20;
    }
}
