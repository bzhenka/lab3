package lab3.abstracts;
import lab3.interfaces.ObjectInterface;

import java.util.Objects;

public abstract class Thing implements ObjectInterface {
    private final String name; //создаю закрытую переменую
    private String property = "";

    // создаю конструктор, который дает имя
    public Thing(String name){
        this.name = name;
        generate();
    }

    public String getName() {
        return name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
        System.out.println("Объекту " + name + " добавлено свойство " + property);
    }

    // переопределяю методы из интерфейсов
    @Override
    public void generate(){
        System.out.println("Предмет " + name + " " +
                "типа " + this.getClass().getName() + " создан");
    }
    @Override
    public void exist(){
        System.out.println(name + " существует");
    }

    // переопределение toString()
    @Override
    public String toString(){
        return "Вещь='" + name + "'";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing thing)) return false;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
