package Calculations;

import BusinessLogic.Business;
import Initializations.Initialize;

import java.util.HashMap;

public class CalculateOrderValue {
    public static void main(String[] args) {
       Initialize.Initialize();
       Business business = new Business();
        HashMap<String,Integer> input = new HashMap<>();
        input.put("A",5);
        input.put("B",5);
        input.put("C",1);
        System.out.println(business.getCartValue(input));
    }

}
