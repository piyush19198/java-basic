import com.interfaces.AdvCalculator;
import com.interfaces.Calculator;
class  MyCalculator implements Calculator , AdvCalculator{

    public int add(int no1, int no2)
    {
        return no1+no2;
    }

    public int sub(int no1, int no2)
    {
        return no1-no2;
    }

    public int mul(int no1, int no2)
    {
        return no1*no2;
    }

    public int div(int no1, int no2)
    {
        return no1/no2;
    }
}