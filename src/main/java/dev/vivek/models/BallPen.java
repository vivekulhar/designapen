package dev.vivek.models;

import dev.vivek.strategy.WriteStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BallPen extends Pen {
    private Refil refil;
}
