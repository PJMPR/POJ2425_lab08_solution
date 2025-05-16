package com.example.filters;


import com.example.CarOffer;

public class SearchByPriceToFilter extends FilterBase {

    @Override
    protected boolean condition() {
        return settings.getPriceTo()>0;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getPrice()<=settings.getPriceTo();
    }
}
