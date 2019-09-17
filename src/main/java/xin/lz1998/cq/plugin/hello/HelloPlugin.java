package xin.lz1998.cq.plugin.hello;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import xin.lz1998.cq.event.message.CQPrivateMessageEvent;
import xin.lz1998.cq.robot.CQPlugin;
import xin.lz1998.cq.robot.CoolQ;

// TODO 多个插件应该如何设计，不同插件使用不同数据库
@Component
@Order(1)//插件执行顺序
public class HelloPlugin extends CQPlugin {
    @Override
    public int onPrivateMessage(CoolQ cq, CQPrivateMessageEvent event) {
        cq.sendPrivateMsg(event.getUserId(),"hello",false);
        return MESSAGE_IGNORE;
    }

}
