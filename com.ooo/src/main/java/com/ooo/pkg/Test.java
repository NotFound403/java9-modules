package com.ooo.pkg;
import cn.felord.pkg.MyPkg;
//import cn.felord.util.Utils;

public class Test {
    public static void main(String[] args) {
        MyPkg myPkg = new MyPkg();
        myPkg.log();
        // 没开放给该包导不进来
//        Utils utils = new Utils();
//        utils.bar();
    }
}
