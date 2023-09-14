package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Busca {
    
    /**
     * @param inicio
     * @param fim
     * @param nos
     * @param grafo
     * @return Object
     */
    public List<String> amplitude(String inicio, String fim, List<String> nos, List<List<String>> grafo) {
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

            //System.out.println("Índice da cidade: " + nos.indexOf(atual.getEstado()));

            // Varre todas as conexões dentro do grafo a partir de atual
            for (String novo : grafo.get(ind)) {

                //System.out.println("Nó / Cidade: " + novo);

                // Pressuponho que não foi visitado
                boolean flag = true;
            
                // Controle de nós repetidos
                for (int j = 0; j < visitado.size(); j++) {
                    List<Object> visitadoItem = visitado.get(j);
                    if (visitadoItem.get(0).equals(novo)) {
                        int nivel = (int) visitadoItem.get(1);
                        if (nivel <= (atual.getNivel() + 1)) {
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
                    if (novo.equals(fim)) {
                        List<String> caminho = new ArrayList<>();
                        caminho.addAll(lista2.exibeCaminho());
                        System.out.println("\nFila:\n" + lista1.exibeLista());
                        System.out.println("\nÁrvore de busca:\n" + lista2.exibeLista());
                        return caminho;
                    }
                }
            }
        }

        return Collections.singletonList("Caminho não encontrado"); // Caminho não encontrado
    }//fim da amplitude

    public List<String> profundidade(String inicio, String fim, List<String> nos, List<List<String>> grafo) {
        // Manipular a PILHA para a busca
        Lista l1 = new Lista();

        // Cópia para apresentar o caminho (somente inserção)
        Lista l2 = new Lista();

        // Insere ponto inicial como nó raiz da árvore
        l1.insereUltimo(inicio, 0, null);
        l2.insereUltimo(inicio, 0, null);

        // Controle de nós visitados
        List<List<Object>> visitado = new ArrayList<>();
        List<Object> linha = new ArrayList<>();
        linha.add(inicio);
        linha.add(0);
        visitado.add(linha);

        while (!l1.vazio()) {
            // Remove o último da pilha
            No atual = l1.deletaUltimo();

            int ind = nos.indexOf(atual.getEstado());

            // Varre todos as conexões dentro do grafo a partir de atual (inverso)
            for (int i = grafo.get(ind).size() - 1; i >= 0; i--) {
                String novo = grafo.get(ind).get(i);

                // Pressuponho que não foi visitado
                boolean flag = true;

                // Controle de nós repetidos
                for (int j = 0; j < visitado.size(); j++) {
                    List<Object> visitadoItem = visitado.get(j);
                    if (visitadoItem.get(0).equals(novo)) {
                        int nivel = (int) visitadoItem.get(1);
                        if (nivel <= (atual.getNivel() + 1)) {
                            flag = false;
                        } else {
                            visitadoItem.set(1, atual.getNivel() + 1);
                        }
                        break;
                    }
                }

                // Se não foi visitado, inclui na pilha
                if (flag) {
                    l1.insereUltimo(novo, atual.getNivel() + 1, atual);
                    l2.insereUltimo(novo, atual.getNivel() + 1, atual);

                    // Marca como visitado
                    linha = new ArrayList<>();
                    linha.add(novo);
                    linha.add(atual.getNivel() + 1);
                    visitado.add(linha);

                    // Verifica se é o objetivo
                    if (novo.equals(fim)) {
                        List<String> caminho = new ArrayList<>();
                        caminho.addAll(l2.exibeCaminho());
                        //System.out.println("\nPilha:\n" + l1.exibeLista());
                        //System.out.println("\nÁrvore de busca:\n" + l2.exibeLista());
                        return caminho;
                    }
                }
            }
        }

        return Collections.singletonList("Caminho não encontrado");
    }//fim da profundidade

    public List<String> profundidadeLimitada(String inicio, String fim, List<String> nos, List<List<String>> grafo, int limite) {
        // Manipular a PILHA para a busca
        Lista l1 = new Lista();

        // Cópia para apresentar o caminho (somente inserção)
        Lista l2 = new Lista();

        // Insere ponto inicial como nó raiz da árvore
        l1.insereUltimo(inicio, 0, null);
        l2.insereUltimo(inicio, 0, null);

        // Controle de nós visitados
        List<List<Object>> visitado = new ArrayList<>();
        List<Object> linha = new ArrayList<>();
        linha.add(inicio);
        linha.add(0);
        visitado.add(linha);

        while (!l1.vazio()) {
            // Remove o último da pilha
            No atual = l1.deletaUltimo();

            if (atual.getNivel() < limite) {
                int ind = nos.indexOf(atual.getEstado());

                // Varre todos as conexões dentro do grafo a partir de atual (inverso)
                for (int i = grafo.get(ind).size() - 1; i >= 0; i--) {
                    String novo = grafo.get(ind).get(i);

                    // Pressuponho que não foi visitado
                    boolean flag = true;

                    // Controle de nós repetidos
                    for (int j = 0; j < visitado.size(); j++) {
                        List<Object> visitadoItem = visitado.get(j);
                        if (visitadoItem.get(0).equals(novo)) {
                            int nivel = (int) visitadoItem.get(1);
                            if (nivel <= (atual.getNivel() + 1)) {
                                flag = false;
                            } else {
                                visitadoItem.set(1, atual.getNivel() + 1);
                            }
                            break;
                        }
                    }

                    // Se não foi visitado, inclui na pilha
                    if (flag) {
                        l1.insereUltimo(novo, atual.getNivel() + 1, atual);
                        l2.insereUltimo(novo, atual.getNivel() + 1, atual);

                        // Marca como visitado
                        linha = new ArrayList<>();
                        linha.add(novo);
                        linha.add(atual.getNivel() + 1);
                        visitado.add(linha);

                        // Verifica se é o objetivo
                        if (novo.equals(fim)) {
                            List<String> caminho = new ArrayList<>();
                            caminho.addAll(l2.exibeCaminho());
                            //System.out.println("\nPilha:\n" + l1.exibeLista());
                            //System.out.println("\nÁrvore de busca:\n" + l2.exibeLista());
                            return caminho;
                        }
                    }
                }
            }
        }

        return Collections.singletonList("Caminho não encontrado");
    }//fim da profundidade limitada

}
