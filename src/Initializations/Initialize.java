package Initializations;

import Promotion.Promotions;
import SKU.SKU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Initialize {
       private static List<Promotions> promotionsList = new ArrayList<>();
       private static List<SKU> skuList = new ArrayList<>();

    public static List<Promotions> getPromotionsList() {
        return promotionsList;
    }

    public static List<SKU> getSkuList() {
        return skuList;
    }

    public static void Initialize(){

       //promotion strategy 1
       Promotions promotions1 = new Promotions();
       HashMap<String,Integer> promotionEntities1 = new HashMap<>();
       promotionEntities1.put("A",3);
       promotions1.setPromotionprice(130);
       promotions1.setPromotionEntities(promotionEntities1);

       //promotion strategy 2
       Promotions promotions2 = new Promotions();
       HashMap<String,Integer> promotionEntities2 = new HashMap<>();
       promotionEntities2.put("B",2);
       promotions2.setPromotionprice(45);
       promotions2.setPromotionEntities(promotionEntities2);

       //promotion strategy 3
       Promotions promotions3 = new Promotions();
       HashMap<String,Integer> promotionEntities3 = new HashMap<>();
       promotionEntities3.put("C",1);
       promotionEntities3.put("D",1);
       promotions3.setPromotionprice(30);
       promotions3.setPromotionEntities(promotionEntities3);

       //adding to promotionlist
       promotionsList.add(promotions1);
       promotionsList.add(promotions2);
       promotionsList.add(promotions3);

       //SKU.SKU Initialization
       SKU sku = new SKU();
       HashMap<String,Integer> pricelist = new HashMap<>();
       pricelist.put("A",50);
       pricelist.put("B",30);
       pricelist.put("C",20);
       pricelist.put("D",15);
       sku.setPricelist(pricelist);

       //adding to SKUlist
       skuList.add(sku);



   }

}
