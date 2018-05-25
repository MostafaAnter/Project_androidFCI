// Generated code from Butter Knife. Do not modify!
package com.example.raniamofeed.project_androidfci;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Doctor_Update_ViewBinding implements Unbinder {
  private Doctor_Update target;

  @UiThread
  public Doctor_Update_ViewBinding(Doctor_Update target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Doctor_Update_ViewBinding(Doctor_Update target, View source) {
    this.target = target;

    target.imageButton = Utils.findRequiredViewAsType(source, R.id.imageButton, "field 'imageButton'", ImageButton.class);
    target.found = Utils.findRequiredViewAsType(source, R.id.found, "field 'found'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Doctor_Update target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageButton = null;
    target.found = null;
  }
}
