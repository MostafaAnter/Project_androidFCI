// Generated code from Butter Knife. Do not modify!
package com.example.raniamofeed.project_androidfci;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Countact_Us_ViewBinding implements Unbinder {
  private Countact_Us target;

  @UiThread
  public Countact_Us_ViewBinding(Countact_Us target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Countact_Us_ViewBinding(Countact_Us target, View source) {
    this.target = target;

    target.logiin = Utils.findRequiredViewAsType(source, R.id.logiin, "field 'logiin'", Button.class);
    target.mail = Utils.findRequiredViewAsType(source, R.id.mail, "field 'mail'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Countact_Us target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.logiin = null;
    target.mail = null;
  }
}
