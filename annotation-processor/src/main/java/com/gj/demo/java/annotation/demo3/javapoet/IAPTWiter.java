package com.gj.demo.java.annotation.demo3.javapoet;

import javax.annotation.processing.Filer;

/**
 * Created by guanjian on 17-7-12.
 * <p>
 * 文件写入接口
 */

public interface IAPTWiter {

    void write(Filer filer);
}
