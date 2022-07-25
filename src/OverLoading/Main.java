package OverLoading;

public class Main {
    public static void main(String[] args) {
        Overriding obj=new Overriding(11,22);
        obj.add(33,44);
        obj.add(11,22);
        obj.add(55,66,77.7f);

    }
}
