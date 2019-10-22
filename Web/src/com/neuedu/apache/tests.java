package com.neuedu.apache;

import java.text.DecimalFormat;

public class tests {
    public static void main(String[] args) {
        float  a = 121231233.123f;
        String s = format(a);
        System.out.println(s);
    }
    public static String format(float data) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(data);
    }
}
