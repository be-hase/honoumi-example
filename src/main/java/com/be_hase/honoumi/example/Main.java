package com.be_hase.honoumi.example;

import com.be_hase.honoumi.netty.server.MonitoringServer;
import com.be_hase.honoumi.netty.server.Server;
import com.be_hase.honoumi.routing.Router;

public class Main {
	public static void main(String[] args) {
		Router router = new Router();
		router.GET().route("/blog/{id}").with(Controller.class, "show");
		
		Server server = Server.create("main", router);
		
		MonitoringServer monitoringServer = MonitoringServer.create(server);
		
		server.start();
		monitoringServer.start();
	}
}
