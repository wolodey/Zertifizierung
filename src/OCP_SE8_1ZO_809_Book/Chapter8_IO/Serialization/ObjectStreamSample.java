package OCP_SE8_1ZO_809_Book.Chapter8_IO.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class ObjectStreamSample {
    public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile))
        )) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal) {
                    animals.add((Animal) object);
                }
            }
        } catch (EOFException e) {

        }
        return animals;
    }

    public static void createAnimalsFile(List <Animal> animals, File dataFile) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile))
        )) {
            for (Animal animal : animals) {
                out.writeObject(animal);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Tommy Tiger", 5, 'T'));
        animals.add(new Animal("Peter Penguin", 8, 'P'));

        File dataFile = new File("C:\\Users\\WSteinle\\Desktop\\Zertifizierung_Oracle\\ztest.txt");
        createAnimalsFile(animals, dataFile);
        System.out.println(getAnimals(dataFile));


    }
}
