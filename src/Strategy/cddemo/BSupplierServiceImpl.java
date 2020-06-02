package Strategy.cddemo;

import java.util.Map;

/**
 * @ClassName BSupplierServiceImpl
 * @Description
 * @Author dd
 * @Date 2020/6/1 10:33
 * @Version 1.0
 **/
public class BSupplierServiceImpl implements SupplierService {
    @Override
    public Object paramInit(Map<String, Object> map) {
        BVO bvo = new BVO();
        bvo.setProductid((String) map.get("productid"));
        return bvo;
    }

    @Override
    public OrderStatus syncOrder(Object obj) {
        BVO bvo = (BVO) obj;
        System.out.println("B同步订购,productid=" + bvo.getProductid());
        return OrderStatus.fail;
    }


}
