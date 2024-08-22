// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.multilibrary.foysaldev.luseen.autolinklibrary.AutoLinkTextView;
import com.v5foradnroid.userapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText address;

  @NonNull
  public final LinearLayout addressLayout;

  @NonNull
  public final EditText amount;

  @NonNull
  public final EditText birth;

  @NonNull
  public final TextView cbax;

  @NonNull
  public final Spinner dis;

  @NonNull
  public final LinearLayout disLayout;

  @NonNull
  public final Spinner division;

  @NonNull
  public final LinearLayout divisionLayout;

  @NonNull
  public final EditText email;

  @NonNull
  public final EditText home;

  @NonNull
  public final Spinner lev;

  @NonNull
  public final EditText mobileNumber;

  @NonNull
  public final EditText name;

  @NonNull
  public final EditText nid;

  @NonNull
  public final EditText password;

  @NonNull
  public final LinearLayout pay;

  @NonNull
  public final EditText pin;

  @NonNull
  public final AutoLinkTextView pp;

  @NonNull
  public final LinearLayout re;

  @NonNull
  public final Button reg;

  @NonNull
  public final Button sub;

  @NonNull
  public final EditText trnx;

  @NonNull
  public final Spinner upzilla;

  @NonNull
  public final LinearLayout upzillaLayout;

  @NonNull
  public final EditText username;

  private ActivityRegisterBinding(@NonNull LinearLayout rootView, @NonNull EditText address,
      @NonNull LinearLayout addressLayout, @NonNull EditText amount, @NonNull EditText birth,
      @NonNull TextView cbax, @NonNull Spinner dis, @NonNull LinearLayout disLayout,
      @NonNull Spinner division, @NonNull LinearLayout divisionLayout, @NonNull EditText email,
      @NonNull EditText home, @NonNull Spinner lev, @NonNull EditText mobileNumber,
      @NonNull EditText name, @NonNull EditText nid, @NonNull EditText password,
      @NonNull LinearLayout pay, @NonNull EditText pin, @NonNull AutoLinkTextView pp,
      @NonNull LinearLayout re, @NonNull Button reg, @NonNull Button sub, @NonNull EditText trnx,
      @NonNull Spinner upzilla, @NonNull LinearLayout upzillaLayout, @NonNull EditText username) {
    this.rootView = rootView;
    this.address = address;
    this.addressLayout = addressLayout;
    this.amount = amount;
    this.birth = birth;
    this.cbax = cbax;
    this.dis = dis;
    this.disLayout = disLayout;
    this.division = division;
    this.divisionLayout = divisionLayout;
    this.email = email;
    this.home = home;
    this.lev = lev;
    this.mobileNumber = mobileNumber;
    this.name = name;
    this.nid = nid;
    this.password = password;
    this.pay = pay;
    this.pin = pin;
    this.pp = pp;
    this.re = re;
    this.reg = reg;
    this.sub = sub;
    this.trnx = trnx;
    this.upzilla = upzilla;
    this.upzillaLayout = upzillaLayout;
    this.username = username;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      EditText address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.address_layout;
      LinearLayout addressLayout = ViewBindings.findChildViewById(rootView, id);
      if (addressLayout == null) {
        break missingId;
      }

      id = R.id.amount;
      EditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.birth;
      EditText birth = ViewBindings.findChildViewById(rootView, id);
      if (birth == null) {
        break missingId;
      }

      id = R.id.cbax;
      TextView cbax = ViewBindings.findChildViewById(rootView, id);
      if (cbax == null) {
        break missingId;
      }

      id = R.id.dis;
      Spinner dis = ViewBindings.findChildViewById(rootView, id);
      if (dis == null) {
        break missingId;
      }

      id = R.id.dis_layout;
      LinearLayout disLayout = ViewBindings.findChildViewById(rootView, id);
      if (disLayout == null) {
        break missingId;
      }

      id = R.id.division;
      Spinner division = ViewBindings.findChildViewById(rootView, id);
      if (division == null) {
        break missingId;
      }

      id = R.id.division__layout;
      LinearLayout divisionLayout = ViewBindings.findChildViewById(rootView, id);
      if (divisionLayout == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.home;
      EditText home = ViewBindings.findChildViewById(rootView, id);
      if (home == null) {
        break missingId;
      }

      id = R.id.lev;
      Spinner lev = ViewBindings.findChildViewById(rootView, id);
      if (lev == null) {
        break missingId;
      }

      id = R.id.mobile_number;
      EditText mobileNumber = ViewBindings.findChildViewById(rootView, id);
      if (mobileNumber == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.nid;
      EditText nid = ViewBindings.findChildViewById(rootView, id);
      if (nid == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.pay;
      LinearLayout pay = ViewBindings.findChildViewById(rootView, id);
      if (pay == null) {
        break missingId;
      }

      id = R.id.pin;
      EditText pin = ViewBindings.findChildViewById(rootView, id);
      if (pin == null) {
        break missingId;
      }

      id = R.id.pp;
      AutoLinkTextView pp = ViewBindings.findChildViewById(rootView, id);
      if (pp == null) {
        break missingId;
      }

      id = R.id.re;
      LinearLayout re = ViewBindings.findChildViewById(rootView, id);
      if (re == null) {
        break missingId;
      }

      id = R.id.reg;
      Button reg = ViewBindings.findChildViewById(rootView, id);
      if (reg == null) {
        break missingId;
      }

      id = R.id.sub;
      Button sub = ViewBindings.findChildViewById(rootView, id);
      if (sub == null) {
        break missingId;
      }

      id = R.id.trnx;
      EditText trnx = ViewBindings.findChildViewById(rootView, id);
      if (trnx == null) {
        break missingId;
      }

      id = R.id.upzilla;
      Spinner upzilla = ViewBindings.findChildViewById(rootView, id);
      if (upzilla == null) {
        break missingId;
      }

      id = R.id.upzilla_layout;
      LinearLayout upzillaLayout = ViewBindings.findChildViewById(rootView, id);
      if (upzillaLayout == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((LinearLayout) rootView, address, addressLayout, amount,
          birth, cbax, dis, disLayout, division, divisionLayout, email, home, lev, mobileNumber,
          name, nid, password, pay, pin, pp, re, reg, sub, trnx, upzilla, upzillaLayout, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
