package model;


import java.math.BigDecimal;

public class Villa extends Residence{

    public Villa(int id, BigDecimal price, BigDecimal squareMeter, int numberOfRooms, int numberOfHalls) {
        super(id, price, squareMeter, numberOfRooms, numberOfHalls);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", NumberOfRooms=" + NumberOfRooms +
                ", NumberOfHalls=" + NumberOfHalls +
                '}';
    }
}
