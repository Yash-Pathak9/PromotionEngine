package BusinessLogic;

import Initializations.Initialize;
import Promotion.Promotions;
import SKU.SKU;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Business {
    public void removeAppliedCouponItems(Promotions promotions,HashMap<String,Integer> input){
        HashMap<String,Integer> promoMap = promotions.getPromotionEntities();
        int discountedprice = promotions.getPromotionprice();
        for(Map.Entry<String,Integer>  promomap: promoMap.entrySet()){
            String promoItemName = promomap.getKey();
            int promoItemNumber = promomap.getValue();
            int remainingCartItemNumber = input.get(promoItemName) - promoMap.get(promoItemName);
            input.put(promoItemName,remainingCartItemNumber);
        }
    }
    public boolean promoIsValid(Promotions promotions,HashMap<String,Integer> input){
        HashMap<String,Integer> promoMap = promotions.getPromotionEntities();
        int discountedprice = promotions.getPromotionprice();
        boolean flag = true;
        for(Map.Entry<String,Integer>  promomap: promoMap.entrySet()){
            String promoItemName = promomap.getKey();
            int promoItemNumber = promomap.getValue();
            if(input.containsKey(promoItemName)){
                if(input.get(promoItemName)<promoItemNumber){
                    flag = false;
                    return flag;
                }
            }
            else{
                flag = false;
                return flag;
            }
        }
        return flag;
    }
    public int getCartValue(HashMap<String,Integer> input){
        List<Promotions> promotionsList = Initialize.getPromotionsList();
        List<SKU> SKUlist = Initialize.getSkuList();
        int cartValue = 0;

        for(int i=0;i<promotionsList.size();i++) {
            Promotions promotions = promotionsList.get(i);
            while(promoIsValid(promotions,input)){
                cartValue = cartValue + promotions.getPromotionprice();
                removeAppliedCouponItems(promotions,input);
            }

        }
        for(Map.Entry<String,Integer>  inputmap: input.entrySet()){
           String cartItem = inputmap.getKey();
           int cartItemNumber = inputmap.getValue();
           while(cartItemNumber-- >0){
               HashMap<String,Integer> SKUMap = SKUlist.get(0).getPricelist();
               cartValue = cartValue +  SKUMap.get(cartItem);
           }
        }
    return cartValue;
    }
}
