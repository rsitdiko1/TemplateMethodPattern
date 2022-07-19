package methods;

public class RussianFlag extends Flag {
    @Override
    public void draw1stLine() {
        System.out.println("Red");
    }

    @Override
    public void draw2ndLine() {
        System.out.println("Blue");
    }

    @Override
    public void draw3dLine() {
        System.out.println("White");
    }
}
