package mvc.view;

import java.util.ArrayList;
import mvc.vo.StudentVO;

public class ScoreView {

	private ArrayList<StudentVO> studentArrList;//패키지 달라서 import 해줘야됨
	
	public ScoreView(ArrayList<StudentVO> studentArrList) {
		this.studentArrList=studentArrList;
	}
	
	public void print() {
		System.out.println("==전체 학생 성적 정보 출력==");
		for(int i=0; i<studentArrList.size(); i++) {
			StudentVO s=studentArrList.get(i);
			int sum=calcSum(s); //합계
			double avg=calcAvg(sum); //평균
			
			System.out.printf("%d  %s  국어:%d  영어:%d  수학:%d  과학:%d  역사:%d 합계:%d  평균:%f\n",
					s.getStuId(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getScience(), s.getHistory(), sum, avg);
		}
	}
	
	public int calcSum(StudentVO s) { //합계구하기
		return s.getKor()+s.getEng()+s.getMath()+s.getScience()+s.getHistory();
	}
	
	public double calcAvg(int sum) { //평균구하기
		return sum/5.0;
	}
}
