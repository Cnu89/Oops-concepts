package Wrapperclass;

public class Wrapperclass {
    public static void main(String[] args) {

        int a=11;
        Integer i=a;
        System.out.println(i);

        String s1= "100";
        Integer s=Integer.valueOf(s1);
        System.out.println(s);

        Integer b= new Integer(5);
        int j=b;
        System.out.println(j);

        String s2="200";
        int k=Integer.parseInt(s2);
        System.out.println(k);

        int c=300;
        String value=String.valueOf(c);
        System.out.println(value);

    }

}
