package tk.mybatis.springboot.mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.springboot.Application;
import tk.mybatis.springboot.model.City2;
import tk.mybatis.springboot.model.UserInfo;

import java.util.List;

/**
 * Author: yepei.yp@alibaba-inc.com
 * Date: 2017/11/9
 * Time: 下午5:16
 * ------------------------------------
 * Desc: 未声明mapper xml文件的DAO接口也是可以的
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@SpringBootTest(classes = Application.class)
public class UserInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testSelectAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        System.out.println(userInfos);
    }
}