package ChallengeEqualsHashcodes;

import java.util.List;

//Create a simulation of a traffic light system using
// an enum to represent the different states of a traffic light.
public class Exercise14 {
    static void main() {

        for (TrafficLight light : TrafficLight.values()){
            System.out.println(light);
        }
    }
}

enum TrafficLight{
    RED("STOP ", 35),
    YELLOW("CAUTION ", 5),
    GREEN("GO ", 20);

    private String action;
    private int duration;

    TrafficLight(String action, int duration){
        this.action=action;
        this.duration=duration;
    }
    public String getAction(){
        return action;
    }
    public int getDuration(){
        return duration;
    }

    @Override
    public String toString() {
        return "TrafficLight {" +
                " name " + this.name() +
                " action= '" + action + '\'' +
                ", duration=" + duration +
                '}';
    }
}