public class Ceas {
    public static void main(String[] args){

        Ora firstHour = new Ora();
        Ora2 secondHour = new Ora2();
        Minute firstMinute = new Minute();
        Minute2 secondMinute = new Minute2();
        //Secunde secunde = new Secunde();

        String ora="15:25:55";

//        System.out.println(Secunde.getSeconds(55));
        Secunde.getSeconds(55);
        firstHour.firsRowOfHours(10);
        secondHour.secondRowOfHours(10);
        firstMinute.firstRowOfMinutes(25);
        secondMinute.secondRowOfMinutes(25);



        System.out.println(ora);
    }
}
