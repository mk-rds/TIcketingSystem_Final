
package finaldemo;



public class user {
  
    private String name;
    private String password;
    private String email;

    public user() {
    }

    
    public user(String name,String email,String password) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" + "name=" + name + ", password=" + password + ", email=" + email + '}';
    }

   
}

