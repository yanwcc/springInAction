import org.I0Itec.zkclient.ZkClient;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yanwc
 * @date 2019/12/25 19:38
 */
public class TestDemo {

    public static void main(String[] args) {
        //testStream();
        //testStream2();
        test3();
    }

    private static void test3() {
        List<String> lists = new ArrayList<>();
        List<String> lists2 = new ArrayList<>();
        lists.add("aa");
        lists.add("bb");
        lists.add("cc");

        lists2.add("cc");
        lists2.add("dd");
        lists2.add("ee");

        for (String str:lists){
            for (String str2:lists2){
                if (str.equals(str2)){
                    System.out.println("ss");
                    //break;
                }
                System.out.println(str2);
            }
            System.out.println(str);
        }
    }

    private static void testStream2() {
        List<String> lists = new ArrayList<>();
        lists.add("ss");
        lists.add("sa");
        lists.add("aa");
        lists.add("bb");

        List<String> collect = lists.stream().map(String::toUpperCase).collect(Collectors.toList());

        collect.forEach((s) -> {
            System.out.println(s);
        });



    }

    private static void testStream() {
        List<Integer> lists = new ArrayList<Integer>();

        lists.add(1);
        lists.add(2);
        lists.add(3);

        long count = lists.stream().filter(w -> w > 1).count();

        System.out.println(count);


    }
}
