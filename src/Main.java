import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }
    public static void task1(){
        System.out.println("Задание 1");
        for (int num : nums) {
            if (num%2!=0){
                System.out.println(num);
            }
            
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        Set<Integer> integerSet = new TreeSet<>(nums);
        for (Integer integer : integerSet) {
            if (integer % 2 == 0){
                System.out.println(integer);
            }
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        System.out.println(new TreeSet<>(strings));
    }
    public static void task4(){
        System.out.println("Задание 4");
        Map<String,Integer> countByWord  = new HashMap<>();
        for (String string : strings) {
            if (countByWord.containsKey(string)){
                countByWord.put(string,countByWord.get(string)+1);
            }else{
                countByWord.put(string,1);
            }
        }
        for (Map.Entry<String,Integer>entry: countByWord.entrySet()) {
            System.out.println(entry.getValue());
            
        }
    }
}