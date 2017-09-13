package jiun.com.panda.presenter;

import jiun.com.panda.model.IGetUser;
import jiun.com.panda.model.IModelUser;
import jiun.com.panda.model.Model;
import jiun.com.panda.view.IView;

/**
 * Created by Administrator on 2017/9/13.
 */

public class MPresenter {
    private IView iView;
    private IGetUser getUser;
    public MPresenter(IView iView){
        this.iView = iView;
        getUser=new Model();
    }
    public void getData(){
        iView.showLoading();
        getUser.getRequest(new IModelUser() {
            @Override
            public void succed(String s) {
                iView.dismisLoading();
                iView.toSucced(s);
            }

            @Override
            public void failed(String f) {
                iView.dismisLoading();
                iView.toFail(f);

            }
        });
    }
}

