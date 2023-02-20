package lab3.things;

import lab3.abstracts.Thing;

public class Palochka extends Thing {
    public Palochka(String material) {
        super("палочка");
        if (material != null) {
            setProperty(material);
        }
    }
}
