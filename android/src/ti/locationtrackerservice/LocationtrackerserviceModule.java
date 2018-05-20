/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2017 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.locationtrackerservice;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import com.google.android.gms.location.LocationRequest;

@Kroll.module(name = "Locationtrackerservice", id = "ti.locationtrackerservice")
public class LocationtrackerserviceModule extends KrollModule {
	@Kroll.constant
	final int PRIORITY_BALANCED_POWER_ACCURACY = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
	@Kroll.constant
	final int PRIORITY_HIGH_ACCURACY = LocationRequest.PRIORITY_HIGH_ACCURACY;
	@Kroll.constant
	final int PRIORITY_LOW_POWER = LocationRequest.PRIORITY_LOW_POWER;

	@Kroll.constant
	final public static String DATABASE = "geologger";
	@Kroll.constant
	final public static String TABLE = DATABASE;
	public static final String LCAT = "🚘 TiGeoLogger";

	public LocationtrackerserviceModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}
}
