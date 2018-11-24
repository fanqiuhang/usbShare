package com.edata.bridge.usbshare;

import lombok.Data;

@Data
public class UsbsharePortDetail extends UsbsharePortBasic {

    /**
     * 返回码。0，成功。1，失败
     */
    private int code;
    /**
     * 基本描述。描述内容为“成功”，或者失败原因
     */
    private String desc;

    /**
     * 端口是否有设备
     */
    protected String existDevice;

    /**
     * 端口使用情况
     */
    protected String useStatus;

    /**
     * 使用者IP
     */
    protected String userIP;

    /**
     * 使用者中间件GUID
     */
    protected String userGUID;

    protected UsbsharePortDetail() {
        this.code = 0;
        this.desc = "成功";
    }

    protected UsbsharePortDetail(String error) {
        this.code = 1;
        this.desc = error;
    }

    @Override
    public String toString() {
        return "UsbsharePortDetail{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", existDevice='" + existDevice + '\'' +
                ", useStatus='" + useStatus + '\'' +
                ", userIP='" + userIP + '\'' +
                ", userGUID='" + userGUID + '\'' +
                ", busid='" + busid + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceProtocolType='" + deviceProtocolType + '\'' +
                ", devicePID='" + devicePID + '\'' +
                ", deviceVID='" + deviceVID + '\'' +
                ", supportedNumber='" + supportedNumber + '\'' +
                ", deviceName='" + deviceName + '\'' +
                '}';
    }
}
