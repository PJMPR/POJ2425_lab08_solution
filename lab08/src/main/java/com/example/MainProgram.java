package com.example;

import com.example.filters.*;

import java.time.LocalDate;
import java.util.List;

public class MainProgram {

    static List<CarOffer> cars = List.of(
            new CarOffer(150000, 2000, LocalDate.now().minusDays(5), "Sprzedam Alfe", 5000.00),
            new CarOffer(250000, 1999, LocalDate.now().minusDays(0), "Sprzedam Opla", 25000.00),
            new CarOffer(110000, 2004, LocalDate.now().minusDays(5), "Sprzedam Opla", 12000.00),
            new CarOffer(350000, 2019, LocalDate.now().minusDays(9), "Sprzedam Opla", 15000.00),
            new CarOffer(140000, 2000, LocalDate.now().minusDays(11), "Opel", 14000.00)
    );

    public static void main(String[] args){

        /**
         * Zadanie 1:
         * Utwórz klasę SearchSettings przechowującą kryteria wyszukiwania ogłoszeń:
         * - rocznik: od - do
         * - przebieg: od - do
         * - cena: od - do
         * - słowo w tytule
         * - data dodania ogłoszenia: od - do
         */
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setDateFrom(LocalDate.now().minusDays(10));
        searchSettings.setMilleageTo(200000);
        searchSettings.setPriceFrom(10000.0);
        searchSettings.setPriceTo(16000.0);
        searchSettings.setWord("Sprzedam");
        searchSettings.setYearFrom(2000);

        Searcher searcher = new Searcher();
        searcher.addFilter(new SearchByMilleageToFilter())
                .addFilter(new SearchByMilleageFromFilter())
                .addFilter(new SearchByDateFromFilter())
                .addFilter(new SearchByPriceFromFilter())
                .addFilter(new SearchByPriceToFilter())
                .addFilter(new SearchByWordFilter())
                .addFilter(new SearchByYearFromFilter())
                .addFilter(new SearchByYearToFilter());

        printOffers(searcher.filter(cars, searchSettings));

    }

    /**
     * Pomocnicza metoda do wyświetlania listy ogłoszeń w czytelnej formie.
     * @param offers lista ogłoszeń do wyświetlenia
     */
    public static void printOffers(List<CarOffer> offers) {
        if (offers == null || offers.isEmpty()) {
            System.out.println("Brak pasujących ogłoszeń.");
            return;
        }

        System.out.println("\n--- Lista ogłoszeń ---");
        for (CarOffer offer : offers) {
            System.out.printf("Tytuł: %s | Cena: %.2f zł | Rocznik: %d | Przebieg: %d km | Data: %s\n",
                    offer.getTitle(),
                    offer.getPrice(),
                    offer.getYear(),
                    offer.getMilleage(),
                    offer.getDate().toString()
            );
        }
        System.out.println("-----------------------\n");
    }
}

