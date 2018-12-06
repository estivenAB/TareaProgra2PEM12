package models;

import exceptions.IDSizeException;
import exceptions.PasswordSizeException;

/**
 *
 * @author Estiven
 */
public class User {

    private String id;
    private String password;

    public User() {
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (id.length() >= 4) {
            this.id = id;
        } else {
            throw new IDSizeException();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if (password.length() >= 3) {
            this.password = password;
        } else {
            throw new PasswordSizeException();
        }
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", password=" + password + '}';
    }

}
