
/**
 * Created by User on 24.01.2017.1
 */
public class Main{
    public static void main(String[] args) {
        InputPart inputPart = new InputPart();
        AllLogic allLogic = new AllLogic();
        inputPart.bufferInput();
        inputPart.getIntDate();
        System.out.println();
        allLogic.findVeryShortAndVeryLongNumber(inputPart.getResult());

    }
}
