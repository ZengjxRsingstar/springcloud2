package zengjx.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/5  12:20
 * @Version V1.0
 */
@Component
public class LoginGlobalFilter     implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        String  token =exchange.getRequest().getQueryParams().getFirst("token");
        if(StringUtils.isEmpty(token)){
            //设置返回状态码
            boolean statusCode = exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);

            System.out.println("statusCode"+statusCode);

            return exchange.getResponse().setComplete();
        }
        System.out.println("succ");
        return  chain.filter(exchange);

    }

    @Override
    public int getOrder() {
        return 0;
    }
}
