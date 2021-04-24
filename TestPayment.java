/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpayment;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ayaa
 */
public class TestPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float balance=10000;
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the amount: ");
        float am=input.nextFloat();
        Payment o = new Payment(am,new AuthorizeCheck(), new PrintCashTrans());
        System.out.println (o.getAuthorizeBehavior().authorized(balance,o.getAmount() , 0));
        o.getPrintBehavior().printReceipt(o.getAmount(), balance);
    }
    
}
class Payment {
    private float amount;
    private IauthorizeBehavior authorizeBehavior; 
    private IprintBehavior printBehavior;

    public Payment(float amount, IauthorizeBehavior authorizeBehavior, IprintBehavior printBehavior) {
        this.amount = amount;
        this.authorizeBehavior = authorizeBehavior;
        this.printBehavior = printBehavior;
    }

    

    public float getAmount() {
        return amount;
    }

    public IauthorizeBehavior getAuthorizeBehavior() {
        return authorizeBehavior;
    }

    public IprintBehavior getPrintBehavior() {
        return printBehavior;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setAuthorizeBehavior(IauthorizeBehavior authorizeBehavior) {
        this.authorizeBehavior = authorizeBehavior;
    }

    public void setPrintBehavior(IprintBehavior printBehavior) {
        this.printBehavior = printBehavior;
    }
    
}
class cash extends Payment{
    private float CashTendered;

    public cash(float CashTendered, float amount, IauthorizeBehavior authorizeBehavior, IprintBehavior printBehavior) {
        super(amount, authorizeBehavior, printBehavior);
        this.CashTendered = CashTendered;
    }

  

    public float getCashTendered() {
        return CashTendered;
    }

    public void setCashTendered(float CashTendered) {
        this.CashTendered = CashTendered;
    }
    
}
class check extends Payment{
    private String name;
    private String bankId;

    public check(String name, String bankId, float amount, IauthorizeBehavior authorizeBehavior, IprintBehavior printBehavior) {
        super(amount, authorizeBehavior, printBehavior);
        this.name = name;
        this.bankId = bankId;
    }

    

    public String getName() {
        return name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
     
}
class credit extends Payment{
    private String name;
    private String type;
    private Date expDate;

    public credit(String name, String type, Date expDate, float amount, IauthorizeBehavior authorizeBehavior, IprintBehavior printBehavior) {
        super(amount, authorizeBehavior, printBehavior);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
    }

    

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    
}
    
