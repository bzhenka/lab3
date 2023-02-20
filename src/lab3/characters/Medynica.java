package lab3.characters;

import lab3.abstracts.Human;
import lab3.abstracts.Thing;
import lab3.enums.Week;
import lab3.interfaces.LeaveInterface;

import java.util.List;
import java.util.Random;


public class Medynica extends Human implements LeaveInterface {
    public Medynica(){
        super("Медуница");
    }

    @Override
    public void leave(Thing thing) {
        List<Week>enumList = List.of(Week.values());
        Random random = new Random();
        Week randomElement = enumList.get(random.nextInt(enumList.size()));
            System.out.println(getName() + " оставила на столе в " + randomElement + " " + thing.getName());
            }

        }





