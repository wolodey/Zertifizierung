package Kapitel01;

public class Aufgabe12 {
    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }
    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }

    static class IE extends Browser {
        @Override
        public void go() {
            System.out.println("Inside IE");
        }
    }

    public static void main(String[] args) {
        Browser b = new Firefox();
        IE e = (IE) b;
        e.go();
    }
}
