package com.neuedu.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GuavaCache {

    public static LoadingCache<String ,String> cache = CacheBuilder.newBuilder().initialCapacity(1000)
            .maximumSize(1000).expireAfterAccess(1, TimeUnit.DAYS).build(
                    new CacheLoader<String, String>() {
                        @Override
                        public String load(String key) throws Exception {
                            return "null";
                        }
                    }
            );
    public static void putcache(String key,String value){
            cache.put(key,value);
    }
    public static String Getcache(String key){
        String s = null;
        try {
            s = cache.get(key);
            if ("null".equals(s)){
                return null;
            }
            return s;
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return s;
    }
}
