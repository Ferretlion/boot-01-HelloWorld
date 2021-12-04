package com.atguigu.boot.bean;

import jdk.jfr.DataAmount;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Ferretlion
 * @version jdk1.11
 * @description:
 * @E-mail 1023744469@qq.com
 * @create 2021-11-20-16:59
 */
@Slf4j
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Car
{
    private String brand;
}
