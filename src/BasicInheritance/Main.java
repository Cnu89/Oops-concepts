package BasicInheritance;

public class Main {
    public static void main(String[] args) {
        Addition driver=new Addition();
        Multiplication driver1=new Multiplication();
        int c=driver.add(5,9);
        driver1.mul(c);

    }
}
