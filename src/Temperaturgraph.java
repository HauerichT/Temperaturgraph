public class Temperaturgraph {

    private int jahr;

    private int[] temperaturen = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public Temperaturgraph(int jahr) {
        this.jahr = jahr;
    }

    public void addTemperatur(int monat, int temperatur) {

        if (monat < 1 || monat > 12) {
            System.out.println("Monat " + monat + ": Monat muss >= 1 und <= 12 sein.");
        } else if (temperatur < 0) {
            System.out.println("Monat " + monat + ": Temperatur mus >= 0 sein.");
        } else {
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

    public void checkData() {
        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] == -1) {
                int fehlerMonat = i + 1;
                System.out.println("Monat " + fehlerMonat + " hat noch keine Temperatur.");
                System.exit(0);
            }
        }
    }

    public void plotGraph() {

        checkData();
        int maximaleTemperatur = temperaturen[0];
        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] > maximaleTemperatur) {
                maximaleTemperatur = temperaturen[i];
            }
        }

        int minimaleTemperatur = temperaturen[0];
        for (int i = 0; i < temperaturen.length; i++) {
            if (temperaturen[i] < minimaleTemperatur) {
                minimaleTemperatur = temperaturen[i];
            }
        }

        System.out.println("Jahr: " + jahr);
        System.out.println("Minimale Temperatur: " + minimaleTemperatur);
        System.out.println("Maximale Temperatur: " + maximaleTemperatur);

        int anzahlZeilen = maximaleTemperatur - minimaleTemperatur + 1;

        for (int i = 0; i < anzahlZeilen; i++) {
            int aktuelleTemperatur = maximaleTemperatur - i;
            if (aktuelleTemperatur < 10) {
                System.out.print(aktuelleTemperatur + "   ");
            }
            else {
                System.out.print(aktuelleTemperatur + "  ");
            }
            for (int j = 0; j < temperaturen.length; j++) {
                if (temperaturen[j] >= aktuelleTemperatur) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}

