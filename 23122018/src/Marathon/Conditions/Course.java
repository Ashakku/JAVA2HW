package Marathon.Conditions;

import Marathon.Interface.Competitor;
import Marathon.Obstacle.Obstacle;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Competitor[] competitors = team.getCompetitors();

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                team.setResult(o.doIt(c));
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
