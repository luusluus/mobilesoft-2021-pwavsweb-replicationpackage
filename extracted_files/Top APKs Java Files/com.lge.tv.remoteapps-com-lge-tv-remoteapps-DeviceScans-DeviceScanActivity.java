package com.lge.tv.remoteapps.DeviceScans;

import Util.PopupUtil;
import Util.UiUtil;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ViewFlipper;
import com.lge.tv.remoteapps.Base.BasePie;
import com.lge.tv.remoteapps.Base.DiscoveredDeviceUnit;
import com.lge.tv.remoteapps.Utils.EtcUtil;
import com.lge.tv.remoteapps.Utils.PreferenceUtil;
import com.lge.tv.remoteapps.Views.DeviceScanAdapter;
import com.lge.tv.remoteapps.Views.IconTwoLineItem;
import com.lge.tv.remoteapps.Welcomes.WelcomeActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeviceScanActivity
  extends DeviceScanBaseActivity
{
  private static final int _IDX_LISTVIEW = 0;
  private static final int _IDX_NOT_FOUND_VIEW = 1;
  private DeviceScanAdapter _deviceAdapter;
  private ListView _deviceList;
  private ViewFlipper _deviceScanPage;
  private ImageView _loadProgressImg;
  private AdapterView.OnItemClickListener deviceSelectListener = new AdapterView.OnItemClickListener()
  {
    public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      if (((DiscoveredDeviceUnit)BasePie.discoveredDeviceUnitLst.get(paramAnonymousInt)).deviceType.equals("tv"))
      {
        BasePie.setSelectedDeviceUnit(paramAnonymousInt);
        DeviceScanActivity.this.onSelectDevice();
      }
      while (!((DiscoveredDeviceUnit)BasePie.discoveredDeviceUnitLst.get(paramAnonymousInt)).deviceType.equals("av")) {
        return;
      }
      paramAnonymousAdapterView = DeviceScanActivity.this.getPackageManager().getInstalledPackages(1);
      int i = 0;
      paramAnonymousInt = 0;
      for (;;)
      {
        if (paramAnonymousInt >= paramAnonymousAdapterView.size()) {}
        for (paramAnonymousInt = i;; paramAnonymousInt = 1)
        {
          if (paramAnonymousInt == 0) {
            break label190;
          }
          PopupUtil.showMessageDialog(DeviceScanActivity.this, "", DeviceScanActivity.this.setPopupViewMsg((String)DeviceScanActivity.this.getText(2131231075)), DeviceScanActivity.this.getText(2131230925), DeviceScanActivity.this.onCloseDialogClickListener);
          return;
          paramAnonymousView = ((PackageInfo)paramAnonymousAdapterView.get(paramAnonymousInt)).packageName;
          Log.w("lg_installed", "appname : " + paramAnonymousView);
          if (!paramAnonymousView.equals("com.lge.magic")) {
            break;
          }
        }
        paramAnonymousInt += 1;
      }
      label190:
      PopupUtil.showMessageDialog(DeviceScanActivity.this, "", DeviceScanActivity.this.setPopupViewMsg((String)DeviceScanActivity.this.getText(2131231076)), DeviceScanActivity.this.onCloseDialogClickListener, DeviceScanActivity.this.getText(2131230929), DeviceScanActivity.this.onGoMediaAppMarketListener, DeviceScanActivity.this.getText(2131231077));
    }
  };
  
  public DeviceScanActivity() {}
  
  public void clearDeviceListView()
  {
    this._deviceAdapter.clear();
    this._deviceAdapter.notifyDataSetChanged();
  }
  
  public void onBackPressed()
  {
    startActivity(WelcomeActivity.class, 67108864);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBodyView(2130903050);
    setTopTitle(2131230962);
    setRightImageButton(2130838567, this.refreshListener);
    this._deviceScanPage = ((ViewFlipper)findViewById(2131361963));
    this._deviceList = ((ListView)findViewById(2131361964));
    this._deviceAdapter = new DeviceScanAdapter(this);
    this._deviceList.setAdapter(this._deviceAdapter);
    this._deviceList.setOnItemClickListener(this.deviceSelectListener);
    this._loadProgressImg = ((ImageView)findViewById(2131361966));
    if (!EtcUtil.isValidAppStatus())
    {
      Log.e("lg", "EtcUtil.isValidAppStatus(): " + EtcUtil.isValidAppStatus() + " , so return!!");
      return;
    }
    initDeviceList();
    startDeviceScan();
  }
  
  public void onFindSupportModel(View paramView)
  {
    showSupportModelViewActivity();
  }
  
  public void onNotFindDevice()
  {
    Log.w("lg", "onNotFindDevice");
    clearDeviceListView();
    this._deviceScanPage.setDisplayedChild(1);
  }
  
  protected void on_progressDialog_for_scan_closed()
  {
    this._loadProgressImg.setAnimation(null);
    this._loadProgressImg.setVisibility(8);
    super.on_progressDialog_for_scan_closed();
  }
  
  protected void startDeviceScan()
  {
    super.startDeviceScan();
    clearDeviceListView();
    this._btnTopRightImage.setEnabled(false);
    this._deviceAdapter.clear();
    this._loadProgressImg.setVisibility(0);
    this._loadProgressImg.startAnimation(UiUtil.getRotateAnimation(1));
    this._loadProgressImg.postDelayed(new Runnable()
    {
      public void run()
      {
        DeviceScanActivity.this.on_progressDialog_for_scan_closed();
        DeviceScanActivity.this._btnTopRightImage.setEnabled(true);
      }
    }, 'ஸ');
    if (PreferenceUtil.getSavedDefaultDevice() != null) {
      this._deviceList.postDelayed(new Runnable()
      {
        public void run()
        {
          DeviceScanActivity.this.isNowScanning = false;
          Log.d("lg", "_deviceList.postDelayed");
          if (DeviceScanActivity.this._isAlreadyDeviceSelect)
          {
            Log.d("lg", "_isAlreadyDeviceSelect is true. so ignore!");
            DeviceScanActivity.this._isAlreadyDeviceSelect = false;
          }
          int i;
          do
          {
            return;
            DiscoveredDeviceUnit localDiscoveredDeviceUnit = PreferenceUtil.getSavedDefaultDevice();
            if (localDiscoveredDeviceUnit == null)
            {
              Log.w("lg", "default device is removed. so ignore!!!");
              return;
            }
            i = DeviceScanActivity.this.findDefaultDeviceFromDiscoverdList(localDiscoveredDeviceUnit.uuid);
            Log.i("lg", "findDefaultDeviceFromDiscoverdList's result: " + i);
          } while (i != -1);
          if (BasePie.curActivity == DeviceScanActivity.this)
          {
            PopupUtil.showMessageDialog(DeviceScanActivity.this, "", DeviceScanActivity.this.setPopupViewMsg(DeviceScanActivity.this.getString(2131231198)), null, DeviceScanActivity.this.getText(2131230925), null, null);
            return;
          }
          Log.w("lg", "curActivity is not scanActivity. so donot show dialog");
        }
      }, 3000L);
    }
  }
  
  protected void updateDeviceListView()
  {
    for (;;)
    {
      try
      {
        if (!this.isNowScanning)
        {
          Log.w("lg", "updateDeviceListView. device detected after timeout");
          return;
        }
        Iterator localIterator;
        try
        {
          clearDeviceListView();
          this._deviceScanPage.setDisplayedChild(0);
          localIterator = BasePie.discoveredDeviceUnitLst.iterator();
          if (localIterator.hasNext()) {
            break label285;
          }
          DiscoveredDeviceUnit localDiscoveredDeviceUnit1 = PreferenceUtil.getSavedDefaultDevice();
          int i = -1;
          if (localDiscoveredDeviceUnit1 != null)
          {
            int j = findDefaultDeviceFromDiscoverdList(localDiscoveredDeviceUnit1.uuid);
            i = j;
            if (j != -1)
            {
              ((IconTwoLineItem)this._deviceAdapter.getItem(j)).setArgument(100);
              i = j;
            }
          }
          this._deviceAdapter.notifyDataSetChanged();
          if (i == -1) {
            continue;
          }
          killDeviceScanner();
          BasePie.setSelectedDeviceUnit(i);
          if (this._lastPairingTryTime == this._lastScanTryTime) {
            break label529;
          }
          this._loadProgressImg.setAnimation(null);
          this._loadProgressImg.setVisibility(8);
          ((LinearLayout)findViewById(2131361813)).setVisibility(0);
          ((ImageView)findViewById(2131361814)).startAnimation(UiUtil.getRotateAnimation(1));
          this._deviceList.setEnabled(false);
          Log.e("lg", "_lastPairingTryTime: " + this._lastPairingTryTime + " , _lastScanTryTime: " + this._lastScanTryTime);
          this._lastPairingTryTime = this._lastScanTryTime;
          requestAuthWithPairingKey(localDiscoveredDeviceUnit1.pairingKey, this, "on_received_auth_result", false, true);
        }
        catch (Exception localException)
        {
          Log.e("lg", "DeviceScanActivity.updateDeviceListView.try.exception : " + localException.toString());
          localException.printStackTrace();
        }
        continue;
        localDiscoveredDeviceUnit2 = (DiscoveredDeviceUnit)localIterator.next();
      }
      finally {}
      label285:
      DiscoveredDeviceUnit localDiscoveredDeviceUnit2;
      Drawable localDrawable;
      if (localDiscoveredDeviceUnit2.deviceType.equals("tv")) {
        localDrawable = getResources().getDrawable(2130838480);
      }
      for (;;)
      {
        this._deviceAdapter.addItem(localDrawable, localDiscoveredDeviceUnit2.deviceDescription, localDiscoveredDeviceUnit2.deviceModel);
        break;
        if (localDiscoveredDeviceUnit2.deviceType.equals("av"))
        {
          if (localDiscoveredDeviceUnit2.deviceModel.substring(0, 2).toLowerCase().equalsIgnoreCase("bh")) {
            localDrawable = getResources().getDrawable(2130838476);
          } else if (localDiscoveredDeviceUnit2.deviceModel.substring(0, 2).toLowerCase().equalsIgnoreCase("bp")) {
            localDrawable = getResources().getDrawable(2130838479);
          } else if (localDiscoveredDeviceUnit2.deviceModel.substring(0, 2).toLowerCase().equalsIgnoreCase("hr")) {
            localDrawable = getResources().getDrawable(2130838477);
          } else if (localDiscoveredDeviceUnit2.deviceModel.substring(0, 2).toLowerCase().equalsIgnoreCase("sp")) {
            localDrawable = getResources().getDrawable(2130838478);
          } else {
            localDrawable = getResources().getDrawable(2130838478);
          }
        }
        else {
          localDrawable = getResources().getDrawable(2130838480);
        }
      }
      label529:
      Log.w("lg", "already request auth for default TV! _lastPairingTryTime: " + this._lastPairingTryTime / 1000L + " , _lastScanTryTime: " + this._lastScanTryTime / 1000L);
    }
  }
}
