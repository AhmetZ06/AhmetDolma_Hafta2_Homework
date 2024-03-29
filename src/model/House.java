package model;

import java.math.BigDecimal;

public class House extends Residence{
    public House(int id, BigDecimal price, BigDecimal squareMeter, int numberOfRooms, int numberOfHalls) {
        super(id, price, squareMeter, numberOfRooms, numberOfHalls);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", NumberOfRooms=" + NumberOfRooms +
                ", NumberOfHalls=" + NumberOfHalls +
                '}'+"\n";
    }
}
