/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jschoe14
 */
public class SuperClass_Parent {

    public double ChickenBurger, Salad, Cheesesteak, Pizza, Spaghetti;
    public double VMilkshake, Coke, Pepsi, CMilkshake, Beer;
    public double Meals, Drinks, TotalofMD, AllTotalofMD;

    public double GetAmount() {

        Meals = ChickenBurger + Salad + Cheesesteak + Pizza + Spaghetti;
        Drinks = VMilkshake + Coke + Pepsi + CMilkshake + Beer;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }

    private JFrame frame;

    public void iExitSystem() {

        frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Management Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit
        
    

(0);
        }
    }
    //set prices
    public double pChickenBurger = 2.99, pSalad = 1.99, pCheesesteak = 6.99, pPizza = 10.99, pSpaghetti = 9.99;
    public double pVMilkshake = 3.49, pCoke = .99, pPepsi = .99, pCMilkshake = 3.99, pBeer = 4.99;
    
    //tax
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount){
        double findTax = cAmount - (cAmount * mcTax);
        return findTax;
    }
}
