package ChallengeEqualsHashcodes;
//Create a day scheduler application that uses an enum to represent the days of the week.
// The application should be able to assign and retrieve activities for each day.
public class Exercise13 {
    public static void main(String[] args) {
        DaysOfWeek.MONDAY.setActivity("Drinking beer in park.");
        DaysOfWeek.TUESDAY.setActivity("Going to gym");
        DaysOfWeek.WEDNESDAY.setActivity("Dating with a tinder girl");
        DaysOfWeek.WEDNESDAY.cancelActivity();
        DaysOfWeek.THURSDAY.setActivity("Studying java & smoking a joint");
        DaysOfWeek.FRIDAY.setActivity("workout at home");
        DaysOfWeek.SATURDAY.setActivity("Clubbing");
        DaysOfWeek.SATURDAY.cancelActivity();
        DaysOfWeek.SUNDAY.setActivity("Chilling with some joints.");

        for (DaysOfWeek days : DaysOfWeek.values()){
            System.out.println(days + " " + days.getActivity());
        }
    }
}

enum DaysOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    private String activity;

   public void setActivity(String activity) {
       this.activity = activity;
   }

   public String getActivity(){
       return activity;
   }

   public void cancelActivity(){
       this.activity = "Activity canceled";
   }
}
