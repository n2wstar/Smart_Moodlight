package org.techtown.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.OpacityBar;
import com.larswerkman.holocolorpicker.SVBar;


public class Fragment4 extends Fragment implements ColorPicker.OnColorChangedListener{
    private ColorPicker picker;

    private SVBar svBar;

    private OpacityBar opacityBar;

    private Button button;

    private TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // xml 로 만들어준 프레그먼트를 자바 단에서 만들어줌
        ViewGroup rootGroup =(ViewGroup)inflater.inflate(R.layout.fragment4,container,false);

        picker = (ColorPicker) rootGroup.findViewById(R.id.picker);

        svBar = (SVBar) rootGroup.findViewById(R.id.svbar);
        opacityBar = (OpacityBar) rootGroup.findViewById(R.id.opacitybar);
        button = (Button) rootGroup.findViewById(R.id.button1);
        text = (TextView) rootGroup.findViewById(R.id.textView1);

        picker.addSVBar(svBar);
        picker.addOpacityBar(opacityBar);
        picker.setOnColorChangedListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextColor(picker.getColor());
                picker.setOldCenterColor(picker.getColor());
            }
        });

        return  rootGroup;


    }

    @Override

    public void onColorChanged(int color) {

        //gives the color when it's changed.

    }
}

