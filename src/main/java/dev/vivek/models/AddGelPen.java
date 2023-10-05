package dev.vivek.models;

import dev.vivek.strategy.TrimaxWriteStrategy;

public class AddGelPen extends GelPen implements Refillable {
    private Refil refil;
    @Override
    public void write() {

        writeStrategy = new TrimaxWriteStrategy();
        writeStrategy.writeStrategy();
    }

    @Override
    public void refill() {
        if (refil != null) {
            System.out.println("Refilling with AddGel");
        } else {
            System.out.println("This GelPen is not refillable");
        }
    }
}
