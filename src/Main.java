
/*

Sentence Reverse
You are given an array of characters arr that consists of sequences of characters separated by space characters.
Each space-delimited sequence of characters defines a word.
Implement a function reverseWords that reverses the order of the words in the array in the most efficient manner.
Explain your solution and analyze its time and space complexities.

input:  arr = [ 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ',
                'm', 'a', 'k', 'e', 's', '  ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' ]

output: [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', '  ',
          'm', 'a', 'k', 'e', 's', '  ',
          'p', 'e', 'r', 'f', 'e', 'c', 't' ]

 */

public class Main {
    public static void main(String[] args) {
        char[] INPUT =
                new char[] {
                        'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                        'm', 'a', 'k', 'e', 's', ' ',
                        'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
        char[] res = reverseWords(INPUT);
        for (char c : res) {
            System.out.print(c);
        }
    }

    static char[] reverseWords(char[] input) {
        final char[] output = new char[input.length];
        int outputIndex = 0;
        int lastSpaceIndex = input.length;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == ' ') {
                final int length = lastSpaceIndex - (i + 1);
                System.arraycopy(input, i + 1, output, outputIndex, length);
                output[outputIndex + length] = ' ';
                outputIndex += length + 1;
                lastSpaceIndex = i;
            }
        }
        System.arraycopy(input, 0, output, outputIndex, lastSpaceIndex);
        return output;
    }
}


/*


The java.lang.System.arraycopy() method copies an array from the specified source array, beginning at the specified position,
to the specified position of the destination array. A subsequence of array components are copied from the source array
referenced by src to the destination array referenced by dest.The number of components copied is equal to the length argument.

The components at positions srcPos through srcPos + length - 1 in the source array are copied into positions destPos
through destPos + length - 1, respectively, of the destination array.

Declaration
Following is the declaration for java.lang.System.arraycopy() method

public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)


 */