package Interface;

public class Main {
    public static void main(String[] args) {
        InterfaceC driver=new InterfaceC();
        InterfaceA driver1=new InterfaceC();
        InterfaceB driver2=new InterfaceC();
        driver.add(10,20);
        driver1.add(30,40);
        driver2.add(50,60);
    }
}
