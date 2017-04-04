package discount_calculation;

public class Main {

	public static void main(String[] args) {

		PaymentTerminal terminal = new PaymentTerminal(); //создание экземпл€ра класса PaymentTerminal
		terminal.printItemsList(); //вывод списка возможных предметов
		
		Customer c = new Customer(); //создание экземпл€ра класса Customer	
		
		terminal.calcTotal(terminal.getPrice(c.chooseItem()), c.setNumber()); //расчет итоговой цены		
	}

}
