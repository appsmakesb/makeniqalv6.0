// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.multilibrary.foysaldev.luseen.autolinklibrary.AutoLinkTextView;
import com.v5foradnroid.userapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PayiBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText amount;

  @NonNull
  public final TextView band;

  @NonNull
  public final TextView cba;

  @NonNull
  public final CircleImageView hm;

  @NonNull
  public final LinearLayout mainlayout;

  @NonNull
  public final TextInputEditText pin;

  @NonNull
  public final AutoLinkTextView pp;

  @NonNull
  public final ScrollView scrollview;

  @NonNull
  public final Button sub;

  @NonNull
  public final TextInputEditText trnx;

  @NonNull
  public final TextInputLayout txtPassword;

  @NonNull
  public final RelativeLayout uitop;

  private PayiBinding(@NonNull LinearLayout rootView, @NonNull TextInputEditText amount,
      @NonNull TextView band, @NonNull TextView cba, @NonNull CircleImageView hm,
      @NonNull LinearLayout mainlayout, @NonNull TextInputEditText pin,
      @NonNull AutoLinkTextView pp, @NonNull ScrollView scrollview, @NonNull Button sub,
      @NonNull TextInputEditText trnx, @NonNull TextInputLayout txtPassword,
      @NonNull RelativeLayout uitop) {
    this.rootView = rootView;
    this.amount = amount;
    this.band = band;
    this.cba = cba;
    this.hm = hm;
    this.mainlayout = mainlayout;
    this.pin = pin;
    this.pp = pp;
    this.scrollview = scrollview;
    this.sub = sub;
    this.trnx = trnx;
    this.txtPassword = txtPassword;
    this.uitop = uitop;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PayiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PayiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.payi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PayiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amount;
      TextInputEditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.band;
      TextView band = ViewBindings.findChildViewById(rootView, id);
      if (band == null) {
        break missingId;
      }

      id = R.id.cba;
      TextView cba = ViewBindings.findChildViewById(rootView, id);
      if (cba == null) {
        break missingId;
      }

      id = R.id.hm;
      CircleImageView hm = ViewBindings.findChildViewById(rootView, id);
      if (hm == null) {
        break missingId;
      }

      LinearLayout mainlayout = (LinearLayout) rootView;

      id = R.id.pin;
      TextInputEditText pin = ViewBindings.findChildViewById(rootView, id);
      if (pin == null) {
        break missingId;
      }

      id = R.id.pp;
      AutoLinkTextView pp = ViewBindings.findChildViewById(rootView, id);
      if (pp == null) {
        break missingId;
      }

      id = R.id.scrollview;
      ScrollView scrollview = ViewBindings.findChildViewById(rootView, id);
      if (scrollview == null) {
        break missingId;
      }

      id = R.id.sub;
      Button sub = ViewBindings.findChildViewById(rootView, id);
      if (sub == null) {
        break missingId;
      }

      id = R.id.trnx;
      TextInputEditText trnx = ViewBindings.findChildViewById(rootView, id);
      if (trnx == null) {
        break missingId;
      }

      id = R.id.txtPassword;
      TextInputLayout txtPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtPassword == null) {
        break missingId;
      }

      id = R.id.uitop;
      RelativeLayout uitop = ViewBindings.findChildViewById(rootView, id);
      if (uitop == null) {
        break missingId;
      }

      return new PayiBinding((LinearLayout) rootView, amount, band, cba, hm, mainlayout, pin, pp,
          scrollview, sub, trnx, txtPassword, uitop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
