package com.dbs.databind;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by windws on 04-Apr-16.
 */
public class UserModel extends BaseObservable {

    String name;
    String email;
    boolean isGirl;
    String msg;

    public UserModel(String name, String email, boolean isGirl) {
        this.name = name;
        this.email = email;
        this.isGirl = isGirl;
        if(isGirl){
            this.msg="She is nice girl";
        }else {
            this.msg="He is nice boy";
        }
    }

    @Bindable
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.dbs.databind.BR.name);
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
       /* notifyPropertyChanged(com.dbs.databind.BR.email);*/
    }

    public boolean isGirl() {
        return isGirl;
    }

    public void setIsGirl(boolean isGirl) {
        this.isGirl = isGirl;
    }

    public String getMsg() {
        return msg;
    }





    public void setMsg(String msg) {
        this.msg = msg;
    }



  /*  public TextWatcherAdapter firstNameWatcher = new TextWatcherAdapter(firstName);
    public TextWatcherAdapter lastNameWatcher = new TextWatcherAdapter(lastName);*/

}
