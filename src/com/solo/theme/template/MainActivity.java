package com.solo.theme.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	private static final String SOLO_LAUNCHER_PACKAGE = "home.solo.launcher.free";
	private static final String ACTION_APPLY_ICON_THEME = "home.solo.launcher.free.APPLY_ICON_THEME";
	private static final String EXTRA_ICON_THEME_PACKAGE = "home.solo.launcher.free.extra.ICON_THEME_PACKAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.apply_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						applyTheme();
					}
				});
	}

	private void applyTheme() {
		Intent intent = new Intent(ACTION_APPLY_ICON_THEME);
		intent.setPackage(SOLO_LAUNCHER_PACKAGE);
		intent.putExtra(EXTRA_ICON_THEME_PACKAGE, getPackageName());

		startActivity(intent);
		finish();
	}

}
