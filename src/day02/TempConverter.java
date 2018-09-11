package day02;

import java.util.Scanner;

public class TempConverter
{
    public static void main(String[] args) {
    double celsiusValue, fahrenheitValue;

    Scanner scan = new Scanner(System.in);

    System.out.print("화씨 온도를 입력하세요: ");
    fahrenheitValue = scan.nextDouble();

	celsiusValue = 5.0/9.0 *(fahrenheitValue - 32.0);


    System.out.println("화씨 온도:\t" + fahrenheitValue);
    System.out.println("섭씨 온도:\t" + celsiusValue);
    scan.close();
   }
}