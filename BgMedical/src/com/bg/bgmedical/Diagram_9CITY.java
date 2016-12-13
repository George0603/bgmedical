package com.bg.bgmedical;

import java.util.ArrayList;
import java.util.List;

import org.achartengine.GraphicalView;

import com.bg.utils.Constant;
import com.bg.utils.StatusBarUtils;
import com.bg.view.MyChart;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Diagram_9CITY extends BaseActivity implements
OnCheckedChangeListener {
	private RadioGroup radioGroup;
	private RadioButton boy_height;
	private LinearLayout content;
	private MyChart myChart = new MyChart();
	private String[] titles = new String[] { "SD2neg", "SD1neg", "SD1", "SD2" }; // 标题

	@SuppressLint("ResourceAsColor") @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		StatusBarUtils.setWindowStatusBarColor(this, R.color.titlebar);
		setContentView(R.layout.diagram_9city);
		
		radioGroup = (RadioGroup) this.findViewById(R.id.radioGroup);
		content = (LinearLayout) this.findViewById(R.id.content);
		boy_height = (RadioButton) this.findViewById(R.id.boy_height);

		radioGroup.setOnCheckedChangeListener(this);
		boy_height.setChecked(true);
	}
	
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		String[] names = new String[3];
		List<double[]> values = new ArrayList<double[]>();
		double[] x_y_max = new double[2];
		content.removeAllViews();

		switch (checkedId) {
		case R.id.boy_height:
			names[0] = "9城市标准男生0-6岁身高";
			names[1] = "月份";
			names[2] = "身高/cm";
			x_y_max[0] = 75.0;
			x_y_max[1] = 140.0;
			values.add(Constant.boy_height_SD2neg_9);
			values.add(Constant.boy_height_SD1neg_9);
			values.add(Constant.boy_height_SD1_9);
			values.add(Constant.boy_height_SD2_9);
			break;
		case R.id.girl_height:
			names[0] = "9城市标准女生0-6岁身高";
			names[1] = "月份";
			names[2] = "身高/cm";
			x_y_max[0] = 75.0;
			x_y_max[1] = 140.0;
			values.add(Constant.girl_height_SD2neg_9);
			values.add(Constant.girl_height_SD1neg_9);
			values.add(Constant.girl_height_SD1_9);
			values.add(Constant.girl_height_SD2_9);
			break;

		case R.id.boy_weight:
			names[0] = "9城市标准男生0-6岁体重";
			names[1] = "月份";
			names[2] = "体重/kg";
			x_y_max[0] = 75.0;
			x_y_max[1] = 40.0;
			values.add(Constant.boy_weight_SD2neg_9);
			values.add(Constant.boy_weight_SD1neg_9);
			values.add(Constant.boy_weight_SD1_9);
			values.add(Constant.boy_weight_SD2_9);
			break;
		case R.id.girl_weight:
			names[0] = "9城市标准女生0-6岁体重";
			names[1] = "月份";
			names[2] = "体重/kg";
			x_y_max[0] = 75.0;
			x_y_max[1] = 40.0;
			values.add(Constant.girl_weight_SD2neg_9);
			values.add(Constant.girl_weight_SD1neg_9);
			values.add(Constant.girl_weight_SD1_9);
			values.add(Constant.girl_weight_SD2_9);
			break;
		case R.id.boy_head:
			names[0] = "9城市标准男生0-5岁头围";
			names[1] = "月份";
			names[2] = "头围/cm";
			x_y_max[0] = 75.0;
			x_y_max[1] = 60.0;
			values.add(Constant.boy_head_SD2neg_9);
			values.add(Constant.boy_head_SD1neg_9);
			values.add(Constant.boy_head_SD1_9);
			values.add(Constant.boy_head_SD2_9);
			break;
		case R.id.girl_head:
			names[0] = "9城市标准女生0-5岁头围";
			names[1] = "月份";
			names[2] = "头围/cm";
			x_y_max[0] = 75.0;
			x_y_max[1] = 60.0;
			values.add(Constant.girl_head_SD2neg_9);
			values.add(Constant.girl_head_SD1neg_9);
			values.add(Constant.girl_head_SD1_9);
			values.add(Constant.girl_head_SD2_9);
			break;
		case R.id.boy_bmi:
			names[0] = "9城市标准男生0-6岁BMI";
			names[1] = "月份";
			names[2] = "BMI";
			x_y_max[0] = 75.0;
			x_y_max[1] = 25.0;
			values.add(Constant.boy_bmi_SD2neg_9);
			values.add(Constant.boy_bmi_SD1neg_9);
			values.add(Constant.boy_bmi_SD1_9);
			values.add(Constant.boy_bmi_SD2_9);
			break;
		case R.id.girl_bmi:
			names[0] = "9城市标准女生0-6岁BMI";
			names[1] = "月份";
			names[2] = "BMI";
			x_y_max[0] = 75.0;
			x_y_max[1] = 25.0;
			values.add(Constant.girl_bmi_SD2neg_9);
			values.add(Constant.girl_bmi_SD1neg_9);
			values.add(Constant.girl_bmi_SD1_9);
			values.add(Constant.girl_bmi_SD2_9);
			break;
		default:
			break;

		}
		GraphicalView grap = myChart.executeView_9city(this, titles, names, values,
				x_y_max);
		content.addView(grap, new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));

	}
	
}
