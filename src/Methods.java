public class Methods {
    private int a;
    private int b;

    public Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int plus() {
        return a + b;
    }
    public int minus(){
        return a - b;
    }
    public int multip(){
        return a * b;
    }
    public int division(){
        return a / b;
    }
}
