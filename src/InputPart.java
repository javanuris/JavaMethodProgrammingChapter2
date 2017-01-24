import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 24.01.2017.
 */
public class InputPart {

    private int result [];

    private static ArrayList<String> stringArrayList = new ArrayList<>();//тут храняться значения с Inputstream

    public InputPart(){

    }

    //Принемает данные с клавы и хранит ее в АрайЛисте
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
    //Конвертирует ListArray<String> в простой интовый массив
    public void getIntDate(){
        result = new int [stringArrayList.size()] ;
       for(int i = 0; i < stringArrayList.size()-1 ; i++){
           result[i] = Integer.parseInt(stringArrayList.get(i));
       }
    }

    public int[] getResult() {
        return result;
    }

    public static int arraySize(){
        return stringArrayList.size();
    }


}
