public class Minute2  {
    public int secondRowOfMinutes(int multipleMinutes) {
        if (multipleMinutes % 5 == 1) {
            System.out.println("M");
        } else if (multipleMinutes / 5 == 2) {
            System.out.println("MM");
        } else if (multipleMinutes / 5 == 3) {
            System.out.println("MMM");
        } else System.out.println("MMMM");

        return multipleMinutes;
    }
}