package MutlilevelInheritance;

public class SubChild extends SubParent{
    public SubChild(String name){
        super(name);
    }
    public void mul(int e){
        int Suboutput=super.sub(33,44,11);
        int f=Suboutput*e;
        System.out.println(f);

    }
}
