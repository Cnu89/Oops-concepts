package Test;

public class Division {
    public void div(int a, int b) {
        double c = (double) a / b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Division obj=new Division();
        obj.div(11,2);
    }
}
