package br.com.java.enumeracoes_composicao;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 
 * @author dionatan
 *
 */

public class OrderTest {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = new Date();
		String date = sdf.format(d);

		Order order = new Order(1080, date, OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
