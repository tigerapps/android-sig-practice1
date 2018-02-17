package edu.missouri.mca.android.practice1;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import edu.missouri.mca.android.practice1.databinding.MainActivityBinding;

public class MainActivity extends Activity {
    private final Model activityModel = new Model();
    private MainActivityBinding binding;

    public void onButtonPressed(final View view) {
        binding.heading.setText(activityModel.getEmail());
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setActivity(this);
        binding.setModel(activityModel);
    }

    @Override
    protected void onDestroy() {
        binding = null;
        super.onDestroy();
    }
}
