package OCP_SE8_1ZO_809_Book.Chapter2_Design_Pattern_Principles;

/**
 * Created by WSteinle on 22.02.2017.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {
        print (new Animal("fish", false, true), abb -> abb.canSwim());
        print (new Animal("kangaroo", true, false), (acc) -> acc.canHop());
    }
}
