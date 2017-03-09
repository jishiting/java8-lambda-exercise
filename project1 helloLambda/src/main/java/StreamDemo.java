import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by shitingji on 09/03/2017.
 */
public class StreamDemo {
    public static void main(String[] args) {
        //Collectors.toList()
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        boolean isBoolean = Arrays.asList("a", "b", "c").equals(collected);
        System.out.println("the result is -->" + isBoolean);

        //map
        collected = Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(Collectors.toList());
        collected.forEach(x -> System.out.println("after uppercase" + x));

        //filter
        collected = Stream.of("a", "1abc", "abc1").filter(value -> {
                    if ("a".equals(value)) {
                        return true;//如果返回为true，则会打印结果
                    }
                    return false;//如果返回为False，则不会打印结果
                }


        ).collect(Collectors.toList());
        collected.forEach(x -> System.out.println("after filter -->" + x));


    }
}
