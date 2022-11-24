public class TemperaturgraphTest {
    public static void main(String[] args) {
        Temperaturgraph temperaturgraph = new Temperaturgraph(2022);
        temperaturgraph.addTemperatur(1, 9);
        temperaturgraph.addTemperatur(2, 11);
        temperaturgraph.addTemperatur(3, 10);
        temperaturgraph.addTemperatur(4, 9);
        temperaturgraph.addTemperatur(5, 9);
        temperaturgraph.addTemperatur(6, 8);
        temperaturgraph.addTemperatur(7, 7);
        temperaturgraph.addTemperatur(8, 12);
        temperaturgraph.addTemperatur(9, 7);
        temperaturgraph.addTemperatur(10, 7);
        temperaturgraph.addTemperatur(11, 8);
        temperaturgraph.addTemperatur(12, 9);

        temperaturgraph.plotGraph();
    }
}