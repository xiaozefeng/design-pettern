package org.dark.principle.compositionaggregation;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午5:45
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao(new MySqlConneciton());
        productDao.addProduct();

        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}
