//package com.example.arms.mvp.presenter;
//
//import android.app.Application;
//
//import com.jess.armslibrary.integration.AppManager;
//import com.jess.armslibrary.di.scope.ActivityScope;
//import com.jess.armslibrary.mvp.BasePresenter;
//import com.jess.armslibrary.http.imageloader.ImageLoader;
//
//import me.jessyan.rxerrorhandler.core.RxErrorHandler;
//
//import javax.inject.Inject;
//
//import com.example.arms.mvp.contract.armsContract;
//
//
///**
// * ================================================
// * Description:
// * <p>
// * Created by MVPArmsTemplate on 02/24/2021 10:27
// * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
// * <a href="https://github.com/JessYanCoding">Follow me</a>
// * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
// * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
// * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
// * ================================================
// */
//@ActivityScope
//public class armsPresenter extends BasePresenter<armsContract.Model, armsContract.View> {
//    @Inject
//    RxErrorHandler mErrorHandler;
//    @Inject
//    Application mApplication;
//    @Inject
//    ImageLoader mImageLoader;
//    @Inject
//    AppManager mAppManager;
//
//    @Inject
//    public armsPresenter(armsContract.Model model, armsContract.View rootView) {
//        super(model, rootView);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        this.mErrorHandler = null;
//        this.mAppManager = null;
//        this.mImageLoader = null;
//        this.mApplication = null;
//    }
//}
