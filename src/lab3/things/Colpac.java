package lab3.things;

import lab3.abstracts.Thing;
import lab3.interfaces.Hang;
import lab3.interfaces.OnTheHead;

public class Colpac extends Thing implements Hang, OnTheHead {

    public Colpac() {
        super("колпак");
    }

    @Override
    public void hang(Veshalka veshalka) {
        System.out.println(getName() + " также висел на " + veshalka.getName());
    }

    @Override
    public void onTheHead() {
        System.out.println(getName() + " на голове");
    }
}
