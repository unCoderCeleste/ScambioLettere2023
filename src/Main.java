import javax.swing.*;

/*
Inserire una frase ed effettuare lo scambio tra le lettere di posizione pari
con quelle dispari e poi ristampiamo la nuova frase.

-Implementazione:
 sostituire le vocali con in numero 8 (o altre)

 */
public class Main {
    public static void main(String[] args) {

        // awt --> swing
        /*
        String eta = JOptionPane.showInputDialog("Inserisci la tua età: ");
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                "Ok so you are a mother fucker",
                "Fai attenzione!", JOptionPane.WARNING_MESSAGE);
        int miaeta = Integer.parseInt(eta);
        System.out.println("La tua età: " + eta);
        */
        String frase = JOptionPane.showInputDialog("Inserisci la frase: ");
        /*int dimensione = frase.length();
        char[] arrayCaratteri = new char[dimensione];
        for(int i=0; i<arrayCaratteri.length; i++){
            arrayCaratteri[i] = frase.charAt(i);
        }*/
        char[] caratteri = frase.toCharArray(); //crea un array con i singoli caratteri della String
        for (char carattere : caratteri) {
            System.out.print(carattere + "-");
        }
        System.out.println("\nScambio le posizioni (pari per dispari):");
        for (int i = 0; i < caratteri.length - 1; i++) {
            //ogni lettera di posizione pari sarà scambiata con quella dispari
            if (i % 2 == 0) {
                // scambio le variabili
                char tmp = caratteri[i];
                caratteri[i] = caratteri[i+1];
                caratteri[i+1] = tmp;
            }
        }
        for (char carattere : caratteri) {
            System.out.print(carattere + "-");
        }
        System.out.println("\nScambio vocali con numero 8 (IF)");
        for (int i = 0; i < caratteri.length; i++) {
            if (caratteri[i] == 'a' || caratteri[i] == 'e' || caratteri[i] == 'i'
                    || caratteri[i] == 'o' || caratteri[i] == 'u') {
                caratteri[i] = '8';
            }
        }
        for (char carattere : caratteri) {
            System.out.print(carattere + "-");
        }
        System.out.println("\nScambio vocali con numero 8 (SWITCH)");
        System.out.println("Stampa dentro lo switch");
        for (int i = 0; i < caratteri.length; i++) {
            switch (caratteri[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    caratteri[i] = '8';
            }
            System.out.print(caratteri[i] + "-");
        }
        System.out.println("\nStampo con 'foreach'");
        for (char carattere : caratteri) {
            System.out.print(carattere + "-");
        }
    }
}

