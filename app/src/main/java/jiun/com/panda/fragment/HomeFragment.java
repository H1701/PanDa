package jiun.com.panda.fragment;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import jiun.com.panda.R;
import jiun.com.panda.presenter.MPresenter;
import jiun.com.panda.view.IView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements IView {
private ProgressDialog pd;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        pd=new ProgressDialog(getActivity());
        MPresenter mPresenter=new MPresenter(this);
        mPresenter.getData();;
        return  view;

    }
    @Override
    public void showLoading() {
pd.show();
    }

    @Override
    public void dismisLoading() {
pd.dismiss();
    }

    @Override
    public void toSucced(final String s) {
getActivity().runOnUiThread(new Runnable() {
    @Override
    public void run() {
        Toast.makeText(getActivity(), ""+s, Toast.LENGTH_SHORT).show();
    }
});
    }

    @Override
    public void toFail(final String f) {
getActivity().runOnUiThread(new Runnable() {
    @Override
    public void run() {
        Toast.makeText(getActivity(), ""+f, Toast.LENGTH_SHORT).show();
    }
});
    }
}
