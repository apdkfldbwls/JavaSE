package day09.mypac;

public class Sister extends Thread{
	public Wallet wallet; // Áö°©°´Ã¼
	public int money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) { 
			// Áö°©¿¡¼­ µ·À» ÀÎÃâÇØ¼­ ÀúÀåÇÑ´Ù.
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) // Áö°© ÀÜ°í 0ÀÌ¸é
				break;
			
			money = money + returnedMoney;
		}
		System.out.println("Sister ÃÑ Àç»ê : " + money);
	}
}
