package com.edw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;

/**
 * @author Muhammad Edwin < emuhamma at redhat dot com >
 * @created 20 August 2019 19:28
 *
 * <pre>
 *
 * </pre>
 */
@Configuration
public class CacheConfig {

    @Bean
    public RemoteCacheManager remoteCacheManager() {
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.addServers("jdg-datagrid-app-01-hotrod:11333");
        return new RemoteCacheManager(builder.build());
    }

}
