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
public class account {
    private double balance;
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public account(){
        balance = 0;
    }
    
    public synchronized void deposit(double amount){
        double tmp = balance;
        try{
            Thread.sleep(50);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        tmp += amount;
        balance = tmp;
    }
    
    public synchronized void withdraw(double amount){
        double tmp = balance;
        try{
            Thread.sleep(20);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        tmp -= amount;
        balance = tmp;
    }
    public void printInfo(){
        System.out.println("Balance on " + "account = " + balance);
        }
        
    }
    


