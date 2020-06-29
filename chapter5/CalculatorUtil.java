package org.infoq.com.ch5;

/**
 * Created by yangchao on 2020/6/29.
 */
public class CalculatorUtil {

    public static double Sum(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public static double Mean(double[] data) {
        double mean = 0;
        mean = Sum(data) / data.length;
        return mean;
    }

    //sample variance 样本方差
    public static double Sample_Variance(double[] data) {
        double variance = 0;
        for (int i = 0; i < data.length; i++) {
            variance = variance + (Math.pow((data[i] - Mean(data)), 2));
        }
        variance = variance / (data.length - 1);
        return variance;
    }

    // sample standard deviation 样本标准差
    public static double Sample_STD_dev(double[] data) {
        double std_dev;
        std_dev = Math.sqrt(Sample_Variance(data));
        return std_dev;
    }

}
