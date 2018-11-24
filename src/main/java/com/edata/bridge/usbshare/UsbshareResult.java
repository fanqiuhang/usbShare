package com.edata.bridge.usbshare;

import lombok.Data;

@Data
public class UsbshareResult {
    /**
     * 返回码。0，成功。1，失败
     */
    private int code;
    /**
     * 基本描述。描述内容为“成功”，或者失败原因
     */
    private String desc;

    protected UsbshareResult() {
        this.code = 0;
        this.desc = "成功";
    }

    protected UsbshareResult(String error){
        this.code = 1;
        this.desc = error;
    }

}
