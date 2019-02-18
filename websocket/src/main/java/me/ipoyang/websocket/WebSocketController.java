package me.ipoyang.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: WebSocketController
 * @description:
 * @author: zhuhy5
 * @create: 2018-12-06 16:49
 **/
@Controller
public class WebSocketController {
    @MessageMapping("/h")
    @SendTo("/topic/hello")
    public String hello(String name){
        return "hello "+ name+"，哈哈哈！";
    }
}
