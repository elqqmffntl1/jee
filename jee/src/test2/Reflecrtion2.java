package test2;

import bank.AccountBean;;

public class Reflecrtion2 {
	public static void main(String[] args) {
		try {
			AccountBean acc = (AccountBean) Class.forName("bank.AccountBean").newInstance();
			acc.setAccountNo();
			acc.setId("z지존상호z");
			acc.setMoney(1000);
			acc.setName("한상호");
			acc.setPw("1");
			System.out.println(acc.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
