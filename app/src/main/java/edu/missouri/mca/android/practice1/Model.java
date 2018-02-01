package edu.missouri.mca.android.practice1;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Model extends BaseObservable {
    private String email;
    private String password;

    @Bindable
    public String getEmail() {
        return email;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setEmail(final String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    public void setPassword(final String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
