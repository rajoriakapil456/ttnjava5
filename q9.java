import java.util.*;
import java.util.stream.Collectors;

class Question_9 
{
    public static void main(String[] args) 
    {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(li.stream().filter(e -> e > 1).collect(Collectors.toUnmodifiableList()));
    }
}
