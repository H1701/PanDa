package jiun.com.panda.view;

/**
 * Created by Administrator on 2017/9/13.
 */

public interface IView {
    void showLoading();
    void dismisLoading();

    void toSucced(String s);
    void toFail(String f);
}
