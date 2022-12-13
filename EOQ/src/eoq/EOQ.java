
package eoq;


public class EOQ {
    
    private float k;
    private float h;
    private float d;
    
    public EOQ() {
    }
    
    public EOQ(float k, float h, float d) {
        this.k = k;
        this.h = h;
        this.d = d;
    }
    
    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
    
    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
    
    public float solve() {
        return (float) Math.sqrt(2*k*d/h);
    }
    
    public void print() {
        System.out.println("Modelo EOQ de inventario-----------");
        System.out.println("k:" + this.k);
        System.out.println("h:" + this.h);
        System.out.println("d:" + this.d);
    }
}
