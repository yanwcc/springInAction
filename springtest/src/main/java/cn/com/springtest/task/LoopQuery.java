package cn.com.springtest.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;


/**
 * @author yanwc
 * @date 2020/5/29 19:48
 */
public class LoopQuery {
    public FlagContext getFlagContext() {
        return flagContext;
    }

    public void setFlagContext(FlagContext flagContext) {
        this.flagContext = flagContext;
    }

    private FlagContext flagContext;

    private int count = 0;

    public void init(){
        while (!flagContext.isFlag()){
            try {
                System.out.println("批量还没有跑完，等待3秒之后轮训");
                count++;
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("轮询结束，flag为" + flagContext.isFlag());
    }
}
