package com.example.filters;

import com.example.CarOffer;

public class SearchByYearFromFilter extends FilterBase {

    @Override
    protected boolean condition() {
        return settings.getYearFrom()>0;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return settings.getYearFrom()<=carOffer.getYear();
    }
}
