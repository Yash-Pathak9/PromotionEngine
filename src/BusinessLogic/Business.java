package BusinessLogic;

import Initializations.Initialize;
import Promotion.Promotions;
import SKU.SKU;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Business {

    public int getCartValue(HashMap<String,Integer> input){
        List<Promotions> promotionsList = Initialize.getPromotionsList();
        List<SKU> SKUlist = Initialize.getSkuList();
        int cartValue = 0;

        for(int i=0;i<promotionsList.size();i++) {

        }
    return cartValue;
    }
}
