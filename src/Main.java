public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, часть 2, задание1:");
        int age = 5;
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок должен ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Ребёнок закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человек закончил университет и пора искать превую работу."); // пока что работает не совсем правильно :(
        } else {
            System.out.println("Ребёнку пока что нужно ходить в десткий сад!");
        }
    }
}