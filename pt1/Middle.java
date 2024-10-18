import java.util.Arrays;

public class Middle {
    public static void main(String[] arg) {
        new Middle().runApp();
    }
    void runApp() {
        int x = middle(10, 5, 7); //return 7
        int y = middle(10, 10, 9); //return 10

        System.out.printf("x: %d, y: %d\n", x, y);

        int[] array = {3, 2, 15, 14, 1}; 
        System.out.printf("min: %d\t", min(array));//print 1
        System.out.printf("max: %d\t", max(array));//print 15
        System.out.printf("median: %.1f\n", median(array));//print 3
        int[] array2 = {13, 2, 25, 14, 1, 26}; 
        System.out.printf("median of array2: %.1f\n", median(array2));//print 3
    }
    //TODO 1 - 5%
    int middle(int a, int b, int c) {
        if (a >= b && a <= c || a <= b && a >= c)
            return a;
        if (b >= a && b <= c || b <= a && b >= c)
            return b;
        return c;
        /**
         * Alternatively 
         **/
        // int[] array = {a, b, c};
        // return median(array);
    }

    //Dictation Questions
    int max(int[] array) {
        int result = array[0];
        for (int i : array)
            if (result < i)
                result = i;
        return result;
    }
    //Dictation Questions
    int min(int[] array) {
        int result = array[0];
        for (int i : array)
            if (result > i)
                result = i;
        return result;
    }

    //A small portion of student cannot write the return type of this method
    // Recall the dictation question, we try to reuse here.
    /**
if ( indexToRemove >= 0 && indexToRemove < oldArray.length) {
    for (int i = 0; i < indexToRemove; i++)
        newArray[i] = oldArray[i];
    for (int i = indexToRemove; i < newArray.length; i++ )
        newArray[i] = oldArray[i + 1];     
    //replace the existing reference by the new reference
    oldArray = newArray; 
}
     */
    //also
    /**
int maxIndex = 0;
for (int i = 1; i < scores.length; i++)
    if (scores[maxIndex] < scores[i])
        maxIndex = i;
     */
    int[] removeIndex(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < index; i++)
            result[i] = array[i];
        for (int i = index; i < result.length; i++ )
            result[i] = array[i + 1];     
        return result;        
    }  
    int findIndex(int[] array, int value) {
        for (int i = 1; i < array.length; i++)
            if (array[i] == value)
                return i;
        return -1;
    }


    int[] removeOneLargestElement(int[] array) {
        return removeIndex(array, findIndex(array, max(array)));
    }

    int[] removeOneSmallestElement(int[] array) {
        return removeIndex(array, findIndex(array, min(array)));
    }
    

    double median(int[] array) {
        while (array.length > 2) {
            array = removeOneLargestElement(array);
            array = removeOneSmallestElement(array);
        }
        if (array.length == 2)
            return (array[0] + array[1]) / 2.0;
        return array[0];
    }
}
