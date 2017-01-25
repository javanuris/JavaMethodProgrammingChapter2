import java.util.*;
/**
 * Класс в котором храянться методы для вычисление и решение задач
 * @author Kalenov Nurislam
 * @version 1.0
 */
public class AllLogic {

    public AllLogic(){
    }

    /**
     * Ищет самое длиное и короткое число по значению
     */
    public void findVeryShortAndVeryLongNumber(int [] array){

    String longest = String.valueOf(array[0]);
    String shortest = String.valueOf(array[0]);

    for(int i = 1 ; i < InputPart.arraySize(); i++){
        if(shortest.length()>array.length){
    shortest =String.valueOf(array[i]);
        }
        if(longest.length()<array.length){
            longest =String.valueOf(array[i]);
        }
    }
    System.out.print("Shortest: " + shortest + " lenght: " + shortest.length());
    System.out.println();
    System.out.print("Longest: " + longest + " lenght: " + longest.length());
}

    /**
     * Упорядочивает и ввыодит число в порядке возрастание символов
     */
    public void interedValueToIncreast(String[] array){
    Map<String , Integer> map = new HashMap<>();
    for(String inter : array){
        map.put(inter , array.length);
    }
    List<Map.Entry<String , Integer>>  lenghtSorting = new ArrayList<Map.Entry<String, Integer>>();
    map.entrySet();

    Collections.sort(lenghtSorting, new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o2.getValue().compareTo(o1.getValue());
        }
    });

    for (Map.Entry<String , Integer> entry : lenghtSorting){
    map.put(entry.getKey() , entry.getValue());
    }

    System.out.println();
    System.out.print(map + "--");
}
}
