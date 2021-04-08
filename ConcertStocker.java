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
public class ConcertStocker extends Staff {
    private double allowanceRate;
    private int code = 2020;

    public ConcertStocker() {
    }

    public ConcertStocker(String name, int YearJoined, double basicSalary,double allowanceRate) {
        super(name, basicSalary,YearJoined);
        this.allowanceRate = allowanceRate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getAllowanceRate() {
        return allowanceRate;
    }

    public void setAllowanceRate(double allowanceRate) {
        this.allowanceRate = allowanceRate;
    }

    @Override
    public String toString() {
        return "ConcertStocker{" + "allowanceRate=" + allowanceRate + '}';
    }
    
    @Override
    public double CalcSalary(){
        return this.getBasicSalary()*allowanceRate + this.getBasicSalary();
    }
    
    public static void AddTicketStock(ticket ticket,int cat1,int cat2,int cat3,int cat4,int cat5){
        ticket.setCAT1(cat1);
        ticket.setCAT2(cat2);
        ticket.setCAT3(cat3);
        ticket.setCAT4(cat4);
        ticket.setCAT5(cat5);
        
    }
    
    
}
