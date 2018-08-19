package org.dark.principle.compositionaggregation;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午5:44
 */
public class OracleConnection implements DBConnection {
    @Override
    public String getConnection() {
        return "Oracle 数据库连接";
    }
}
