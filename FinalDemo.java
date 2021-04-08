/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FinalDemo {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select=0,times=0,what,option=0,choose,quantity=0,total=0,subtotalBP=0,subtotalJay=0,code=0;                                                            
        String name,pswd,name1,pswd1,type=null;
        
        Concert[] Concert = {new Concert("BlackPink","3 March 2021 "),                          //CONCERT ARRAY
                             new Concert("Jay Chou","10 March 2021 ")               
        };
        
        ticket[] ticket = {new ticket(10,20,30,40,50),                                          //TICKET ARRAY
                           new ticket(50,50,50,50,50)
        };
        
        
                System.out.print("how many time you want to purchase ? ");             //ASK USER TO INPUT HOW MANY TIMES HE WANT
                 times = input.nextInt();
                 if(times <= 0){
                 times = 1;                                                             //IF USER INPUT LESS THAN 0 , TIMES AUTO = 1
                 Record[] record = new Record[times];
                 System.out.println("you can only buy one times");
                  }
                 else{
                       Record[] record = new Record[times];                                
                      }
                    Record[] record = new Record[times];                
        
        
        do{
        System.out.println("[1]user");
        System.out.println("[2]admin");
        System.out.println("click any key to exit this program");     
        select = input.nextInt();                                                                   //SELECT USER OR ADMIN
        
        
        
            switch(select){
                case 1:      for(int i=0;i<record.length;i++){
                             //System.out.print("[1] REGISTER");                                      //USER CHOOSE REGISTER OR LOGIN
                             //System.out.print("[2] LOGIN");
                             //what = input.nextInt();
                             
                            
                                         System.out.print("Register");                              //REGISTER AND LOGIN PART
                                         System.out.print("enter your name :");
                                         name = input.next();
                                         System.out.print("enter your password :");
                                         pswd = input.next();
                                         
                                         System.out.print("Login");
                                         System.out.print("enter your name :");
                                         name1 = input.next();
                                         System.out.print("enter your password :");
                                         pswd1 = input.next();
                                        
                                         if(name.equals(name1) && pswd.equals(pswd1)){                                            
                                             System.out.print("login successful");
                                             
                                         }
                                         else{
                                             System.out.print("no match");
                                         }
                                                                                                                                                                                    
                                                          
                                        user user = new user(name1,pswd1); 
                            
                             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                             for(int a=0;a<Concert.length;a++){                                             //DISPLAY ALL CONCERT USING FOR LOOP               
                                 System.out.println("["+(a+1)+"]"+Concert[a].getConName());                               
                             }
                             option = input.nextInt();
                             
                             switch(option){                                                                //CHOOSE WHAT CONCERT
                                 case 1: System.out.println(Concert[option-1]);                               //SHOW FIRST CONCERT DETAILS
                                         System.out.println(ticket[option-1]);                                //SHOW FIRST CONCERT TICKET STOCK
                                         System.out.print("select what ticket type : ");                      //CHOOSE WHAT TICKET TYPE
                                         choose = input.nextInt();
                                         switch(choose){
                                             case 1: type = "CAT1";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT1()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*900;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt(choose, Concert[option-1], quantity,total);
                                                     break;
                                                    
                                             case 2: type = "CAT2";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT2()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*800;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt(choose, Concert[option-1], quantity,total);
                                                     break;
                                                     
                                             case 3:type = "CAT3";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT3()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*700;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt(choose, Concert[option-1], quantity,total);
                                                     break;
                                                     
                                             case 4: type = "CAT4";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT4()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*600;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt(choose, Concert[option-1], quantity,total);
                                                     break;
                                                     
                                             case 5: type = "CAT5";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT5()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*500;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt(choose, Concert[option-1], quantity,total);
                                                     break;
                                                     
                                                     
                                                       }
                                         break;
                                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                             
                                case 2:  System.out.println(Concert[option-1]);                               //SHOW SECOND CONCERT DETAILS
                                         System.out.println(ticket[option-1]);                                //SHOW FIRST CONCERT TICKET STOCK
                                         System.out.print("select what ticket type : ");                      //CHOOSE WHAT TICKET TYPE
                                         choose = input.nextInt();
                                         switch(choose){
                                             case 1: type = "CAT1";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT1()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*900;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt1(choose, Concert[option-1], quantity,total);
                                                     break;
                                                     
                                            case 2:  type = "CAT2";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT2()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*800;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt1(choose, Concert[option-1], quantity,total);
                                                     break;
                                                     
                                             case 3: type = "CAT3";                                     
                                                     System.out.println("quantity : ");
                                                     quantity = input.nextInt();
                                                     if(ticket[option-1].getCAT3()-quantity >= 0){
                                                          ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                          total = quantity*700;
                                                             
                                                          switch(option){
                                                            case 1: subtotalBP += total;                              
                                                                    break;
                                                            case 2: subtotalJay += total;                                
                                                                    break;
                                                                        }
                                                                                                   }
                                                     else{
                                                          quantity =0;
                                                          total= 0;
                                                          System.out.print("insuficient");
                                                     }
                                                     
                                                     ticket[option-1].printReceipt1(choose, Concert[option-1], quantity,total);
                                                     break; 
                                                     
                                                case 4: type = "CAT4";                                     
                                                        System.out.println("quantity : ");
                                                        quantity = input.nextInt();
                                                        if(ticket[option-1].getCAT4()-quantity >= 0){
                                                            ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                            total = quantity*600;
                                                             
                                                            switch(option){
                                                              case 1: subtotalBP += total;                              
                                                                      break;
                                                              case 2: subtotalJay += total;                                
                                                                      break;
                                                                          }
                                                                                                   }
                                                       else{
                                                            quantity =0;
                                                            total= 0;
                                                            System.out.print("insuficient");
                                                       }
                                                     
                                                       ticket[option-1].printReceipt1(choose, Concert[option-1], quantity,total);
                                                       break;
                                                       
                                                case 5: type = "CAT5";                                     
                                                       System.out.println("quantity : ");
                                                       quantity = input.nextInt();
                                                       if(ticket[option-1].getCAT5()-quantity >= 0){
                                                            ticket[option-1].TicketStock(ticket, quantity, choose, option);
                                                            total = quantity*500;
                                                             
                                                            switch(option){
                                                              case 1: subtotalBP += total;                              
                                                                      break;
                                                              case 2: subtotalJay += total;                                
                                                                      break;
                                                                          }
                                                                                                   }
                                                       else{
                                                            quantity =0;
                                                            total= 0;
                                                            System.out.print("insuficient");
                                                       }
                                                     
                                                       ticket[option-1].printReceipt1(choose, Concert[option-1], quantity,total);
                                                       break;       
                                                                    }
                   
                                     
                                       
                        
                    
                    
                             }
                                         TicketSystem ticketSystem = new TicketSystem(Concert[option-1],type,quantity,total);
                                         record[i] = new Record(user,ticketSystem);
                    
                             }
                break;
                             
                case 2: 
                        Staff[] Staffarr = new Staff[3];
                        Staffarr[0] = new Manager("hanshen",2020,500000,600000);
                        Staffarr[1] = new ConcertAdmin("mingkit",2021,9000,0.03);
                        Staffarr[2] = new ConcertStocker("kenneth",2021,9000,0.04);
                         
                        
                        ArrayList<String> ConcertAdminList = new ArrayList<>(); 
                        ArrayList<String> ConcertStockerList = new ArrayList<>(); 
                        ConcertAdminList.add("mingkit");
                        ConcertStockerList.add("kenneth");
                        
                        
                        
                        
                        System.out.print("login \n[1]ConcertAdmin \n[2]ConcertStocker\n[3]Manager" );
                        select = input.nextInt();
                        switch(select){
                            case 1: ConcertAdmin CA = new ConcertAdmin();
                                do{
                                    System.out.println("login\nName :");
                                    name = input.next();
                                    System.out.println("enter code :");
                                    code = input.nextInt();
                                    if(ConcertAdminList.contains(name) && CA.getCode() == code){
                                        System.out.print("welcome back " + name);
                                    }
                                    else{
                                        System.out.print("only concert admin can access ");
                                    }
                                }while(ConcertAdminList.contains(name) == false && CA.getCode() == code == false);
                                
                                do{
                                System.out.println("\n[1] BlackPink Financial Report");
                                System.out.println("[2] Jay Chou Financial Report");
                                System.out.println("[3] Customer Record");
                                
                                option = input.nextInt();
                                switch(option){
                                    case 1: CA.ConcertDetails(Concert[0] , subtotalBP,ticket[0]);
                                            break;
                                    case 2: CA.ConcertDetails(Concert[1] , subtotalJay,ticket[1]);
                                            break;
                                    case 3:  for (int i=0;i<record.length;i++) {
                                                System.out.println(record[i]);
                                            }
                                            break;
                                    
                                }
                                }while(option != 1 || option != 2 || option != 3);
                               
                                    break;
                                    
                            case 2: ConcertStocker CS = new ConcertStocker();
                                    int cat1=0,cat2=0,cat3=0,cat4=0,cat5=0;
                                    do{
                                    System.out.println("login\nName :");
                                    name = input.next();
                                    System.out.println("enter code :");
                                    code = input.nextInt();
                                    if(ConcertAdminList.contains(name) && CS.getCode() == code){
                                        System.out.print("welcome back " + name);
                                    }
                                    else{
                                        System.out.print("only concert stocker can access ");
                                    }
                                }while(ConcertAdminList.contains(name) == false && CS.getCode() == code == false);
                                    
                                    System.out.println("blackpink stock " + ticket[0] + "\t\t\t" + "jay chou stock" + ticket[1]);
                                    System.out.println("[1] add stock for blackpink ");
                                    System.out.println("[2] add stock for jay chou");
                                    option = input.nextInt();
                                    switch(option){
                                        case 1: System.out.println(ticket[0]);
                                                System.out.print("cat1 :");
                                                cat1 = input.nextInt();
                                                System.out.print("cat2 :");
                                                cat2 = input.nextInt(); 
                                                System.out.print("cat3 :");
                                                cat3 = input.nextInt(); 
                                                System.out.print("cat4 :");
                                                cat4 = input.nextInt(); 
                                                System.out.print("cat5 :");
                                                cat5 = input.nextInt();
                                                ConcertStocker.AddTicketStock(ticket[0], cat1, cat2, cat3, cat4, cat5);
                                                break;
                                                
                                        case 2: System.out.println(ticket[1]);
                                                System.out.print("cat1 :");
                                                cat1 = input.nextInt();
                                                System.out.print("cat2 :");
                                                cat2 = input.nextInt(); 
                                                System.out.print("cat3 :");
                                                cat3 = input.nextInt(); 
                                                System.out.print("cat4 :");
                                                cat4 = input.nextInt(); 
                                                System.out.print("cat5 :");
                                                cat5 = input.nextInt();
                                                ConcertStocker.AddTicketStock(ticket[1], cat1, cat2, cat3, cat4, cat5);
                                                break;        
                                    }
                                    
                                    
                                    break;
                                    
                            case 3: Manager M1 = new Manager();
                                    System.out.println("[1] Calculate Salary");
                                    option = input.nextInt();
                                    switch(option){
                                        case 1: for(int i=0;i<Staffarr.length;i++){
                                                    System.out.println("["+(i+1)+"] "+Staffarr[i].getName());
                                                }
                                                System.out.print("Calculate who salary");
                                                choose = input.nextInt();
                                                switch(choose){
                                                    case 1: for(int i=0;i<Staffarr.length;i++){
                                                            if(Staffarr[i] instanceof Manager){
                                                                System.out.println(Staffarr[i].getName() + " salary is " + ((Manager)Staffarr[i]).CalcSalary());
                                                                    }                                                           
                                                            }
                                                            break;
                                                    case 2: for(int i=0;i<Staffarr.length;i++){
                                                            if(Staffarr[i] instanceof ConcertAdmin){
                                                                System.out.println(Staffarr[i].getName() + " salary is " + ((ConcertAdmin)Staffarr[i]).CalcSalary());
                                                                    }                                                           
                                                            }
                                                            break;
                                                    case 3: for(int i=0;i<Staffarr.length;i++){
                                                            if(Staffarr[i] instanceof ConcertStocker){
                                                                System.out.println(Staffarr[i].getName() + " salary is " + ((ConcertStocker)Staffarr[i]).CalcSalary());
                                                                    }                                                           
                                                            }
                                                            break;
                                                            
                                                    default :break;
                                                        
                                                            
                                                         
                                                            
                                                    
                                                        
                                                                
                                                }
                                                break;
                                    }
                                    break;
                        }
                        
                        break;
                        
                default: break;
                       
                       
                             }
        
        
        
        
        }while(select == 1 || select == 2);

                             }
    
     public static void CalculateSalary(Staff[] a){
        for (int i=0;i<a.length;i++){
           
                System.out.print(((Manager)a[0]).CalcSalary());
            
            
        }
        
        
        
    }
            
        }
