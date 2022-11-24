public class TemperaturgraphTest {
    public static void main(String[] args) {

        Temperaturgraph temperaturgraph = new Temperaturgraph(2022);

        // fügt Temperaturen zu Monaten hinzu
        temperaturgraph.addTemperatur(1, 3);
        temperaturgraph.addTemperatur(2, 7);
        temperaturgraph.addTemperatur(3, 6);
        temperaturgraph.addTemperatur(4, 5);
        temperaturgraph.addTemperatur(5, 9);
        temperaturgraph.addTemperatur(6, 14);
        temperaturgraph.addTemperatur(7, 13);
        temperaturgraph.addTemperatur(8, 12);
        temperaturgraph.addTemperatur(9, 6);
        temperaturgraph.addTemperatur(10, 4);
        temperaturgraph.addTemperatur(11, 2);
        temperaturgraph.addTemperatur(12, 0);

        // erstellt und printet den Temperaturgraphen
        temperaturgraph.plotGraph();
    }
}