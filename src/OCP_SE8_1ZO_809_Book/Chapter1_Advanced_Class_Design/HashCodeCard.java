package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class HashCodeCard {
    private String rank;
    private String suit;

    public HashCodeCard(String r, String s) {
        if (r == null || s == null) {
            throw new IllegalArgumentException();
        }
        rank = r;
        suit = s;
    }

    public boolean equals(Object object) {
        if (!(object instanceof HashCodeCard)) {
            return false;
        }
        HashCodeCard card = (HashCodeCard) object;
        return rank.equals(card.rank) && suit.equals(card.suit);
    }

    public int hashCode() {
        return rank.hashCode();
    }

    public static void main(String[] args) {
        HashCodeCard card = new HashCodeCard("a", "b");
        System.out.println(card.hashCode());
    }
}
