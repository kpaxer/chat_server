package com.kingston.service.login;

import io.netty.buffer.ByteBuf;

import com.kingston.net.Packet;
import com.kingston.net.PacketType;

public class ClientHeartBeat extends Packet{

	@Override
	public void writePacketBody(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readPacketBody(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PacketType getPacketType() {
		return PacketType.ClientHeartBeat;
	}

	@Override
	public void execPacket() {
		
	}

}
