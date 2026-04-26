package net.jrz.adapter.adapters;

import net.jrz.adapter.round.RoundPeg;
import net.jrz.adapter.square.SquarePeg;

// SquarePeg -> RoundPeg
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2);
    }
}
