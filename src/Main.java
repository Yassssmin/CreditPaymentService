public class Main {
    public static void main(String[] args){
        float sum = 1_000_000;
        float percent = 9.99f;

        CreditPaymentService creditPaymentService = new CreditPaymentService();

        System.out.println(creditPaymentService.calculate(sum, 1, percent));

        System.out.println(creditPaymentService.calculate(sum, 2, percent));

        System.out.println(creditPaymentService.calculate(sum, 3, percent));
    }
}
