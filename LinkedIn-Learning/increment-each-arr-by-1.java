// Java code​​​​​​‌‌‌​‌‌‌‌​‌‌‌​‌‌​​‌​‌‌​​‌‌ below
// Write your answer here, and then test your code.
// Your job is to implement the incrementArray() method.

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Increment each number in the 'numbers' array by one
    static int[] incrementArray(int[] numbers) {
        int[] result = new int[numbers.length];

        for(int i=0; i < numbers.length; i++) {
             result[i] = numbers[i] + 1 ;
        }
        
        return result;
    }
}