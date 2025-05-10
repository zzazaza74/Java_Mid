import java.util.Scanner;

public class GGE20240837_Mid1
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중 하나를 선택해 번호를 입력하시오.");
       
        int you = 0;
        int com = (int)(Math.random() * 3)+1;
        
		while (you < 1 || you > 3) 
		{
			System.out.println("1.가위  2.바위  3.보");
            you = s.nextInt();

            if (you < 1 || you > 3) 
            {
                System.out.println("잘못 입력하였습니다. 다시 입력하시오.");
            }
        }

		if(you==com)
		{
			System.out.println("비겼습니다.");
			System.out.println("당신: " + you + " | 컴퓨터: " + com);
		}
		else if((you == 1 && com == 3) || (you == 2 && com == 1) || (you == 3 && com == 2))
		{
			System.out.println("당신이 이겼습니다.");
			System.out.println("당신: " + you + " | 컴퓨터: " + com);
		}
		else 
		{
			System.out.println("당신이 졌습니다.");
			System.out.println("당신: " + you + " | 컴퓨터: " + com);
		}
		
		s.close();
	} 

}
