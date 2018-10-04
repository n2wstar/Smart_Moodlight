package org.techtown.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // xml 로 만들어준 프레그먼트를 자바 단에서 만들어줌
        ViewGroup rootGroup = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);
        return rootGroup;

    }
}