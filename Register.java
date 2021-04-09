/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

/**
 *
 * @author mingkit
 */
public class Register {
   
     private String name1;
    private String email1;
    private String password1;
    

    public Register() {
    }

    public Register(String name1, String email1, String password1) {
        this.name1 = name1;
        this.email1 = email1;
        this.password1 = password1;
       
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getEmail1() {
        return email1;
    }

    public void  setEmail1(String email1) {
      
        this.email1 = email1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

 
    public static boolean emailVerify(String email) {

       
        String REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        boolean mail;

      
        mail = email.matches(REGEX);
        return mail == true;
      
    }

    
    public static boolean passwordVeify(String password) {
     
        String REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{7,}$";
        boolean passwrd;

       passwrd = password.matches(REGEX);
        return passwrd == true;
    }

    public static boolean confirmPswd(String password ,String password1) {
       
        boolean compare;
       
        compare = password1.equals(password);
        return compare == true;
      
    }

    @Override
    public String toString() {
        return "Register{" + "name1=" + name1 + ", email1=" + email1 + ", password1=" + password1 + '}';
    }
}
