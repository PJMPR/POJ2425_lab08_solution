package com.example.filters;

import com.example.CarOffer;

public class SearchByMilleageFromFilter extends FilterBase{
    @Override
    protected boolean condition() {
        return settings.getMilLeageFrom()>0;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getMilleage()>=settings.getMilLeageFrom();
    }
}
