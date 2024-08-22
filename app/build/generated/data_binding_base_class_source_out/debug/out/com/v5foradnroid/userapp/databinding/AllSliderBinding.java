// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v5foradnroid.userapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AllSliderBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView SliderRecyclar;

  @NonNull
  public final EditText searchEt;

  private AllSliderBinding(@NonNull RelativeLayout rootView, @NonNull RecyclerView SliderRecyclar,
      @NonNull EditText searchEt) {
    this.rootView = rootView;
    this.SliderRecyclar = SliderRecyclar;
    this.searchEt = searchEt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AllSliderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AllSliderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.all_slider, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AllSliderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SliderRecyclar;
      RecyclerView SliderRecyclar = ViewBindings.findChildViewById(rootView, id);
      if (SliderRecyclar == null) {
        break missingId;
      }

      id = R.id.search_Et;
      EditText searchEt = ViewBindings.findChildViewById(rootView, id);
      if (searchEt == null) {
        break missingId;
      }

      return new AllSliderBinding((RelativeLayout) rootView, SliderRecyclar, searchEt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
