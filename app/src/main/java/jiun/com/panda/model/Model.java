package jiun.com.panda.model;

import android.os.SystemClock;

/**
 * Created by Administrator on 2017/9/13.
 */

public class Model implements IGetUser {

    @Override
    public void getRequest(final IModelUser iModelUser) {
        if (1==1){
new Thread(new Runnable() {
    @Override
    public void run() {
        SystemClock.sleep(2000);
        iModelUser.succed("Prefect");
    }
}).start();
        }else {
            iModelUser.failed("GameOver");
        }
    }
}
