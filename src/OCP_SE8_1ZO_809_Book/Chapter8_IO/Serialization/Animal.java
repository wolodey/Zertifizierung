package OCP_SE8_1ZO_809_Book.Chapter8_IO.Serialization;

import java.io.Serializable;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class Animal implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age;
    private char type = 'C';

    public Animal() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return "Animal [name = " + name + ", age = " + age + ", type = " + type + "]";

    }
}

