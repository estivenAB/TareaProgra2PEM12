package main;

import models.User;
import view.Welcome;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class Test {

    public static void main(String[] args) {
User user = new User();
        Welcome start = new Welcome();
        start.setVisible(true);
        System.out.println(user.getId());
    }

}
