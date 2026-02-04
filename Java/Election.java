import java.util.HashMap;
import java.util.Map;

public class Election {
    /**
     * Retorna o nome do candidato com mais votos. 
     * Em caso de empate, retorna o nome que vem primeiro na ordem alfabética.
     */
    public static String findWinner(String[] votes) {
        // TODO: Implemente a contagem de votos aqui
        return "";
    }

    public static void main(String[] args) {
        String[] votes = {"B", "A", "B", "C", "A"};
        // Esperado: "A" (Empate entre A e B, mas A vem antes alfabeticamente)
        System.out.println("Vencedor: " + findWinner(votes));
    }
}