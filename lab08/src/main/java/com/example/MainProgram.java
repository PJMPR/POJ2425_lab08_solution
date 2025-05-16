package com.example;

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
//        SearchSettings searchSettings = new SearchSettings();
//        searchSettings.setDateFrom(LocalDate.now().minusDays(10));
//        searchSettings.setMilleageTo(200000);
//        searchSettings.setPriceFrom(10000.0);
//        searchSettings.setPriceTo(16000.0);
//        searchSettings.setWord("Sprzedam");
//        searchSettings.setYearFrom(2000);

        /**
         * Zadanie 2: Filtrowanie po roczniku
         */
//        Filter yearFilter = new SearchByYearFilter();
//        yearFilter.setCarOffers(cars);
//        yearFilter.setSearchSettings(searchSettings);
//        if(yearFilter.canFilter()){
//            List<CarOffer> filteredByYearCarsOffers = yearFilter.filter();
//            printOffers(filteredByYearCarsOffers);
//            if(filteredByYearCarsOffers.size() > 4){
//                System.out.println("❌ [BŁĄD] Filtrowanie po roczniku nie działa poprawnie - oczekiwano maksymalnie 4 wyników");
//                return;
//            } else {
//                System.out.println("✅ [OK] Filtrowanie po roczniku działa poprawnie");
//            }
//        }

        /**
         * Zadanie 3: Filtrowanie po cenie
         */
//        Filter priceFilter = new SearchByPriceFilter();
//        priceFilter.setCarOffers(cars);
//        priceFilter.setSearchSettings(searchSettings);
//        if(priceFilter.canFilter()){
//            List<CarOffer> filteredCarsOffers = priceFilter.filter();
//            printOffers(filteredCarsOffers);
//            if(filteredCarsOffers.size() > 3){
//                System.out.println("❌ [BŁĄD] Filtrowanie po cenie nie działa poprawnie - oczekiwano maksymalnie 3 wyników");
//                return;
//            } else {
//                System.out.println("✅ [OK] Filtrowanie po cenie działa poprawnie");
//            }
//        }

        /**
         * Zadanie 3: Filtrowanie po słowie kluczowym
         */
//        Filter wordFilter = new SearchByWordFilter();
//        wordFilter.setCarOffers(cars);
//        wordFilter.setSearchSettings(searchSettings);
//        if(wordFilter.canFilter()){
//            List<CarOffer> filteredCarsOffers = wordFilter.filter();
//            printOffers(filteredCarsOffers);
//            if(filteredCarsOffers.size() > 4){
//                System.out.println("❌ [BŁĄD] Filtrowanie po słowie kluczowym nie działa poprawnie - oczekiwano maksymalnie 4 wyników");
//                return;
//            } else {
//                System.out.println("✅ [OK] Filtrowanie po słowie kluczowym działa poprawnie");
//            }
//        }

        /**
         * Zadanie 3: Filtrowanie po przebiegu
         */
//        Filter milleageFilter = new SearchByMillageFilter();
//        milleageFilter.setCarOffers(cars);
//        milleageFilter.setSearchSettings(searchSettings);
//        if(milleageFilter.canFilter()){
//            List<CarOffer> filteredCarsOffers = milleageFilter.filter();
//            printOffers(filteredCarsOffers);
//            if(filteredCarsOffers.size() > 3){
//                System.out.println("❌ [BŁĄD] Filtrowanie po przebiegu nie działa poprawnie - oczekiwano maksymalnie 3 wyników");
//                return;
//            } else {
//                System.out.println("✅ [OK] Filtrowanie po przebiegu działa poprawnie");
//            }
//        }

        /**
         * Zadanie 3: Filtrowanie po dacie dodania
         */
//        Filter dateFilter = new SearchByDateFilter();
//        dateFilter.setCarOffers(cars);
//        dateFilter.setSearchSettings(searchSettings);
//        if(dateFilter.canFilter()){
//            List<CarOffer> filteredCarsOffers = dateFilter.filter();
//            printOffers(filteredCarsOffers);
//            if(filteredCarsOffers.size() > 4){
//                System.out.println("❌ [BŁĄD] Filtrowanie po dacie nie działa poprawnie - oczekiwano maksymalnie 4 wyników");
//                return;
//            } else {
//                System.out.println("✅ [OK] Filtrowanie po dacie działa poprawnie");
//            }
//        }

        /**
         * Zadanie 4: Filtrowanie zbiorcze z użyciem klasy Searcher
         */
//        Searcher searcher = new Searcher();
//        searcher.addFilter(wordFilter);
//        searcher.addFilter(priceFilter);
//        searcher.addFilter(milleageFilter);
//        searcher.addFilter(dateFilter);

//        List<CarOffer> filteredCarsOffers = searcher.filter(cars, searchSettings);
//        printOffers(filteredCarsOffers);

//        if(filteredCarsOffers.size() != 1){
//            System.out.println("❌ [BŁĄD] Filtrowanie zbiorcze nie działa poprawnie - oczekiwano dokładnie 1 wyniku");
//        } else {
//            System.out.println("✅ [OK] Filtrowanie zbiorcze działa poprawnie");
//        }

//        System.out.println("🏁 Koniec testów");
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

