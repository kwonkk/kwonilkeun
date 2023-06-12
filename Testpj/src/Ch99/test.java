package Ch99;


class Buyer{
	private int wallet;
	private int Apple;
	
	
	public Buyer(int wallet, int appleCnt) {
		
		wallet = wallet;
		Apple = appleCnt;
	}
	public void Payment(Seller seller,int money)
	{
		wallet-=money;
		
		int cnt = seller.Receive(money);
		
		Apple+=cnt;
	}
	public void Info() {
		
		System.out.println("구매자");
		System.out.println("보유 금액 : " + wallet);
		System.out.println("사과 개수 : " + Apple);
	}
}

class Seller{
	private int wallet;
	private int Apple;
	public int Price;
	
	public Seller(int wallet, int appleCnt, int price) {
		
		wallet = wallet;
		Apple = appleCnt;
		Price = price;
	}
	public int Receive(int money) {
		
		wallet+=money;
		
		int revcnt = money/Price;
		
		Apple-=revcnt;
		
		return revcnt;
	}
	public void Info() {
		
		System.out.println("판매자");
		System.out.println("보유 금액 : " + wallet);
		System.out.println("사과 개수 : " + Apple);
		System.out.println("개당 가격 : " + Price);
	}
}
public class test {

	public static void main(String[] args) {
		Seller 셀러 = new Seller(500000,500,100);	
		Buyer 피카츄 = new Buyer(20000,0);	
		Buyer 라이츄 = new Buyer(10000,0);
		Buyer 파이리 = new Buyer(30000,0);
		피카츄.Payment(셀러, 5000);
		셀러.Info();
		피카츄.Info();
		라이츄.Payment(셀러, 6000);
		라이츄.Info();
		파이리.Payment(셀러, 7000);
		파이리.Info();
		
	}

}
