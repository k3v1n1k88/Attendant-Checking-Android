// Generated code from Butter Knife. Do not modify!
package com.example.hoangdang.diemdanh.courseAttendanceDetail;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.hoangdang.diemdanh.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AttendanceDetailActivity_ViewBinding implements Unbinder {
  private AttendanceDetailActivity target;

  @UiThread
  public AttendanceDetailActivity_ViewBinding(AttendanceDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AttendanceDetailActivity_ViewBinding(AttendanceDetailActivity target, View source) {
    this.target = target;

    target.listView = Utils.findRequiredViewAsType(source, R.id.attendance_detail_listView, "field 'listView'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AttendanceDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
  }
}
