package com.edw.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Muhammad Edwin < emuhamma at redhat dot com >
 * @created 20 August 2019 19:18
 *
 * <pre>
 *
 * </pre>
 */
@RestController
public class IndexController {

    @GetMapping("/")
    @Cacheable("bakerooo")
    public Long getNow() {
        return System.currentTimeMillis();
    }
}
