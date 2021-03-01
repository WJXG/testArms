package com.example.arms.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.example.arms.di.module.armsModule;
import com.example.arms.mvp.contract.armsContract;

import com.jess.arms.di.scope.ActivityScope;
import com.example.arms.mvp.ui.activity.armsActivity;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 02/24/2021 10:27
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = armsModule.class, dependencies = AppComponent.class)
public interface armsComponent {
    void inject(armsActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        armsComponent.Builder view(armsContract.View view);

        armsComponent.Builder appComponent(AppComponent appComponent);

        armsComponent build();
    }
}