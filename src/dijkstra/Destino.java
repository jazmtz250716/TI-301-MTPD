
package dijkstra;

public class Destino {

        int vertice;
        int peso;

        public Destino(int vertice, int peso) {
            this.vertice = vertice;
            this.peso = peso;
        }

        public int getVertice() {
            return this.vertice;
        }

        public void setVertice(int vertice) {
            this.vertice = vertice;
        }

        public int getPeso() {
            return this.peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        @Override
        public String toString() {
            return vertice + " " + peso;
        }

    }
