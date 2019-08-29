package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1137;

import java.util.HashMap;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class Info {
    String s1, s2, s3;

    public Info(String a, String b, String c) {
        s1 = a;
        s2 = b;
        s3 = c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Info)) {
            return false;
        }
        Info i = (Info) object;
        System.out.println(s1+s2+s3);
        return (s1 + s2 + s3).equals(i.s1 + i.s2 + i.s3);
    }

    public int hashCode() {
        System.out.println("Запускаем hashCode");
        return s1.hashCode();
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        Info i1 = new Info("aaa", "aaa", "aaa");
        Info i2 = new Info("aaa", "bbb", "ccc");

        Info i3 = new Info("aa", "b", "c");

        map.put(i1, "hello");
        map.put(i2, "world");
        map.put(i3, "haha");
    }
}
