package com.example.filters;

import com.example.CarOffer;

public class SearchByMilleageToFilter extends FilterBase{
    @Override
    protected boolean condition() {
        return settings.getMileageTo()>0;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getMilleage()<=settings.getMileageTo();
    }
}
