/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpayment;

/**
 *
 * @author Ayaa
 */
public interface IauthorizeBehavior {
   public abstract String authorized(double balance, double cost , int e);
}
class AuthorizeCheck implements IauthorizeBehavior{

    
    public void authorized(double balance, double cost , int e) {
       /*check if the check is valid for payment.
        e =0 if the check expired.
        */
       if(balance>cost && e==1)
           return "the check is valid you can pay";
    }   
}
class AuthorizeCredit1 implements IauthorizeBehavior{

    @Override
    public void authorized() {
       
    }   
}
class AuthorizeNon implements IauthorizeBehavior{

    @Override
    public void authorized() {
       
    }   
}
class AuthorizeCredit2 implements IauthorizeBehavior{

    @Override
    public void authorized() {
       
    }   
}


