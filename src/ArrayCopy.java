public class ArrayCopy {
    public static void main(String[] args){
        int[] myNumbers = {0,1,2,3,4,5,6,7};
        int[] luckyNumbers = {10,11,12,13,14,15,16,17};
        System.arraycopy(myNumbers,2,luckyNumbers,3,4);
        /*
           copy starting from myNumbers[2] to array luckyNumbers
           starting from luckyNumbers[3] and copy 4 numbers
        */
    }
}
