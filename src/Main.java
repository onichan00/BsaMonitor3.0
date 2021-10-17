/**
 * @author Maajid
 * @doel Berekenen van ( voorlopig ) bsa
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // hier worden alle inputs opgevraagd
        Scanner scan = new Scanner(System.in);


        String[] vakNamen = {"fastenYourSeatbelts", "programming", "databases", "pps", "infrastructure", "userInteraction"};
        int[] vakPunten = {12, 3, 3, 4, 3, 3};
        double[] vakCijfers = {0, 0, 0, 0, 0, 0};

        System.out.println("vul hier je cijfers in");


        for (int i = 0; i < vakCijfers.length; i++) {
            System.out.print("vul hier " + vakNamen[i] + " in: ");
            vakCijfers[i] = scan.nextDouble();
        }

        // maximum aantal haalbare studiepunten
        int MaxStudiePunten = IntStream.of(vakPunten).sum();

        // vanaf hier worden alle studiepunten berekend
        int studiePunten = 0;

        for (int i = 0; i < vakNamen.length; i++) {
            if (vakCijfers[i] >= 5.5 ){
                studiePunten += vakPunten[i];
            }
        }

        System.out.println(" "); // white line

        // studiepunten en cijfers en vakken weergeven
        int i;
        String vakken;
        double cijfers;
        int punten;
        for (i = 0; i < vakNamen.length && i < vakCijfers.length && i < vakPunten.length; i++ ) {
            vakken = vakNamen[i];
            cijfers = vakCijfers[i];
            punten = vakPunten[i];
            if (vakCijfers[i] >= 5.5) {
                System.out.printf("%s %-30s %s %.2f %s %d %n", "vak/project: ", vakken,"cijfer: ", cijfers, "behaalde studiepunten: ",  punten);
            } else {
                System.out.printf("%s %-30s %s %.2f %s %d %n", "vak/project: ", vakken,"cijfer: ", cijfers, "behaalde studiepunten: ",  0);
            }
        }

        //studiepunten weergeven
        System.out.println(" ");
        System.out.printf("%s %d %s %d", "totaal behaalde studiepunten: ", studiePunten,"/", MaxStudiePunten);

        //positief bsa berekenen 5/6 = 100/6= 16.6666666 * 5 = 83.33333333333333 *
        double positiefBSA = (studiePunten / 100.0) * 83.33333333333333; // hoeveel het positief bsa is volgens de vakken die nu gevolgd worden

        // gekeken of je een positief bsa hebt
        if (studiePunten < positiefBSA) {
            System.out.println(" PAS OP: je bent ondeweg naar een negatief bsa");
        }
    }
}
