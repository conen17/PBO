import java.util.Scanner;

public class AppTodoList {
    public static String[] model = new String[10];
    public static int count = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        testViewShowToDoList();
    }

    public static void showToDoList() {
        for (int i = 0; i < count; i++) {
            String todo = model[i];
            int no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowToDoList() {
        System.out.println("ToDoList");
        model[0] = "apel";
        model[1] = "mangga";
        model[2] = "jeruk";
        showToDoList();
    }

    public static void addToDoList(String todo) {
        if (count < model.length) {
            model[count] = todo;
            count++;
        } else {
            System.out.println("Daftar sudah penuh, tidak bisa menambahkan lagi.");
        }
    }

    public static boolean removeToDoList(int number) {
        if (number < 1 || number > count) {
            return false;
        }
        for (int i = number - 1; i < count - 1; i++) {
            model[i] = model[i + 1];
        }
        model[count - 1] = null;
        count--;
        return true;
    }

    public static void viewShowToDoList() {
        while (true) {
            showToDoList();
            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            System.out.print("Pilih: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                viewAddToDoList();
            } else if (input.equals("2")) {
                viewRemoveToDoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
        scanner.close();
    }

    public static void testViewShowToDoList() {
        System.out.println("ToDoList");
        model[0] = "Satu";
        model[1] = "Dua";
        model[2] = "Tiga";
        viewShowToDoList();
    }

    public static void viewAddToDoList() {
        System.out.println("MENAMBAH TODOLIST");
        System.out.print("Todo (x Jika Batal): ");
        String todo = scanner.nextLine();

        if (!todo.equals("x")) {
            addToDoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        System.out.println("ToDoList");
        count = 2;
        model[0] = "Satu";
        model[1] = "Dua";

        viewAddToDoList();
        System.out.println("TODOLIST");
        showToDoList();
    }

    public static void viewRemoveToDoList() {
        System.out.println("MENGHAPUS TODOLIST");
        showToDoList();
        System.out.print("Nomor yang Dihapus (x Jika Batal) : ");
        String number = scanner.nextLine();

        if (!number.equals("x")) {
            boolean success = removeToDoList(Integer.parseInt(number));
            if (!success) {
                System.out.println("Gagal menghapus ToDoList: " + number);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");
        viewRemoveToDoList();
        showToDoList();
    }
}