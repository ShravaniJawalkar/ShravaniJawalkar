package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import net.sf.ehcache.config.CacheConfiguration;

@Configuration
@EnableCaching
public class ApiConfig extends CachingConfigurerSupport {

//	@Bean
//	public ApiConfig getBean() {
//		return new ApiConfig();
//	}

	public net.sf.ehcache.CacheManager ehCacheManager() {
		CacheConfiguration tenSecond = new CacheConfiguration();
		tenSecond.setName("ten-second-cache");
		tenSecond.setMemoryStoreEvictionPolicy("LRU");
		tenSecond.setMaxEntriesLocalHeap(1000);
		tenSecond.setTimeToLiveSeconds(10);

		CacheConfiguration tweentySecond = new CacheConfiguration();
		tweentySecond.setName("twenty-second-cache");
		tweentySecond.setMemoryStoreEvictionPolicy("LRU");
		tweentySecond.setMaxEntriesLocalHeap(2000);
		tweentySecond.setTimeToLiveSeconds(20);

		net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
		config.addCache(tweentySecond);
		config.addCache(tenSecond);

		return net.sf.ehcache.CacheManager.newInstance(config);

	}

	@Bean
	@Override
	public CacheManager cacheManager() {
		return new EhCacheCacheManager(ehCacheManager());
	}
}
