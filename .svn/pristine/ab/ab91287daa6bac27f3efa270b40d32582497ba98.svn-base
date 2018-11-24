package com.edata.bridge.usbshare;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * 终端类，list 中是该终端下的端口
 */
@Data
public class UsbshareTerminal {

    /**
     * 终端ID
     */
    private String id;

    /**
     * 获取过的usb设备数
     */
    private int usbNum;

    /**
     * 设备
     */
    private List<UsbshareDevice> usbshareDevices = new LinkedList<>();

    /**
     * 增加一个设备
     * @param usbshareDevice
     */
    protected void addDevice(UsbshareDevice usbshareDevice){
        usbshareDevices.add(usbshareDevice);
    }

    @Override
    public String toString() {
        return "UsbshareTerminal{" +
                "id='" + id + '\'' +
                ", usbNum=" + usbNum +
                ", usbshareDevices=" + usbshareDevices +
                '}';
    }
}
