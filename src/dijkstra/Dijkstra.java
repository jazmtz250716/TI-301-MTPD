package Dijkstra;

import java.io.*;
import java.util.*;

public class Dijkstra {

    static String entrada;
    static int n;
    static int m;
    static String[] num;
    static ArrayList<ArrayList<Destino>> lista = new ArrayList<>();
    static ArrayList<String> aux = new ArrayList<>();
    static ArrayList<String>[] array = new ArrayList[n];

    public static void main(String... args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        entrada = bufer.readLine();

        num = entrada.split(" ");

        n = Integer.parseInt(num[0]);
        m = Integer.parseInt(num[1]);

        for (int i = 0; i < m; i++) {
            ArrayList<Destino> lista2 = new ArrayList<>();
            ArrayList<Destino> lista3 = new ArrayList<>();
            int u, v, c;
            entrada = bufer.readLine();
            num = entrada.split(" ");

            u = Integer.parseInt(num[0]);
            v = Integer.parseInt(num[1]);
            c = Integer.parseInt(num[2]);

            lista2.add(new Destino(v, c));
            lista3.add(new Destino(u, c));

            if (array[u] == null) {
                array[u] = new ArrayList<>();
                array[u].add(new Destino(v, c));
            } else {
                array[u].add(new Destino(v, c));
            }

            if (array[v] == null) {
                array[v] = new ArrayList<>();
                array[v].add(new Destino(u, c));
            } else {
                array[v].add(new Destino(u, c));
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");

        int ini;
        ini = Integer.parseInt(entrada = bufer.readLine());
        ArrayList<Destino> cola = new ArrayList<>();

        cola.add(new Destino(ini, 0));
        ArrayList<Integer> visto = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            visto.add(-1);
        }

        do {
            Collections.sort(cola, (Destino uno, Destino dos) -> new Integer(uno.getPeso()).compareTo(dos.getPeso()));
            Destino actual = cola.get(0);
            cola.remove(0);
            if (visto.get(actual.vertice) == -1) {
                visto.set(actual.vertice, actual.peso);
                aux = array[actual.vertice];
                for (Destino vecino : aux) {
                    cola.add(new Destino(vecino.getVertice(), vecino.getPeso() + actual.peso));
                }
            }
        } while (!cola.isEmpty());

        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + visto.get(i));
        }
    }
}
