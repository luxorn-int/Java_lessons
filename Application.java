// import com.luxorn.testjava.test.test;

public class Application
{

    static void print(String x)
    {
        System.out.println(x);
    }

    public static void main(String[] args) {

        Integer i = 0;

        while (i < 100) { 
            
            print(i.toString());

            i++;
        }

    }
}