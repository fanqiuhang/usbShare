package com.edata.bridge.usbshare;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.regex.Pattern;

public class UsbshareSendSocketUtil {
    /**
     * 发送socket请求方法
     * @param ip
     * @param port
     * @param data
     * @return
     */
    protected static String sendSocket(String ip,int port,byte[] data) {
        Socket socket = null;
        OutputStream os = null;
        InputStream is = null;
        String error = "";
        try {
            socket = new Socket(ip,port);
            os = socket.getOutputStream();
            os.write(data);
            //读取结果
            is = socket.getInputStream();
            byte[] buffer = new byte[512];
            StringBuilder sb = new StringBuilder();
            int counter = 15; //用来表示15秒的等待
            for (int t = 0; t < counter; t++) {
                boolean trun = true;
                while ((is.read(buffer)) != -1) {
                    for (int i = 0; i <buffer.length; i++) {
                        sb.append(buffer[i]);
                        sb.append(",");
                    }
                    if (is.available() == 0) {
                        t = 15; //不要继续循环了
                        trun = false; //不需要等待1秒了
                        break;
                    }
                }
                if (trun) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        error += e.getMessage();
                    }
                }
            }

            String s = sb.toString();
            s = s.substring(0,s.length()-1);
            return s;
        } catch (IOException e) {
            error += e.getMessage();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    error += e.getMessage();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    error += e.getMessage();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    error += e.getMessage();
                }
            }
        }
        return "请求失败：" + error;
    }

    /**
     * 检查 id 的合法性
     * @return
     */
    protected static boolean checkId(String id) {
        return id != null && id.length() == 12 && Pattern.compile("[0-9]{12}").matcher(id).matches();
    }

    /**
     * 封装发起请求的数据
     * @param dataLong
     * @param command
     * @param id
     * @param usbPort
     * @return
     */
    protected static byte[] packageData(int dataLong, int command, String id, int usbPort) {
        byte[] data = new byte[dataLong + 4];
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        data[3] = (byte) dataLong;
        data[4] = (byte) command;
        data[17] = 0;
        data[18] = 0;
        data[19] = 0;
        data[20] = (byte) usbPort;
        for (int i = 5; i < 17 ; i++) {
            char s = id.charAt(i-5);
            data[i] = (byte) s;
        }
        return data;
    }
}
