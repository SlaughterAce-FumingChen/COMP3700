public class FinderWithTwoFunctions {
    public Integer findMax(int[] intArray){
        if(intArray.length == 0|| intArray == null) {
            return null;
        }
        int maxValue = intArray[0];
        for(int i = 1; i < intArray.length; i++){
            if(intArray[i]> maxValue) {
                maxValue = intArray[i];
            }
        }
        return maxValue;
    }
    public  Integer findMin(int[] intArray) {
        if(intArray.length == 0|| intArray == null) {
            return null;
        }
        int minValue = intArray[0];
        for(int i = 1; i < intArray.length; i++) {
            if(intArray[i]< minValue) {
                minValue = intArray[i];
            }
        }
        return minValue;
    }
}
