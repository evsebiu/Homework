package ChallengeEqualsHashcodes;
//Create an enum called LightColor that represents the three colors of a traffic light: red, yellow, and green.
// Each color should have a string representation and a duration (in seconds) associated with it
// (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).
public class Exercise6 {
    public static void main(String[] args) {
        for (trafficLights lights: trafficLights.values()){
            System.out.println(lights + ":" + lights.getAction() + "(" + lights.getDuration() + " seconds)");
        }
    }
}

enum trafficLights{
    RED("STOP", 30),
    YELLOW("Caution", 5),
    GREEN("GO!", 45);

    private String action;
    private int duration;

    trafficLights(String action, int duration){
        this.action=action;
        this.duration=duration;
    }
    public String getAction(){
        return action;
    }
    public int getDuration(){
        return duration;
    }
}
