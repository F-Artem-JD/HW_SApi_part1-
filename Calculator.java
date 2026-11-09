import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator <Integer> plus = (x, y) -> x + y;
    BinaryOperator <Integer> minus = (x, y) -> x - y;
    BinaryOperator <Integer> multiply = (x, y) -> x * y;
    BinaryOperator <Integer> devide = (x ,y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //Тут выполняется проверка только одного числа
    Predicate<Integer> isPositive = x -> x > 0;

    //Предлагаю сделать изменение на BiPredicate
    BiPredicate<Integer, Integer> isPositiveNew = (x, y) -> x > 0 && y > 0;


    Consumer<Integer> println = System.out::println;


}
