package model;

import lombok.*;

import java.math.BigDecimal;

public class Summer_House extends Residence{
    public Summer_House(int id, BigDecimal price, BigDecimal squareMeter, int numberOfRooms, int numberOfHalls) {
        super(id, price, squareMeter, numberOfRooms, numberOfHalls);
    }

   @Override
    public String toString() {
        return "Summer_House{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", NumberOfRooms=" + NumberOfRooms +
                ", NumberOfHalls=" + NumberOfHalls +
                '}';
    }
}
