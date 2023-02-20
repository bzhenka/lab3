package lab3.interfaces;

import lab3.abstracts.Human;
import lab3.abstracts.Thing;

public interface SeeInterface {
    void see(Thing[] things);
    default void inspect(Human human){
        System.out.println("осмотрела");
    }
    default void look(Human human){
        System.out.println("смотрела");
    }
}
