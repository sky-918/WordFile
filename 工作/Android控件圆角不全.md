Android控件在xml文件中通过android:background="@drawable/bg_round_conner_activity"设置圆角时出现圆角不全的情况，一般是由以下原因造成的：

1. 控件相互遮挡

   给父布局设置圆角时，没有给子布局设置边距，导致子布局遮挡住父布局的圆角

   处理方法：给父布局设置padding或者子布局设置layout_marginLeft等

2. 显示不全

   给控件设置的圆角时，控件的宽度过大，导致圆角在屏幕外，看不见。

   处理方法：尝试给控件宽度或者高度变小，查看圆角的情况，再进一步解决。

3. 和view绘制流程有关

   例如：

   ```java
   <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
       android:id="@+id/rl"
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       android:layout_marginStart="15dp"
       android:layout_marginEnd="15dp"
       android:gravity="center_vertical"
       android:background="@drawable/bg_round_conner_activity">
   
       <TextView
           android:id="@+id/tv_years"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:layout_marginLeft="9dp"
           android:layout_marginTop="4dp"
           android:layout_marginBottom="4dp"
           android:gravity="center"
           android:text="2016年1月15日"
           android:textColor="#5A5B5D"
           android:textSize="14sp"
           android:layout_marginStart="9dp" />
   </LinearLayout>
   ```

这是一个RecycleView的子布局文件，此时右侧两个圆角没有显示，尝试**定宽**时可以正常显示，或者**在最外层再添加一个父布局**时，也能显示正常；至于具体的原因还未知。