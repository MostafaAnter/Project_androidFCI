// Generated code from Butter Knife. Do not modify!
package com.example.raniamofeed.project_androidfci;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Log_in_ViewBinding implements Unbinder {
  private Log_in target;

  @UiThread
  public Log_in_ViewBinding(Log_in target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Log_in_ViewBinding(Log_in target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    target.imageView4 = Utils.findRequiredViewAsType(source, R.id.imageView4, "field 'imageView4'", ImageView.class);
    target.imageView3 = Utils.findRequiredViewAsType(source, R.id.imageView3, "field 'imageView3'", ImageView.class);
    target.imageView2 = Utils.findRequiredViewAsType(source, R.id.imageView2, "field 'imageView2'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Log_in target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.imageView4 = null;
    target.imageView3 = null;
    target.imageView2 = null;
  }
}
