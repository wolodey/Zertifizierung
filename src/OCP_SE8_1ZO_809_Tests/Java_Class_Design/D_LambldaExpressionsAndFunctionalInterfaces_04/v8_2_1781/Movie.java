package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1781;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class Movie {

    static enum Genre {DRAMA, THRILLER, HORROR, ACTION};

    private Genre genre;
    private String name;

    Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
