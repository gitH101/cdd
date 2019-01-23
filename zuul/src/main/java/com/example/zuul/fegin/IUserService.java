package com.example.zuul.fegin;

import com.example.zuul.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ace-admin",fallback = UserServiceFallback.class)
public interface IUserService {
}
