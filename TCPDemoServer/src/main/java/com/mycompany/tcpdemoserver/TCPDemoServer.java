/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tcpdemoserver;

import com.mycompany.tcpdemoserver.networklayer.TCPServer;

/**
 *
 * @author USER
 */
public class TCPDemoServer {

    public static void main(String[] args) {
        TCPServer server = new TCPServer(9090);
        server.start();
       
    }
}
