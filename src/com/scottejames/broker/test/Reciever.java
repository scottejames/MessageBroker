package com.scottejames.broker.test;

import java.util.List;

import com.scottejames.broker.IReciever;

public class Reciever implements IReciever<Message>
{

	@Override
	public void received(List<Message> events)
	{
		for (Message m: events)
		{
			System.out.println("Received event " + m);
		}
	}

}
