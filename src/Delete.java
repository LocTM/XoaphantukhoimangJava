import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào vị trí cần xóa trong mảng: ");
        int x = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }


        if (index_del != -1) {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
        } else {
            System.out.println("Không tìm thấy giá trị " + x + " trong mảng.");
        }

        System.out.print("Mảng sau khi xoá: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
