package Abstract;

public class AbstractMethod  extends AbstractClass{

    public AbstractMethod(){
        System.out.println("p");
    }

    @Override
    public void sub(int a, int b) {
        int c=a-b;
        System.out.println(c);
    }
    public void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
}
