package lab3.interfaces;

import lab3.abstracts.Human;

public interface EmotionInterface {
    String surprise();

    default void udivlenie(Human human){
        System.out.println("удивляясь над " + human.getName());
    }
}
