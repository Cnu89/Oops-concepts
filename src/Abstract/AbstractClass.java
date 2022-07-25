package Abstract;

public abstract class AbstractClass {
    public AbstractClass(){
        System.out.println("S");
    }
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public  abstract void sub(int a,int b);
    }

