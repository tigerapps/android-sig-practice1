package edu.missouri.mca.android.practice1;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import edu.missouri.mca.android.practice1.databinding.MainActivityBinding;

public class MainActivity extends Activity {
    private MainActivityBinding binding;

    public void onButtonPressed(final View view) {
        final String emailAddress = binding.textEmail.getText().toString();
        Toast.makeText(this, getString(R.string.message, emailAddress), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
    }

    @Override
    protected void onDestroy() {
        binding = null;
        super.onDestroy();
    }
}
