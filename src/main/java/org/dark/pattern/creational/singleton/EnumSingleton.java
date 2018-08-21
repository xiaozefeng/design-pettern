package org.dark.pattern.creational.singleton;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午5:35
 */
public enum EnumSingleton {

    INSTANCE{
        @Override
        protected void printTest() {
            System.out.println("enum print test");
        }
    };

    private Object data;

    protected abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
