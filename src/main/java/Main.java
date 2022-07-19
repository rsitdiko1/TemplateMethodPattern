import methods.Flag;
import methods.NetherlandsFlag;
import methods.RussianFlag;

public class Main {
    public static void main(String[] args) {
        Flag russian = new RussianFlag();
        Flag netherlands = new NetherlandsFlag();

        russian.drawFlag();
        System.out.println("--------------");
        netherlands.drawFlag();
    }
}
