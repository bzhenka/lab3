package lab3.characters;

import lab3.abstracts.Human;
import lab3.abstracts.Thing;
import lab3.enums.Gender;
import lab3.interfaces.DressedInterface;
import lab3.interfaces.SeeInterface;
import lab3.interfaces.TakeInterface;
import lab3.interfaces.ThinkInterface;

import java.util.Random;

public class Neznayka extends Human implements DressedInterface, SeeInterface, TakeInterface, ThinkInterface {
    public Neznayka() {
        super("Незнайка", Gender.MALE);
    }


    @Override
    public void putOn(Thing thing) {
        Random random = new Random();
        int x = random.nextInt(3);
        switch (x) {
            case 0 -> System.out.println("Незнайка надел " + thing.getProperty() + " " + thing.getName());
            case 1 -> System.out.println("Незнайка напялил " + thing.getProperty() + " " + thing.getName());
            case 2 -> System.out.println("Незнайка нацепил " + thing.getProperty() + " " + thing.getName());
        }
    }

    @Override
    public void see(Thing[] things) {
        for (Thing thing: things){
            System.out.println("Незнайка увидел " + thing.getName());
        }

    }

    @Override
    public void take(Thing thing) {
        System.out.println("Незнайка захватил " + thing.getProperty()+ " " +  thing.getName());
    }
    @Override
    public void cameOut(){
        System.out.println("Незнайка вышел из комнаты");
    }

    @Override
    public void boldness(String boldness){
        System.out.println("у " + getName() + " есть " + boldness);
    }



}
