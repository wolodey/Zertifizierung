//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package Ekkel_Book.pets;
import java.util.*;

public class LiteralPetCreator extends PetCreator {
  // No try block needed.
  @SuppressWarnings("unchecked")
  public static final List<Class<? extends Pet>> allTypes =
    Collections.unmodifiableList(Arrays.asList(
      Pet.class, Dog.class, Cat.class,  Rodent.class,
      Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
      Cymric.class, Rat.class, Mouse.class,Hamster.class));
  // Types for random creation:
  private static final List<Class<? extends Pet>> types =
    allTypes.subList(allTypes.indexOf(Mutt.class),
      allTypes.size());
  public List<Class<? extends Pet>> types() {
    return types;
  }	
  public static void main(String[] args) {
    System.out.println(types);
  }
} /* Output:
[class Ekkel_Book.pets.Mutt, class Ekkel_Book.pets.Pug, class Ekkel_Book.pets.EgyptianMau, class Ekkel_Book.pets.Manx, class Ekkel_Book.pets.Cymric, class Ekkel_Book.pets.Rat, class Ekkel_Book.pets.Mouse, class Ekkel_Book.pets.Hamster]
*///:~
