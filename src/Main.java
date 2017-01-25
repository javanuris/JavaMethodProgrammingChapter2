
/**
 * Главный класс , запускатор.
 * Как это работает?
 * Run -> Вводим n числа -> вводим : "stop";
 * @author Kalenov Nurislam
 * @version 1.0
 */
public class Main{
    public static void main(String[] args) {
        InputPart inputPart = new InputPart();
        AllLogic allLogic = new AllLogic();
        inputPart.bufferInput();
        /*Не зпбудь применять методы - конверторы! */
        /*Лучше конечно конверторы перенести в сами методы , а не тут их вызывать*/
        inputPart.getIntDate();
        System.out.println();
        allLogic.findVeryShortAndVeryLongNumber(inputPart.getIntResult());
        System.out.println();
        inputPart.getStringDate();
        allLogic.interedValueToIncreast(inputPart.getStringResult());
    }
}
