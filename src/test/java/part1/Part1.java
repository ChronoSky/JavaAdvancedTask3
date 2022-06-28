package part1;

/**
 * @author Zakrenichniy AN
 */
public class Part1 {

    public static void main(String[] args) {

        // согласно данным из википедии 0 (ноль) не является ни положительным ни отрицательным числом
        int posMinNum = 0;
        int negMaxNum = 0;
        int posMinNumInd = 0;
        int negMaxNumInd = 0;

        int[] nums = new int[20];

        // заполнение массива
        for (int i = 0; i < 20; i++) {
            nums[i] = rnd(-10, 10);
            System.out.println(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n < 0 && (negMaxNum == 0 || negMaxNum < n)) {
                negMaxNum = n;
                negMaxNumInd = i;
            } else if (n > 0 && (posMinNum == 0 || posMinNum > n)) {
                posMinNum = n;
                posMinNumInd = i;
            }
        }
        if (posMinNum != 0 && negMaxNum != 0) {
            System.out.println("Минимальный положительный элемент : " + posMinNum);
            System.out.println("Максимальный отрицательный элемент : " + negMaxNum);

            int value = negMaxNum;
            nums[negMaxNumInd] = posMinNum;
            nums[posMinNumInd] = value;

            System.out.println("Значения поменяли местами");

        } else {
            if (posMinNum == 0) System.out.println("В массиве отсутствует минимальный положительный элемент");
            if (negMaxNum == 0) System.out.println("В массиве отсутствует максимальный отрицательный элемент");
        }

    }

    /**
     *
     * @param min minimum boundary number
     * @param max maximum boundary number
     * @return random Integer number between two numbers
     */
    public static int rnd(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }
}
