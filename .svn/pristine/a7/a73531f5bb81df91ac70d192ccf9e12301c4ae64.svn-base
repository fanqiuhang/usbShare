package com.edata.bridge.usbshare;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * 本机类，查询本机已打开的全部端口
 */
@Data
public class UsbshareNative {

    /**
     * 返回码。0，成功。1，失败
     */
    private int code;
    /**
     * 基本描述。描述内容为“成功”，或者失败原因
     */
    private String desc;
    /**
     * 终端总数
     */
    private int terminalNum;

    /**
     * 终端
     */
    private List<UsbshareTerminal> usbshareTerminals = new LinkedList<>();

    protected UsbshareNative(){
        this.code = 0;
        this.desc = "成功";
    }

    protected UsbshareNative(String error) {
        this.code = 1;
        this.desc = error;
    }

    /**
     * 增加终端
     * @param usbshareTerminal
     */
    protected void addTerminal(UsbshareTerminal usbshareTerminal) {
        usbshareTerminals.add(usbshareTerminal);
    }

    @Override
    public String toString() {
        return "UsbshareNative{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", totalNum=" + terminalNum +
                ", usbshareTerminals=" + usbshareTerminals +
                '}';
    }
}
