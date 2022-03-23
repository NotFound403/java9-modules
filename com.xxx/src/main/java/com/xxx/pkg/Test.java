package com.xxx.pkg;

import cn.felord.pkg.MyPkg;
import cn.felord.util.Utils;

public class Test {
    public static void main(String[] args) {
        MyPkg myPkg = new MyPkg();
        // 静态会报错
        myPkg.log();
        // 可以导入Utils
        Utils utils = new Utils();
        utils.bar();
    }
}
