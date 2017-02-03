package com.buu.se.tabbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by Dell on 02/02/2560.
 */

public class ForetellFragment extends Fragment {
    private LinearLayout lllove;
    private LinearLayout llfinance;
    private TextView tvresult;
    private TextView tvTitle;

    public ForetellFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_foretell, container, false);
        lllove = (LinearLayout) rootView.findViewById(R.id.llLove);
        llfinance = (LinearLayout) rootView.findViewById(R.id.llFinance);
        tvresult = (TextView) rootView.findViewById(R.id.tvreSult);
        tvTitle = (TextView) rootView.findViewById(R.id.tvTitle);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lllove.setOnClickListener(OnClickLoveListener);
        llfinance.setOnClickListener(OnClickFinanceListener);

    }

    private View.OnClickListener OnClickLoveListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            tvTitle.setText("ดวงด้านความรัก");

            int random = (int)(Math.random() * 6 + 1);
            if(random == 1){
                tvresult.setText("  ถ้าหากจะพบใครในช่วงนี้โดดเด่นเป็นคนผิวขาว เขาจะเข้าใจเจ้าชะตาได้เป็นอย่างดี");
            }else if(random == 2){
                tvresult.setText("  จะพบคนเก่ง มีความสามารถ เฉลียวฉลาด มั่นใจในตนเองสูง ผิวสองสี");
            }else if(random == 3){
                tvresult.setText("  ดูเหมือนจะดี แต่ก็ยังไม่ใช่ ไม่ถึงกับทุกข์เกินไป มีเรื่องกวนใจบ้าง แต่ก็ยังพอที่จะปรับตัวเข้าหากันได้");
            } else if(random == 4){
                tvresult.setText("  เจ้าชะตาเป็นผู้ที่มีเสน่ห์ มีโอกาสพบคู่ พบคนที่ถูกใจ แต่เขาจะเป็นคนใจร้อนไปซัก หน่อย");
            }
            else if(random == 5){
                tvresult.setText("  ยังไม่ลงตัวในเรื่องความสัมพันธ์ด้านความรัก ช่วงนี้ควรใช้ชีวิตกับความเป็นอิสระไปก่อน");
            }else{
                tvresult.setText("  ยังไม่ลงตัวด้านความรัก ความสัมพันธ์ในช่วงนี้ เพราะยังเกิดความเข้าใจกันผิดอยู่นั่นเอง");
            }
        }
    };
    private View.OnClickListener OnClickFinanceListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            tvTitle.setText("ดวงด้านการเงิน");
            int random = (int)(Math.random() * 6 + 1);
            if(random == 1){
                tvresult.setText("  อย่าใช้จ่ายเงินเกินตัวจนต้องดึงเงินของอนาคตออกมาใช้จ่ายไปก่อน ต้องวางแผนและใช้เงินอย่างรอบคอบและประหยัด");
            }else if(random == 2){
                tvresult.setText("  หาใช้จ่ายได้อย่างเรื่อย ๆ ต้องมีเรื่องใช้จ่ายออกไปบ้าง ช่วงนี้ต้องระวังคนที่จะเข้ามายืมเงิน เพราะจะได้คืนช้าหรือไม่ได้คืน");
            }else if(random == 3){
                tvresult.setText("    ยังอยู่ในเกณฑ์ทรงตัว ไม่มีเรื่องเดือดร้อนใด ๆ ในช่วงนี้ เมื่อใช้ความประหยัดจะทำให้มีเงินเก็บ");
            }else if(random == 4){
                tvresult.setText("    มีแต่เรื่องจ่ายในช่วงนี้ แม้จะพยายามหลีกเลี่ยงแล้ว แต่เรื่องเหล่านั้นก็จะวนกลับมา จึงต้องจ่ายอีกอยู่ดี");
            }else if(random == 5){
                tvresult.setText("    ในช่วงนี้ต้องใช้เงินเป็นจำนวนมาก และระวังการดึงเงินในอนาคตออกมาใช้จ่ายไปก่อน ซึ่งไม่ควรทำ");
            }else{
                tvresult.setText("  มีทั้งรับทั้งจ่าย แต่ในช่วงนี้ใช้ความประหยัดเอาไว้จะดีที่สุด");
            }

        }
    };

    public static Fragment newInstance() {
        return new ForetellFragment();
    }

}
