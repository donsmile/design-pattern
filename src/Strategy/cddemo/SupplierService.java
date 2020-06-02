package Strategy.cddemo;

import java.util.Map;

public interface SupplierService {
    Object paramInit(Map<String,Object> map);
    OrderStatus syncOrder(Object obj);
}
