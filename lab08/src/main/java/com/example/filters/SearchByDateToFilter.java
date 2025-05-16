package com.example.filters;

import com.example.CarOffer;

public class SearchByDateToFilter extends FilterBase{
    @Override
    protected boolean condition() {
        return settings.getDateTo()!=null;
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getDate().isBefore(settings.getDateTo());
    }
}
