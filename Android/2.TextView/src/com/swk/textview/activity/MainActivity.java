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
        //��ʽ����
        /*
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setText(Html.fromHtml("<font color=blue>��֪��żȻ��<br>����ڤڤ֮������ע����<br>�칫������<br>����ư�ã�<br>ʱ��������<br>�˴�����</font>��<br><font color=yellow>��ҹ��<br>���꣬<br>��Ƶ�·�ƣ�<br>һɡ���ˣ�<br>ĬĬ����</font>��<br><font color=green>��Ҫ��·ͨ��η���<br>Ҳ��·�ľ�ͷ��������</font>��"));
      	*/
       //��ʽһ������һ��TextView���󣬲���������ʾ���ı���Ϣ
       /*
        TextView tv=new TextView(this);
        tv.setText("Android is very interesting!");
        setContentView(tv);
        */
        //��ʽ����
        /*
        TextView tv=(TextView)findViewById(R.id.tv);
        String str="Ҳ����Ϊѩ��Ե�ʣ���ϲ�����˶�������ķ�ѩ���������ܵĻ�顣����ѩ�װ��ס���Ө��ѩ�����ϸ�塢���顣��������ѩ������������˰�ͷ����û��ᡣ";
        SpannableStringBuilder ssb=new SpannableStringBuilder(str);
        ssb.setSpan(new ForegroundColorSpan(Color.RED), 0,12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(Color.GREEN), 12, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(Color.YELLOW),30, 50, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(ssb);
        */
    }
}