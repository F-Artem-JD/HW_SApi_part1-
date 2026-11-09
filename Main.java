public class Main {
    public static void main(String[] args) {

        //ЗАДАЧА 1

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1, 1);

        // int с = calc.devide(a, b); - Ошибка, делить на 0 нельзя + нет проверки

        boolean result = calc.isPositiveNew.test(a , b);

        int c = 0;

        if (result){
            c = calc.devide.apply(a, b);
        } else {
            System.out.println("Делить на ноль нельзя");
        }

        calc.println.accept(c);



        //ЗАДАЧА 2

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}

