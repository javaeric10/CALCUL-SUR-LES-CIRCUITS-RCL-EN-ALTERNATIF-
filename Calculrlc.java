package src;

import java.util.Scanner;

class Main {

    public static void main (String[] args) {
        try (Scanner scanner = new Scanner ( System.in )) {
            System.out.println ( "          CALCUL SUR LES CIRCUITS RCL EN ALTERNATIF        " );
            System.out.println ( "-----------------------------------------------------------" );
            System.out.println ( "-   1 RESISTANCE - 2 INDUCTANCE - 3 CAPACITE - 4 FREQUENCE " );
            System.out.println ( "-----------------------------------------------------------" );
            System.out.println ( "CHOIX CIRCUIT EN SERIE = 1 OU PARALLELE = 2 OU 4 CALCUL DES INDUCTANCES" );
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
            if ( choix == 2 )//circuit en paralleme
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
                double inpedance = 1 / (Math.sqrt ( (Math.pow ( (1 / resistance), 2 ) + Math.pow ( ((1 / reactanceindu) - reactancecondo), 2 )) ));
                double frequencerais = 1 / ((2 * Math.PI) * Math.sqrt ( inductance * capacite ));
                //affichage resultat
                System.out.println ( "LA VALEUR DE L'RADIAN " + rads );
                System.out.println ( "LA VALEUR DE L'IMPEDANCE " + inpedance );
                System.out.println ( "LA VALEUR DE LA REACTANCE DE L'INDUCTANCE " + reactanceindu );
                System.out.println ( "LA VALEUR DE LA REACTANCE DE LA CAPACITE " + reactancecondo );
                System.out.println ( "LA VALEUR DE LA RESISTANCE " + resistance );
                System.out.println ( "LA VALEUR DE LA FREQUENCE RESONANCE " + frequencerais );

            }
            if ( choix == 4 ) { // calcul sur les inductances
                System.out.println ( " " );
                System.out.println ( "------CALCUL SUR LES INDUCTANCES UTILISÉES ENTRE 5 ET 50 MHZ-------" );
                System.out.println ( "-------------------------------------------------------------------" );
                System.out.println ( "- 1 DIAMÈTRE DU CORPS DE BOBINE - 2 DIAMÈTRE DU FIL SANS ISOLATION " );
                System.out.println ( "-------------------------------------------------------------------" );
                System.out.println ( "- 3 DIAMÈTRE DU FIL AVEC ISOLAT - 4 INDUCTANCE REQUISE OU CALCULER " );
                System.out.println ( "-------------------------------------------------------------------" );
                //choix valeurs connues
                System.out.println ( "  VALEURS QUE TU VEUX CALCULER TAPE 1 - 2 - 3 - 4" );
                System.out.println ( "  POUR LA VALEUR VEUX CALCULER TAPE 0" );
                int choixl = Integer.parseInt ( scanner.nextBigInteger ().toString () );
                if ( choixl == 4 ) { // calcul inductance
                    String diametresupport;
                    String inductancestr;
                    String longeurbobstr = null;
                    //entre des valeurs
                    diametresupport = ("DIAMETRE SUPPORT EN MILLIMETRE");
                    String nombrespirestr = ("NOMBRE SPIRE");
                    inductancestr = (" EN henry");
                    System.out.println ( "DONNE LE DIAMETRE DU SUPPORT " + diametresupport );
                    Double diametrebob = scanner.nextDouble ();
                    System.out.println ( "DONNE LA VALEUR DE L'" + inductancestr );
                    Double inductance = scanner.nextDouble ();
                    System.out.println ( "DONNE LA VALEUR DE LA " + nombrespirestr );
                    double nombrespire = scanner.nextDouble ();
                    System.out.println ( "DONNE LA VALEUR DE LA " + longeurbobstr );
                    double longeurbob = scanner.nextDouble ();
                    // calcul de votre inductance
                    if ( inductance == 0 )
                        inductance = ((Math.pow ( diametrebob, 2 )) * (Math.pow ( nombrespire, 2 ))) / ((460 * diametrebob) + 1000 * longeurbob);
                    System.out.println ( "LA VALEUR DE L'INDUCTANCE " + inductance + " EN MICROHENRY" );
                    System.out.println ( "LA VALEUR DU DIAMETRE " + diametrebob + " EN MILLIMETRE" );
                    System.out.println ( "LA VALEUR DE LA NOMBRE DE SPIRE " + nombrespire + " EN TOUR" );
                    System.out.println ( "LA VALEUR DE LA LONGEUR DE LA BOBINE " + longeurbob + " EN MILLIMETRE" );


                }
            }
        }
    }
}

