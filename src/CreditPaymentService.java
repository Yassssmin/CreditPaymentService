public class CreditPaymentService {
    public int calculate(float sum, int years, float percent) {
        int monthlyPayment;
        float monthlyPercent;
        int months;
        float mathPow;
        float K;

        months = years * 12; //перевод год в месяцы

        monthlyPercent = percent / 12 / 100;  //процент за месяц

        mathPow = (float)Math.pow(1 + monthlyPercent, months);  //повторяющаяся часть в К

        K = monthlyPercent * mathPow / (mathPow - 1);  // коэффициент аннуитета

        monthlyPayment = (int)Math.floor(sum * K);

        return monthlyPayment;
    }
}
