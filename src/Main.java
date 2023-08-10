import java.TransporteNautico;
import java.TransporteTerrestre;

public class Main {

    public static void main(String[] args) {

        TransporteNautico transporteNautico = new TransporteNautico();
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre();

        int altura = 10;
        int largura = 5;

        double freteNautico = transporteNautico.calculaFrete(altura, largura);
        double freteTerrestre = transporteTerrestre.calculaFrete(altura, largura);

        System.out.println("Frete pelo transporte náutico: " + freteNautico);
        System.out.println("Frete pelo transporte terrestre: " + freteTerrestre);
    }
}