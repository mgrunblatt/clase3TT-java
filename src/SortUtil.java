public class SortUtil {

    public static <T> void ordenar (Precedable<T> arr[]){
        boolean noChangeFlag=false;
        Precedable <T> precedableAux;
        while(!noChangeFlag) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].precedeA((T) arr[i + 1]) < 0) {
                    precedableAux = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = precedableAux;
                }else{
                    noChangeFlag=true;
                }
            }
        }
    }
}
