package school.mjc.stage0.conditions.task4;
public class Largest_Ternary 

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        
        int greatest = third > (first > second ? first : second) ? third : ((first > second) ? first : second);
        System.out.println(greatest);
    }
}
