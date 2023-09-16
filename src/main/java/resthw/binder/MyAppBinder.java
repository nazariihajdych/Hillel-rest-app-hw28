package resthw.binder;

import jakarta.inject.Singleton;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import resthw.services.OrderService;
import resthw.services.OrderServiceDefault;

public class MyAppBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(OrderServiceDefault.class)
                .to(OrderService.class)
                .in(Singleton.class);
    }
}
