import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;


public class StreamDemo {
    public static void main(String[] args) {
        //Collectors.toList()
        List<String> collected = Stream.of("a", "b", "c").collect(toList());
        boolean isBoolean = asList("a", "b", "c").equals(collected);
        System.out.println("the result is -->" + isBoolean);

        //map
        collected = Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(toList());
        collected.forEach(x -> System.out.println("after uppercase" + x));

        //filter
        collected = Stream.of("a", "1abc", "abc1").filter(value -> {
                    if ("a".equals(value)) {
                        return true;//如果返回为true，则会打印结果
                    }
                    return false;//如果返回为False，则不会打印结果
                }


        ).collect(toList());
        collected.forEach(x -> System.out.println("after filter -->" + x));
        // flatMap
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4)).flatMap(numbers -> numbers.stream()).collect(toList());
        together.forEach(x -> System.out.println("after flatMap -->" + x));
        //reduce
        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);//0是累加器acc的初始值
        System.out.println("after reduce --> " + count);


    }
}
