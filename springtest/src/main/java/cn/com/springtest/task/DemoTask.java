package cn.com.springtest.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

/**
 * @author yanwc
 * @date 2020/5/29 19:41
 */
public class DemoTask {


    private FlagContext flagContext;

    public FlagContext getFlagContext() {
        return flagContext;
    }

    public void setFlagContext(FlagContext flagContext) {
        this.flagContext = flagContext;
    }

    @Async
    public void run(){
        while (!flagContext.isFlag()){
            try {
                System.out.println("批量还没有跑完，等待3秒之后轮训");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("flag已设置好" + flagContext.isFlag());
    }
}
