package com.example.filters;

import com.example.CarOffer;

public class SearchByYearToFilter extends FilterBase{
    @Override
    protected boolean condition() {
        return settings.getYearTo()>0;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getYear()<=settings.getYearTo();
    }
}
