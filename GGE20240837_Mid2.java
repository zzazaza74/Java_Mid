import java.util.Scanner;

public class GGE20240837_Mid2
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("랜덤으로 가위, 바위, 보 중 3개를 나눠드리겠습니다.");
		System.out.println("먼저 2점을 획득하거나 점수가 더 높은 쪽이 승리합니다.");
		System.out.println("상대방의 패를 보고 어떤 것을 낼지 고르시오.");
		
        int you = 0;
        int younum = 0;
        int comnum = 0;
        int youS = 0;
        int comS = 0;
        int comchoice;
        
        String[] card = {"가위", "바위", "보"};
        String[] comcard = new String[3];
        String[] youcard = new String[3];

        for (int i = 0; i < 3; i++) 
        {
            int rndcom = (int)(Math.random() * 3);
            comcard[i] = card[rndcom];
        }
        
        for (int i = 0; i < 3; i++) 
        {
            int rndyou = (int)(Math.random() * 3);
            youcard[i] = card[rndyou];
        }
        
        for (int j = 1; j <= 3; j++) 
        {
    		System.out.println();
            System.out.print("컴퓨터의 패: ");
            for (int i = 0; i < 3; i++) 
            {
                System.out.print((i + 1) + "." + comcard[i] + "  ");
            }
            System.out.println();
            
            System.out.print("당신의 패: ");
            for (int i = 0; i < 3; i++) 
            {
                System.out.print((i + 1) + "." + youcard[i] + "  ");
            }
            System.out.println();

            while (true) 
            {
                System.out.println("낼 카드의 번호를 선택하시오.");
                you = s.nextInt();
                if (youcard[you - 1] == "X") 
                {
                	System.out.println("이미 사용한 카드입니다. 다시 입력하시오.");
                } 
                else if (you < 1 || you > 3)
                {
                	System.out.println("잘못 입력하였습니다. 다시 입력하시오.");
                }
                else
                {
                	 break;
                }
            }
            
            while (true) 
            {
            	comchoice = (int)(Math.random() * 3);
                if (comcard[comchoice] != "X") 
                {
                    break; 
                }
            }
            
            String youC = youcard[you - 1];
            String comC = comcard[comchoice];
            youcard[you - 1] = "X";   
            comcard[comchoice] = "X";

            if (youC == "가위") younum = 0;
            else if (youC == "바위") younum = 1;
            else younum = 2;

            if (comC == "가위") comnum = 0;
            else if (comC == "바위") comnum = 1;
            else comnum = 2;
            
            if(younum==comnum)
    		{
    			System.out.println("비겼습니다.");
    			System.out.println("당신: " + youC + " | 컴퓨터: " + comC);
    		}
    		else if((younum == 0 && comnum == 2) || (younum == 1 && comnum == 0) || (younum == 2 && comnum == 1))
    		{
    			youS++;
    			System.out.println("당신이 이겼습니다.");
    			System.out.println("당신: " + youC + " | 컴퓨터: " + comC);
    		}
    		else 
    		{	
    			comS++;
    			System.out.println("당신이 졌습니다.");
    			System.out.println("당신: " + youC + " | 컴퓨터: " + comC);
    		}
            
            if (youS == 2 || comS == 2) 
            {
                break; 
            }
        }
        
        if (youS > comS) 
        {
            System.out.println("-------당신이 승리하였습니다.-------");
        } 
        else if (comS > youS) 
        {
            System.out.println("-------컴퓨터가 승리하였습니다.-------");
        } 
        else 
        {
            System.out.println("---------무승부입니다.---------");
        }
        

		s.close();
	} 

}
