public class CreditPaymentService {
    public double calculate(int amount,int duration, double rate) {
        duration = duration * 12;
        double coefficient = (((rate / 100) / 12) * Math.pow(1 + ((rate / 100) / 12),duration)) / (Math.pow(1 + ((rate / 100) / 12),duration) - 1);
        double payment = coefficient * amount;

        return payment;
    }
}
