package Strategy.cddemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author dd
 * @Date 2020/6/1 10:02
 * @Version 1.0
 **/
public class OrderServiceImpl {
    public void syncOrder() {
        //数据库配置
        String className = "Strategy.cddemo.ASupplierServiceImpl";
        //String className = "Strategy.cddemo.BSupplierServiceImpl";
       //加载bean
        SupplierService bss = new Supplier().getSupplier(className);

        //业务代码
        //TODO 更新支付状态

        //TODO 查询产品、商品等信息，形成map总集合，提供给供应商使用
        Map <String,Object> allMap = new HashMap<>();
        allMap.put("orderid","123456");
        allMap.put("productid","10000");

        Object a = bss.paramInit(allMap);

        OrderStatus os = bss.syncOrder(a);
        //TODO 更新订单状态


    }



}
