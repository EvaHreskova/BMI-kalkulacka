public class BMI_kalkulacka {
    public static void main(String[] args) {
        double hmotnost = 40.5;
        double vyska = 1.60;
        double BMI = hmotnost / (vyska * vyska);
        if (BMI <= 16.5) {
            System.out.println("Vaše BMI je " + BMI + ": TAZKA PODVYZIVA");
        }
        hmotnost = 48.2;
        vyska = 1.68;
        BMI = hmotnost / (vyska * vyska);
        if ((BMI > 16.5) && (BMI <= 18.5)) {
            System.out.println("Vaše BMI je " + BMI + ": PODVAHA");
        }

        hmotnost = 58.7;
        vyska = 1.72;
        BMI = hmotnost / (vyska * vyska);
        if ((BMI > 18.5) && (BMI <= 25.0)) {
            System.out.println("Vaše BMI je " + BMI + ": IDEALNA VAHA");
        }

        hmotnost = 78.7;
        vyska = 1.72;
        BMI = hmotnost / (vyska * vyska);
        if ((BMI > 25.0) && (BMI <= 30.0)) {
            System.out.println("Vaše BMI je " + BMI + ": NADVAHA");
        }

        hmotnost = 90.6;
        vyska = 1.62;
        BMI = hmotnost / (vyska * vyska);
        if ((BMI > 30.0) && (BMI <= 35.0)) {
            System.out.println("Vaše BMI je " + BMI + ": OBEZITA 1. STUPNA");
        }

        hmotnost = 104.8;
        vyska = 1.70;
        BMI = hmotnost / (vyska * vyska);
        if ((BMI > 35.0) && (BMI <= 40.0)) {
            System.out.println("Vaše BMI je " + BMI + ": OBEZITA 2. STUPNA");
        }

        hmotnost = 137.8;
        vyska = -1.68;
        if (hmotnost <= 0 || vyska <=0) {
            System.out.println("Jedna hodnota je nesprávne zadaná.");
            return;
        }
            BMI = hmotnost / (vyska * vyska);
        if (BMI > 40.0)  {
            System.out.println("Vaše BMI je " + BMI + ": OBEZITA 3. STUPNA");
        }


    }
}