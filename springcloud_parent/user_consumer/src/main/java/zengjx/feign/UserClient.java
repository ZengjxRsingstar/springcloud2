package zengjx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import zengjx.domain.User;
import zengjx.feign.conf.FeignConfig;
import zengjx.feign.fallBack.UserClientFallBack;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/4  15:32
 * @Version V1.0
 */
@FeignClient(value = "user-provider",
      fallback = UserClientFallBack.class,
        configuration= FeignConfig.class  //配置feign   日誌級別
)
//@RequestMapping("user")
public interface UserClient {
 //@RequestMapping("/{id}")
@RequestMapping("/user/{id}")
 User findUserById(@PathVariable(value ="id") Integer  id);
}
