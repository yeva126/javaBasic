package com.company;

import java.io.*;
import java.net.Socket;

public class UpperCase extends Thread{
    private Socket socket;
    private static final int PROTECTED_LENGTH = 51200; //输入保护 50KB

    public UpperCase(Socket socket) {
        this.socket = socket;
    }

    /*@Override
    public void run() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int readSize = 0;
        int totalSize = 0;
        byte[] buff = new byte[2048];
        try{
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            while ((readSize = in.read(buff)) > 0){
                totalSize += readSize;
                if (totalSize > PROTECTED_LENGTH){
                    throw new Exception("超出50KB");
                }
                outputStream.write(buff, 0, readSize);
            }
            in.close();
            out.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/

    @Override
    public void run() {
        try{
            //获取socket输入输出流
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            int ch = 0;
            byte[] buff = new byte[1024];
            ch = in.read(buff);
            String content = new String(buff, 0, ch);
            System.out.println(content);

            //往输出流里写入获得的字符串长度返回给客户端
            out.write(String.valueOf(content.length()).getBytes());
            in.close();
            out.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
