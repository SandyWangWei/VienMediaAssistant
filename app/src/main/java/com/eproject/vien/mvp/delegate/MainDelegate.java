package com.eproject.vien.mvp.delegate;

import android.util.Log;
import android.view.TextureView;

import com.eproject.vien.vienmediaassistant.R;

import butterknife.BindView;


/**
 * Created by Administrator on 2018/7/8/008.
 */

public class MainDelegate extends AppDelegate {

    /** 播放的surface载体 */
    @BindView(R.id.player_view)TextureView mPlayerVIew;

    @Override
    public int getRootLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initWidget() {



    }
}
