package com.example.filters;

import com.example.CarOffer;

public class SearchByDateFromFilter extends FilterBase{
    @Override
    protected boolean condition() {
        return settings.getDateFrom() != null;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getDate().isAfter(settings.getDateFrom());
    }
}
