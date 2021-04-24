/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpayment;

import java.util.Date;

/**
 *
 * @author Ayaa
 */
public class credit extends Payment{
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
    

