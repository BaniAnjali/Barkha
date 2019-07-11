package com.example.admin.EcoairBoosterAPP;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        TextView clickTv=findViewById(R.id.click);
        PieChart pieChart = findViewById(R.id.piechart);
        ArrayList<Entry> NoOfEmp = new ArrayList<Entry>();



        NoOfEmp.add(new Entry(150f, 0));
        NoOfEmp.add(new Entry(100f, 1));
        NoOfEmp.add(new Entry(200f, 2));
        NoOfEmp.add(new Entry(190f, 3));
        NoOfEmp.add(new Entry(200f, 4));
        NoOfEmp.add(new Entry(110f, 5));

        PieDataSet dataSet = new PieDataSet(NoOfEmp, "Number Of Gas");

        ArrayList<String> year = new ArrayList<String>();

        year.add("% NH3 ");
        year.add("% NOx");
        year.add("% CO2");
        year.add("% Benzene");
        year.add("% smoke");
        year.add("% alcohol");

        PieData data = new PieData(year, dataSet);
        pieChart.setData(data);
        dataSet.setColors(ColorTemplate.PASTEL_COLORS);
        pieChart.animateXY(5000, 5000);

        clickTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PieChartActivity.this,SuggestedPlantActivity.class);
                startActivity(intent);
            }
        });
    }
}

