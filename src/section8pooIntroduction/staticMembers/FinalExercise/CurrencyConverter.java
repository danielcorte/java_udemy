package section8pooIntroduction.staticMembers.FinalExercise;

public class CurrencyConverter {

    public static final double DOLAR_TODAY = 5.84;

    public static double ConvertToReal(double value) {
        double iof = (DOLAR_TODAY * value) * 0.06;
        return (DOLAR_TODAY * value) + iof;
    }
}
