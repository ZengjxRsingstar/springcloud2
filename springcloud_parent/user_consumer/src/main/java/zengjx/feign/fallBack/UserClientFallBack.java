package zengjx.feign.fallBack;

import org.springframework.stereotype.Component;
import zengjx.domain.User;
import zengjx.feign.UserClient;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/4  16:47
 * @Version V1.0
 */
@Component
public class UserClientFallBack implements UserClient   {

//    public User findUserById(Integer id) {
//        User   user=new User();
//        user.setName("FallBack  服务降级");
//        return user;
//    }
    /**
     * 服务降级实现
     * @param id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setUsername("Fallback，Feign服务降级。。。");
        return user;
    }



}
