package com.glsite.myapp;

import android.Manifest;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.constraint.solver.widgets.Analyzer;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        //        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //        builder.setView(R.layout.dialog).setTitle("test").show();
        //        android.os.Process.killProcess(android.os.Process.myPid());
        //        System.exit(0);

        System.out.println(Calc.sub(20, 10));

        TelephonyManager telManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String operator = telManager.getSimOperator();
        if(operator!=null){
            if(operator.equals("46000") || operator.equals("46002")){
                //中国移动
                Toast.makeText(this,"中国移动", Toast.LENGTH_SHORT).show();
            }else if(operator.equals("46001")){
                //中国联通
                Toast.makeText(this,"中国联通", Toast.LENGTH_SHORT).show();
            }else if(operator.equals("46003")){
                //中国电信
                Toast.makeText(this,"中国电信", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Hasee() {
        Toast.makeText(this,"Hasee", Toast.LENGTH_SHORT).show();
    }
}
