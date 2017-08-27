package com.zxy.h5down;

import android.app.Activity;
import android.preference.PreferenceManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.Toast;

/**
 * Created by zuoxiangyu on 2017/8/21.
 */

class MyWebViewDownLoadListener implements DownloadListener {
    private Activity mActivity;
    MyWebViewDownLoadListener(Activity activity){
        mActivity = activity;
    }
    @Override
    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
        Toast.makeText(mActivity,"onDownloadStart ++++++++++++++",Toast.LENGTH_SHORT).show();
        String fileName = URLUtil.guessFileName(url, contentDisposition, mimetype);
        new DownloadTask(mActivity).execute(url,fileName);
        System.out.println("zuoxiangyu  url == "+url);
    }

}
