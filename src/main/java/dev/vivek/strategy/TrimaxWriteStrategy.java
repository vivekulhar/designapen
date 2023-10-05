package dev.vivek.strategy;

public class TrimaxWriteStrategy implements WriteStrategy{
    @Override
    public void writeStrategy() {
        System.out.println("Writing with Trimax");
    }
}
