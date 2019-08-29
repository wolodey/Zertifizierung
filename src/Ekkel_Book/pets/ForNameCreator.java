//: typeinfo/pets/ForNameCreator.java
package Ekkel_Book.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "Ekkel_Book.pets.Mutt",
    "Ekkel_Book.pets.Pug",
    "Ekkel_Book.pets.EgyptianMau",
    "Ekkel_Book.pets.Manx",
    "Ekkel_Book.pets.Cymric",
    "Ekkel_Book.pets.Rat",
    "Ekkel_Book.pets.Mouse",
    "Ekkel_Book.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
