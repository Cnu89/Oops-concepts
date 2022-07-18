package MutlilevelInheritance;

public class SubParent extends BaseParent{
    public SubParent(String name){
        super(name);
    }
    public int sub(int a,int b,int c){
        int Addoutput=super.add(11,22);
        int d=Addoutput-c;
        return d;

    }
}
