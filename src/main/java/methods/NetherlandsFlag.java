package methods;

public class NetherlandsFlag extends Flag {
    @Override
    public void draw1stLine() {
        System.out.println("Blue");
    }

    @Override
    public void draw2ndLine() {
        System.out.println("White");
    }

    @Override
    public void draw3dLine() {
        System.out.println("Red");
    }
}
