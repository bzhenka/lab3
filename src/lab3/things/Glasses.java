package lab3.things;

import lab3.abstracts.Thing;

public class Glasses extends Thing  {
    public Glasses() {
        super("очки");
    }
    public void onTheNose(){
        System.out.println(getName() + " на носу!");
    }
}
