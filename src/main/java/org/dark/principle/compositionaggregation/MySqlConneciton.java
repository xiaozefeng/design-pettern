package org.dark.principle.compositionaggregation;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午5:44
 */
public class MySqlConneciton implements DBConnection {
    @Override
    public String getConnection() {
        return "MySql数据库连接";
    }
}
