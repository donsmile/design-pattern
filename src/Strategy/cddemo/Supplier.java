package Strategy.cddemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Supplier
 * @Description
 * @Author dd
 * @Date 2020/6/1 14:41
 * @Version 1.0
 **/
public class Supplier {
    private static Map<String, SupplierService> supplierMap = new HashMap<>();

    public SupplierService getSupplier(String className) {
        //加载对象
        //使用spring框架时，采用spring map注入
        SupplierService bss = supplierMap.get(className);
        try {
            if (bss == null) {
                Class<?> cla = Class.forName(className);
                bss = (SupplierService) cla.newInstance();
                supplierMap.put(className, bss);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bss;
    }

}
