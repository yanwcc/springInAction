import com.alibaba.dubbo.common.utils.ConcurrentHashSet;

/**
 * @author yanwc
 * @date 2020/1/2 17:15
 */
public class Test {

    public static void main(String[] args) {
        ConcurrentHashSet<String> concurrentHashSet = new ConcurrentHashSet<String>();

        concurrentHashSet.add("1");
        concurrentHashSet.add("22");
        concurrentHashSet.add("ss");

        for (String str:concurrentHashSet){
        System.out.println(str);
    }
}
}
