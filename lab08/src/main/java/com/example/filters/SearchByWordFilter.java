package com.example.filters;

import com.example.CarOffer;

public class SearchByWordFilter extends FilterBase{
    @Override
    protected boolean condition() {
        return !settings.getWord().isEmpty();
    }

    @Override
    protected boolean filterCondition(CarOffer carOffer) {
        return carOffer.getTitle().toLowerCase().contains(settings.getWord().toLowerCase());
    }
}
