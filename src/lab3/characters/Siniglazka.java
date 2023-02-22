package lab3.characters;

import lab3.abstracts.Human;
import lab3.enums.Gender;

public class Siniglazka extends Human {
    public Siniglazka() {
        super("Синеглазка", Gender.FEMALE);
    }
    @Override
    public void cameOut(){
        System.out.println("Синуглазка вышла из комнаты");
    }
}
