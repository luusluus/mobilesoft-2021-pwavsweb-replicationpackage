package com.free.ads.e;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.blankj.utilcode.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  public static List<String> a = new ArrayList();
  
  static
  {
    a.add("com.facebook.katana");
    a.add("com.facebook.orca");
    a.add("com.facebook.lite");
  }
  
  public static boolean a()
  {
    try
    {
      synchronized ()
      {
        Iterator localIterator = Utils.getApp().getPackageManager().getInstalledPackages(0).iterator();
        while (localIterator.hasNext())
        {
          PackageInfo localPackageInfo = (PackageInfo)localIterator.next();
          if (a.indexOf(localPackageInfo.packageName) != -1) {
            return true;
          }
        }
        return false;
      }
      return false;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}
