package service;

import model.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Residence_Service {
    List<House> houseList = new ArrayList<>();
    List<Villa> villaList = new ArrayList<>();
    List<Summer_House> summerHouseList = new ArrayList<>();

    public void addHouse(House house) {
        houseList.add(house);
        return;
    }

    public void addSummerHouse(Summer_House summerHouse) {
        summerHouseList.add(summerHouse);
    }

    public void addVilla(Villa villa) {
        villaList.add(villa);
    }

    public BigDecimal SumOfHousePrices() {
        if (houseList.isEmpty()) {
            return BigDecimal.ZERO; // Return 0 if the list is empty so the division by 0 problem is solved
        }

        BigDecimal sum = houseList.stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Summing up the prices

        return sum;
    }

    public BigDecimal SumOfVillaPrices() {
        if (villaList.isEmpty()) {
            return BigDecimal.ZERO; // Return 0 if the list is empty so the division by 0 problem is solved
        }

        BigDecimal sum = villaList.stream()
                .map(Villa::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Summing up the prices

        return sum;
    }

    public BigDecimal SumOfSummerHousePrices() {
        if (summerHouseList.isEmpty()) {
            return BigDecimal.ZERO; // Return 0 if the list is empty so the division by 0 problem is solved
        }

        BigDecimal sum = summerHouseList.stream()
                .map(Summer_House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Summing up the prices

        return sum;
    }

    public BigDecimal sumOfAllResidence() {
        BigDecimal sum = SumOfHousePrices().add(SumOfVillaPrices()).add(SumOfSummerHousePrices());
        return sum;
    }


    public BigDecimal averagesquaremeterofHouses() {
        if (houseList.isEmpty()) {
            return BigDecimal.ZERO; // Return 0 if the list is empty so the division by 0 problem is solved
        }

        BigDecimal sum = houseList.stream()
                .map(House::getSquareMeter)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Summing up the square meters

        BigDecimal average = sum.divide(BigDecimal.valueOf(houseList.size()), 2, RoundingMode.HALF_UP); // Calculating the average

        return average;
    }

    public BigDecimal averagesquaremeterofVillas(){
        if (villaList.isEmpty()) {
            return BigDecimal.ZERO; // Return 0 if the list is empty so the division by 0 problem is solved
        }

        BigDecimal sum = villaList.stream()
                .map(Villa::getSquareMeter)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Summing up the square meters

        BigDecimal average = sum.divide(BigDecimal.valueOf(villaList.size()), 2, RoundingMode.HALF_UP); // Calculating the average

        return average;
    }

    public BigDecimal averagesquaremeterofSummerHouses(){
        if (summerHouseList.isEmpty()) {
            return BigDecimal.ZERO; // Return 0 if the list is empty so the division by 0 problem is solved
        }

        BigDecimal sum = summerHouseList.stream()
                .map(Summer_House::getSquareMeter)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Summing up the square meters

        BigDecimal average = sum.divide(BigDecimal.valueOf(summerHouseList.size()), 2, RoundingMode.HALF_UP); // Calculating the average

        return average;
    }

    public BigDecimal averageSquareMeterOfAllResidences() {
        int totalResidences = houseList.size() + villaList.size() + summerHouseList.size();

        if (totalResidences == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal sum = houseList.stream()
                .map(House::getSquareMeter)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        sum = sum.add(villaList.stream()
                .map(Villa::getSquareMeter)
                .reduce(BigDecimal.ZERO, BigDecimal::add));
        sum = sum.add(summerHouseList.stream()
                .map(Summer_House::getSquareMeter)
                .reduce(BigDecimal.ZERO, BigDecimal::add));

        return sum.divide(new BigDecimal(totalResidences), 2, RoundingMode.HALF_UP);
    }

    public List<Residence> filterResidencesByRoomsAndHalls(int numberOfRooms, int numberOfHalls) {

        // House listesini filtrele
        List<Residence> filteredHouses = houseList.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfHalls() == numberOfHalls)
                .collect(Collectors.toList());

        // Villa listesini filtrele
        List<Residence> filteredVillas = villaList.stream()
                .filter(villa -> villa.getNumberOfRooms() == numberOfRooms && villa.getNumberOfHalls() == numberOfHalls)
                .collect(Collectors.toList());

        // Summer_House listesini filtrele
        List<Residence> filteredSummerHouses = summerHouseList.stream()
                .filter(summerHouse -> summerHouse.getNumberOfRooms() == numberOfRooms && summerHouse.getNumberOfHalls() == numberOfHalls)
                .collect(Collectors.toList());

        // Tüm filtrelenmiş listeleri birleştir
        return Stream.of(filteredHouses, filteredVillas, filteredSummerHouses)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }


}
