package com.example.packet;

public class NetworkInterface {
    public Packet receivePacket() {
        // Simulate packet reception
        byte[] data = new byte[1024];
        return new Packet(data);
    }
}