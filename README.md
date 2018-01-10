# MixTextProgressBar
支持显示文字的进度条。文字可以根据进度条进度混合颜色显示

![preview](https://github.com/hugbio/MixTextProgressBar/blob/master/preview/preview.png)

## Usage
```xml
<com.hugbio.mixtextprogressbar.MixTextProgressBar
        android:id="@+id/mixTextProgressBar"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:indeterminateOnly="false"
        android:progressDrawable="@drawable/progressbar_horizontal"
        android:progress="50"
        app:textGravity="LEFT"
        app:textSize="16sp"
        app:textColor="#3c3c3c"
        app:mixTextColor="@android:color/white"
        app:textPadding="20dp" />
 ```
 ```java
MixTextProgressBar mixTextProgressBar = findViewById(R.id.mixTextProgressBar);
mixTextProgressBar.setMax(100);
mixTextProgressBar.setProgress(progress);
mixTextProgressBar.setText("当前进度："+progress+"%");
 ```


