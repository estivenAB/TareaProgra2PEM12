package dataSet;

import exceptions.IDSizeException;
import exceptions.NotExistException;
import exceptions.PasswordSizeException;
import exceptions.SameIDException;
import exceptions.SamePasswordException;
import models.User;

/**
 *
 * @author Estiven Álvarez
 * @author Priscila Castro
 * @author Maikol Lizano
 *
 * @version 05 diciembre, 2018
 */
public class UsersList {

    private User[] usersList;
    private int counter;
    private User user;

    public UsersList(User[] usersList, int counter, User user) {
        this.usersList = usersList;
        this.counter = counter;
        this.user = user;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public User[] getUsersList() {
        return usersList;
    }

    public void setUsersList(User[] usersList) {
        this.usersList = usersList;
    }

    @Override
    public String toString() {
        return "UsersList{" + "usersList=" + usersList + '}';
    }

    public void addUser(User userToAdd) {
        if (userToAdd != null) {
            if (counter == usersList.length) {
                enlargeList(usersList);
            }
            if (counter == 0) {
                usersList[0] = userToAdd;
                counter++;
            } else {
                for (int i = counter; i >= 0; i--) {
                    usersList[i + 1] = usersList[i];
                }
                usersList[0] = userToAdd;
                counter++;
            }

        }
    }

    public void enlargeList(User[] userList) {
        if (counter >= userList.length) {
            User[] auxUserList = new User[userList.length + 1];
            for (int i = 0; i < userList.length; i++) {
                auxUserList[i] = userList[i];
            }
            auxUserList = userList;
        }
    }

    public void validateUserLogin(String id, String password) throws Exception {
        try {
            for (int i = 0; i < usersList.length; i++) {
                if (usersList[i].getId().equalsIgnoreCase(id) == true && usersList[i].getPassword().equalsIgnoreCase(password) == true) {
                    break;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public void validateUserSingOn(String id, String password) throws Exception {

        try {
            for (int i = 0; i < usersList.length; i++) {
                if (usersList[i].getId().equalsIgnoreCase(id) == false) {
                    try {
                        user.setId(id);
                    } catch (IDSizeException ex) {
                        System.err.println(ex.getMessage());
                    }
                }
            }
        } catch (SameIDException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            for (int i = 0; i < usersList.length; i++) {
                if (usersList[i].getPassword().equalsIgnoreCase(password) == false) {
                    try {
                        user.setPassword(password);
                    } catch (PasswordSizeException ex) {
                        System.err.println(ex.getMessage());
                    }
                }
            }
        } catch (SamePasswordException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
