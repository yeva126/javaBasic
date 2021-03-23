package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        //绑定到65000端口
        ServerSocket ss = new ServerSocket(65000);
        while (true){
            //监听65000端口，直到客户端返回连接信息
            Socket socket = ss.accept();

            new UpperCase(socket).start();
        }
    }
}
