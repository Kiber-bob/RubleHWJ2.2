public class Main {
    public static void main(String[] args) {
        int balance = 30_000; // баланс на счету в копейках
        int limit = 110_000; //  сумма пополнения в копейках
        int balanceSummary = balance + limit;
        System.out.println("balanceSummary: " + balanceSummary);
        int bonus;
        if (limit >= 100_000) {  // бонус в копейках
            bonus = (balance + limit) / 100;
        } else {
            bonus = 0;
        }
        System.out.println("bonus: " + bonus);
    }


}