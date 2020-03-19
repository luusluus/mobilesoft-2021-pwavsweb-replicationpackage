package com.unity3d.ads.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.Sensor;
import android.util.SparseArray;
import com.unity3d.ads.device.Device;
import com.unity3d.ads.device.DeviceError;
import com.unity3d.ads.device.IVolumeChangeListener;
import com.unity3d.ads.device.VolumeChange;
import com.unity3d.ads.log.DeviceLog;
import com.unity3d.ads.properties.ClientProperties;
import com.unity3d.ads.webview.WebViewApp;
import com.unity3d.ads.webview.WebViewEventCategory;
import com.unity3d.ads.webview.bridge.WebViewCallback;
import com.unity3d.ads.webview.bridge.WebViewExposed;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceInfo
{
  private static SparseArray<IVolumeChangeListener> _volumeChangeListeners;
  
  public DeviceInfo() {}
  
  @WebViewExposed
  public static void getAdvertisingTrackingId(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getAdvertisingTrackingId() });
  }
  
  @WebViewExposed
  public static void getAndroidId(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getAndroidId() });
  }
  
  @WebViewExposed
  public static void getApiLevel(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getApiLevel()) });
  }
  
  @WebViewExposed
  public static void getApkDigest(WebViewCallback paramWebViewCallback)
  {
    String str = Device.getApkDigest();
    if (str != null)
    {
      paramWebViewCallback.invoke(new Object[] { str });
      return;
    }
    paramWebViewCallback.error(DeviceError.COULDNT_GET_DIGEST, new Object[0]);
  }
  
  @WebViewExposed
  public static void getBatteryLevel(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Float.valueOf(Device.getBatteryLevel()) });
  }
  
  @WebViewExposed
  public static void getBatteryStatus(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getBatteryStatus()) });
  }
  
  @WebViewExposed
  public static void getBoard(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getBoard() });
  }
  
  @WebViewExposed
  public static void getBootloader(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getBootloader() });
  }
  
  @WebViewExposed
  public static void getBrand(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getBrand() });
  }
  
  @WebViewExposed
  public static void getBuildId(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getBuildId() });
  }
  
  @WebViewExposed
  public static void getBuildVersionIncremental(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getBuildVersionIncremental() });
  }
  
  @WebViewExposed
  public static void getCPUCount(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Long.valueOf(Device.getCPUCount()) });
  }
  
  @WebViewExposed
  public static void getCertificateFingerprint(WebViewCallback paramWebViewCallback)
  {
    String str = Device.getCertificateFingerprint();
    if (str != null)
    {
      paramWebViewCallback.invoke(new Object[] { str });
      return;
    }
    paramWebViewCallback.error(DeviceError.COULDNT_GET_FINGERPRINT, new Object[0]);
  }
  
  @WebViewExposed
  public static void getConnectionType(WebViewCallback paramWebViewCallback)
  {
    String str;
    if (Device.isUsingWifi()) {
      str = "wifi";
    } else if (Device.isActiveNetworkConnected()) {
      str = "cellular";
    } else {
      str = "none";
    }
    paramWebViewCallback.invoke(new Object[] { str });
  }
  
  @WebViewExposed
  public static void getDevice(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getDevice() });
  }
  
  @WebViewExposed
  public static void getDeviceMaxVolume(Integer paramInteger, WebViewCallback paramWebViewCallback)
  {
    int i = Device.getStreamMaxVolume(paramInteger.intValue());
    if (i > -1)
    {
      paramWebViewCallback.invoke(new Object[] { Integer.valueOf(i) });
      return;
    }
    switch (i)
    {
    default: 
      paramInteger = new StringBuilder();
      paramInteger.append("Unhandled deviceMaxVolume error: ");
      paramInteger.append(i);
      DeviceLog.error(paramInteger.toString());
      return;
    case -1: 
      paramWebViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[] { Integer.valueOf(i) });
      return;
    }
    paramWebViewCallback.error(DeviceError.AUDIOMANAGER_NULL, new Object[] { Integer.valueOf(i) });
  }
  
  @WebViewExposed
  public static void getDeviceVolume(Integer paramInteger, WebViewCallback paramWebViewCallback)
  {
    int i = Device.getStreamVolume(paramInteger.intValue());
    if (i > -1)
    {
      paramWebViewCallback.invoke(new Object[] { Integer.valueOf(i) });
      return;
    }
    switch (i)
    {
    default: 
      paramInteger = new StringBuilder();
      paramInteger.append("Unhandled deviceVolume error: ");
      paramInteger.append(i);
      DeviceLog.error(paramInteger.toString());
      return;
    case -1: 
      paramWebViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[] { Integer.valueOf(i) });
      return;
    }
    paramWebViewCallback.error(DeviceError.AUDIOMANAGER_NULL, new Object[] { Integer.valueOf(i) });
  }
  
  @WebViewExposed
  public static void getElapsedRealtime(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Long.valueOf(Device.getElapsedRealtime()) });
  }
  
  private static File getFileForStorageType(StorageType paramStorageType)
  {
    switch (2.$SwitchMap$com$unity3d$ads$api$DeviceInfo$StorageType[paramStorageType.ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unhandled storagetype: ");
      localStringBuilder.append(paramStorageType);
      DeviceLog.error(localStringBuilder.toString());
      return null;
    case 2: 
      return ClientProperties.getApplicationContext().getExternalCacheDir();
    }
    return ClientProperties.getApplicationContext().getCacheDir();
  }
  
  @WebViewExposed
  public static void getFingerprint(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getFingerprint() });
  }
  
  @WebViewExposed
  public static void getFreeMemory(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Long.valueOf(Device.getFreeMemory()) });
  }
  
  @WebViewExposed
  public static void getFreeSpace(String paramString, WebViewCallback paramWebViewCallback)
  {
    StorageType localStorageType = getStorageTypeFromString(paramString);
    if (localStorageType == null)
    {
      paramWebViewCallback.error(DeviceError.INVALID_STORAGETYPE, new Object[] { paramString });
      return;
    }
    long l = Device.getFreeSpace(getFileForStorageType(localStorageType));
    if (l > -1L)
    {
      paramWebViewCallback.invoke(new Object[] { Long.valueOf(l) });
      return;
    }
    paramWebViewCallback.error(DeviceError.COULDNT_GET_STORAGE_LOCATION, new Object[] { Long.valueOf(l) });
  }
  
  @WebViewExposed
  public static void getGLVersion(WebViewCallback paramWebViewCallback)
  {
    String str = Device.getGLVersion();
    if (str != null)
    {
      paramWebViewCallback.invoke(new Object[] { str });
      return;
    }
    paramWebViewCallback.error(DeviceError.COULDNT_GET_GL_VERSION, new Object[0]);
  }
  
  @WebViewExposed
  public static void getHardware(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getHardware() });
  }
  
  @WebViewExposed
  public static void getHeadset(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Boolean.valueOf(Device.isWiredHeadsetOn()) });
  }
  
  @WebViewExposed
  public static void getHost(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getHost() });
  }
  
  @WebViewExposed
  public static void getInstalledPackages(boolean paramBoolean, WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { new JSONArray(Device.getInstalledPackages(paramBoolean)) });
  }
  
  @WebViewExposed
  public static void getLimitAdTrackingFlag(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Boolean.valueOf(Device.isLimitAdTrackingEnabled()) });
  }
  
  @WebViewExposed
  public static void getManufacturer(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getManufacturer() });
  }
  
  @WebViewExposed
  public static void getModel(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getModel() });
  }
  
  @WebViewExposed
  public static void getNetworkOperator(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getNetworkOperator() });
  }
  
  @WebViewExposed
  public static void getNetworkOperatorName(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getNetworkOperatorName() });
  }
  
  @WebViewExposed
  public static void getNetworkType(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getNetworkType()) });
  }
  
  @WebViewExposed
  public static void getOsVersion(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getOsVersion() });
  }
  
  @WebViewExposed
  public static void getPackageInfo(String paramString, WebViewCallback paramWebViewCallback)
  {
    PackageManager localPackageManager;
    if (ClientProperties.getApplicationContext() != null) {
      localPackageManager = ClientProperties.getApplicationContext().getPackageManager();
    }
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramString, 0);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("installer", localPackageManager.getInstallerPackageName(paramString));
        localJSONObject.put("firstInstallTime", localPackageInfo.firstInstallTime);
        localJSONObject.put("lastUpdateTime", localPackageInfo.lastUpdateTime);
        localJSONObject.put("versionCode", localPackageInfo.versionCode);
        localJSONObject.put("versionName", localPackageInfo.versionName);
        localJSONObject.put("packageName", localPackageInfo.packageName);
        paramWebViewCallback.invoke(new Object[] { localJSONObject });
        return;
      }
      catch (JSONException paramString)
      {
        paramWebViewCallback.error(DeviceError.JSON_ERROR, new Object[] { paramString.getMessage() });
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    paramWebViewCallback.error(DeviceError.APPLICATION_INFO_NOT_AVAILABLE, new Object[] { paramString });
    return;
    paramWebViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
  }
  
  @WebViewExposed
  public static void getProcessInfo(WebViewCallback paramWebViewCallback)
  {
    JSONObject localJSONObject = new JSONObject();
    Map localMap = Device.getProcessInfo();
    if (localMap != null) {
      try
      {
        if (localMap.containsKey("stat")) {
          localJSONObject.put("stat", localMap.get("stat"));
        }
        if (localMap.containsKey("uptime")) {
          localJSONObject.put("uptime", localMap.get("uptime"));
        }
      }
      catch (Exception localException)
      {
        DeviceLog.exception("Error while constructing process info", localException);
      }
    }
    paramWebViewCallback.invoke(new Object[] { localJSONObject });
  }
  
  @WebViewExposed
  public static void getProduct(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getProduct() });
  }
  
  @WebViewExposed
  public static void getRingerMode(WebViewCallback paramWebViewCallback)
  {
    int i = Device.getRingerMode();
    if (i > -1)
    {
      paramWebViewCallback.invoke(new Object[] { Integer.valueOf(i) });
      return;
    }
    switch (i)
    {
    default: 
      paramWebViewCallback = new StringBuilder();
      paramWebViewCallback.append("Unhandled ringerMode error: ");
      paramWebViewCallback.append(i);
      DeviceLog.error(paramWebViewCallback.toString());
      return;
    case -1: 
      paramWebViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[] { Integer.valueOf(i) });
      return;
    }
    paramWebViewCallback.error(DeviceError.AUDIOMANAGER_NULL, new Object[] { Integer.valueOf(i) });
  }
  
  @WebViewExposed
  public static void getScreenBrightness(WebViewCallback paramWebViewCallback)
  {
    int i = Device.getScreenBrightness();
    if (i > -1)
    {
      paramWebViewCallback.invoke(new Object[] { Integer.valueOf(i) });
      return;
    }
    if (i != -1)
    {
      paramWebViewCallback = new StringBuilder();
      paramWebViewCallback.append("Unhandled screenBrightness error: ");
      paramWebViewCallback.append(i);
      DeviceLog.error(paramWebViewCallback.toString());
      return;
    }
    paramWebViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[] { Integer.valueOf(i) });
  }
  
  @WebViewExposed
  public static void getScreenDensity(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getScreenDensity()) });
  }
  
  @WebViewExposed
  public static void getScreenHeight(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getScreenHeight()) });
  }
  
  @WebViewExposed
  public static void getScreenLayout(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getScreenLayout()) });
  }
  
  @WebViewExposed
  public static void getScreenWidth(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(Device.getScreenWidth()) });
  }
  
  @WebViewExposed
  public static void getSensorList(WebViewCallback paramWebViewCallback)
  {
    JSONArray localJSONArray = new JSONArray();
    Object localObject = Device.getSensorList();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Sensor localSensor = (Sensor)((Iterator)localObject).next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("name", localSensor.getName());
          localJSONObject.put("type", localSensor.getType());
          localJSONObject.put("vendor", localSensor.getVendor());
          localJSONObject.put("maximumRange", localSensor.getMaximumRange());
          localJSONObject.put("power", localSensor.getPower());
          localJSONObject.put("version", localSensor.getVersion());
          localJSONObject.put("resolution", localSensor.getResolution());
          localJSONObject.put("minDelay", localSensor.getMinDelay());
          localJSONArray.put(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          paramWebViewCallback.error(DeviceError.JSON_ERROR, new Object[] { localJSONException.getMessage() });
          return;
        }
      }
    }
    paramWebViewCallback.invoke(new Object[] { localJSONException });
  }
  
  private static StorageType getStorageTypeFromString(String paramString)
  {
    try
    {
      StorageType localStorageType = StorageType.valueOf(paramString);
      return localStorageType;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Illegal argument: ");
      localStringBuilder.append(paramString);
      DeviceLog.exception(localStringBuilder.toString(), localIllegalArgumentException);
    }
    return null;
  }
  
  @WebViewExposed
  public static void getSupportedAbis(WebViewCallback paramWebViewCallback)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = Device.getSupportedAbis().iterator();
    while (localIterator.hasNext()) {
      localJSONArray.put((String)localIterator.next());
    }
    paramWebViewCallback.invoke(new Object[] { localJSONArray });
  }
  
  @WebViewExposed
  public static void getSystemLanguage(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Locale.getDefault().toString() });
  }
  
  @WebViewExposed
  public static void getSystemProperty(String paramString1, String paramString2, WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getSystemProperty(paramString1, paramString2) });
  }
  
  @WebViewExposed
  public static void getTimeZone(Boolean paramBoolean, WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { TimeZone.getDefault().getDisplayName(paramBoolean.booleanValue(), 0, Locale.US) });
  }
  
  @WebViewExposed
  public static void getTimeZoneOffset(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000) });
  }
  
  @WebViewExposed
  public static void getTotalMemory(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Long.valueOf(Device.getTotalMemory()) });
  }
  
  @WebViewExposed
  public static void getTotalSpace(String paramString, WebViewCallback paramWebViewCallback)
  {
    StorageType localStorageType = getStorageTypeFromString(paramString);
    if (localStorageType == null)
    {
      paramWebViewCallback.error(DeviceError.INVALID_STORAGETYPE, new Object[] { paramString });
      return;
    }
    long l = Device.getTotalSpace(getFileForStorageType(localStorageType));
    if (l > -1L)
    {
      paramWebViewCallback.invoke(new Object[] { Long.valueOf(l) });
      return;
    }
    paramWebViewCallback.error(DeviceError.COULDNT_GET_STORAGE_LOCATION, new Object[] { Long.valueOf(l) });
  }
  
  @WebViewExposed
  public static void getUniqueEventId(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Device.getUniqueEventId() });
  }
  
  @WebViewExposed
  public static void getUptime(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Long.valueOf(Device.getUptime()) });
  }
  
  @WebViewExposed
  public static void isAdbEnabled(WebViewCallback paramWebViewCallback)
  {
    Boolean localBoolean = Device.isAdbEnabled();
    if (localBoolean != null)
    {
      paramWebViewCallback.invoke(new Object[] { localBoolean });
      return;
    }
    paramWebViewCallback.error(DeviceError.COULDNT_GET_ADB_STATUS, new Object[0]);
  }
  
  @WebViewExposed
  public static void isAppInstalled(String paramString, WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Boolean.valueOf(Device.isAppInstalled(paramString)) });
  }
  
  @WebViewExposed
  public static void isRooted(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Boolean.valueOf(Device.isRooted()) });
  }
  
  @WebViewExposed
  public static void isUSBConnected(WebViewCallback paramWebViewCallback)
  {
    paramWebViewCallback.invoke(new Object[] { Boolean.valueOf(Device.isUSBConnected()) });
  }
  
  @WebViewExposed
  public static void registerVolumeChangeListener(Integer paramInteger, WebViewCallback paramWebViewCallback)
  {
    if (_volumeChangeListeners == null) {
      _volumeChangeListeners = new SparseArray();
    }
    if (_volumeChangeListeners.get(paramInteger.intValue()) == null)
    {
      IVolumeChangeListener local1 = new IVolumeChangeListener()
      {
        private int _streamType = this.val$streamType.intValue();
        
        public int getStreamType()
        {
          return this._streamType;
        }
        
        public void onVolumeChanged(int paramAnonymousInt)
        {
          WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfo.DeviceInfoEvent.VOLUME_CHANGED, new Object[] { Integer.valueOf(getStreamType()), Integer.valueOf(paramAnonymousInt), Integer.valueOf(Device.getStreamMaxVolume(this._streamType)) });
        }
      };
      _volumeChangeListeners.append(paramInteger.intValue(), local1);
      VolumeChange.registerListener(local1);
    }
    paramWebViewCallback.invoke(new Object[0]);
  }
  
  @WebViewExposed
  public static void unregisterVolumeChangeListener(Integer paramInteger, WebViewCallback paramWebViewCallback)
  {
    if ((_volumeChangeListeners != null) && (_volumeChangeListeners.get(paramInteger.intValue()) != null))
    {
      VolumeChange.unregisterListener((IVolumeChangeListener)_volumeChangeListeners.get(paramInteger.intValue()));
      _volumeChangeListeners.remove(paramInteger.intValue());
    }
    paramWebViewCallback.invoke(new Object[0]);
  }
  
  public static enum DeviceInfoEvent
  {
    VOLUME_CHANGED;
    
    private DeviceInfoEvent() {}
  }
  
  public static enum StorageType
  {
    EXTERNAL,  INTERNAL;
    
    private StorageType() {}
  }
}
