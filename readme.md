Creating a Simple Spring Boot @Cacheable Cache using JBoss DataGrid on top of Openshift
===
## Purpose
A simple proof of concept of how caching works out of the box using JBoss DataGrid (JDG), and how to integrate it to Spring Boot seamlessly.

Just add a cache with a specific name on your JBoss Datagrid YAML file,
```aidl
    - name: CACHE_NAMES
      value: 'jeje,jjongjong,bakerooo,default'
```

Point your cache provider to JBoss Datagrid HotRod route url
```aidl
    @Bean
    public RemoteCacheManager remoteCacheManager() {
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.addServers("jdg-datagrid-app-01-hotrod:11333");
        return new RemoteCacheManager(builder.build());
    }
```

And call it on your java code using @Cacheable annotation.
```aidl
    @GetMapping("/")
    @Cacheable("bakerooo")
    public Long getNow() {
        return System.currentTimeMillis();
    }
```