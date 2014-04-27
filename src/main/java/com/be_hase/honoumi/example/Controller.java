package com.be_hase.honoumi.example;

import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

import com.be_hase.honoumi.controller.Response;
import com.be_hase.honoumi.controller.argument.PathParam;

public class Controller {
	
	public void show(
			MessageEvent evt,
			@PathParam("id") String id
			) {
		Response.execute(evt, HttpResponseStatus.OK, null, id);
	}
}
