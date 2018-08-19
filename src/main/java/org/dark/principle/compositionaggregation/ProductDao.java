package org.dark.principle.compositionaggregation;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午5:45
 */
public class ProductDao {
    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "添加产品");
    }
}
