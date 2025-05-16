package com.example.filters;

import com.example.CarOffer;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterBase implements Filter {
    protected List<CarOffer> cars;
    protected SearchSettings settings;
    @Override
    public void setCarOffers(List<CarOffer> cars) {
        this.cars = cars;
    }

    @Override
    public void setSearchSettings(SearchSettings searchSettings) {
        settings = searchSettings;
    }

    @Override
    public boolean canFilter() {
        return condition();
    }

    @Override
    public List<CarOffer> filter() {
        List<CarOffer> result = new ArrayList<>();
        for (CarOffer car : cars) {
            if(filterCondition(car))
                result.add(car);
        }
        return result;
    }

    protected abstract boolean condition();
    protected abstract boolean filterCondition(CarOffer carOffer);
}
