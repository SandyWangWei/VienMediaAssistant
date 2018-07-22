package com.eproject.vien.vienmediaassistant;

import com.eproject.vien.mvp.delegate.MainDelegate;
import com.eproject.vien.mvp.presenter.ActivityPresenter;

public class MainActivity extends ActivityPresenter {

    @Override
    protected Class getDelegateClass() {
        return MainDelegate.class;
    }

}
