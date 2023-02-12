package hello.advanced.app.V1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV1 {

    private final OrderRepositoryV1 orderRepositoryV1;

    public void orederItem(String itemID){
        orderRepositoryV1.save(itemID);
    }
}
