package demo.zookeeper.rmi.client;

import demo.zookeeper.rmi.common.IHelloService;

public class Client {
	public static void main(String[] args) throws Exception {
		ServiceConsumer consumer = new ServiceConsumer();

		while (true) {
			IHelloService helloService = consumer.lookup();
			String result = helloService.sayHello("Jack");
			System.out.println(result);
			Thread.sleep(3000);
		}
	}
}
