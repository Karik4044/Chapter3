public class EX18 {
    public static void main(String[] args) {
        int[] series = new int[10];
        series[0] = 1;
        for (int i = 1; i < series.length; i++) {
            if (i == 1) {
                series[i] = 7;
            } else if (i == 2) {
                series[i] = 16;
            } else {
                series[i] = series[i - 1] + (series[i - 1] - series[i - 2]) * 2;
            }
        }

        for (int num : series) {
            System.out.print(num +" , ");
        }
    }
}

