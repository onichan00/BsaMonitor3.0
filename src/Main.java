/**
 * @author Maajid
 * @doel Berekenen van ( voorlopig ) bsa
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // hier worden alle inputs opgevraagd
        Scanner scan = new Scanner(System.in);

        String[] vakNamen = {"fastenYourSeatbelts", "programming", "databases", "pps", "infrastructure", "userInteraction"};
        int[] vakPunten = {12, 3, 3, 4, 3, 3};
        double[] vakCijfers = {0,0,0,0,0,0};

        System.out.println("vul hier je cijfers in");

        System.out.println("Fasten your seatbelts");
        vakCijfers[0] = scan.nextDouble();
        System.out.println("Programming \t");
        vakCijfers[1] = scan.nextDouble();
        System.out.println("Databases");
        vakCijfers[2] = scan.nextDouble();
        System.out.println("Personal Project & skills");
        vakCijfers[3] = scan.nextDouble();
        System.out.println("Infrastructure");
        vakCijfers[4] = scan.nextDouble();
        System.out.println("userInteraction:");
        vakCijfers[5] = scan.nextDouble();

        // studiepunten te behalen per vak
        int fysStudiePunten = vakPunten[0];
        int programmingStudiePunten = vakPunten[1];
        int databasesStudiePunten = vakPunten[2];
        int ppsStudiePunten = vakPunten[3];
        int infrastructureStudiePunten = vakPunten[4];
        int userInteractionStudiePunten = vakPunten[5];

        // maximum aantal haalbare studiepunten
        int MaxStudiePunten = fysStudiePunten + programmingStudiePunten + databasesStudiePunten + ppsStudiePunten + infrastructureStudiePunten + userInteractionStudiePunten;

        // vanaf hier worden alle studiepunten berekend
        int studiePunten = 0;

        // alle cijfers worden hier weergeven
        if (vakCijfers[0] >= 5.5) {
            studiePunten += vakPunten[0];
            System.out.println("Vak/project : Fasten your seatbelts \t \t cijfer behaald: " + vakCijfers[0] + " \t behaalde punten: " + vakPunten[0]);
        }else {
            System.out.println("Vak/project : Fasten your seatbelts \t \t cijfer behaald: " + vakCijfers[0] + " \t behaalde punten: 0");
        }

        if (vakCijfers[1] >= 5.5) {
            studiePunten += vakPunten[1];
            System.out.println("Vak/project : Programming \t \t \t \t \t cijfer behaald: " + vakCijfers[1] + "\t behaalde punten: " + vakPunten[1]);
        } else {
            System.out.println("Vak/project : Programming \t \t \t \t \t cijfer behaald: " + vakCijfers[1] + "\t behaalde punten: 0");
        }

        if (vakCijfers[2] >= 5.5) {
            studiePunten += databasesStudiePunten;
            System.out.println("Vak/project : Databases \t \t \t \t \t cijfer behaald: " + vakCijfers[2] + "\t behaalde punten: " + vakPunten[2]);
        } else {
            System.out.println("Vak/project : Databases \t \t \t \t \t cijfer behaald: " + vakCijfers[2] + "\t behaalde punten: 0");
        }

        if (vakCijfers[3] >= 5.5) {
            studiePunten += ppsStudiePunten;
            System.out.println("Vak/project : Personal project and skills \t cijfer behaald: " + vakCijfers[3] + "\t behaalde punten: " + vakPunten[3]);
        } else {
            System.out.println("Vak/project : Personal project and skills \t cijfer behaald: " + vakCijfers[3] + "\t behaalde punten: 0");
        }

        if (vakCijfers[4] >= 5.5) {
            studiePunten += infrastructureStudiePunten;
            System.out.println("Vak/project : Infrastructure \t \t \t \t cijfer behaald: " + vakCijfers[4] + "\t behaalde punten: " + vakPunten[4]);
        } else {
            System.out.println("Vak/project : Infrastructure \t \t \t \t cijfer behaald: " + vakCijfers[4] + "\t behaalde punten: 0");
        }

        if (vakCijfers[5] >= 5.5) {
            studiePunten += userInteractionStudiePunten;
            System.out.println("Vak/project : User Interaction \t \t \t \t cijfer behaald: " + vakCijfers[5] + "\t behaalde punten: " + vakPunten[5]);
        } else{
            System.out.println("Vak/project : User Interaction \t \t \t \t cijfer behaald: " + vakCijfers[5] + "\t behaalde punten: 0");
        }

        int afgerondenMaxStudiepunten = Math.round(MaxStudiePunten);
        int afgerondenStudiePunten = Math.round(studiePunten);


        System.out.println(" "); // white line

        //studiepunten weergeven
        System.out.println(" je hebt " + afgerondenStudiePunten + "/" + "50" + " " + "studiepunten");

        //positief bsa berekenen 5/6 = 100/6= 16.6666666 * 5 = 83.33333333333333 *
        double positiefBSA = (afgerondenMaxStudiepunten / 100.0) * 83.33333333333333; // hoeveel het positief bsa is volgens de vakken die nu gevolgd worden

        // gekeken of je een positief bsa hebt
        if (afgerondenStudiePunten < positiefBSA) {
            System.out.println(" PAS OP: je bent ondeweg naar een negatief bsa");
        }

    }
}
