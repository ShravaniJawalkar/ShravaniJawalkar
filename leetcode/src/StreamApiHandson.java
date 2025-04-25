import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiHandson {

    public static void main(String[] args) {
      List<Integer> l= Arrays.asList(1,2,3,4,5,6,9,7,8,10);
      List<Integer> r =  l.stream().filter(e->e%2==0).map(e->e*2).distinct().collect(Collectors.toList());
        int min=  r.stream().collect(Collectors.summarizingInt(n->n)).getMin();
        int max =  r.stream().collect(Collectors.summarizingInt(n->n)).getMax();
        long sum = r.stream().collect(Collectors.summarizingInt(n->n)).getSum();
        long count = r.stream().collect(Collectors.summarizingInt(n->n)).getCount();
        double avg = r.stream().collect(Collectors.summarizingInt(n->n)).getAverage();

        List<String> s= List.of("Java", "Stream", "API","JavaX","Spring","Angular","JavaScript","Java8","Java9","Java10");
    Map<Character,List<String>> m=  s.stream().collect(Collectors.groupingBy(e->e.charAt(0)));
    m.entrySet().stream().forEach(System.out::println);
    Map<Integer, Set<String>> m1 = s.stream().collect(Collectors.groupingBy(e->e.length(),Collectors.toSet()));
    m1.entrySet().stream().forEach(System.out::println);
      Map<Boolean,List<String>> k= s.stream().collect(Collectors.partitioningBy(e->e.startsWith("J")));
      k.entrySet().stream().forEach(System.out::println);
      Map<Boolean,Long> d= s.stream().collect(Collectors.partitioningBy(e->e.startsWith("J"),Collectors.counting()));
      d.entrySet().stream().forEach(System.out::println);
      Map<Boolean,List<String>> f = s.stream().collect(Collectors.partitioningBy(e->e.startsWith("J"),Collectors.mapping(e->e.toUpperCase(),Collectors.toList())));
      f.entrySet().forEach(System.out::println);
                    s.stream().collect(Collectors.toMap(e->e,e->e.toUpperCase())).entrySet().forEach(System.out::println);
    }
}
