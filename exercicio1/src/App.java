import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nQueue\n\n");

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Primeiro");
        queue.offer("Segundo");
        queue.offer("Terceiro");

        System.out.println("Elemento do inicio da fila: " + queue.peek());

        System.out.println("Fila: " + queue);

        while(!queue.isEmpty()) {
            System.out.println("Elemento removido: " + queue.poll());
        }

        System.out.println("\n\n\nPilha\n\n");

        Stack<String> stack = new Stack<String>();

        stack.push("Primeiro");

        System.out.println("Elemento do topo da pilha: " + stack.peek());

        stack.push("Segundo");
        stack.push("Terceiro");

        System.out.println("Pilha: " + stack);

        while(!stack.isEmpty()) {
            System.out.println("Elemento removido: " + stack.pop());
        }

        System.out.println("\n\n\nLista\n\n");

        List<String> list = new ArrayList<String>();

        list.add("Primeiro");
        list.add("Segundo");
        list.add("Terceiro");

        System.out.println("Elemento do inicio da lista: " + list.get(0));

        System.out.println("Lista: " + list);

        while(!list.isEmpty()) {
            System.out.println("Elemento removido: " + list.remove(0));
        }

        System.out.println("\n\n\nConjuntos\n\n");

        Set<Integer> set = new HashSet<Integer>();

        System.out.println("inserindo elemento 1: " + set.add(5));
        System.out.println("inserindo elemento 2: " + set.add(10));
        System.out.println("inserindo elemento 3: " + set.add(15));
        System.out.println("inserindo elemento 4: " + set.add(20));
        System.out.println("inserindo elemento 5: " + set.add(10)); // não insere pois já existe
        
        System.out.println("Contem 10? " + set.contains(10));

        for(Integer i : set) {
            System.out.println("Elemento: " + i);
        }

        System.out.println("Removendo elemento 10: " + set.remove(10));

        System.out.println("\n\n\nMapas\n\n");

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Primeiro");
        map.put(2, "Segundo");
        map.put(3, "Terceiro");

        System.out.println("Elemento com chave 1: " + map.get(1));

        System.out.println("Mapa: " + map);

        for(Integer key : map.keySet()) {
            System.out.println("Chave: " + key + " Valor: " + map.get(key));
        }

        System.out.println("Removendo elemento com chave 1: " + map.remove(1));

        System.out.println("Mapa: " + map);

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + " Valor: " + entry.getValue());
        }
    }
}
