package Marathon.Obstacle;

import Marathon.Interface.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public String doIt(Competitor competitor) {
        return competitor.run(length);
    }
}