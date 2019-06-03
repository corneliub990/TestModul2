public class Ora {
    public int firsRowOfHours(int multipleHours){
        if(multipleHours /5 ==1)
        {
            System.out.println("H");
        }
        else
        if(multipleHours /5 ==2)

        {
            System.out.println("HH");
        }
        else
        if(multipleHours /5 ==3) {
            System.out.println("HHH");
        }
        else System.out.println("HHHH");

        return multipleHours;
    }
}
