package com.developlee.readingnotes.chapter2.scopeDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @// TODO 2018/7/5-17:27
 * @description
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
