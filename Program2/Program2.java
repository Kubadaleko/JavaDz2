
package Program2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// С логированием не получилось::((((
public class Program2 {
    public static void main(String[] args) throws IOException {
        try(FileWriter writer = new FileWriter("notes3.txt")){
        int[] arry = { 11, 3, 14, 16, 7 };
        boolean isSorted = false;
        int variable;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arry.length - 1; i++) {
                if (arry[i] > arry[i + 1]) {
                    isSorted = false;
                    variable = arry[i];
                    arry[i] = arry[i + 1];
                    arry[i + 1] = variable;
                    writer.write(variable);
                    writer.flush();
                }
            }
        }
        System.out.println(Arrays.toString(arry));
    }
}
}