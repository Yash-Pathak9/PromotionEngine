package Calculations;

import Initializations.Initialize;
import Promotion.Promotions;
import SKU.SKU;

import java.util.List;

public class CalculateOrderValue {
    public static void main(String[] args) {
        Initialize initialize = new Initialize();
        List<Promotions> promotionsList = initialize.getPromotionsList();
        List<SKU> SKUlist = initialize.getSkuList();

    }

}
