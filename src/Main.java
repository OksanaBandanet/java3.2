public class Main {
    public static void main(String[] args) {
        System.out.println("Ваш баланс равен:");
        int balance = 100;
        int refill = 1500;
        int bonus = refill / 100;
        if (refill > 1000) {
            System.out.println(balance + refill + bonus);
        } else {
            System.out.println(balance + refill);
        }
    }
}
