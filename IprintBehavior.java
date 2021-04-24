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
public interface IprintBehavior {
    public abstract void printReceipt();
}
class PrintCashTrans implements IprintBehavior{

    @Override
    public void printReceipt() {
       
    }
}
class PrintNon implements IprintBehavior{

    @Override
    public void printReceipt() {
       
    }
}
