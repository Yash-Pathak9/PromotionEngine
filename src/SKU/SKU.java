package SKU;

import java.util.HashMap;

public class SKU {
    HashMap<String,Integer> pricelist = new HashMap<>();


    public HashMap<String, Integer> getPricelist() {
        return pricelist;
    }

    public void setPricelist(HashMap<String, Integer> pricelist) {
        this.pricelist = pricelist;
    }
}
