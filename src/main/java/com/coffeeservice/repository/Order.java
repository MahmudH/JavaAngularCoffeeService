package com.coffeeservice.repository;

import org.mongodb.morphia.annotations.Id;

public class Order {
//    {
//        "type": {
    //        "name": "Cappuccino",
    //        "family": "Coffee"
//    },
//        "size": "Medium",
//        "drinker": "M"
//    }

    @Id
    private String id;
    private String  size;
    private String  drinker;
    private String[] selectedOptions;
    private long coffeeShopId;
    private DrinkType type;

    public String getSize() {
        return size;
    }

    public String getDrinker() {
        return drinker;
    }

    public String[] getSelectedOptions() {
        return selectedOptions;
    }

    public long getCoffeeShopId() {
        return coffeeShopId;
    }

    public DrinkType getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
