package com.swk.textview.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //方式二：
        /*
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setText(Html.fromHtml("<font color=blue>不知是偶然，<br>还是冥冥之中早已注定，<br>天公作美，<br>大雨瓢泼；<br>时间作美，<br>彼此相遇</font>。<br><font color=yellow>黑夜，<br>大雨，<br>昏黄的路灯，<br>一伞两人，<br>默默独行</font>。<br><font color=green>不要问路通向何方，<br>也许路的尽头就是永恒</font>。"));
      	*/
       //方式一：建立一个TextView对象，并设置其显示的文本信息
       /*
        TextView tv=new TextView(this);
        tv.setText("Android is very interesting!");
        setContentView(tv);
        */
        //方式三：
        /*
        TextView tv=(TextView)findViewById(R.id.tv);
        String str="也许因为雪的缘故，你喜欢上了冬天漫天的飞雪是你最亲密的伙伴。你如雪白般洁白、晶莹，雪如你般细腻、柔情。不曾邀你雪中漫步，错过了白头的最好机会。";
        SpannableStringBuilder ssb=new SpannableStringBuilder(str);
        ssb.setSpan(new ForegroundColorSpan(Color.RED), 0,12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(Color.GREEN), 12, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(Color.YELLOW),30, 50, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(ssb);
        */
    }
}