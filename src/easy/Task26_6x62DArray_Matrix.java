package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Task26_6x62DArray_Matrix {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> array = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                array.add(
                        Stream
                                .of(bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });



        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int arrRow = 0; arrRow < array.size() - 2; arrRow++) {
            for (int arrColumn = 0; arrColumn < array.get(arrRow).size() - 2; arrColumn++) {
                sum = array.get(arrRow).get(arrColumn)
                        + array.get(arrRow).get(arrColumn + 1)
                        + array.get(arrRow).get(arrColumn + 2)
                        + array.get(arrRow + 1).get(arrColumn + 1)
                        + array.get(arrRow + 2).get(arrColumn)
                        + array.get(arrRow + 2).get(arrColumn + 1)
                        + array.get(arrRow + 2).get(arrColumn + 2);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);

        bufferedReader.close();
    }


}
