
public class Main {
    public static void main(String[] args) {




        int[] sandar = new int[]{1,2,3,4};

            System.out.println(task(2,sandar));




    }

    public static boolean task(int a, int[] re) {
        for (int i : re) {
            if (i == a) {
                return true;
            }
        }
        return false;
    }
}