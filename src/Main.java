public class Main {
    public static void main(String[] args) {
        int balance = 10_000; // баланс на счету в копейках
        int limit = 100_000; // сумма пополнения в копейках
        int bonus;
        if (limit > 1000) {  // бонус в копейках
            bonus = limit / 100;
        } else {
            bonus = 0;
        }
        int balanceSummary = balance + limit + bonus;
        System.out.println("balanceSummary: " + balanceSummary);
        System.out.println("bonus: " + bonus);
    }


}