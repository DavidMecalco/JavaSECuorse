package Section4_FlujosControl;

public class SentenciasBucleEtiquetasBusqueda {
    public static void main(String[] args) {



        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() -maxPalabra;



        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if (frase.charAt(k++) != palabra.charAt(j)){
                    i ++;
                    continue buscar;
                }
            }
            i = i + maxPalabra;
            cantidad++;
        }
        System.out.println("Encontrado " + cantidad + " veces la palabra " + palabra + " en la frase");

    }
}
