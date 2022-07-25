package OverRiding;

public class RidingMethod extends OverridingParent {
    public int add(int a, int b) {

        int output = super.add(a, b);
        System.out.println(output);
        return output + 5;


    }
}
