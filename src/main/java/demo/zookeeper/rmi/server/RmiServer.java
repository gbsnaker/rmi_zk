package demo.zookeeper.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
	public static void main(String[] args) throws Exception {
        int port = 1099;
        String url = "rmi://localhost:1099/demo.zookeeper.rmi.server.HelloServiceImpl";
        // JNDI 中创建注册表
        LocateRegistry.createRegistry(port);
        // unbind() 与 bind() 
        Naming.rebind(url, new HelloServiceImpl());
    }
}
