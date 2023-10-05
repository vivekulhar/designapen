package dev.vivek.strategy;

public class ButterflowWriteStrategy implements WriteStrategy{
    @Override
    public void writeStrategy() {
        System.out.println("Writing with Butterflow");
    }
}
