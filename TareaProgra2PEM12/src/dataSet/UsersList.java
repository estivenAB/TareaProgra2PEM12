
package dataSet;

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

    public UsersList(User[] usersList) {
        this.usersList = usersList;
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
    
    public void addUser (User userToAdd){
        if (userToAdd != null) {
            if (counter == usersList.length) {
                enlargeList(usersList);
            }
            if (counter == 0) {
                usersList[0] = userToAdd;
                counter++;
            }else{
                for (int i = counter; i >= 0; i--) {
                    usersList[i + 1] = usersList[i];
                }
                usersList[0] = userToAdd;
                counter++;
            }
            
        }
    }
    
    public void enlargeList(User[] userList){
        if (counter >= userList.length) {
            User[] auxUserList = new User[userList.length+1];
            for (int i = 0; i < userList.length; i++) {
                auxUserList[i] = userList[i];
            }
            auxUserList = userList;
        }
    }
    
    
}
