package src;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        try (Scanner scanner = new Scanner ( System.in )) {
            System.out.println ( "          CALCUL SUR LES CIRCUITS RCL EN ALTERNATIF        " );
            System.out.println ( "-----------------------------------------------------------" );
            System.out.println ( "-   1 RESISTANCE - 2 INDUCTANCE - 3 CAPACITE - 4 FREQUENCE " );
            System.out.println ( "-----------------------------------------------------------" );
            System.out.println ( "CHOIX CIRCUIT EN SERIE = 1 OU PARALLELE = 2" );
            double choix = scanner.nextDouble ();
            String valeurresist;
            if ( choix == 1 )// circuit serie
            // initalisation des valeurs
            {
                String valeurinduc;
                String valeurcapa;
                String valeurfreq;
                //entre des valeurs
                System.out.println ( "POUR LES VALEUR NON CONNUES TAPE 0" );
                valeurresist = ("RESISTANCE EN OHMS");
                valeurinduc = ("INDUCTANCE EN HENRY");
                valeurcapa = ("CAPACITE EN MICROFARAD");
                valeurfreq = ("FREQUENCE EN HERTZ");
                System.out.println ( "DONNE LA VALEUR DE LA " + valeurresist );
                double resistance = scanner.nextDouble ();
                System.out.println ( "DONNE LA VALEUR DE L'" + valeurinduc );
                double inductance = scanner.nextDouble ();
                System.out.println ( "DONNE LA VALEUR DE LA " + valeurcapa );
                double capacite = scanner.nextDouble ();
                System.out.println ( "DONNE LA VALEUR DE LA " + valeurfreq );
                double frequence = scanner.nextDouble ();
                //si circuit serie
                double rads = 2 * Math.PI * frequence;
                double reactanceindu = rads * inductance;
                double reactancecondo = 1 / (rads * capacite);
                double frequencerais = 1 / ((2 * Math.PI) * Math.sqrt ( inductance * capacite ));
                double inpedance;
                inpedance = Math.sqrt ( (Math.pow ( resistance, 2 ) + Math.pow ( (reactanceindu - reactancecondo), 2 )) );
                //affichage resultat
                System.out.println ( "LA VALEUR DE L'RADIAN " + rads );
                System.out.println ( "LA VALEUR DE L'IMPEDANCE " + inpedance );
                System.out.println ( "LA VALEUR DE LA REACTANCE DE L'INDUCTANCE " + reactanceindu );
                System.out.println ( "LA VALEUR DE LA REACTANCE DE LA CAPACITE " + reactancecondo );
                System.out.println ( "LA VALEUR DE LA RESISTANCE " + resistance );
                System.out.println ( "LA VALEUR DE LA FREQUENCE RESONANCE " + frequencerais );
            }
           if(choix==2)//circuit en paralleme
           {
               String valeurinduc;
               String valeurcapa;
               String valeurfreq;
               //entre des valeurs
               System.out.println ( "POUR LES VALEUR NON CONNUES TAPE 0" );
               valeurresist = ("RESISTANCE EN OHMS");
               valeurinduc = ("INDUCTANCE EN HENRY");
               valeurcapa = ("CAPACITE EN MICROFARAD");
               valeurfreq = ("FREQUENCE EN HERTZ");
               System.out.println ( "DONNE LA VALEUR DE LA " + valeurresist );
               double resistance = scanner.nextDouble ();
               System.out.println ( "DONNE LA VALEUR DE L'" + valeurinduc );
               double inductance = scanner.nextDouble ();
               System.out.println ( "DONNE LA VALEUR DE LA " + valeurcapa );
               double capacite = scanner.nextDouble ();
               System.out.println ( "DONNE LA VALEUR DE LA " + valeurfreq );
               double frequence = scanner.nextDouble ();
               // si circuit paralele
               double rads = 2 * Math.PI * frequence;
               double reactanceindu = rads * inductance;
               double reactancecondo = 1 / (rads * capacite);
               double inpedance = 1/(Math.sqrt ( (Math.pow ( (1/resistance), 2 ) + Math.pow ( ((1/reactanceindu) - reactancecondo), 2 )) ));
               double frequencerais = 1 / ((2 * Math.PI) * Math.sqrt ( inductance * capacite ));
               //affichage resultat
               System.out.println ( "LA VALEUR DE L'RADIAN " + rads );
               System.out.println ( "LA VALEUR DE L'IMPEDANCE " + inpedance );
               System.out.println ( "LA VALEUR DE LA REACTANCE DE L'INDUCTANCE " + reactanceindu );
               System.out.println ( "LA VALEUR DE LA REACTANCE DE LA CAPACITE " + reactancecondo );
               System.out.println ( "LA VALEUR DE LA RESISTANCE " + resistance );
               System.out.println ( "LA VALEUR DE LA FREQUENCE RESONANCE " + frequencerais );

        }
    }
}}


