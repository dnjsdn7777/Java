package day02;

public class Average {
    public static void main(String[] args) {
       // 영작문, 프로그래밍, 이산수학과 컴퓨터구조 과목의 점수들을 저장하는
       //  변수들을 선언한다
       int compgrade, proggrade, mathgrade, archgrade;

       // 과목 점수들의 평균을 저장하는 변수를 선언한다
       int average;

      // 영작문 과목의 점수를 88점으로 한다
      	compgrade = 88;

      // 프로그래밍 과목의 점수를 92점으로 한다
      	proggrade = 92;

      // 이산수학 과목의 점수를 79점으로 한다
      	mathgrade = 79;
      	
      // 컴퓨터구조 과목의 점수를 80점으로 한다
      	archgrade = 80;
      			
      			
      // 과목 점수들의 평균을 계산한다
      	average = (compgrade + proggrade + mathgrade + archgrade) / 4;

      // 각 과목의  점수와 평균 점수를 출력한다
      	System.out.println("영작문 과목의 점수:\t\t" + compgrade);
      	System.out.println("프로그래밍 과목의 점수:\t" + proggrade);
      	System.out.println("이산수학 과목의 점수:\t\t" + mathgrade);
      	System.out.println("컴퓨터구조 과목의 점수:\t" + archgrade);
      	System.out.println("모든 과목의 평균 점수:\t\t" + average);
      	
			// 여기에 코드를 삽입하세요
   }
}