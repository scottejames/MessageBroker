package com.scottejames.broker.test;

import com.scottejames.broker.MultiDispatcher;

public class TestHarness
{

	public static void main(String [] args)
	{
		MultiDispatcher<Message> disp = new MultiDispatcher<Message>();
		disp.addReciever(new Reciever());
		disp.push(new Message("One"));
		disp.push(new Message("One"));
		disp.push(new Message("One"));
		
	}
}
