package com.ants360.yicamera.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ants360.yicamera.activity.cloud.CloudDeviceChooseActivity;
import com.ants360.yicamera.activity.cloud.CloudInternationalProductWebActivity;
import com.ants360.yicamera.activity.cloud.CloudServiceChooseActivity;
import com.ants360.yicamera.bean.CloudFreeInfo;
import com.ants360.yicamera.bean.CloudOrderInfo;
import com.ants360.yicamera.bean.CloudStorageInfo;
import com.ants360.yicamera.bean.DeviceInfo;
import com.ants360.yicamera.bean.UserCouponInfo;
import com.ants360.yicamera.bean.a.a;
import com.ants360.yicamera.bean.v;
import com.ants360.yicamera.d.k;
import com.ants360.yicamera.d.l;
import com.ants360.yicamera.util.h;
import com.ants360.yicamera.util.o;
import com.ants360.yicamera.view.CameraHistorySeekBar.Event;
import com.xiaoyi.log.AntsLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class i
{
  public static String a = "";
  public static boolean b = false;
  private static List<com.ants360.yicamera.bean.f> c = new ArrayList();
  
  public static int a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 == 0L)) {
      return 0;
    }
    if (paramLong2 >= System.currentTimeMillis()) {
      return 2;
    }
    return 1;
  }
  
  public static int a(CloudOrderInfo paramCloudOrderInfo)
  {
    if (paramCloudOrderInfo.I == 1) {
      if (System.currentTimeMillis() <= paramCloudOrderInfo.o) {}
    }
    do
    {
      do
      {
        return 2131559223;
        return 2131559118;
        if (paramCloudOrderInfo.I != 2) {
          break label94;
        }
        if (paramCloudOrderInfo.s) {
          break label96;
        }
        if (paramCloudOrderInfo.v == 2) {
          return 2131559224;
        }
        if (paramCloudOrderInfo.v != 3) {
          break;
        }
      } while (System.currentTimeMillis() > paramCloudOrderInfo.o);
      return 2131559224;
      if (paramCloudOrderInfo.v == 6) {
        return 2131559221;
      }
    } while (paramCloudOrderInfo.v == 7);
    label94:
    return -1;
    label96:
    if (System.currentTimeMillis() > paramCloudOrderInfo.o) {
      return 2131559127;
    }
    return 2131559128;
  }
  
  public static CloudOrderInfo a(JSONObject paramJSONObject)
  {
    boolean bool2 = true;
    int i = paramJSONObject.optInt("client_channel");
    if ((i < 0) || (i > 1)) {
      return null;
    }
    Object localObject = h.b();
    long l1 = h.d((String)localObject + "000000");
    long l2 = h.d((String)localObject + "235959");
    localObject = new CloudOrderInfo();
    ((CloudOrderInfo)localObject).l = paramJSONObject.optInt("status");
    ((CloudOrderInfo)localObject).a = paramJSONObject.optString("user_id");
    ((CloudOrderInfo)localObject).b = paramJSONObject.optString("uid");
    ((CloudOrderInfo)localObject).e = paramJSONObject.optString("order_code");
    ((CloudOrderInfo)localObject).f = paramJSONObject.optString("currency");
    ((CloudOrderInfo)localObject).g = paramJSONObject.optInt("sku_id");
    ((CloudOrderInfo)localObject).h = paramJSONObject.optInt("product_id");
    ((CloudOrderInfo)localObject).m = (paramJSONObject.optDouble("price") * 0.01D);
    ((CloudOrderInfo)localObject).i = paramJSONObject.optInt("product_type");
    ((CloudOrderInfo)localObject).j = paramJSONObject.optInt("product_subType");
    ((CloudOrderInfo)localObject).k = paramJSONObject.optInt("service_time");
    ((CloudOrderInfo)localObject).n = paramJSONObject.optLong("start_time");
    ((CloudOrderInfo)localObject).o = paramJSONObject.optLong("end_time");
    ((CloudOrderInfo)localObject).p = paramJSONObject.optLong("create_time");
    if (l1 > ((CloudOrderInfo)localObject).o)
    {
      bool1 = true;
      ((CloudOrderInfo)localObject).r = bool1;
      if (l2 >= ((CloudOrderInfo)localObject).n) {
        break label418;
      }
    }
    label418:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((CloudOrderInfo)localObject).q = bool1;
      ((CloudOrderInfo)localObject).d = DeviceInfo.c(paramJSONObject.optString("model"));
      ((CloudOrderInfo)localObject).c = paramJSONObject.optString("did");
      ((CloudOrderInfo)localObject).t = paramJSONObject.optBoolean("ifhascoupon");
      ((CloudOrderInfo)localObject).E = paramJSONObject.optInt("coupon_type");
      ((CloudOrderInfo)localObject).G = (paramJSONObject.optDouble("coupon_discount") * 0.01D);
      ((CloudOrderInfo)localObject).H = paramJSONObject.optLong("expired_time");
      ((CloudOrderInfo)localObject).F = paramJSONObject.optString("coupon_code");
      ((CloudOrderInfo)localObject).I = paramJSONObject.optInt("order_type");
      ((CloudOrderInfo)localObject).J = paramJSONObject.optInt("pay_type");
      ((CloudOrderInfo)localObject).L = paramJSONObject.optString("totalfee");
      ((CloudOrderInfo)localObject).K = i;
      return localObject;
      bool1 = false;
      break;
    }
  }
  
  private static com.ants360.yicamera.bean.f a(DeviceInfo paramDeviceInfo, boolean paramBoolean)
  {
    com.ants360.yicamera.bean.f localF = new com.ants360.yicamera.bean.f();
    localF.a = paramDeviceInfo.a;
    localF.c = paramDeviceInfo.a();
    localF.b = paramDeviceInfo.i;
    localF.d = paramDeviceInfo.z;
    localF.f = paramDeviceInfo.aj;
    localF.h = paramBoolean;
    localF.g = paramDeviceInfo.v();
    localF.j = paramDeviceInfo.w();
    localF.l = paramDeviceInfo.ad;
    localF.m = paramDeviceInfo.ae;
    localF.n = paramDeviceInfo.af;
    localF.o = paramDeviceInfo.ah;
    localF.i = paramDeviceInfo.p;
    localF.k = paramDeviceInfo.ag;
    return localF;
  }
  
  public static String a()
  {
    String str = "USD";
    if (com.ants360.yicamera.a.d.h()) {
      str = "CNY";
    }
    while ((!com.ants360.yicamera.a.d.m()) && (!com.ants360.yicamera.a.d.l())) {
      return str;
    }
    return "EUR";
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    if (paramInt == 1) {
      return paramContext.getString(2131559329);
    }
    if (paramInt == 3) {
      return paramContext.getString(2131559331);
    }
    if (paramInt == 6) {
      return paramContext.getString(2131559327);
    }
    if (paramInt == 12) {
      return paramContext.getString(2131559333);
    }
    return String.format(paramContext.getString(2131559335), new Object[] { Integer.valueOf(paramInt) });
  }
  
  public static String a(Context paramContext, int paramInt1, int paramInt2)
  {
    String str = a(paramContext, paramInt1);
    return str + " " + String.format(paramContext.getString(2131559243), new Object[] { Integer.valueOf(paramInt2) });
  }
  
  public static String a(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new StringBuffer(a(paramContext, paramInt1));
    localStringBuffer.append(" ").append(paramInt2).append(" ");
    if (paramBoolean) {}
    for (paramContext = paramContext.getString(2131559114);; paramContext = paramContext.getString(2131559113))
    {
      localStringBuffer.append(paramContext);
      return localStringBuffer.toString();
    }
  }
  
  public static String a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramInt).append("-");
    localStringBuffer.append(paramContext.getString(2131559115));
    return localStringBuffer.toString();
  }
  
  public static String a(Context paramContext, CloudOrderInfo paramCloudOrderInfo)
  {
    return a(paramContext, paramCloudOrderInfo.k, paramCloudOrderInfo.j, paramCloudOrderInfo.D);
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    paramString1 = l.a().c(paramString1);
    if (paramString1 != null) {
      return paramString1.i;
    }
    return l.a().a(paramContext, paramString2);
  }
  
  public static List<CloudFreeInfo> a(JSONObject paramJSONObject, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (!paramJSONObject.has("cschargeinfo_list")) {
      return localArrayList;
    }
    paramJSONObject = paramJSONObject.optJSONArray("cschargeinfo_list");
    int i = 0;
    if (i < paramJSONObject.length())
    {
      CloudFreeInfo localCloudFreeInfo = new CloudFreeInfo();
      JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
      if (!TextUtils.isEmpty(paramString))
      {
        localCloudFreeInfo.a = paramString;
        label69:
        localCloudFreeInfo.c = localJSONObject.optString("sn");
        localCloudFreeInfo.b = localJSONObject.optString("password");
        localCloudFreeInfo.g = localJSONObject.optInt("product_id");
        localCloudFreeInfo.f = localJSONObject.optInt("product_subType");
        localCloudFreeInfo.e = localJSONObject.optInt("product_type");
        localCloudFreeInfo.d = localJSONObject.optInt("service_time");
        localCloudFreeInfo.h = localJSONObject.optLong("start_time");
        localCloudFreeInfo.i = localJSONObject.optLong("end_time");
        localCloudFreeInfo.j = localJSONObject.optLong("expire_time");
        localCloudFreeInfo.k = (localJSONObject.optInt("product_price") * 0.01D);
        if (localJSONObject.optInt("enabledCloudDeviceWorkMode") != 1) {
          break label250;
        }
      }
      label250:
      for (boolean bool = true;; bool = false)
      {
        localCloudFreeInfo.l = bool;
        localArrayList.add(localCloudFreeInfo);
        i += 1;
        break;
        localCloudFreeInfo.a = localJSONObject.optString("uid");
        break label69;
      }
    }
    return localArrayList;
  }
  
  public static List<com.ants360.yicamera.bean.f> a(boolean paramBoolean)
  {
    Object localObject = l.a().b();
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      DeviceInfo localDeviceInfo = (DeviceInfo)((Iterator)localObject).next();
      if (paramBoolean)
      {
        if (localDeviceInfo.U == 0) {
          localArrayList.add(a(localDeviceInfo, false));
        }
      }
      else if (localDeviceInfo.v()) {
        localArrayList.add(a(localDeviceInfo, true));
      }
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString1, String paramString2, long paramLong1, long paramLong2, boolean paramBoolean, String paramString3, final a<String> paramA)
  {
    paramString3 = o.b(paramString3, paramString2);
    v localV = aa.a().b();
    if (paramInt2 == 0) {
      new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString2, paramLong1, paramLong2, paramString3, new com.ants360.yicamera.http.g()
      {
        public void a(int paramAnonymousInt, String paramAnonymousString)
        {
          AntsLog.d("CloudStorageManager", "getCloudVideoInfoForRecord error" + paramAnonymousInt);
          paramA.a(false, paramAnonymousInt, null);
        }
        
        public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
        {
          int i = paramAnonymousJSONObject.optInt("code", -1);
          AntsLog.d("CloudStorageManager", "getCloudVideoInfoForRecord success:" + paramAnonymousJSONObject);
          if (i == 20000)
          {
            if (this.a == 16) {
              paramAnonymousJSONObject = paramAnonymousJSONObject.optString("view_url_X16");
            }
            for (;;)
            {
              paramA.a(true, paramAnonymousInt, paramAnonymousJSONObject);
              return;
              if (this.a == 4) {
                paramAnonymousJSONObject = paramAnonymousJSONObject.optString("view_url_X4");
              } else {
                paramAnonymousJSONObject = paramAnonymousJSONObject.optString("view_url");
              }
            }
          }
          paramA.a(false, paramAnonymousInt, null);
        }
      });
    }
    while (paramInt2 != 1) {
      return;
    }
    new com.ants360.yicamera.http.e(localV.l(), localV.m()).a(localV.a(), paramString1, paramString2, paramLong1, paramLong2, 0, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getCloudVideoInfoForRecord error" + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code", -1);
        AntsLog.d("CloudStorageManager", "getCloudVideoInfoForRecord success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          paramAnonymousJSONObject = paramAnonymousJSONObject.optString("view_url");
          this.a.a(true, paramAnonymousInt, paramAnonymousJSONObject);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(int paramInt1, String paramString1, final int paramInt2, long paramLong1, long paramLong2, final boolean paramBoolean, String paramString2, final String paramString3, final a<Map<String, Object>> paramA)
  {
    paramString2 = o.b(paramString2, paramString1);
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString1, paramLong1, paramLong2, paramString2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getCloudVideoInfo error" + paramAnonymousInt);
        paramAnonymousString = new HashMap();
        paramAnonymousString.put("date_index", Integer.valueOf(paramInt2));
        paramA.a(false, paramAnonymousInt, paramAnonymousString);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code", -1);
        AntsLog.d("CloudStorageManager", "getCloudVideoInfo success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          String str1;
          if (this.a == 16)
          {
            String str2 = paramAnonymousJSONObject.optString("view_url_X16");
            str1 = str2;
            if (TextUtils.isEmpty(str2)) {
              str1 = paramAnonymousJSONObject.optString("view_url");
            }
          }
          for (;;)
          {
            i.a(paramInt2, str1, paramBoolean, paramString3, this.a, paramA);
            return;
            if (this.a == 4) {
              str1 = paramAnonymousJSONObject.optString("view_url_X4");
            } else {
              str1 = paramAnonymousJSONObject.optString("view_url");
            }
          }
        }
        paramAnonymousJSONObject = new HashMap();
        paramAnonymousJSONObject.put("date_index", Integer.valueOf(paramInt2));
        paramA.a(false, paramAnonymousInt, paramAnonymousJSONObject);
      }
    });
  }
  
  public static void a(int paramInt1, final String paramString1, boolean paramBoolean, String paramString2, int paramInt2, final a<Map<String, Object>> paramA)
  {
    j.a().a(paramString1, paramBoolean, paramString2, paramInt2, new j.a()
    {
      public void a(int paramAnonymousInt)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("date_index", Integer.valueOf(this.a));
        paramA.a(false, 0, localHashMap);
      }
      
      public void a(CloudVideoParser paramAnonymousCloudVideoParser)
      {
        Object localObject = paramAnonymousCloudVideoParser.a();
        HashMap localHashMap = new HashMap();
        ArrayList localArrayList = new ArrayList();
        localObject = ((CopyOnWriteArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          CloudVideoParser.c localC = (CloudVideoParser.c)((Iterator)localObject).next();
          CameraHistorySeekBar.Event localEvent = new CameraHistorySeekBar.Event();
          localEvent.a = localC.a;
          localEvent.c = localC.c;
          localEvent.b = (localC.a + localC.c);
          localArrayList.add(localEvent);
        }
        localHashMap.put("date_index", Integer.valueOf(this.a));
        localHashMap.put("url", paramString1);
        localHashMap.put("events", localArrayList);
        localHashMap.put("parser", paramAnonymousCloudVideoParser);
        paramA.a(true, 0, localHashMap);
      }
    });
  }
  
  public static void a(Activity paramActivity)
  {
    Object localObject = l.a().b();
    ArrayList localArrayList;
    if (localObject != null)
    {
      localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        DeviceInfo localDeviceInfo = (DeviceInfo)((Iterator)localObject).next();
        if ((localDeviceInfo.U == 0) && ((com.ants360.yicamera.a.d.h()) || ((!com.ants360.yicamera.a.d.h()) && (localDeviceInfo.ae < System.currentTimeMillis())))) {
          localArrayList.add(localDeviceInfo);
        }
      }
      localObject = new Intent();
      if (!com.ants360.yicamera.a.d.h()) {
        break label157;
      }
      if (localArrayList.size() != 1) {
        break label145;
      }
      ((Intent)localObject).setClass(paramActivity, CloudServiceChooseActivity.class);
      ((Intent)localObject).putExtra("uid", ((DeviceInfo)localArrayList.get(0)).a);
    }
    for (;;)
    {
      paramActivity.startActivity((Intent)localObject);
      return;
      label145:
      ((Intent)localObject).setClass(paramActivity, CloudDeviceChooseActivity.class);
      continue;
      label157:
      if (localArrayList.size() == 1) {
        ((Intent)localObject).putExtra("uid", ((DeviceInfo)localArrayList.get(0)).a);
      }
      ((Intent)localObject).setClass(paramActivity, CloudInternationalProductWebActivity.class);
      ((Intent)localObject).putExtra("path", com.ants360.yicamera.b.c.c());
    }
  }
  
  public static void a(a<Boolean> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).c(localV.a(), new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryCloudUserOrderInfo4UserDelete onYiFailure response=" + paramAnonymousString);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AntsLog.d("CloudStorageManager", "queryCloudUserOrderInfo4UserDelete onYiSuccess response=" + paramAnonymousJSONObject);
        if (paramAnonymousJSONObject.optInt("code", -1) == 20000)
        {
          boolean bool = paramAnonymousJSONObject.optBoolean("ifanyactivesub");
          this.a.a(true, paramAnonymousInt, Boolean.valueOf(bool));
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString, int paramInt)
  {
    a(paramString, paramInt, null);
  }
  
  public static void a(String paramString1, final int paramInt, long paramLong1, long paramLong2, long paramLong3, String paramString2, final a<List<com.ants360.yicamera.bean.g>> paramA)
  {
    paramString2 = o.b(paramString2, paramString1);
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString1, paramLong1, paramLong2, paramLong3, paramString2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getCloudImages onYiFailure");
        paramA.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AntsLog.d("CloudStorageManager", "getCloudImages response:" + paramAnonymousJSONObject.toString());
        int k = paramAnonymousJSONObject.optInt("code");
        if (k == 20000)
        {
          paramAnonymousJSONObject.optString("iv");
          ArrayList localArrayList = new ArrayList();
          if (paramAnonymousJSONObject.has("images"))
          {
            paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONArray("images");
            int i = 0;
            while (i < paramAnonymousJSONObject.length())
            {
              JSONObject localJSONObject = paramAnonymousJSONObject.optJSONObject(i);
              if (localJSONObject.optInt("type") != 1)
              {
                i += 1;
              }
              else
              {
                com.ants360.yicamera.bean.g localG = new com.ants360.yicamera.bean.g();
                localG.g = this.a;
                localG.b = paramInt;
                localG.c = localJSONObject.optInt("type");
                localG.h = localJSONObject.optString("url");
                localG.e = h.i(localG.h);
                localG.a = (localG.g + "_" + localG.e);
                if (localG.h.contains("Expires="))
                {
                  paramAnonymousInt = localG.h.indexOf("Expires=") + 8;
                  localG.f = Long.valueOf(localG.h.substring(paramAnonymousInt, paramAnonymousInt + 10)).longValue();
                }
                Calendar localCalendar = Calendar.getInstance();
                localCalendar.setTimeInMillis(localG.e);
                int m = localCalendar.get(11);
                int j = 0;
                if ((m >= 0) && (m < 6)) {
                  paramAnonymousInt = 0;
                }
                for (;;)
                {
                  localCalendar.set(11, 0);
                  localCalendar.set(12, 0);
                  localCalendar.set(13, 0);
                  localCalendar.set(14, 0);
                  localG.d = (localCalendar.getTimeInMillis() + paramAnonymousInt);
                  localG.i = localJSONObject.optString("password").substring(0, 16);
                  localArrayList.add(localG);
                  break;
                  if ((m >= 6) && (m < 12))
                  {
                    paramAnonymousInt = 1;
                  }
                  else if ((m >= 12) && (m < 18))
                  {
                    paramAnonymousInt = 2;
                  }
                  else
                  {
                    paramAnonymousInt = j;
                    if (m >= 18)
                    {
                      paramAnonymousInt = j;
                      if (m < 24) {
                        paramAnonymousInt = 3;
                      }
                    }
                  }
                }
              }
            }
          }
          Collections.sort(localArrayList);
          paramA.a(true, k, localArrayList);
          return;
        }
        paramA.a(false, k, null);
      }
    });
  }
  
  public static void a(String paramString, int paramInt, a paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).k(localV.a(), paramString, String.valueOf(paramInt), new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "submitPayResult failure : " + paramAnonymousInt);
        if (this.a != null) {
          this.a.a(false, paramAnonymousInt, null);
        }
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "submitPayResult success:" + paramAnonymousJSONObject);
        if (this.a != null)
        {
          if (i == 20000) {
            this.a.a(true, paramAnonymousInt, null);
          }
        }
        else {
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString, long paramLong1, long paramLong2, a paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString, paramLong1, paramLong2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "deleteCloudVideoInfo error" + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code", -1);
        AntsLog.d("CloudStorageManager", "deleteCloudVideoInfo success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          this.a.a(true, paramAnonymousInt, null);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString, final a<List<CloudFreeInfo>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).o(localV.a(), paramString, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryFreeCharge onYiFailure");
        paramA.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AntsLog.d("CloudStorageManager", "queryFreeCharge success:" + paramAnonymousJSONObject);
        paramAnonymousInt = paramAnonymousJSONObject.optInt("code");
        if (paramAnonymousInt == 20000)
        {
          paramAnonymousJSONObject = i.a(paramAnonymousJSONObject, this.a);
          if (paramAnonymousJSONObject.size() >= 2) {
            Collections.sort(paramAnonymousJSONObject);
          }
          paramA.a(true, paramAnonymousInt, paramAnonymousJSONObject);
          return;
        }
        paramA.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString1, String paramString2, a<Void> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).j(localV.a(), paramString1, paramString2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "submitCloudOrder failure " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        paramAnonymousInt = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "updateCloudOrder success:" + paramAnonymousJSONObject);
        if (paramAnonymousInt == 20000)
        {
          this.a.a(true, paramAnonymousInt, null);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, a<List<List<CloudStorageInfo>>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).d(localV.a(), paramString1, paramString3, paramString2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getProductInfos failure");
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code", -1);
        AntsLog.d("CloudStorageManager", "getProductInfos success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          ArrayList localArrayList = new ArrayList();
          Object localObject = new TreeMap();
          JSONArray localJSONArray = paramAnonymousJSONObject.optJSONArray("product_list");
          paramAnonymousInt = 0;
          while (paramAnonymousInt < localJSONArray.length())
          {
            CloudStorageInfo localCloudStorageInfo = i.c(localJSONArray.optJSONObject(paramAnonymousInt));
            if (localCloudStorageInfo == null)
            {
              paramAnonymousInt += 1;
            }
            else
            {
              if (!((Map)localObject).containsKey(Integer.valueOf(localCloudStorageInfo.c)))
              {
                paramAnonymousJSONObject = new ArrayList();
                ((Map)localObject).put(Integer.valueOf(localCloudStorageInfo.c), paramAnonymousJSONObject);
              }
              for (;;)
              {
                paramAnonymousJSONObject.add(localCloudStorageInfo);
                break;
                paramAnonymousJSONObject = (List)((Map)localObject).get(Integer.valueOf(localCloudStorageInfo.c));
              }
            }
          }
          paramAnonymousJSONObject = ((Map)localObject).values().iterator();
          while (paramAnonymousJSONObject.hasNext())
          {
            localObject = (List)paramAnonymousJSONObject.next();
            Collections.sort((List)localObject);
            localArrayList.add(localObject);
          }
          this.a.a(true, i, localArrayList);
          return;
        }
        this.a.a(false, i, null);
      }
    });
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, a<com.tencent.a.a.e.b> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString1, paramString2, paramString3, paramString4, paramString5, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryWXPayInfo failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "queryWXPayInfo success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          com.tencent.a.a.e.b localB = new com.tencent.a.a.e.b();
          localB.c = paramAnonymousJSONObject.optString("appid");
          localB.d = paramAnonymousJSONObject.optString("partnerid");
          localB.e = paramAnonymousJSONObject.optString("prepayid");
          localB.f = paramAnonymousJSONObject.optString("noncestr");
          localB.g = paramAnonymousJSONObject.optString("timestamp");
          localB.h = paramAnonymousJSONObject.optString("package");
          localB.i = paramAnonymousJSONObject.optString("sign");
          this.a.a(true, paramAnonymousInt, localB);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, a<Map<String, Object>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "submitCloudOrder failure " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        paramAnonymousInt = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "submitCloudOrder success:" + paramAnonymousJSONObject);
        if (paramAnonymousInt == 20000)
        {
          double d = paramAnonymousJSONObject.optDouble("final_price");
          String str = paramAnonymousJSONObject.optString("order_code");
          paramAnonymousJSONObject = paramAnonymousJSONObject.optString("totalfee");
          HashMap localHashMap = new HashMap();
          localHashMap.put("finalPrice", Double.valueOf(d * 0.01D));
          localHashMap.put("orderCode", str);
          localHashMap.put("totalfee", paramAnonymousJSONObject);
          this.a.a(true, paramAnonymousInt, localHashMap);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, final a<List<CloudOrderInfo>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString1, paramString2, paramString3, paramBoolean, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryCloudUserOrderInfos Failure : " + paramAnonymousInt);
        paramA.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = 0;
        AntsLog.d("CloudStorageManager", "queryCloudUserOrderInfos success:" + paramAnonymousJSONObject);
        ArrayList localArrayList = new ArrayList();
        int j = paramAnonymousJSONObject.optInt("code", -1);
        if (j == 20000)
        {
          JSONArray localJSONArray = paramAnonymousJSONObject.optJSONArray("order_list");
          if (i < localJSONArray.length())
          {
            paramAnonymousJSONObject = localJSONArray.optJSONObject(i);
            if (this.a)
            {
              paramAnonymousJSONObject = i.b(paramAnonymousJSONObject);
              label89:
              if (paramAnonymousJSONObject != null) {
                break label108;
              }
            }
            for (;;)
            {
              i += 1;
              break;
              paramAnonymousJSONObject = i.a(paramAnonymousJSONObject);
              break label89;
              label108:
              localArrayList.add(paramAnonymousJSONObject);
            }
          }
          Collections.sort(localArrayList);
          paramA.a(true, paramAnonymousInt, localArrayList);
          return;
        }
        if (j == 20200)
        {
          paramA.a(true, paramAnonymousInt, localArrayList);
          return;
        }
        paramA.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean, a paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).a(localV.a(), paramString1, paramString2, paramBoolean, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "cancelOrder failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "cancelOrder success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          this.a.a(true, paramAnonymousInt, null);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void a(String paramString, boolean paramBoolean, a<List<CloudOrderInfo>> paramA)
  {
    a(paramString, "", "", paramBoolean, paramA);
  }
  
  public static void a(String paramString, boolean paramBoolean1, boolean paramBoolean2, a<Void> paramA)
  {
    if (paramBoolean1) {}
    for (int i = 1;; i = 0)
    {
      if (paramBoolean2) {}
      for (int j = 0;; j = 1)
      {
        v localV = aa.a().b();
        new com.ants360.yicamera.http.e(localV.l(), localV.m()).c(localV.a(), paramString, String.valueOf(i), String.valueOf(j), new com.ants360.yicamera.http.g()
        {
          public void a(int paramAnonymousInt, String paramAnonymousString)
          {
            AntsLog.d("CloudStorageManager", "setCloudSwitch failure " + paramAnonymousInt);
            this.a.a(false, paramAnonymousInt, null);
          }
          
          public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
          {
            AntsLog.d("CloudStorageManager", "setCloudSwitch success:" + paramAnonymousJSONObject);
            this.a.a(true, paramAnonymousInt, null);
          }
        });
        return;
      }
    }
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool2 = false;
    paramContext = paramContext.getPackageManager().getInstalledPackages(0);
    boolean bool1 = bool2;
    int i;
    if (paramContext != null) {
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < paramContext.size())
      {
        if (((PackageInfo)paramContext.get(i)).packageName.equals("com.tencent.mm")) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static CloudOrderInfo b(JSONObject paramJSONObject)
  {
    int i = 0;
    boolean bool = true;
    int j = paramJSONObject.optInt("order_type");
    int k = paramJSONObject.optInt("client_channel");
    if ((j < 1) || (j > 2) || (k < 0) || (k > 1)) {
      return null;
    }
    CloudOrderInfo localCloudOrderInfo = new CloudOrderInfo();
    localCloudOrderInfo.a = paramJSONObject.optString("userid");
    localCloudOrderInfo.l = paramJSONObject.optInt("status");
    localCloudOrderInfo.b = paramJSONObject.optString("uid").trim();
    localCloudOrderInfo.I = j;
    localCloudOrderInfo.J = paramJSONObject.optInt("pay_type");
    if (TextUtils.isEmpty(localCloudOrderInfo.b)) {
      localCloudOrderInfo.b = ",";
    }
    label213:
    label366:
    Object localObject;
    if (paramJSONObject.has("ifhastrialperiod"))
    {
      localCloudOrderInfo.s = paramJSONObject.optBoolean("ifhastrialperiod");
      localCloudOrderInfo.t = paramJSONObject.optBoolean("ifhascoupon");
      if (paramJSONObject.has("nextbillingamount")) {
        localCloudOrderInfo.B = paramJSONObject.optDouble("nextbillingamount");
      }
      if (!paramJSONObject.has("trialstartdate")) {
        break label518;
      }
      localCloudOrderInfo.z = paramJSONObject.optLong("trialstartdate");
      localCloudOrderInfo.A = paramJSONObject.optLong("trialenddate");
      localCloudOrderInfo.n = paramJSONObject.optLong("start_time");
      localCloudOrderInfo.o = paramJSONObject.optLong("end_time");
      localCloudOrderInfo.u = paramJSONObject.optInt("trialduration");
      localCloudOrderInfo.v = paramJSONObject.optInt("subscriptionstatus");
      localCloudOrderInfo.p = paramJSONObject.optLong("createdatdate");
      localCloudOrderInfo.w = paramJSONObject.optLong("firstbillingdate");
      localCloudOrderInfo.x = paramJSONObject.optLong("nextbillingdate");
      localCloudOrderInfo.y = paramJSONObject.optLong("paidthroughdate");
      localCloudOrderInfo.k = paramJSONObject.optInt("servicetime");
      localCloudOrderInfo.j = paramJSONObject.optInt("subtype");
      localCloudOrderInfo.e = paramJSONObject.optString("ordercode");
      localCloudOrderInfo.K = k;
      if (j != 2) {
        break label555;
      }
      localCloudOrderInfo.m = paramJSONObject.optDouble("subscriptionprice");
      if (paramJSONObject.has("sku_constraints"))
      {
        localObject = paramJSONObject.optJSONObject("sku_constraints");
        localCloudOrderInfo.C = ((JSONObject)localObject).optInt("maxDeviceCnt");
        if (((JSONObject)localObject).optInt("enabledCloudDeviceWorkMode") != 1) {
          break label569;
        }
      }
    }
    for (;;)
    {
      localCloudOrderInfo.D = bool;
      localObject = paramJSONObject.optString("model").trim();
      paramJSONObject = (JSONObject)localObject;
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        paramJSONObject = ",";
      }
      localObject = new StringBuffer();
      paramJSONObject = paramJSONObject.split(",");
      j = paramJSONObject.length;
      while (i < j)
      {
        ((StringBuffer)localObject).append(DeviceInfo.c(paramJSONObject[i])).append(",");
        i += 1;
      }
      if (!paramJSONObject.has("ifintrial")) {
        break;
      }
      localCloudOrderInfo.s = paramJSONObject.optBoolean("ifintrial");
      break;
      label518:
      if (!paramJSONObject.has("coupon_start")) {
        break label213;
      }
      localCloudOrderInfo.z = paramJSONObject.optLong("coupon_start");
      localCloudOrderInfo.A = paramJSONObject.optLong("coupon_end");
      break label213;
      label555:
      localCloudOrderInfo.m = paramJSONObject.optDouble("price");
      break label366;
      label569:
      bool = false;
    }
    if (((StringBuffer)localObject).length() > 0) {
      ((StringBuffer)localObject).deleteCharAt(((StringBuffer)localObject).length() - 1);
    }
    localCloudOrderInfo.d = ((StringBuffer)localObject).toString();
    return localCloudOrderInfo;
  }
  
  public static String b()
  {
    String str = "US$";
    if (com.ants360.yicamera.a.d.h()) {
      str = "￥";
    }
    while ((!com.ants360.yicamera.a.d.m()) && (!com.ants360.yicamera.a.d.l())) {
      return str;
    }
    return "€";
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    if (paramInt == 1) {
      return paramContext.getString(2131559330);
    }
    if (paramInt == 3) {
      return paramContext.getString(2131559332);
    }
    if (paramInt == 6) {
      return paramContext.getString(2131559328);
    }
    if (paramInt == 12) {
      return paramContext.getString(2131559334);
    }
    return String.format(paramContext.getString(2131559335), new Object[] { Integer.valueOf(paramInt) });
  }
  
  public static String b(Context paramContext, CloudOrderInfo paramCloudOrderInfo)
  {
    return a(paramContext, paramCloudOrderInfo.j, paramCloudOrderInfo.D);
  }
  
  public static void b(a<List<UserCouponInfo>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).e(localV.a(), new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryCloudCoupon Failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AntsLog.d("CloudStorageManager", "queryCloudCoupon success:" + paramAnonymousJSONObject);
        if (paramAnonymousJSONObject.optInt("code") == 20000)
        {
          ArrayList localArrayList = new ArrayList();
          JSONArray localJSONArray = paramAnonymousJSONObject.optJSONArray("coupon_list");
          int i = 0;
          if (i < localJSONArray.length())
          {
            UserCouponInfo localUserCouponInfo = new UserCouponInfo();
            JSONObject localJSONObject = localJSONArray.optJSONObject(i);
            localUserCouponInfo.a = localJSONObject.optString("coupon_code");
            localUserCouponInfo.b = localJSONObject.optInt("sku_id");
            localUserCouponInfo.d = localJSONObject.optInt("coupon_type");
            localUserCouponInfo.c = localJSONObject.optInt("sku_groupid");
            localUserCouponInfo.e = localJSONObject.optInt("subtype");
            localUserCouponInfo.f = localJSONObject.optInt("service_time");
            localUserCouponInfo.g = localJSONObject.optInt("coupon_time");
            localUserCouponInfo.i = localJSONObject.optLong("created_date");
            localUserCouponInfo.j = localJSONObject.optLong("expired_date");
            localUserCouponInfo.p = paramAnonymousJSONObject.optLong("lastmodified_date");
            if (localJSONObject.has("used"))
            {
              localUserCouponInfo.k = localJSONObject.optBoolean("used");
              label223:
              localUserCouponInfo.o = (localJSONObject.optDouble("coupon_discount") * 0.01D);
              if (localUserCouponInfo.o < 0.0D) {
                localUserCouponInfo.o = 0.0D;
              }
              if (localUserCouponInfo.j >= System.currentTimeMillis()) {
                break label395;
              }
              bool = true;
              label270:
              localUserCouponInfo.l = bool;
              if (localJSONObject.has("sku_constraints"))
              {
                localJSONObject = localJSONObject.optJSONObject("sku_constraints");
                localUserCouponInfo.h = localJSONObject.optInt("maxDeviceCnt");
                if (localJSONObject.optInt("enabledCloudDeviceWorkMode") != 1) {
                  break label401;
                }
              }
            }
            label395:
            label401:
            for (boolean bool = true;; bool = false)
            {
              localUserCouponInfo.m = bool;
              localArrayList.add(localUserCouponInfo);
              int j;
              do
              {
                i += 1;
                break;
                if (!localJSONObject.has("coupon_status")) {
                  break label223;
                }
                j = localJSONObject.optInt("coupon_status");
              } while (j == 2);
              if (j > 0) {}
              for (bool = true;; bool = false)
              {
                localUserCouponInfo.k = bool;
                break;
              }
              bool = false;
              break label270;
            }
          }
          Collections.sort(localArrayList);
          this.a.a(true, paramAnonymousInt, localArrayList);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void b(String paramString, long paramLong1, long paramLong2, a<com.ants360.yicamera.bean.a.b> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).b(localV.a(), paramString, paramLong1, paramLong2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.e("CloudStorageManager", "getCloudVideoDates error" + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int k = paramAnonymousJSONObject.optInt("code", -1);
        AntsLog.d("CloudStorageManager", "getCloudVideoDates success:" + paramAnonymousJSONObject);
        if (k == 20000)
        {
          ArrayList localArrayList1 = new ArrayList();
          paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONArray("stats");
          int i = 0;
          while (i < paramAnonymousJSONObject.length())
          {
            JSONObject localJSONObject1 = paramAnonymousJSONObject.optJSONObject(i);
            ArrayList localArrayList2 = new ArrayList();
            Object localObject = localJSONObject1.optJSONArray("days");
            int j = 0;
            while (j < ((JSONArray)localObject).length())
            {
              JSONObject localJSONObject2 = ((JSONArray)localObject).optJSONObject(j);
              double d = localJSONObject2.optDouble("duration");
              a localA = new a();
              localA.a(d);
              localA.a(localJSONObject2.optInt("cnt"));
              localA.a(localJSONObject2.optLong("start"));
              localA.b(localJSONObject2.optLong("end"));
              localA.c(localJSONObject2.optLong("ts"));
              localArrayList2.add(localA);
              j += 1;
            }
            localObject = new com.ants360.yicamera.bean.a.c();
            ((com.ants360.yicamera.bean.a.c)localObject).a(localJSONObject1.optString("uid"));
            ((com.ants360.yicamera.bean.a.c)localObject).a(localArrayList2);
            localArrayList1.add(localObject);
            i += 1;
          }
          paramAnonymousJSONObject = new com.ants360.yicamera.bean.a.b();
          paramAnonymousJSONObject.a(k);
          paramAnonymousJSONObject.a(localArrayList1);
          this.a.a(true, paramAnonymousInt, paramAnonymousJSONObject);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void b(String paramString, final a<Boolean> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).d(localV.a(), new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "checkTrailPeriod failure " + paramAnonymousInt);
        paramA.a(false, paramAnonymousInt, Boolean.valueOf(false));
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        boolean bool2 = false;
        AntsLog.d("CloudStorageManager", "checkTrailPeriod success:" + paramAnonymousJSONObject);
        int j = paramAnonymousJSONObject.optInt("code");
        if (j == 20000)
        {
          boolean bool3 = paramAnonymousJSONObject.optBoolean("triedoutalready");
          paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONArray("uids");
          int i = 0;
          paramAnonymousInt = 0;
          if (i < paramAnonymousJSONObject.length())
          {
            String str = paramAnonymousJSONObject.optString(i);
            DeviceInfo localDeviceInfo = l.a().c(str);
            if (localDeviceInfo != null) {
              localDeviceInfo.aj = true;
            }
            if (TextUtils.isEmpty(this.a)) {
              if (!TextUtils.isEmpty(str)) {
                paramAnonymousInt = 1;
              }
            }
            for (;;)
            {
              i += 1;
              break;
              if (str.equals(this.a)) {
                paramAnonymousInt = 1;
              }
            }
          }
          boolean bool1 = bool2;
          if (!bool3)
          {
            bool1 = bool2;
            if (paramAnonymousInt != 0) {
              bool1 = true;
            }
          }
          paramA.a(true, j, Boolean.valueOf(bool1));
          return;
        }
        paramA.a(false, j, Boolean.valueOf(false));
      }
    });
  }
  
  public static void b(String paramString1, String paramString2, a<com.ants360.yicamera.bean.d> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).l(localV.a(), paramString1, paramString2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        boolean bool = false;
        AntsLog.d("CloudStorageManager", "checkCloudCharge response : " + paramAnonymousJSONObject);
        paramAnonymousInt = paramAnonymousJSONObject.optInt("code");
        if (paramAnonymousInt == 20000)
        {
          new HashMap();
          com.ants360.yicamera.bean.d localD = new com.ants360.yicamera.bean.d();
          localD.a = paramAnonymousJSONObject.optInt("service_time");
          localD.b = paramAnonymousJSONObject.optInt("product_subtype");
          localD.d = paramAnonymousJSONObject.optLong("start_time");
          localD.e = paramAnonymousJSONObject.optLong("end_time");
          localD.f = paramAnonymousJSONObject.optLong("expire_time");
          localD.c = paramAnonymousJSONObject.optInt("used_flag");
          if (paramAnonymousJSONObject.has("sku_constraints"))
          {
            paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONObject("sku_constraints");
            localD.g = paramAnonymousJSONObject.optInt("maxDeviceCnt");
            if (paramAnonymousJSONObject.optInt("enabledCloudDeviceWorkMode") == 1) {
              bool = true;
            }
            localD.h = bool;
          }
          this.a.a(true, paramAnonymousInt, localD);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, a<List<List<List<CloudStorageInfo>>>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).d(localV.a(), paramString1, paramString3, paramString2, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getProductInfos failure");
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        ArrayList localArrayList = new ArrayList();
        int i = paramAnonymousJSONObject.optInt("code", -1);
        AntsLog.d("CloudStorageManager", "getProductInfos success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          Object localObject2 = new TreeMap();
          Object localObject3 = paramAnonymousJSONObject.optJSONArray("product_list");
          paramAnonymousInt = 0;
          Object localObject1;
          while (paramAnonymousInt < ((JSONArray)localObject3).length())
          {
            CloudStorageInfo localCloudStorageInfo = i.c(((JSONArray)localObject3).optJSONObject(paramAnonymousInt));
            if (localCloudStorageInfo == null)
            {
              paramAnonymousInt += 1;
            }
            else
            {
              localObject1 = String.valueOf(localCloudStorageInfo.m) + localCloudStorageInfo.j;
              if (!((Map)localObject2).containsKey(localObject1))
              {
                paramAnonymousJSONObject = new TreeMap();
                ((Map)localObject2).put(localObject1, paramAnonymousJSONObject);
                label162:
                if (paramAnonymousJSONObject.containsKey(Integer.valueOf(localCloudStorageInfo.c))) {
                  break label236;
                }
                localObject1 = new ArrayList();
                paramAnonymousJSONObject.put(Integer.valueOf(localCloudStorageInfo.c), localObject1);
              }
              label236:
              for (paramAnonymousJSONObject = (JSONObject)localObject1;; paramAnonymousJSONObject = (List)paramAnonymousJSONObject.get(Integer.valueOf(localCloudStorageInfo.c)))
              {
                paramAnonymousJSONObject.add(localCloudStorageInfo);
                break;
                paramAnonymousJSONObject = (Map)((Map)localObject2).get(localObject1);
                break label162;
              }
            }
          }
          paramAnonymousJSONObject = ((Map)localObject2).values().iterator();
          while (paramAnonymousJSONObject.hasNext())
          {
            localObject2 = (Map)paramAnonymousJSONObject.next();
            localObject1 = new ArrayList();
            localObject2 = ((Map)localObject2).values().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (List)((Iterator)localObject2).next();
              Collections.sort((List)localObject3);
              ((List)localObject1).add(localObject3);
            }
            localArrayList.add(localObject1);
          }
          this.a.a(true, i, localArrayList);
          return;
        }
        this.a.a(false, i, null);
      }
    });
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, a<String> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).b(localV.a(), paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryAlipayInfo failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "queryAlipayInfo success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          paramAnonymousJSONObject = paramAnonymousJSONObject.optString("alipay_string");
          this.a.a(true, paramAnonymousInt, paramAnonymousJSONObject);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void b(String paramString, boolean paramBoolean, a<Void> paramA)
  {
    a(paramString, paramBoolean, false, paramA);
  }
  
  public static void c()
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).d(localV.a(), new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "checkTrailPeriod failure " + paramAnonymousInt);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        boolean bool = true;
        if (paramAnonymousJSONObject.optInt("code") == 20000) {
          if (paramAnonymousJSONObject.optBoolean("triedoutalready", true)) {
            break label29;
          }
        }
        for (;;)
        {
          i.b = bool;
          return;
          label29:
          bool = false;
        }
      }
    });
  }
  
  public static void c(final a<List<com.ants360.yicamera.bean.f>> paramA)
  {
    final v localV = aa.a().b();
    com.ants360.yicamera.http.f localF = new com.ants360.yicamera.http.f(localV.l(), localV.m());
    localF.t(localV.a(), "", new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getCloudDeviceInfo getMyCloudStateInfo onYiFailure");
        i.d().clear();
        i.d().addAll(i.a(false));
        paramA.a(true, paramAnonymousInt, i.d());
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        i.d().clear();
        int i = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "getCloudDeviceInfo getMyCloudStateInfo response : " + paramAnonymousJSONObject.toString());
        if (i == 20000)
        {
          Object localObject1 = l.a().b();
          Object localObject2 = ((List)localObject1).iterator();
          Object localObject3;
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (DeviceInfo)((Iterator)localObject2).next();
            ((DeviceInfo)localObject3).ad = 0L;
            ((DeviceInfo)localObject3).ae = 0L;
            ((DeviceInfo)localObject3).af = 0;
            ((DeviceInfo)localObject3).ah = 0;
            ((DeviceInfo)localObject3).a(false);
          }
          k.a().b((List)localObject1);
          localObject1 = paramAnonymousJSONObject.optJSONArray("devices");
          i = paramAnonymousJSONObject.optInt("maxVideoActiveDays");
          paramAnonymousInt = 0;
          if (paramAnonymousInt < ((JSONArray)localObject1).length())
          {
            paramAnonymousJSONObject = ((JSONArray)localObject1).optJSONObject(paramAnonymousInt);
            localObject2 = paramAnonymousJSONObject.optString("uid");
            if (TextUtils.isEmpty((CharSequence)localObject2)) {}
            for (;;)
            {
              paramAnonymousInt += 1;
              break;
              localObject3 = l.a().c((String)localObject2);
              long l1 = paramAnonymousJSONObject.optLong("start") * 1000L;
              long l2 = paramAnonymousJSONObject.optLong("end") * 1000L;
              if (localObject3 != null)
              {
                ((DeviceInfo)localObject3).ag = i;
                ((DeviceInfo)localObject3).ad = l1;
                ((DeviceInfo)localObject3).ae = l2;
                ((DeviceInfo)localObject3).af = paramAnonymousJSONObject.optInt("subType");
                ((DeviceInfo)localObject3).ah = paramAnonymousJSONObject.optInt("order_type");
                if (h.c(System.currentTimeMillis(), ((DeviceInfo)localObject3).ae) + ((DeviceInfo)localObject3).af >= 0) {}
                for (boolean bool = true;; bool = false)
                {
                  ((DeviceInfo)localObject3).a(bool);
                  k.a().a((DeviceInfo)localObject3);
                  break;
                }
              }
              if (!com.ants360.yicamera.a.d.h())
              {
                localObject3 = paramAnonymousJSONObject.optString("model");
                if (DeviceInfo.b((String)localObject3))
                {
                  com.ants360.yicamera.bean.f localF = new com.ants360.yicamera.bean.f();
                  localF.a = ((String)localObject2);
                  localF.j = i.a(l1, l2);
                  localF.c = "";
                  localF.b = "";
                  localF.g = true;
                  localF.k = i;
                  localF.d = DeviceInfo.c((String)localObject3);
                  localF.i = false;
                  localF.l = l1;
                  localF.m = l2;
                  localF.n = paramAnonymousJSONObject.optInt("subType");
                  localF.o = paramAnonymousJSONObject.optInt("order_type");
                  i.d().add(localF);
                }
              }
            }
          }
          i.d().addAll(i.a(false));
          this.a.f(localV.a(), new com.ants360.yicamera.http.g()
          {
            public void a(int paramAnonymous2Int, String paramAnonymous2String)
            {
              AntsLog.d("CloudStorageManager", "getCloudDeviceInfo getCloudDevices onYiFailure");
              i.d().clear();
              Collections.sort(i.d());
              i.22.this.c.a(true, paramAnonymous2Int, i.d());
            }
            
            public void a(int paramAnonymous2Int, JSONObject paramAnonymous2JSONObject)
            {
              AntsLog.d("CloudStorageManager", "getCloudDeviceInfo getCloudDevices success:" + paramAnonymous2JSONObject);
              int i;
              String str;
              if (paramAnonymous2JSONObject.optInt("code") == 20000)
              {
                JSONArray localJSONArray = paramAnonymous2JSONObject.optJSONArray("uids");
                paramAnonymous2JSONObject = paramAnonymous2JSONObject.optJSONArray("models");
                if (localJSONArray.length() == paramAnonymous2JSONObject.length())
                {
                  i = 0;
                  if (i < localJSONArray.length())
                  {
                    str = localJSONArray.optString(i);
                    if (!TextUtils.isEmpty(str)) {}
                  }
                }
              }
              label388:
              for (;;)
              {
                i += 1;
                break;
                Object localObject1 = i.d().iterator();
                do
                {
                  if (!((Iterator)localObject1).hasNext()) {
                    break;
                  }
                } while (!str.equals(((com.ants360.yicamera.bean.f)((Iterator)localObject1).next()).a));
                for (int j = 0;; j = 1)
                {
                  if (j == 0) {
                    break label388;
                  }
                  Object localObject2 = paramAnonymous2JSONObject.optString(i);
                  if (!DeviceInfo.b((String)localObject2)) {
                    break;
                  }
                  localObject1 = new com.ants360.yicamera.bean.f();
                  ((com.ants360.yicamera.bean.f)localObject1).a = str;
                  ((com.ants360.yicamera.bean.f)localObject1).c = "";
                  ((com.ants360.yicamera.bean.f)localObject1).b = "";
                  ((com.ants360.yicamera.bean.f)localObject1).h = true;
                  ((com.ants360.yicamera.bean.f)localObject1).i = false;
                  ((com.ants360.yicamera.bean.f)localObject1).d = DeviceInfo.c((String)localObject2);
                  ((com.ants360.yicamera.bean.f)localObject1).g = true;
                  j = 0;
                  for (;;)
                  {
                    if (j < this.a.length())
                    {
                      localObject2 = this.a.optJSONObject(j);
                      if (str.equals(((JSONObject)localObject2).optString("uid")))
                      {
                        long l1 = ((JSONObject)localObject2).optLong("start") * 1000L;
                        long l2 = ((JSONObject)localObject2).optLong("end") * 1000L;
                        ((com.ants360.yicamera.bean.f)localObject1).j = i.a(l1, l2);
                        ((com.ants360.yicamera.bean.f)localObject1).l = l1;
                        ((com.ants360.yicamera.bean.f)localObject1).m = l2;
                        ((com.ants360.yicamera.bean.f)localObject1).n = ((JSONObject)localObject2).optInt("subType");
                        ((com.ants360.yicamera.bean.f)localObject1).o = ((JSONObject)localObject2).optInt("order_type");
                      }
                    }
                    else
                    {
                      i.d().add(localObject1);
                      break;
                    }
                    j += 1;
                  }
                  Collections.sort(i.d());
                  i.22.this.c.a(true, paramAnonymous2Int, i.d());
                  return;
                }
              }
            }
          });
          return;
        }
        i.d().clear();
        i.d().addAll(i.a(false));
        paramA.a(true, paramAnonymousInt, i.d());
      }
    });
  }
  
  public static void c(String paramString, a<String> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).p(localV.a(), paramString, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "checkDeviceActiveFromServer failure " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AntsLog.d("CloudStorageManager", "checkDeviceActiveFromServer success:" + paramAnonymousJSONObject);
        int i = paramAnonymousJSONObject.optInt("code");
        if (i == 20000)
        {
          Object localObject1 = paramAnonymousJSONObject.optString("uid");
          paramAnonymousJSONObject = (JSONObject)localObject1;
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            paramAnonymousJSONObject = ",";
          }
          paramAnonymousJSONObject = paramAnonymousJSONObject.split(",");
          localObject1 = new StringBuffer();
          int j = paramAnonymousJSONObject.length;
          paramAnonymousInt = 0;
          while (paramAnonymousInt < j)
          {
            Object localObject2 = paramAnonymousJSONObject[paramAnonymousInt];
            localObject2 = l.a().c((String)localObject2);
            if (localObject2 != null) {
              ((StringBuffer)localObject1).append(((DeviceInfo)localObject2).i).append(",");
            }
            paramAnonymousInt += 1;
          }
          if (((StringBuffer)localObject1).length() > 0) {
            ((StringBuffer)localObject1).deleteCharAt(((StringBuffer)localObject1).length() - 1);
          }
          this.a.a(true, i, ((StringBuffer)localObject1).toString());
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  private static CloudStorageInfo d(JSONObject paramJSONObject)
  {
    boolean bool2 = true;
    int i = paramJSONObject.optInt("product_type");
    if (i != 1) {
      return null;
    }
    CloudStorageInfo localCloudStorageInfo = new CloudStorageInfo();
    localCloudStorageInfo.a = paramJSONObject.optInt("product_id");
    localCloudStorageInfo.d = paramJSONObject.optInt("service_time");
    localCloudStorageInfo.e = (paramJSONObject.optDouble("product_price") * 0.01D);
    localCloudStorageInfo.b = i;
    localCloudStorageInfo.c = paramJSONObject.optInt("product_subtype");
    localCloudStorageInfo.f = (paramJSONObject.optDouble("discount") / 100.0D);
    localCloudStorageInfo.g = paramJSONObject.optDouble("discount_rate");
    localCloudStorageInfo.h = paramJSONObject.optInt("coupon");
    localCloudStorageInfo.i = paramJSONObject.optInt("sku");
    localCloudStorageInfo.k = paramJSONObject.optString("product_currency");
    if (localCloudStorageInfo.f == 0.0D)
    {
      bool1 = false;
      localCloudStorageInfo.l = bool1;
      if (paramJSONObject.has("sku_constraints"))
      {
        paramJSONObject = paramJSONObject.optJSONObject("sku_constraints");
        localCloudStorageInfo.j = paramJSONObject.optInt("maxDeviceCnt");
        if (paramJSONObject.optInt("enabledCloudDeviceWorkMode") != 1) {
          break label220;
        }
      }
    }
    label220:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localCloudStorageInfo.m = bool1;
      return localCloudStorageInfo;
      bool1 = true;
      break;
    }
  }
  
  public static void d(String paramString, a<List<com.ants360.yicamera.bean.e>> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).q(localV.a(), paramString, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "queryBrainTreeTransaction Failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        int i = 0;
        AntsLog.d("CloudStorageManager", "queryBrainTreeTransaction success:" + paramAnonymousJSONObject);
        if (paramAnonymousJSONObject.optInt("code") == 20000)
        {
          ArrayList localArrayList = new ArrayList();
          paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONArray("data");
          while (i < paramAnonymousJSONObject.length())
          {
            JSONObject localJSONObject = paramAnonymousJSONObject.optJSONObject(i);
            com.ants360.yicamera.bean.e localE = new com.ants360.yicamera.bean.e();
            localE.a = localJSONObject.optDouble("amount", 0.0D);
            localE.b = localJSONObject.optLong("createddate");
            localE.c = localJSONObject.optString("status");
            if (localE.a > 0.0D) {
              localArrayList.add(localE);
            }
            i += 1;
          }
          Collections.sort(localArrayList);
          this.a.a(true, paramAnonymousInt, localArrayList);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void e(String paramString, a<UserCouponInfo> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).r(localV.a(), paramString, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "checkCloudCoupon Failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        boolean bool = false;
        AntsLog.d("CloudStorageManager", "checkCloudCoupon success:" + paramAnonymousJSONObject);
        paramAnonymousInt = paramAnonymousJSONObject.optInt("code");
        if (paramAnonymousInt == 20000)
        {
          UserCouponInfo localUserCouponInfo = new UserCouponInfo();
          localUserCouponInfo.i = paramAnonymousJSONObject.optLong("created_date");
          localUserCouponInfo.f = paramAnonymousJSONObject.optInt("servicetime");
          localUserCouponInfo.g = paramAnonymousJSONObject.optInt("coupon_time");
          localUserCouponInfo.e = paramAnonymousJSONObject.optInt("subtype");
          localUserCouponInfo.b = paramAnonymousJSONObject.optInt("sku_id");
          localUserCouponInfo.j = paramAnonymousJSONObject.optLong("expired_date");
          localUserCouponInfo.c = paramAnonymousJSONObject.optInt("sku_groupid");
          localUserCouponInfo.p = paramAnonymousJSONObject.optLong("lastmodified_date");
          localUserCouponInfo.q = paramAnonymousJSONObject.optInt("status");
          if (paramAnonymousJSONObject.has("sku_constraints"))
          {
            paramAnonymousJSONObject = paramAnonymousJSONObject.optJSONObject("sku_constraints");
            localUserCouponInfo.h = paramAnonymousJSONObject.optInt("maxDeviceCnt");
            if (paramAnonymousJSONObject.optInt("enabledCloudDeviceWorkMode") == 1) {
              bool = true;
            }
            localUserCouponInfo.m = bool;
          }
          this.a.a(true, paramAnonymousInt, localUserCouponInfo);
          return;
        }
        this.a.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static void f(String paramString, a<Boolean> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).s(localV.a(), paramString, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "checkCloudCoupon Failure : " + paramAnonymousInt);
        this.a.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        AntsLog.d("CloudStorageManager", "activateCloudCoupon success:" + paramAnonymousJSONObject);
        paramAnonymousInt = paramAnonymousJSONObject.optInt("code");
        if (paramAnonymousInt == 20000)
        {
          this.a.a(true, paramAnonymousInt, Boolean.valueOf(true));
          return;
        }
        this.a.a(false, paramAnonymousInt, Boolean.valueOf(false));
      }
    });
  }
  
  public static void g(String paramString, final a<com.ants360.yicamera.bean.j> paramA)
  {
    v localV = aa.a().b();
    new com.ants360.yicamera.http.f(localV.l(), localV.m()).t(localV.a(), paramString, new com.ants360.yicamera.http.g()
    {
      public void a(int paramAnonymousInt, String paramAnonymousString)
      {
        AntsLog.d("CloudStorageManager", "getMyCloudStateInfo failure");
        paramA.a(false, paramAnonymousInt, null);
      }
      
      public void a(int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        boolean bool2 = false;
        int i = paramAnonymousJSONObject.optInt("code");
        AntsLog.d("CloudStorageManager", "getMyCloudStateInfo success:" + paramAnonymousJSONObject);
        if (i == 20000)
        {
          com.ants360.yicamera.bean.j localJ = new com.ants360.yicamera.bean.j();
          localJ.a = this.a;
          if (paramAnonymousJSONObject.optInt("css_flag") == 1)
          {
            bool1 = true;
            localJ.f = bool1;
            if (paramAnonymousJSONObject.optInt("css_mode") != 0) {
              break label256;
            }
          }
          label256:
          for (boolean bool1 = true;; bool1 = false)
          {
            localJ.g = bool1;
            localJ.d = paramAnonymousJSONObject.optInt("subType");
            localJ.b = (paramAnonymousJSONObject.optLong("start", 0L) * 1000L);
            localJ.c = (paramAnonymousJSONObject.optLong("end", 0L) * 1000L);
            localJ.e = paramAnonymousJSONObject.optInt("order_type");
            localJ.i = (paramAnonymousJSONObject.optDouble("todayVideoDuration") / 60L);
            localJ.j = (paramAnonymousJSONObject.optDouble("sumVideoDuration") / 60L);
            localJ.k = paramAnonymousJSONObject.optBoolean("canceledornot");
            localJ.l = (paramAnonymousJSONObject.optLong("nextbillingdate", 0L) * 1000L);
            bool1 = bool2;
            if (paramAnonymousJSONObject.optInt("enabledCloudDeviceWorkMode") == 1) {
              bool1 = true;
            }
            localJ.h = bool1;
            paramA.a(true, paramAnonymousInt, localJ);
            return;
            bool1 = false;
            break;
          }
        }
        paramA.a(false, paramAnonymousInt, null);
      }
    });
  }
  
  public static abstract interface a<T>
  {
    public abstract void a(boolean paramBoolean, int paramInt, T paramT);
  }
}
