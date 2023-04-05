package day09.mypac;

public class Brother extends Thread{
	public Wallet wallet;	// Áö°©°´Ã¼
	public int money;
	
	
	public Brother(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			// Áö°©¿¡¼­ µ·À» ÀÎÃâÇØ¼­ ÀúÀåÇÑ´Ù.
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) // Áö°© ÀÜ°í°¡ 0ÀÌ¸é
				break;
			money = money + returnedMoney;
			
			System.out.println("Brother ÃÑ Àç»ê : " + money);
		}
	}

}




