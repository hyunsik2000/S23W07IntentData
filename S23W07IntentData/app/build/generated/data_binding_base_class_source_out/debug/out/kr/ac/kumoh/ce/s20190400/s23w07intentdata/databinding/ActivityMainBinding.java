// Generated by view binder compiler. Do not edit!
package kr.ac.kumoh.ce.s20190400.s23w07intentdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kumoh.ce.s20190400.s23w07intentdata.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCupid;

  @NonNull
  public final Button btnOmg;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCupid,
      @NonNull Button btnOmg) {
    this.rootView = rootView;
    this.btnCupid = btnCupid;
    this.btnOmg = btnOmg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cupid;
      Button btnCupid = ViewBindings.findChildViewById(rootView, id);
      if (btnCupid == null) {
        break missingId;
      }

      id = R.id.btn_omg;
      Button btnOmg = ViewBindings.findChildViewById(rootView, id);
      if (btnOmg == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnCupid, btnOmg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
