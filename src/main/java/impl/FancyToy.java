package impl;

import interfaces.HasBatteries;
import interfaces.Shoots;
import interfaces.Waterproof;

public class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}
