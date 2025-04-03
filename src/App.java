
public class App {

    public static void main(String[] args) throws Exception {
        double alturaChico = 1.50;
        double alturaZe = 1.10;

        double altPorAnoC = 0.02;
        double altPorAnoZ = 0.03;
        int anos = 0;

        while (alturaZe < alturaChico) {
            alturaChico += altPorAnoC;
            alturaZe += altPorAnoZ;
            anos++;
            
            String alturaCFormatada = String.format("%.2f", alturaChico);
            String alturaZFormatada = String.format("%.2f", alturaZe);

            System.out.println("chico: "+alturaCFormatada);
            System.out.println("zé: "+alturaZFormatada);
        }
        System.out.println("Zé alcançou em: " + anos + " anos");
    }
}
