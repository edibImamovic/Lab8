
public class zadatakPrvi {
	public static void main(String[] args) {
		
		System.out.println("Unesite vrijeme");
		double vrijeme = TextIO.getDouble();
		System.out.println("Uneseno vrijeme je : " + vrijeme);
		double razdaljina = (0.5)*(9)*9.81*(vrijeme*vrijeme);
		
		if (razdaljina > 0){
			System.out.printf("Razdaljina je:%f centimentra ", razdaljina );
		} 
		else {
			System.out.println("Podatak nije validan");
		}

}
}
