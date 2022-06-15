import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       int[] x = {10};

        Ioperable op = ()-> {
          x[0]++;
          return "Hello World";
        };

        //Method1(() -> { x[0]++; return 15; });
        Method1((p1, p2 , p3) -> {return p1 + p2 + p3;});
        Method1((p1, p2 , p3) -> {return p1 + p2 * p3;});

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");

        list.forEach(System.out::println);

        System.out.println(op.Operable());
        System.out.println(String.valueOf(x[0]));
    }

    interface Ioperable {
          public String Operable() ;
    }

    interface ITest2 {
        public int Operable(int p1, int p2 , int p3);
    }
    public static void Method1 (ITest2 op) {
        int xx = op.Operable(1, 2 , 2);
        System.out.println(xx);
    }
}
