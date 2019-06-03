public class Ora2 {
    public int secondRowOfHours(int multipleHours) {
        if (multipleHours % 5 == 1) {
            System.out.println("h");
        } else if (multipleHours % 5 == 2) {
            System.out.println("hh");
        } else if (multipleHours % 5 == 3) {
            System.out.println("hhh");
        } else System.out.println("hhhh");

        return multipleHours;
    }
}
