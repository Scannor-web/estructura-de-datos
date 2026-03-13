public class Main {
    public static void main(String[] args) {
        GestionRanking ranking = new GestionRanking();

        ranking.registrarPuntaje("Ana", 1500);
        ranking.registrarPuntaje("Beto", 2000);
        ranking.registrarPuntaje("Clara", 1500); // Repetido
        ranking.registrarPuntaje("David", 3000);

        System.out.println("--- Ranking Original ---");
        ranking.imprimir();

        System.out.println("\nBuscando a Beto: " + ranking.buscarJugador("Beto"));
        System.out.println("Valor Máximo: " + ranking.encontrarMaximo());
        System.out.println("Total Nodos: " + ranking.contarNodos());
        System.out.println("Nodo Medio: " + ranking.encontrarMedio());

        System.out.println("\n--- Valores Repetidos ---");
        ranking.mostrarRepetidos();

        System.out.println("\n--- Ranking Ordenado (Mayor a Menor) ---");
        ranking.ordenarRanking();
        ranking.imprimir();
    }
}
