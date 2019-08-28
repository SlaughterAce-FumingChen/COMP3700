import org.jetbrains.annotations.NotNull;

public class FinderWithTwoFunctions {
    int findMax(@NotNull int[] intArray) {
        int MaxNumber=0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>MaxNumber) {
                MaxNumber=intArray[i];
            }
        }
        return MaxNumber;
    }
    int findMin(@org.jetbrains.annotations.NotNull int[] intArray){
        int MinNumber=99999;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]<MinNumber) {
                MinNumber=intArray[i];
            }
        }
        return MinNumber;    }
}
