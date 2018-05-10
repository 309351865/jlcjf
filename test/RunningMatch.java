package cn.jbit.ifdemo;
import java.util.*;
public class RunningMatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入比赛成绩（s）：");
		double score = input.nextDouble();
		System.out.print("请输入性别：");
		String gender = input.next();
		if(score>=10){
			if(gender.equals("男")){
				System.out.println("进入男子组决赛！");
			}else if(gender.equals("女")){
				System.out.println("进入女子组决赛！");
			}
		}else{
			System.out.println("淘汰！");
		}
	}
}
