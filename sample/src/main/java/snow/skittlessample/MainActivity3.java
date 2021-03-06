package snow.skittlessample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import snow.skittles.BaseSkittle;
import snow.skittles.Skittle;
import snow.skittles.SkittleBuilder;
import snow.skittles.SkittleLayout;
import snow.skittles.TextSkittle;

/**
 * Created by aashrai on 3/2/16.
 */
public class MainActivity3 extends AppCompatActivity
    implements SkittleBuilder.OnSkittleClickListener {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final SkittleBuilder skittleBuilder =
        SkittleBuilder.newInstance((SkittleLayout) findViewById(R.id.skittleLayout), false);

    skittleBuilder.addSkittle(Skittle.newInstance(ContextCompat.getColor(this, R.color.barratheon),
        ContextCompat.getDrawable(this, R.drawable.barratheon_icon)));

    skittleBuilder.addSkittle(
        new TextSkittle.Builder("Hello", ContextCompat.getColor(this, R.color.stark),
            ContextCompat.getDrawable(this, R.drawable.stark_icon)).setTextBackground(
            ContextCompat.getColor(this, android.R.color.background_light)).build());

    skittleBuilder.addSkittle(Skittle.newInstance(ContextCompat.getColor(this, R.color.lannister),
        ContextCompat.getDrawable(this, R.drawable.lannister_icon)));
    skittleBuilder.setSkittleClickListener(this);
  }

  @Override public void onSkittleClick(BaseSkittle skittle, int position) {
    Snackbar.make(findViewById(R.id.skittle_container), "This is a snackbar", Snackbar.LENGTH_SHORT)
        .show();
  }

  @Override public void onMainSkittleClick() {
  }
}