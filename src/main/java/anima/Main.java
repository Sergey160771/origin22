package anima;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> list=new ArrayList<> ();
        Predator cat=new Cat ("Vasy");
        list.add (cat);
        list.add (new Dog ("Шарик"));
        list.add (new Shark ("Лиза"));
        list.add (new Bream ("Коля"));
        list.add (new Perod ("Ваня"));



        for (Animal item : list
        ) {
            System.out.println (item.toString ());
        }

        List<Speakable> list1=new ArrayList<> ();
        for (Animal item : list) {
            if (item instanceof Speakable)
                list1.add ((Speakable) item);
        }
        list1.add (new Radeo ());
        for (Speakable item : list1
        ) {
            System.out.println (item.Speak ());
        }
        List<Runable> list2=new ArrayList<> ();
        for (Animal item : list) {
            if (item instanceof Runable)
                list2.add ((Runable) item);
        }
        for (Runable item : list2
        ) {
            System.out.println (item.toString () + "   " + item.SppedOfRun () + " км/ч");
        }
        List<SpeedOfSwimable> list3=new ArrayList<> ();
        for (Animal item : list) {
            if (item instanceof SpeedOfSwimable)
                list3.add ((SpeedOfSwimable) item);
        }
        Copelist<SpeedOfSwimable>(list,list3);
        for (SpeedOfSwimable item : list3
        ) {
            System.out.println (item.toString () + "   " + item.speedSwim () + " км/ч");
        }
    }



    static <T> void   Copelist(List<Animal> list, List<T> list2){
        for (Animal item : list) {
            if (item instanceof T)
                list2.add ((T) item);
        }
    }

}