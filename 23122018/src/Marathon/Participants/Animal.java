package Marathon.Participants;

import Marathon.Interface.Competitor;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (type + " " + name + " хорошо справился с кроссом");
        } else {
            onDistance = false;
            return (type + " " + name + " не справился с кроссом");
        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeight) {
            return (type + " " + name + " удачно перепрыгнул через стену");
        } else {
            onDistance = false;
            return (type + " " + name + " не смог перепрыгнуть стену");

        }
    }

    @Override
    public String swim(int dist) {
        if (maxSwimDistance == 0) {
            onDistance = false;
            return (type + " " + name + " не умеет плавать");


        }
        if (dist <= maxSwimDistance) {
            return (type + " " + name + " отлично проплыл");
        } else {
            onDistance = false;
            return (type + " " + name + " не смог проплыть");

        }
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " - " + onDistance);
    }
}