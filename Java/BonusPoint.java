package javaexcercise;

public class BonusPoint {

	public int bonuspoint(int score) {
		if (score >= 1 && score <= 3) {
			return score*10;
			}
		else if(score >= 4 && score <= 6) {
			return score*100;	
		}
		else if(score >= 7 && score <= 9) {
			return score*1000;
		}
		else if(score <= 0 || score >=9) {
			System.out.println("Error occured");
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusPoint bp=new BonusPoint();
		System.out.println("Bonus point for given number is: "+bp.bonuspoint(8));

	}

}
