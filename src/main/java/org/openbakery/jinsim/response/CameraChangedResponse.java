package org.openbakery.jinsim.response;

import org.openbakery.jinsim.PacketType;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class CameraChangedResponse extends PlayerResponse {

	private byte camera;

	public CameraChangedResponse() {
		super(PacketType.CAMERA_CHANGED);
	}

	@Override
	public void construct(ByteBuffer buffer) throws BufferUnderflowException {
		super.construct(buffer);
		camera = buffer.get();
		buffer.position(buffer.position() + 3);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public byte getCamera() {
		return camera;
	}

}
