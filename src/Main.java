public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, часть 2, задание 3:");
        int ticketsPurchasedSeats = 60;
        int ticketsPurchasedStanding = 42;
        int numbеrOfSeats = 60;
        int numberOfStandingPlcs = 42;
        int allNumberOfPassengers = 102;
        int numberFreeSeats = numbеrOfSeats - ticketsPurchasedSeats;
        int numberFreeStanding = numberOfStandingPlcs - ticketsPurchasedStanding;
        int totalNumberOfFreePlcs = numberFreeSeats + numberFreeStanding;
        if (totalNumberOfFreePlcs > 0 && totalNumberOfFreePlcs <= allNumberOfPassengers) {
            System.out.println("В вагоне есть свободные места. Количество свободных мест " + totalNumberOfFreePlcs);
        }
        if (numberFreeSeats > 0 && numberFreeSeats <= 60) {
            System.out.println("В вагоне есть сидячие места. Количество сидячих мест " + numberFreeSeats);
        }
        if (numberFreeStanding > 0 && numberFreeStanding <= 42) {
            System.out.println("В вагоне есть стоячие места. Количество стоячих мест " + numberFreeStanding);
        }
        else  {
            System.out.println("В вагоне нет свободных мест.");
        }
    }
}