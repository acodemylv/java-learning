package lv.acodemy.objects;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    // Fields
    private String color;
    private String model;

    public void start() {
        System.out.println("Car started");
    }
}