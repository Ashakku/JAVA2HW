package Marathon;

import Marathon.Conditions.Course;
import Marathon.Obstacle.Cross;
import Marathon.Conditions.Team;
import Marathon.Obstacle.Wall;
import Marathon.Obstacle.Water;
import Marathon.Participants.Cat;
import Marathon.Participants.Dog;
import Marathon.Participants.Human;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Wall(2), new Wall(1),
                new Cross(120), new Water(50));
        Team team = new Team("Драники", new Human("Боб"), new Cat("Барсик"),
                new Dog("Бобик"), new Cat("Мурка"));
        c.doIt(team);
        team.showResults();
    }
}