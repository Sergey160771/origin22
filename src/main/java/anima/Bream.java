package anima;

public class Bream extends Fish{
    public Bream(String name) {
        super (name);
    }

    @Override
    public String toString() {
        return "Bream{} " + super.toString () ;
    }


    @Override
    public int speedSwim() {
        return 15;
    }
}


