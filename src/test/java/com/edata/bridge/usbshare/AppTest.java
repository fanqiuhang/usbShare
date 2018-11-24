package com.edata.bridge.usbshare;

import com.edata.bridge.usbshare.Usbshare;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void get(){
        System.out.println(Usbshare.getAccess("068032005464",2));

    }


    @Test
    public void free() {
        System.out.println(Usbshare.freeAccess("068032005464",2));

    }

    @Test
    public void detail() {
        System.out.println(Usbshare.queryPortDetail("068032005464",4));

    }

    @Test
    public void all() {
        System.out.println(Usbshare.queryAllPortDetails());

    }
}
