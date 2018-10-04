package org.techtown.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1툴바 설정
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //2xml 프래그먼트를 보여주기

        fragment1=new Fragment1();

        fragment2=new Fragment2();

        fragment3=new Fragment3();

        fragment4=new Fragment4();

        //프레그먼트를 메니져로 보여줌
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragment1).commit();




        //4탭기능 구성
        TabLayout tabs=(TabLayout)findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Main"));
        tabs.addTab(tabs.newTab().setText("Position"));
        tabs.addTab(tabs.newTab().setText("Color"));
        tabs.addTab(tabs.newTab().setText("Statistic"));



        //탭버튼을 클릭했을 때 프레그먼트 동작
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                //선택된 탭 번호 반환
                int position =tab.getPosition();

                Fragment selected = null;

                if(position == 0 ){

                    selected = fragment1;

                }else if(position == 1 ){

                    selected = fragment2;

                }else if(position == 2 ){

                    selected = fragment3;
                }else if(position == 3){

                    selected = fragment4;
                }

                //선택된 프레그먼트로 바꿔줌
                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
