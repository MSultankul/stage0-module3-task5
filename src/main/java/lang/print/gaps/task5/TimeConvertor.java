package lang.print.gaps.task5;

public class TimeConverter {
    public void convert(float minutes) {
        float seconds = minutes * 60;
        System.out.println(seconds);
    }

    public static void main(String[] args) {
        TimeConverter converter = new TimeConverter();
        converter.convert(5);
    }
}