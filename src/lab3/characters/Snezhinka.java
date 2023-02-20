package lab3.characters;

import lab3.abstracts.Human;
import lab3.abstracts.Thing;
import lab3.enums.Gender;
import lab3.interfaces.EmotionInterface;
import lab3.interfaces.SeeInterface;
import lab3.interfaces.UnstickInterface;

import java.util.Random;

public class Snezhinka extends Human implements UnstickInterface, SeeInterface, EmotionInterface {
    public Snezhinka(){
        super("Снежинка", Gender.FEMALE);
    }


    @Override
    public void see(Thing[] things) {

    }


    @Override
    public void unstick(Thing thing) {
        Random random = new Random();
        int y = random.nextInt(3);{
            switch (y){
                case 0 -> System.out.println(getName() + " отклеила на 10% процентов " + thing.getProperty() + " " + thing.getName());
                case 1 -> System.out.println(getName() + " отклеила на 197% процентов " + thing.getProperty() + " " + thing.getName());
                case 2 -> System.out.println(getName() + " отклеила на 36% процентов " + thing.getProperty() + " " + thing.getName());
            }

        }

    }
    @Override
    public void inspect(Human human){
        System.out.println(human.getName() + " осмотрен Снежинкой" );
    }
    @Override
    public void cameOut(){
        System.out.println("Снежинка вышла из комнаты");

    }
    @Override
    public void look(Human human){
        System.out.println(getName() + " смотрела " + surprise() + " на " +  human.getName());
    }
    @Override
    public String surprise(){
        return ("с восторгом");

    }
}
