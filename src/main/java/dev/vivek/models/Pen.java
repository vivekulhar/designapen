package dev.vivek.models;

import dev.vivek.strategy.WriteStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pen implements Refillable{
    private PenType type;
    private String name;
    private String brand;
    private double price;
    private Ink ink;
    public WriteStrategy writeStrategy;
    public abstract void write();

}
