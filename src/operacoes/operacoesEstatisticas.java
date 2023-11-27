package operacoes;
import java.util.ArrayList;
import java.util.Collections;
import leitura.leitura;

public class operacoesEstatisticas{


    // insere dados em um array enquanto o usuário quiser
    public static ArrayList<Double> leDados(){
        int check = 0;
        ArrayList<Double> dados = new ArrayList<>();

        while(check == 0){
            System.out.println("adicione o valor (double, i.e, 1.0)");
            double numero = leitura.leituraDouble();
            dados.add(numero);
            System.out.println("Deseja ler mais um numero? 0 - Sim, 1 - Não");
            check = leitura.leituraInt();
        }

        return dados;
    }


    // OPERAÇÕES DE CALCULO E RETORNO, NAO IMPRIMEM RESULTADO
    public static double calcularMedia(ArrayList<Double> dados) {
        if (dados.isEmpty()) {
            throw new IllegalArgumentException("A lista de dados não pode estar vazia.");
        }

        double soma = 0;
        for (double valor : dados) {
            soma += valor;
        }
        return soma / dados.size();
    }

    public static double calcularMediana(ArrayList<Double> dados) {
        if (dados.isEmpty()) {
            throw new IllegalArgumentException("A lista de dados não pode estar vazia.");
        }

        Collections.sort(dados);

        int meio = dados.size() / 2;
        if (dados.size() % 2 == 0) {
            return (dados.get(meio - 1) + dados.get(meio)) / 2.0;
        } else {
            return dados.get(meio);
        }
    }

    public static double calcularVariancia(ArrayList<Double> dados) {
        if (dados.isEmpty()) {
            throw new IllegalArgumentException("A lista de dados não pode estar vazia.");
        }

        double media = calcularMedia(dados);
        double somaQuadradosDiferencas = 0;
        for (double valor : dados) {
            somaQuadradosDiferencas += Math.pow(valor - media, 2);
        }
        return somaQuadradosDiferencas / dados.size();
    }

    public static double calcularDesvioPadrao(ArrayList<Double> dados) {
        if (dados.isEmpty()) {
            throw new IllegalArgumentException("A lista de dados não pode estar vazia.");
        }

        double variancia = calcularVariancia(dados);
        return Math.sqrt(variancia);
    } 
}