import model.*;
import service.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Villa villa1 = new Villa(1, new BigDecimal(100000), new BigDecimal(100), 3, 2);
        Villa villa2 = new Villa(2, new BigDecimal(200000), new BigDecimal(200), 5, 3);
        Villa villa3 = new Villa(3, new BigDecimal(300000), new BigDecimal(300), 7, 4);

        House house1 = new House(4, new BigDecimal(400000), new BigDecimal(400), 9, 5);
        House house2 = new House(5, new BigDecimal(500000), new BigDecimal(500), 3, 2);
        House house3 = new House(6, new BigDecimal(600000), new BigDecimal(600), 13, 7);

        Summer_House summerHouse1 = new Summer_House(7, new BigDecimal(700000), new BigDecimal(700), 15, 8);
        Summer_House summerHouse2 = new Summer_House(8, new BigDecimal(800000), new BigDecimal(800), 3, 2);
        Summer_House summerHouse3 = new Summer_House(9, new BigDecimal(900000), new BigDecimal(900), 19, 10);

        Residence_Service residenceService = new Residence_Service();

        residenceService.addVilla(villa1);
        residenceService.addVilla(villa2);
        residenceService.addVilla(villa3);

        residenceService.addHouse(house1);
        residenceService.addHouse(house2);
        residenceService.addHouse(house3);

        residenceService.addSummerHouse(summerHouse1);
        residenceService.addSummerHouse(summerHouse2);
        residenceService.addSummerHouse(summerHouse3);

        System.out.println("Sum of Villa Prices: " + residenceService.SumOfVillaPrices());
        System.out.println("Sum of House Prices: " + residenceService.SumOfHousePrices());
        System.out.println("Sum of Summer House Prices: " + residenceService.SumOfSummerHousePrices());
        System.out.println("Total Sum of Prices: " + residenceService.sumOfAllResidence());

        System.out.println("Average Squaremeter of Villas: " + residenceService.averagesquaremeterofVillas());
        System.out.println("Average Squaremeter of Houses: " + residenceService.averagesquaremeterofHouses());
        System.out.println("Average Squaremeter of Summer Houses: " + residenceService.averagesquaremeterofSummerHouses());
        System.out.println("Average Squaremeter of All Residences: " + residenceService.averageSquareMeterOfAllResidences());

        System.out.print(residenceService.filterResidencesByRoomsAndHalls(3,2));
    }
}