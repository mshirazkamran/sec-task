package dev.shiraz.user;

public class User {
 
    String username;
    String password;
    int age;


    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", age=" + age + "]";
    }

    
    
}
