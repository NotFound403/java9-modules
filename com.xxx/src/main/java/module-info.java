module com.xxx {
    requires com.ooo;
    // 移除pom 依赖编译不了
    requires static cn.felord;
    uses com.ooo.pkg.Read;
}