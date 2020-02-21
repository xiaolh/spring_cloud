package com.cloud.user.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xiaolh
 * @date 2020/2/21
 */
@Data
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private Integer age;
}
