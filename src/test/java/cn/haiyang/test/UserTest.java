package cn.haiyang.test;

import cn.haiyang.domain.User;
import org.junit.Test;

/**
 * @author 杨海洋 2021/3/29 11:00
 */
public class UserTest {

    @Test
    public void test(){
        User user=new User();
        user.setId(123);
        System.out.println(user.getId() );
    }
}
