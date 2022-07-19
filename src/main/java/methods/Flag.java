package methods;

public abstract class Flag {

    public abstract void draw1stLine();
    public abstract void draw2ndLine();
    public abstract void draw3dLine();

    public void drawFlag(){
        draw3dLine();
        draw2ndLine();
        draw1stLine();
    }
}
