package anima;

public class Shark extends Fish {

    public Shark(String name) {
        super (name);
    }

    @Override
    public String toString() {
        return "Shark{} " + super.toString () +  Teeth () ;
    }
    public String Teeth(){
        return " у меня есть зубы";
    }


    @Override
    public int speedSwim() {
        return 25 ;
    }
}
