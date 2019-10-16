package test.algorithm;

import com.algorithm.NeedlemanWunsch;

/**
 * Main class for demonstrating functionality of the system.
 *
 * @author Francis Lawlor
 */
public class Main {
    /**
     * This is the starting point for the application. Here, the specified strings
     * are provided, along with the values for the scoring system.
     *
     * The NeedlemanWunsch class' static methods are utilised for first computing
     * the similarity matrix, and then the optimal alignment of the two strings
     * by downmost order.
     *
     * @param args
     */
    public static void main(String[] args) {
        String sequence1 = "AAGTGCCTCAAGATA";

        String sequence2 = "CCGTCTCAGCAATA";

        float matchScore = 4;
        float mismatchScore = -3;
        float indelScore = -4;
        //NeedlemanWunsch比较序列的方法
        float[][] computedMatrix = NeedlemanWunsch.computeMatrix(sequence1, sequence2, matchScore, mismatchScore, indelScore);

        System.out.println("Global max similarity matrix: ");
//        //输出第一行的序列
        for (int i = 0; i <= sequence2.length(); i++) {
            if (i == 0) {
                System.out.print("\t\t");
            } else {
                System.out.print(sequence2.charAt(i - 1) + "\t");
            }
        }

        System.out.println();
//        //输出列序列和比对结果
        for (int i = 0; i < computedMatrix.length; i++) {
            if (i == 0) {
                System.out.print("\t");
            } else {
                //输出列序列
                System.out.print(sequence1.charAt(i - 1) + "\t");
            }
            //输出比对结果
            for (int j = 0; j < computedMatrix[0].length; j++) {
                System.out.print(String.format("%.2f\t", computedMatrix[i][j]));
            }
            System.out.println();
        }
//
//        System.out.println("\n分数: \n" + computedMatrix[computedMatrix.length - 1][computedMatrix[0].length - 1] + "\n");
        System.out.println("最好的全局比对结果 ");
        System.out.println(NeedlemanWunsch.obtainOptimalAlignmentByDownmostOrder(computedMatrix, sequence1, sequence2, matchScore, mismatchScore, indelScore));
        System.out.println(5<1||6>2);
    }
}
