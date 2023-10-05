package dev.vivek.models;

import dev.vivek.strategy.ButterflowWriteStrategy;
import dev.vivek.strategy.WriteStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ButterflowPen extends BallPen implements Refillable{
    private Refil refil;

    @Override
    public void write() {
        writeStrategy = new ButterflowWriteStrategy();
        writeStrategy.writeStrategy();
    }


    public void refill() {
        if(refil!=null){
            System.out.println("Refilling with Butterflow");
        }else {
            System.out.println("This BallPen is not refillable");
        }
    }
}
