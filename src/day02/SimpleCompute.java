package day02;

import java.util.Scanner;

public class SimpleCompute {
   public static void main (String[] args) {
	// 변수들을 선언한다
    int number1, number2, sum, diff, product;

    Scanner scan = new Scanner(System.in);

	// 첫 번째 정수를 읽어 들인다
    System.out.print("첫 번째 정수를 입력하세요: ");
    number1 = scan.nextInt();

	// 두 번째 정수를 읽어 들인다
    System.out.print("두 번째 정수를 입력하세요: ");
    number2 = scan.nextInt();

	// 정수들의 합을 계산한다
    sum = number1 + number2;

    // 정수들의 차를 계산한다
    diff = number1 - number2;

    // 정수들의 곱을 계산한다
    product = number1 * number2;

	// 정수들의 합, 차와 곱을 출력한다
    System.out.println ("합 = " + sum);
    System.out.println ("차 = " + diff);
    System.out.println ("곱 = " + product);
   }
}
