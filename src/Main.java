public class Main {
    public static void main(String[] args){
        float sum = 1_000_000;
        float percent = 9.99f;

        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int oneYear = 1;
        System.out.println(creditPaymentService.calculate(sum, oneYear, percent));

        int twoYears = 2;
        System.out.println(creditPaymentService.calculate(sum, twoYears, percent));

        int threeYears = 3;
        System.out.println(creditPaymentService.calculate(sum, threeYears, percent));
    }
}
