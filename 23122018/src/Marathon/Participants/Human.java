package Marathon.Participants;

import Marathon.Interface.Competitor;

public class Human implements Competitor {
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " хорошо справился с кроссом");
        } else {
            active = false;
            return (name + " не справился с кроссом");

        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeight) {
            return (name + " удачно перепрыгнул через стену");
        } else {
            active = false;
            return (name + " не смог перепрыгнуть стену");

        }
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance) {
            return (name + " отлично проплыл");
        } else {
            active = false;
            return (name + " не смог проплыть");

        }
    }

    @Override
    public void info() {
        System.out.println(name + " - " + active);
    }
}