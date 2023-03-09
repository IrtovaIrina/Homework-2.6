import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,4));
        List<String> str = new ArrayList<>(List.of("1", "1", "2", "3", "4", "4", "5", "5", "6", "7","4"));
        task1(nums);
        task2(nums);
        task3(str);
        task4(str);
    }
    public static void task1(List<Integer> list){
        for(Integer i: list){
            if (i % 2 == 1) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task2(List<Integer> list){
        Set<Integer> setList = new HashSet<Integer> (list);
        setList.stream().sorted();
        for(Integer i: setList){
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3(List<String> list){
        Set<String> setList = new HashSet<String> (list);
        for(String i: setList){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task4(List<String> list){
        Set<String> setList = new HashSet<String> (list);
        System.out.println(list.size() - setList.size());
    }
}