import java.util.stream.Stream;
class Question_5 
{
    public static void main(String[] args) 
    {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e > 5).findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("Values Doesnot Exists"));

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10).filter(e -> e > 8).findFirst().orElseThrow();
    }
}
