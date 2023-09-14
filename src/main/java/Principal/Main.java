package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        List<String> cidades = lerNomesCidades();
        List<List<String>> cidadesPorLinha = lerCidadesPorLinha();


        System.out.println("\n\nNomes das cidades lidas do arquivo:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
        
        System.out.println("\n\nCidades por linha lidas do arquivo:");
        for (List<String> linhaDeCidades : cidadesPorLinha) {
            System.out.println(linhaDeCidades);
        }

        String origem = "ubatuba";
        String destino = "jardimSaoJudas";

        System.out.println("\n\nVocê está saindo de " + origem + " em destino à " + destino);
        
        Busca busca = new Busca();
        Object amplitude = busca.amplitude(origem, destino, cidades, cidadesPorLinha);
        Object profundidade = busca.profundidade(origem, destino, cidades, cidadesPorLinha);
        Object profundidadeLimitada = busca.profundidadeLimitada(origem, destino, cidades, cidadesPorLinha, 6);

        System.out.println("\n<<<   AMPLITUDE   >>>\n" + amplitude);

        System.out.println("\n<<<   PROFUNDIDADE   >>>\n" + profundidade);

        System.out.println("\n<<<   PROFUNDIDADE LIMITADA   >>>\n" + profundidadeLimitada);

    }
    
    public static List<String> lerNomesCidades() {
        List<String> cidades = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\valePaulista.txt"))) {
            String linha = br.readLine();
            if (linha != null) {
                String[] nomes = linha.split(",");
                for (String nome : nomes) {
                    cidades.add(nome.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cidades;
    }
    
    public static List<List<String>> lerCidadesPorLinha() {
        List<List<String>> cidadesPorLinha = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\valePaulista.txt"))) {
            // Ignorar a primeira linha
            br.readLine();

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] nomes = linha.split(",");
                List<String> cidades = new ArrayList<>();
                for (String nome : nomes) {
                    cidades.add(nome.trim());
                }
                cidadesPorLinha.add(cidades);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cidadesPorLinha;
    }
    
}
