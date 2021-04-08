/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

/**
 *
 * @author User
 */
public class Manager extends Staff{
 private int code = 8888;
 private double bonus;
 
    public Manager() {
    }

    public Manager(String name, int YearJoined, double basicSalary,double bonus) {
        super(name, basicSalary,YearJoined);
        this.bonus = bonus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Manager{" + "code=" + code + '}';
    }

 @Override
     public double CalcSalary(){
        return this.getBasicSalary() + bonus;
    }

   
    
    
}
