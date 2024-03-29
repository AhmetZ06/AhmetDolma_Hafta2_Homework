package model;

import lombok.*;

import java.math.BigDecimal;
@ToString
public class Summer_House extends Residence{
    public Summer_House(int id, BigDecimal price, BigDecimal squareMeter, int numberOfRooms, int numberOfHalls) {
        super(id, price, squareMeter, numberOfRooms, numberOfHalls);
    }
}
