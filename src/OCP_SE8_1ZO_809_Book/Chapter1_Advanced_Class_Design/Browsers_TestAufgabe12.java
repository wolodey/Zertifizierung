package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 15.11.2017.
 */
public class Browsers_TestAufgabe12 {
    static class Browser {
        public void go(){
            System.out.println("inside browser");
        }
    }
    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }
    static class IE extends  Browser {
        @Override
        public void go() {
            System.out.println("inside IE");
        }
    }

    public static void main(String[] args) {

        Browser b = new Firefox();
        IE e = (IE) b;
        e.go();
    }
}
