package easy;

import java.util.BitSet;
import java.util.Scanner;

public class Task34_BitSetVector {

    /**
     * Java's BitSet class implements a vector of bit values (i.e.:  () or  ())
     * that grows as needed, allowing us to easily manipulate bits while
     * optimizing space (when compared to other collections).
     * Any element having a bit value of  is called a set bit.
     * Given  BitSets,  and , of size  where all bits in both
     * BitSets are initialized to , perform a series of  operations.
     * After each operation, print the number of set bits in the
     * respective BitSets as two space-separated integers on a new line.
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read length of bit sets and num of operations
        int length = scanner.nextInt();
        int numOfOperations = scanner.nextInt();

        /* Create two bit sets and put links to the array */
        BitSet bitSet1 = new BitSet(length);
        BitSet bitSet2 = new BitSet(length);
        BitSet[] bitSets = {bitSet1, bitSet2};

        // Create operational variables
        String operation = "";
        int firstArgument = 0;
        int secondArgument = 0;

        // For each operation
        for (int i = 0; i < numOfOperations; i++) {
            // Read type of operation and read args
            operation = scanner.next();
            firstArgument = scanner.nextInt();
            secondArgument = scanner.nextInt();

            // for each operation define case
            switch (operation) {
                // Retrieve relevant bit set from array
                // and call the operation on this set
                case "AND" -> bitSets[firstArgument - 1].and(bitSets[secondArgument - 1]);
                case "OR" -> bitSets[firstArgument - 1].or(bitSets[secondArgument - 1]);
                case "XOR" -> bitSets[firstArgument - 1].xor(bitSets[secondArgument - 1]);
                case "FLIP" -> bitSets[firstArgument - 1].flip(secondArgument);
                case "SET" -> bitSets[firstArgument - 1].set(secondArgument);
            }

            // After each operation output num of bits set to 1
            // using cardinality() from BitSet class
            System.out.printf("%d %d%n",
                    bitSet1.cardinality(),
                    bitSet2.cardinality()
            );
        }


    }
}
