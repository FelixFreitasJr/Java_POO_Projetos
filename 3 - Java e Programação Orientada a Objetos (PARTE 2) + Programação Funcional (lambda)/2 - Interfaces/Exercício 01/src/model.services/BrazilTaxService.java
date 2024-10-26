package model.services;

public class BrazilTaxService implements TaxService {

    public double tax(double amount){
        if (amount <=  100.0){
            retorn amount * 0.2;
        }
        else {
            retorn amount *0.15;
        }
    }
}