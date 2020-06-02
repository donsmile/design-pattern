package Strategy.cddemo;

import java.util.Map;

/**
 * @ClassName ASupplierServiceImpl
 * @Description
 * @Author dd
 * @Date 2020/6/1 10:07
 * @Version 1.0
 **/
public class ASupplierServiceImpl implements SupplierService {
    @Override
    public AVO paramInit(Map<String,Object> map) {
        //可以采用第三方jar的自带方法
        AVO avo = new AVO();
        avo.setOrderid(map.get("orderid").toString());
        return avo;
    }

    @Override
    public OrderStatus syncOrder(Object obj) {
        AVO avo = (AVO) obj;
        System.out.println("A后向订购,name="+avo.getOrderid());
        return OrderStatus.success;
    }


}
