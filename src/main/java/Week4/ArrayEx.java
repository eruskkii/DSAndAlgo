package Week4;

class SearchNum {

    public static int searchNum(int[] num, int target) {
        int index = -1;

        for (int i = 0; i < num.length; i++){
            if (num[i] == target) {
                index = i;

                break;
            }
        }

        return index;

    }

}


public class ArrayEx {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int target1 = 6;


        int result = SearchNum.searchNum(num1,target1);

        if (result != -1) {
            System.out.println("Index found at " + result);
        } else {
            System.out.println("Index not found in provided Array");
        }



    }
}
