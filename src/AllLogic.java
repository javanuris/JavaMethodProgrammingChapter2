
/**
 * Created by User on 24.01.2017.
 */
public class AllLogic {
    public AllLogic(){
    }

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

public void interedValuetoIncreat(){

    
}
}
