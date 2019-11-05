package zengjx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zengjx.domain.User;
import zengjx.feign.UserClient;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/4  16:08
 * @Version V1.0
 */

@RestController
@RequestMapping("feign")
public class ConsumerFeignController {
    @Autowired
    private UserClient  userClient;
    @RequestMapping("{id}")
    public User findUserById(@PathVariable(value ="id") Integer  id){
        System.out.println("ConsumerFeignController.......");
      return userClient.findUserById(id);

    }
}
