package Principal;

import java.util.ArrayList;
import java.util.List;

public class Busca {
    
    public Object amplitude(String inicio, String fim, List<String> nos, List<List<String>> grafo) {
        // Manipular a FILA para a busca
        Lista lista1 = new Lista();

        // Cópia para apresentar o caminho (somente inserção)
        Lista lista2 = new Lista();

        // Insere ponto inicial como nó raiz da árvore
        lista1.insereUltimo(inicio, 0, null);
        lista2.insereUltimo(inicio, 0, null);

        // Controle de nós visitados
        List<List<Object>> visitado = new ArrayList<>();
        List<Object> linha = new ArrayList<>();
        linha.add(inicio);
        linha.add(0);
        visitado.add(linha);

        while (!lista1.vazio()) {

            // Remove o primeiro da fila
            No atual = lista1.deletaUltimo();

            // Direciona para o conjunto de Strings de nos com o mesmo index em grafos.
            int ind = nos.indexOf(atual.getEstado());
            System.out.println(nos.indexOf(atual.getEstado()));

            // Varre todas as conexões dentro do grafo a partir de atual
            for (String novo : grafo.get(ind)) {

                System.out.println(novo.toString());

                // Pressuponho que não foi visitado
                boolean flag = true;

                // Controle de nós repetidos
                for (int j = 0; j < visitado.size(); j++) {
                    List<Object> visitadoItem = visitado.get(j);
                    if (visitadoItem.get(0).equals(novo)) {
                        if ((int) visitadoItem.get(1) <= (atual.getNivel() + 1)) {
                            flag = false;
                        } else {
                            visitadoItem.set(1, atual.getNivel() + 1);
                        }
                        break;
                    }
                }

                // Se não foi visitado, inclui na fila
                if (flag) {
                    lista1.insereUltimo(novo, atual.getNivel() + 1, atual);
                    lista2.insereUltimo(novo, atual.getNivel() + 1, atual);

                    // Marca como visitado
                    linha = new ArrayList<>();
                    linha.add(novo);
                    linha.add(atual.getNivel() + 1);
                    visitado.add(linha);

                    // Verifica se é o objetivo
                    if (novo == fim) {
                        List<String> resultadoCaminho = new ArrayList<>();
                        for (Object node : lista2.exibeCaminho()) {
                            resultadoCaminho.add(node.toString());
                        }
                        return resultadoCaminho;
                    }
                }
            }
        }

        return "Caminho não encontrado"; // Caminho não encontrado
    }

}
