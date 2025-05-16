package com.example;

import com.example.filters.Filter;
import com.example.filters.SearchSettings;

import java.util.ArrayList;
import java.util.List;

public class Searcher {

    List<Filter> filters = new ArrayList<Filter>();

    public Searcher addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public List<CarOffer> filter(List<CarOffer> carOffers, SearchSettings settings) {
        List<CarOffer> filteredCarOffers = new ArrayList<>(carOffers);
        for (Filter filter : filters) {
            filter.setCarOffers(filteredCarOffers);
            filter.setSearchSettings(settings);
            if(filter.canFilter())
                filteredCarOffers = filter.filter();
        }
        return filteredCarOffers;
    }
}
