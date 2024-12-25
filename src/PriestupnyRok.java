public class PriestupnyRok {
    public static void main(String[] args) {

        int rok = 1800;
        double vysledoka = rok % 4;
        double vysledokb = rok % 400;
        if ((vysledoka == 0) && (vysledokb == 0)) {
            System.out.println("Rok "+ rok +" je priestupný");
        } else {
            System.out.println("Rok "+ rok +" nie je priestupný");
        }
    }
}