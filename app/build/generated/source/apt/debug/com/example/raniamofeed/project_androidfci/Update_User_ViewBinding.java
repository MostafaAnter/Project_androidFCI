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

public class Update_User_ViewBinding implements Unbinder {
  private Update_User target;

  @UiThread
  public Update_User_ViewBinding(Update_User target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Update_User_ViewBinding(Update_User target, View source) {
    this.target = target;

    target.found = Utils.findRequiredViewAsType(source, R.id.found, "field 'found'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Update_User target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.found = null;
  }
}
