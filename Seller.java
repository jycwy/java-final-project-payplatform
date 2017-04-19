/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payplatform;

/**
 *
 * @author cwy
 */
public class Seller implements Runnable{
    private String name;
    private String address;
    private String email;
    private String phone;
    private account account;
    
    public Seller (String name,String address,String email, String phone,account account)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }
    
    public void printCustomerInfo(){
        System.out.println("Information about a customer");
        System.out.println("Name                   -" + name);
        System.out.println("Address                -" + address);
        System.out.println("Email                  -" + email);
        System.out.println("Phone #                -" + phone);
        if(account != null){
            account.printInfo();
        }else{
            System.out.println("The customer has no accounts");
        }
}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phoen){
        this.phone = phone;
    }
    
    @Override
    public void run(){
        for(int i =1;i<10;i++){
            account.withdraw(1000);
            System.out.println("The Balance of account after No:" +i  + "withdraw is:" +account.getBalance());
            
        }
    }
    
}
