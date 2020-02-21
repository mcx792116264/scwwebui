package com.atguigu.scwsts.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScwAppUtils {
	public static boolean PhontMatches(String phone) {

        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if (phone.length() != 11) {
            System.out.println("手机号应为11位数");
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if (isMatch) {
                return true;
            } else {
                return false;
            }
        }
    }
}
