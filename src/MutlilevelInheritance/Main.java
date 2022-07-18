package MutlilevelInheritance;

public class Main {
    public static void main(String[] args) {
        SubChild obj=new SubChild("Srinivas Reddy");
        String s=obj.name;
        System.out.println(s);
        obj.mul(5);
        int z=obj.sub(11,22,3);
        int y=obj.add(77,88);
        System.out.println(z);
        System.out.println(y);
    }

}
