public class TemperaturGraph {

    // Instanzvariablen
    private int jahr;

    // Variable zur Speicherung der Temperaturwerte (default: -1)
    private int[] temperaturen = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    // Konstruktor
    public TemperaturGraph(int jahr) {
        this.jahr = jahr;
    }

    // Methode, zum Hinzufügen einer Temperatur
    public void addTemperatur(int monat, int temperatur) {

        // prüft, ob monat nicht valide ist
        if (monat < 1 || monat > 12) {
            System.out.println("Monat " + monat + ": Monat muss >= 1 und <= 12 sein.");
        }
        // prüft, ob temperatur nicht valide ist
        else if (temperatur < 0) {
            System.out.println("Monat " + monat + ": Temperatur mus >= 0 sein.");
        }
        else {
            // fügt die übergebene Temperatur dem jeweiligen Monat hinzu
            switch (monat) {
                case 1:
                    temperaturen[0] = temperatur;
                    break;
                case 2:
                    temperaturen[1] = temperatur;
                    break;
                case 3:
                    temperaturen[2] = temperatur;
                    break;
                case 4:
                    temperaturen[3] = temperatur;
                    break;
                case 5:
                    temperaturen[4] = temperatur;
                    break;
                case 6:
                    temperaturen[5] = temperatur;
                    break;
                case 7:
                    temperaturen[6] = temperatur;
                    break;
                case 8:
                    temperaturen[7] = temperatur;
                    break;
                case 9:
                    temperaturen[8] = temperatur;
                    break;
                case 10:
                    temperaturen[9] = temperatur;
                    break;
                case 11:
                    temperaturen[10] = temperatur;
                    break;
                case 12:
                    temperaturen[11] = temperatur;
                    break;
            }
        }

    }

    // Methode prüft, ob alle Monate einen Temperaturwert haben
    public void checkData() {
        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] == -1) {
                int fehlerMonat = i + 1;
                System.out.println("Monat " + fehlerMonat + " hat noch keinen Temperaturwert oder der Monat fehlt.");
                System.exit(0);
            }
        }
    }

    // Methode erzeugt den Temperaturgraphen
    public void plotGraph() {

        // ruft die Methode checkData auf um zu prüfen, ob ein Graph erstellt werden kann
        checkData();

        // ermittelt die höchste Temperatur
        int maximaleTemperatur = temperaturen[0];
        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] > maximaleTemperatur) {
                maximaleTemperatur = temperaturen[i];
            }
        }

        // ermittelt die niedrigste Temperatur
        int minimaleTemperatur = temperaturen[0];
        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] < minimaleTemperatur) {
                minimaleTemperatur = temperaturen[i];
            }
        }

        // printet das Jahr
        System.out.println("Jahr: " + jahr);

        // berechnet die Anzahl der zu printenden Zeilen
        int anzahlZeilen = maximaleTemperatur - minimaleTemperatur + 1;

        // printen der Zeilen
        for (int i = 0; i < anzahlZeilen; i++) {

            // printet die Temperaturzahl inkl. der passenden Anzahl an Leerzeichen
            int aktuelleTemperatur = maximaleTemperatur - i;
            if (aktuelleTemperatur < 10) {
                System.out.print(aktuelleTemperatur + "   ");
            }
            else {
                System.out.print(aktuelleTemperatur + "  ");
            }

            for (int j = 0; j < temperaturen.length; j++) {
                // printet Symbol, falls Temperatur des Monats größer gleich der aktuellen Temperatur der Zeile ist
                if (temperaturen[j] >= aktuelleTemperatur) {
                    System.out.print("#");
                }
                // printet Leerzeichen, falls Temperatur des Monats kleiner als Temperatur der Zeile ist
                else {
                    System.out.print(" ");
                }

                // printet Leerzeichen zwischen Temperaturkennzeichnungen
                System.out.print(" ");
            }

            // printet Zeilenumbruch
            System.out.println();
        }

    }
}

