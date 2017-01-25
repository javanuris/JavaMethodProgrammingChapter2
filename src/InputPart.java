import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Класс , отвечает за ввод значений в консоль.
 * @author Kalenov Nurislam
 * @version 1.0
 */
public class InputPart {

    private int resultInt [];
    private String resultString[];

    private static ArrayList<String> stringArrayList = new ArrayList<>();//тут храняться значения с Inputstream

    public InputPart(){

    }

    /**
     * Принимает данные с клавы и хранит ее в АрайЛисте
     *
     * */
    public void  bufferInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.println("Вводите числа: ");
        do{
            try {
                str =   br.readLine();
                System.out.println("Вы ввели: " + str);
                stringArrayList.add(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!str.equals("stop"));

        System.out.print("Your numbers :");
        for(int i = 0; i <= str.length() ; i++) {
            System.out.print(" "+stringArrayList.get(i));
        }
    }

    /**
     * Конвертирует ListArray<String> в простой интовый массив
     * @see InputPart
     * */
    public void getIntDate(){
        resultInt = new int [stringArrayList.size()] ;
       for(int i = 0; i < stringArrayList.size()-1 ; i++){
           resultInt[i] = Integer.parseInt(stringArrayList.get(i));
       }
    }
    /**
     * Конвертирует ListArray<String> в простой стринговый массив
     * @see InputPart
     * */
    public void getStringDate(){
        for(int i = 0; i < stringArrayList.size() -1 ; i++){
        resultString = stringArrayList.toArray(new String[i]);
        }
    }

    public int[] getIntResult() {
        return resultInt;
    }

    public String[] getStringResult(){return resultString;}

    public static int arraySize(){
        return stringArrayList.size();
    }


}
