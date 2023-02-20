package lab3.things;

import lab3.abstracts.Thing;

public class Veshalka extends Thing {

    public Veshalka(String chvet) {
        super("вешалка");
            if (chvet != null) {
                setProperty(chvet);
            }

    }
}
