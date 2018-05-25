// Generated code from Butter Knife. Do not modify!
package com.example.raniamofeed.project_androidfci;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Setting_ViewBinding implements Unbinder {
  private Setting target;

  @UiThread
  public Setting_ViewBinding(Setting target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Setting_ViewBinding(Setting target, View source) {
    this.target = target;

    target.found = Utils.findRequiredViewAsType(source, R.id.found, "field 'found'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Setting target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.found = null;
  }
}
