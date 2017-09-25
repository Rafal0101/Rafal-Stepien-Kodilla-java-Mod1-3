package part3.ex5_2;

/**
 * Created by User on 2017-08-21.
 */
public abstract class TimeCounter {
    protected abstract void operation();
    protected abstract String operationName();

    public void execute() {
        long begin = System.nanoTime();
        operation();
        long end = System.nanoTime();
        System.out.println(operationName() + " - execution time:" + (end - begin) + " ns");
    }
}
