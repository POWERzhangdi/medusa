package com.medusa.order.web.serivce;

import com.medusa.order.web.fallback.ApiFeignFallBack;
import com.medusa.order.api.server.ApiUserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "order-server",fallback = ApiFeignFallBack.class)
public interface ApiFeignUserService extends ApiUserService {

}
