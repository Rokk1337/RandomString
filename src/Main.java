import java.util.*;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество элементов в стороке");
        int n = in.nextInt();
        List<String> num = new ArrayList();

        for (int i = 0; i < n; i++) {
            int x = random.nextInt(10);
            String s = Integer.toString(x);
            num.add(s);
        }

        System.out.println("list_num");
        for (String g : num){
            System.out.print(g + " ");
        }

        System.out.println("");
        long for_0 = num.stream().filter(e -> e.equals("0")).count();
        long for_1 = num.stream().filter(e -> e.equals("1")).count();
        long for_2 = num.stream().filter(e -> e.equals("2")).count();
        long for_3 = num.stream().filter(e -> e.equals("3")).count();
        long for_4 = num.stream().filter(e -> e.equals("4")).count();
        long for_5 = num.stream().filter(e -> e.equals("5")).count();
        long for_6 = num.stream().filter(e -> e.equals("6")).count();
        long for_7 = num.stream().filter(e -> e.equals("7")).count();
        long for_8 = num.stream().filter(e -> e.equals("8")).count();
        long for_9 = num.stream().filter(e -> e.equals("9")).count();

        long procent_0 = (for_0 * 100 / n);
        long procent_1 = (for_1 * 100 / n);
        long procent_2 =  (for_2 * 100 / n);
        long procent_3 = (for_3 * 100 / n);
        long procent_4 = (for_4 * 100 / n);
        long procent_5 = (for_5 * 100 / n);
        long procent_6 = (for_6 * 100 / n);
        long procent_7 = (for_7 * 100 / n);
        long procent_8 = (for_8 * 100 / n);
        long procent_9 = (for_9 * 100 / n);

        System.out.println("вот столько нулей " + for_0 + " - " + procent_0 + "%");
        System.out.println("а единиц вот сколько " + for_1 + " - " + procent_1 + "%");
        System.out.println("двоек подвезли столько " + for_2 + " - " + procent_2 + "%");
        System.out.println("троек сегодня как вот так " + for_3 + " - " + procent_3 + "%");
        System.out.println("4-ок сегодня воть " + for_4 + " - " + procent_4 + "%");
        System.out.println("пятёрок как в школе " + for_5 + " - " + procent_5 + "%");
        System.out.println("шестёрок как всегда " + for_6 + " - " + procent_6 + "%");
        System.out.println("7-ок ни туда, ни сюда " + for_7 + " - " + procent_7 + "%");
        System.out.println("8-ок аж вот сколько " + for_8 + " - " + procent_8 + "%");
        System.out.println("9 как и надо " + for_9 + " - " + procent_9 + "%");

    }
}

