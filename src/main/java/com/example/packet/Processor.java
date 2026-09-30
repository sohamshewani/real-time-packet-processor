package com.example.packet;

import com.example.packet.Packet;
import com.example.packet.NetworkInterface;

public class Processor {
    public static void main(String[] args) {
        NetworkInterface networkInterface = new NetworkInterface();
        while (true) {
            Packet packet = networkInterface.receivePacket();
            processPacket(packet);
        }
    }

    private static void processPacket(Packet packet) {
        // Process packet logic
    }
}