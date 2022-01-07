package com.flong.springboot.abstractFactory.protogenesis;

public interface CacheService {


     String get(String key, int redisType);

     void set(String key, String value, int redisType);
}
