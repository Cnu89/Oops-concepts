package OverLoading;

public class Overriding {

    public Overriding(int a){
        System.out.println(a);
    }
    public Overriding(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b,int c) {
        System.out.println(a + b + c);
    }
    public void add(int a,int b,float c){
        System.out.println(a+b+c);
    }


}
