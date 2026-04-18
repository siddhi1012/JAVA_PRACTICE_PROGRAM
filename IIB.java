public class IIB {
    int x;
    {
        x = 10;
        System.out.println("Instance block executed");
    }

    IIB() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        IIB i1 = new IIB();
        IIB i2 = new IIB();

    }

}
