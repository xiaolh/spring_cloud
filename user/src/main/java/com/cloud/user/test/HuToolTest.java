package com.cloud.user.test;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.ObjectUtil;
import com.cloud.user.bean.User;
import org.junit.Test;

/**
 * @author xiaolh
 * @date 2020/2/21
 */
public class HuToolTest {

    @Test
    public void testClone(){
        User user = new User();
        User userNew = ObjectUtil.clone(user);
        System.out.println(userNew == user);
    }

    @Test
    public void testConvert(){
        System.out.println(Convert.digitToChinese(1234567890));
    }

    @Test
    public void testDate(){
        System.out.println(new DateTime().toString());
        System.out.println(DateTime.now());
    }

}
