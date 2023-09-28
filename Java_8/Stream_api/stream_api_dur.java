package Java_8.Stream_api;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_api_dur {
    public static void main(String[] args) {
        /*List<Integer> list1 = List.of(2,3,4,50,31, 22,76, 67);
        List<Integer> newlist1 = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(newlist1);*/

        //1 - blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        //2-array, Object, Collection
        String names[] = {"Prabaht", "Keerti"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //3 builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();
    }

}
