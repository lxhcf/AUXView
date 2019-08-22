package com.example.auxviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.List;

import chihane.jdaddressselector.AddressProvider;
import chihane.jdaddressselector.AddressSelector;
import chihane.jdaddressselector.BottomDialog;
import chihane.jdaddressselector.OnAddressSelectedListener;
import chihane.jdaddressselector.model.City;
import chihane.jdaddressselector.model.County;
import chihane.jdaddressselector.model.Province;
import chihane.jdaddressselector.model.Street;
import mlxy.utils.T;

public class WifiConnection extends AppCompatActivity implements OnAddressSelectedListener {
//    private PopupWindow popupWindow;
//    private WindowManager.LayoutParams params;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_connection);

        Button btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WifiConnection.this, InstallLoaction.class);
                startActivity(intent);
            }
        });


//        if (NavUtils.getParentActivityName(this) != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);    //显示向左的箭头图标
//        }
//
//        params = getWindow().getAttributes();

        /**
         * JD8.13
         * 原始弹出
         */
//        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
//
//        AddressSelector selector = new AddressSelector(this);
//        selector.setOnAddressSelectedListener(this);
////        selector.setAddressProvider(new TestAddressProvider());
//
//        assert frameLayout != null;
//        frameLayout.addView(selector.getView());

//        /**
//         * 自定义数据源
//         */
//        AddressSelector selector = new AddressSelector(this);
////        selector.setOnAddressSelectedListener(new AddressProvider() {
////            @Override
////            public void provideProvinces(AddressReceiver<Province> addressReceiver) {
//////                List<Province> provinces = addressApi.provincesFromDatabase();
////                List<Province> provinces = new ArrayList<>();
////                Province province=new Province();
////                province.id=1;
////                province.name="河南";
////                provinces.add(province);
////
////                addressReceiver.send(provinces);
////            }
////
////            @Override
////            public void provideCitiesWith(int provinceId, AddressReceiver<City> addressReceiver) {
//////                new Thread(() -> {
////////                    List<City> cities = addressApi.citiesSync(provinceId);
////////                    List<City> cities =new ArrayList<>();
////////                    City city=new City();
////////                    city.id=1;
////////                    city.name="焦作";
////////                    cities.add(city);
//////
//////                    addressReceiver.send(cities);
//////                }).start();
//////                super;
////            }
////
////            @Override
////            public void provideCountiesWith(int cityId, AddressReceiver<County> addressReceiver) {
//////                addressApi.counties(cityId)
//////                        .subscribeOn(Schedulers.io())
//////                        .subscribe(
//////                                counties -> addressReceiver.send(counties),
//////                                throwable -> addressReceiver.send(null)
//////                        );
////            }
////
////            @Override
////            public void provideStreetsWith(int countyId, AddressReceiver<Street> addressReceiver) {
////                // blahblahblah
////            }
////        });
//
//        /**
//         * 按键弹出
//         */
//        Button buttonBottomDialog = (Button) findViewById(R.id.buttonBottomDialog);
//
//         //assert用来检测布尔表达式,如果为false说明程序处于不正常的状态下
////        assert buttonBottomDialog != null;
//        buttonBottomDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                BottomDialog.show(MainActivity.this, MainActivity.this);
//                BottomDialog dialog = new BottomDialog(WifiConnection.this);
//                dialog.setOnAddressSelectedListener(WifiConnection.this);
//                dialog.show();
//            }
//        });

    }

    private boolean mIsShowing = false;

//    public void popup(View view){
//        if(popupWindow == null){
//            initPopup();
//        }
//        if(!mIsShowing){
//            params.alpha= 0.3f;
//            getWindow().setAttributes(params);
//            popupWindow.showAtLocation(findViewById(R.id.layout_main),Gravity.BOTTOM,0,0);
//            mIsShowing = true;
//        }
//    }
//
//    private void initPopup() {
//        View pop = View.inflate(this, R.layout.popu, null);
//        popupWindow = new PopupWindow(pop, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        popupWindow.setTouchable(true);
//        popupWindow.setOutsideTouchable(false);
//        popupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
//        popupWindow.setAnimationStyle(R.style.anim_menu_bottombar);
//        mIsShowing = false;
//    }

    @Override
    public void onAddressSelected(Province province, City city, County county, Street street) {
        String s =
                (province == null ? "" : province.name) +
                        (city == null ? "" : "\n" + city.name) +
                        (county == null ? "" : "\n" + county.name) +
                        (street == null ? "" : "\n" + street.name);

        T.showShort(this, s);
    }

}
