public class CreditPaymentService {
    public float calculate(int amount,int duration) {
        float bet;
        if (duration == 1) {
            duration = 12;
            bet = 5.4932F;
        } else if (duration == 2) {
            duration = 24;
            bet = 10.736F;
        } else {
            duration = 48;
            bet = 54.8576F;
        }

        float betMonth = (float) (10_000 * bet);
        float calcFirst = (float) amount + betMonth;
        float calcTwice = (float) calcFirst / duration;

        return calcTwice;
    }
}
