package OCP_SE8_1ZO_809_Book.Chapter8_IO;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class TransientEkkel_S795 implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    public TransientEkkel_S795(String name, String pwd) {
        username = name;
        password = pwd;
    }

    public String toString() {
        return "logon info: \n username: " + username +
                "\n date: " + date + "\n password" + password;
    }

    public static void main(String[] args) {
        TransientEkkel_S795 a = new TransientEkkel_S795("Hulk", "myPony");

    }

}
