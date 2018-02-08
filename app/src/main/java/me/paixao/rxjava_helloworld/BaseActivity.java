package me.paixao.rxjava_helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.reactivex.disposables.CompositeDisposable;

public class BaseActivity<A extends BaseActivity> extends AppCompatActivity {

    protected static String TAG;

    protected A _this;

    protected final CompositeDisposable disposables = new CompositeDisposable();

    public BaseActivity() {
        _this = (A) this;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getLocalClassName();
    }


    @Override protected void onDestroy() {
        super.onDestroy();
        disposables.clear();
    }
}
