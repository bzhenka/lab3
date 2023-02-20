package lab3.things;

import lab3.abstracts.Thing;
import lab3.interfaces.Hang;

public class Robe extends Thing implements Hang {

    public Robe(String color) {
        super("халат");
        if (color != null){
            setProperty(color);
        }
    }

    @Override
    public void hang(Veshalka veshalka) {
        System.out.println(getName() + " весел на " + veshalka.getName());
    }
}
