import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(findContinuousSequence(15)));
    }

    public static int[][] findContinuousSequence(int target) {
        ArrayList<int[]> arrayList = new ArrayList<>();

        int[] sequence = new int[target - 1];
        for (int j = 0; j < target - 1; j++) {
            sequence[j] = j + 1;
        }
        for (int k = 0; k < sequence.length; k++) {
            int sum = 0;
            for (int s = k; s < sequence.length; s++) {
                sum += sequence[s];
                if (sum == target) {
                    int[] temp = new int[s + 1 - k];
                    int p = k;int q = 0;
                    for (;p<s+1 && q < temp.length;){
                        temp[q] = sequence[p];
                        p++;
                        q++;
                    }
                    arrayList.add(temp);
                    break;
                }
            }
        }
        return arrayList.toArray(new int[arrayList.size()][]);
    }

}
