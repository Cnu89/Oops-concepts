package Interface;

public class InterfaceC implements InterfaceA,InterfaceB{
    public void add(int a,int b) {
        int c= a+b;
        System.out.println(c);
    }
}
