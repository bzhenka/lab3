package lab3.things;

import lab3.abstracts.Thing;

public class Plaster extends Thing {

    public Plaster(String coloring) {
        super("пластырь");
        if (coloring != null) {
            setProperty(coloring);
        }
    }
}
