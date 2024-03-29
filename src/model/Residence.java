package model;

import lombok.*;

import java.math.BigDecimal;

//Burada enum olarak ev tiplerini belirtip daha sonrasinda ekleme yapilma ihtimaline karsi bu sekilde yapildi

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
    public abstract class Residence {
        public int id;
        public BigDecimal price;
        public BigDecimal squareMeter;
        public int NumberOfRooms;
        public int NumberOfHalls;

    }







