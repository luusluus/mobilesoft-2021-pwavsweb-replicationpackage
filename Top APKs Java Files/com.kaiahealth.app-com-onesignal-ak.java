package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ak
{
  private static long A;
  private static bb B;
  private static az C;
  private static ba D;
  private static d E;
  private static int F;
  private static aj G;
  private static String H;
  private static boolean I;
  private static boolean J;
  private static boolean K;
  private static boolean L;
  private static p.f M;
  private static Collection<JSONArray> N;
  private static HashSet<String> O;
  private static f P;
  private static boolean Q;
  private static boolean R;
  private static boolean S;
  private static JSONObject T;
  private static boolean U;
  private static af V;
  private static ae<Object, ag> W;
  private static OSSubscriptionState X;
  private static ae<ah, ai> Y;
  private static z Z;
  static String a;
  private static g aa;
  private static as ab;
  private static int ac = 0;
  static Context b;
  static boolean c;
  static ExecutorService d;
  public static ConcurrentLinkedQueue<Runnable> e;
  static AtomicLong f;
  public static String g;
  static boolean h;
  static a i;
  static boolean j;
  static boolean k;
  static k l;
  static af m;
  static OSSubscriptionState n;
  private static e o;
  private static e p;
  private static String q;
  private static boolean r;
  private static i s = i.a;
  private static i t = i.d;
  private static String u = null;
  private static String v = null;
  private static int w;
  private static boolean x;
  private static h y;
  private static long z;
  
  static
  {
    e = new ConcurrentLinkedQueue();
    f = new AtomicLong();
    z = 1L;
    A = -1L;
    E = new c();
    g = "native";
    h = true;
    N = new ArrayList();
    O = new HashSet();
    k = false;
  }
  
  public ak() {}
  
  private static void H()
  {
    if (!e.isEmpty())
    {
      d = Executors.newSingleThreadExecutor(new ThreadFactory()
      {
        public Thread newThread(Runnable paramAnonymousRunnable)
        {
          paramAnonymousRunnable = new Thread(paramAnonymousRunnable);
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("OS_PENDING_EXECUTOR_");
          localStringBuilder.append(paramAnonymousRunnable.getId());
          paramAnonymousRunnable.setName(localStringBuilder.toString());
          return paramAnonymousRunnable;
        }
      });
      while (!e.isEmpty()) {
        d.submit((Runnable)e.poll());
      }
    }
  }
  
  private static void I()
  {
    if (R) {
      return;
    }
    boolean bool2 = true;
    R = true;
    I = false;
    if (S) {
      J = false;
    }
    J();
    M();
    boolean bool1 = bool2;
    if (!L) {
      if (i.d) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    L = bool1;
  }
  
  private static void J()
  {
    p.d local6 = new p.d()
    {
      public p.a a()
      {
        return p.a.a;
      }
      
      public void a(p.f paramAnonymousF)
      {
        ak.a(paramAnonymousF);
        ak.c(true);
        ak.x();
      }
    };
    boolean bool;
    if ((i.d) && (!L)) {
      bool = true;
    } else {
      bool = false;
    }
    p.a(b, bool, local6);
  }
  
  private static as K()
  {
    as localAs = ab;
    if (localAs != null) {
      return localAs;
    }
    if (F == 2) {
      ab = new at();
    } else if (aj.a()) {
      ab = new av();
    } else {
      ab = new aw();
    }
    return ab;
  }
  
  private static void L()
  {
    K().a(b, q, new as.a()
    {
      public void a(String paramAnonymousString, int paramAnonymousInt)
      {
        if (paramAnonymousInt < 1)
        {
          if ((aq.g() == null) && ((ak.y() == 1) || (ak.a(ak.y())))) {
            ak.b(paramAnonymousInt);
          }
        }
        else if (ak.a(ak.y())) {
          ak.b(paramAnonymousInt);
        }
        ak.f(paramAnonymousString);
        ak.d(true);
        ak.g(ak.b).b(paramAnonymousString);
        ak.x();
      }
    });
  }
  
  private static void M()
  {
    if (K)
    {
      L();
      return;
    }
    ap.a local8 = new ap.a()
    {
      void a(int paramAnonymousInt, String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        new Thread(new Runnable()
        {
          public void run()
          {
            try
            {
              int j = ak.z() * 10000 + 30000;
              int i = j;
              if (j > 90000) {
                i = 90000;
              }
              ak.i localI = ak.i.e;
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Failed to get Android parameters, trying again in ");
              localStringBuilder.append(i / 1000);
              localStringBuilder.append(" seconds.");
              ak.a(localI, localStringBuilder.toString());
              Thread.sleep(i);
            }
            catch (Throwable localThrowable)
            {
              for (;;) {}
            }
            ak.A();
            ak.B();
          }
        }, "OS_PARAMS_REQUEST").start();
      }
      
      void a(String paramAnonymousString)
      {
        try
        {
          paramAnonymousString = new JSONObject(paramAnonymousString);
          if (paramAnonymousString.has("android_sender_id"))
          {
            ak.e(true);
            ak.g(paramAnonymousString.getString("android_sender_id"));
          }
          ak.j = paramAnonymousString.optBoolean("enterp", false);
          ak.f(paramAnonymousString.optBoolean("use_email_auth", false));
          ak.a(paramAnonymousString.getJSONObject("awl_list"));
          boolean bool = paramAnonymousString.optBoolean("fba", false);
          ao.a(ao.a, "GT_FIREBASE_TRACKING_ENABLED", bool);
          r.a(ak.b, paramAnonymousString);
        }
        catch (Throwable paramAnonymousString)
        {
          paramAnonymousString.printStackTrace();
        }
        ak.g(true);
        ak.C();
      }
    };
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("apps/");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append("/android_params.js");
    String str1 = ((StringBuilder)localObject).toString();
    String str2 = l();
    localObject = str1;
    if (str2 != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str1);
      ((StringBuilder)localObject).append("?player_id=");
      ((StringBuilder)localObject).append(str2);
      localObject = ((StringBuilder)localObject).toString();
    }
    a(i.f, "Starting request to get Android parameters.");
    ap.a((String)localObject, local8);
  }
  
  private static void N()
  {
    Iterator localIterator = N.iterator();
    while (localIterator.hasNext()) {
      b((JSONArray)localIterator.next(), true, false);
    }
    N.clear();
  }
  
  private static int O()
  {
    TimeZone localTimeZone = Calendar.getInstance().getTimeZone();
    int i2 = localTimeZone.getRawOffset();
    int i1 = i2;
    if (localTimeZone.inDaylightTime(new Date())) {
      i1 = i2 + localTimeZone.getDSTSavings();
    }
    return i1 / 1000;
  }
  
  private static void P()
  {
    i localI = i.f;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("registerUser: registerForPushFired:");
    localStringBuilder.append(I);
    localStringBuilder.append(", locationFired: ");
    localStringBuilder.append(J);
    localStringBuilder.append(", awlFired: ");
    localStringBuilder.append(K);
    a(localI, localStringBuilder.toString());
    if ((I) && (J))
    {
      if (!K) {
        return;
      }
      new Thread(new Runnable()
      {
        public void run()
        {
          try
          {
            ak.D();
            al.a(ak.b, ak.a, ak.E(), c.a());
            return;
          }
          catch (JSONException localJSONException)
          {
            ak.a(ak.i.b, "FATAL Error registering device!", localJSONException);
          }
        }
      }, "OS_REG_USER").start();
      return;
    }
  }
  
  private static void Q()
    throws JSONException
  {
    Object localObject3 = b.getPackageName();
    Object localObject2 = b.getPackageManager();
    Object localObject1 = new JSONObject();
    ((JSONObject)localObject1).put("app_id", a);
    Object localObject4 = E.a(b);
    if (localObject4 != null) {
      ((JSONObject)localObject1).put("ad_id", localObject4);
    }
    ((JSONObject)localObject1).put("device_os", Build.VERSION.RELEASE);
    ((JSONObject)localObject1).put("timezone", O());
    ((JSONObject)localObject1).put("language", aj.f());
    ((JSONObject)localObject1).put("sdk", "031005");
    ((JSONObject)localObject1).put("sdk_type", g);
    ((JSONObject)localObject1).put("android_package", localObject3);
    ((JSONObject)localObject1).put("device_model", Build.MODEL);
    try
    {
      ((JSONObject)localObject1).put("game_version", ((PackageManager)localObject2).getPackageInfo((String)localObject3, 0).versionCode);
      try
      {
        localObject2 = ((PackageManager)localObject2).getInstalledPackages(0);
        localObject3 = new JSONArray();
        localObject4 = MessageDigest.getInstance("SHA-256");
        i1 = 0;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          int i1;
          String str;
          continue;
          i1 += 1;
        }
      }
      if (i1 < ((List)localObject2).size())
      {
        ((MessageDigest)localObject4).update(((PackageInfo)((List)localObject2).get(i1)).packageName.getBytes());
        str = Base64.encodeToString(((MessageDigest)localObject4).digest(), 2);
        if (T.has(str)) {
          ((JSONArray)localObject3).put(str);
        }
      }
      else
      {
        ((JSONObject)localObject1).put("pkgs", localObject3);
        ((JSONObject)localObject1).put("net_type", G.d());
        ((JSONObject)localObject1).put("carrier", G.e());
        ((JSONObject)localObject1).put("rooted", ay.a());
        aq.a((JSONObject)localObject1);
        localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("identifier", H);
        ((JSONObject)localObject1).put("subscribableStatus", w);
        ((JSONObject)localObject1).put("androidPermission", s());
        ((JSONObject)localObject1).put("device_type", F);
        aq.b((JSONObject)localObject1);
        if (h)
        {
          localObject1 = M;
          if (localObject1 != null) {
            aq.a((p.f)localObject1);
          }
        }
        if (S) {
          aq.j();
        }
        R = false;
        return;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  private static void R()
  {
    try
    {
      Object localObject1 = y;
      if (localObject1 == null) {
        return;
      }
      localObject1 = aq.g();
      if (!aq.f()) {
        localObject1 = null;
      }
      String str = l();
      if (str == null) {
        return;
      }
      y.a(str, (String)localObject1);
      if (localObject1 != null) {
        y = null;
      }
      return;
    }
    finally {}
  }
  
  private static boolean S()
  {
    if (S) {
      return true;
    }
    return (System.currentTimeMillis() - o(b)) / 1000L >= 30L;
  }
  
  static ae<Object, ag> a()
  {
    if (W == null) {
      W = new ae("onOSPermissionChanged", true);
    }
    return W;
  }
  
  static String a(Bundle paramBundle)
  {
    if (paramBundle.isEmpty()) {
      return null;
    }
    try
    {
      if (paramBundle.containsKey("custom"))
      {
        paramBundle = new JSONObject(paramBundle.getString("custom"));
        if (paramBundle.has("i")) {
          return paramBundle.optString("i", null);
        }
        a(i.f, "Not a OneSignal formatted GCM message. No 'i' field in custom.");
        return null;
      }
      a(i.f, "Not a OneSignal formatted GCM message. No 'custom' field in the bundle.");
      return null;
    }
    catch (Throwable paramBundle)
    {
      a(i.f, "Could not parse bundle, probably not a OneSignal notification.", paramBundle);
    }
    return null;
  }
  
  static void a(long paramLong)
  {
    ao.a(ao.a, "OS_LAST_SESSION_TIME", paramLong);
  }
  
  static void a(long paramLong, boolean paramBoolean)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("app_id", a).put("type", 1).put("state", "ping").put("active_time", paramLong);
      b(localJSONObject);
      a(l(), localJSONObject, paramBoolean);
      String str = m();
      if (str != null)
      {
        a(str, localJSONObject, paramBoolean);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      a(i.c, "Generating on_focus:JSON Failed.", localThrowable);
    }
  }
  
  static void a(Context paramContext)
  {
    int i1;
    if (b == null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    b = paramContext.getApplicationContext();
    if (i1 != 0) {
      ao.b();
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, j paramJ, k paramK)
  {
    a(paramContext);
    if ((k) && (!d()))
    {
      a(i.g, "OneSignal SDK initialization delayed, user privacy consent is set to required for this application.");
      l = new k(paramContext, paramString1, paramString2, paramJ, paramK);
      return;
    }
    i = c();
    a localA = i;
    localA.h = false;
    localA.b = paramJ;
    localA.c = paramK;
    if (!r) {
      q = paramString1;
    }
    G = new aj();
    F = G.c();
    w = G.a(paramContext, F, paramString2);
    if (w == 64537) {
      return;
    }
    if (c)
    {
      if (i.b != null) {
        N();
      }
      return;
    }
    boolean bool = paramContext instanceof Activity;
    x = bool;
    a = paramString2;
    b(i.g);
    if (bool)
    {
      a.b = (Activity)paramContext;
      w.a(b);
    }
    else
    {
      a.a = true;
    }
    z = SystemClock.elapsedRealtime();
    aq.d();
    ((Application)b).registerActivityLifecycleCallbacks(new b());
    try
    {
      Class.forName("com.amazon.device.iap.PurchasingListener");
      C = new az(b);
      paramContext = j();
      if (paramContext != null)
      {
        if (!paramContext.equals(a))
        {
          a(i.f, "APP ID changed, clearing user id as it is no longer valid.");
          h(a);
          aq.h();
        }
      }
      else
      {
        f.a(0, b);
        h(a);
      }
      OSPermissionChangedInternalObserver.a(h(b));
      if ((x) || (l() == null))
      {
        S = S();
        a(System.currentTimeMillis());
        I();
      }
      if (i.b != null) {
        N();
      }
      if (bb.a(b)) {
        B = new bb(b);
      }
      if (ba.a()) {
        D = new ba(b);
      }
      av.a(b);
      c = true;
      H();
      return;
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static void a(Context paramContext, JSONArray paramJSONArray, boolean paramBoolean)
  {
    if (a(null)) {
      return;
    }
    b(paramContext, paramJSONArray);
    if ((D != null) && (d(b))) {
      D.a(c(paramJSONArray, true, paramBoolean));
    }
    boolean bool1 = false;
    boolean bool2 = "DISABLE".equals(aj.a(paramContext, "com.onesignal.NotificationOpened.DEFAULT"));
    if (!bool2) {
      bool1 = a(paramContext, paramJSONArray);
    }
    b(paramJSONArray, true, paramBoolean);
    if ((!paramBoolean) && (!bool1) && (!bool2)) {
      l(paramContext);
    }
  }
  
  private static void a(ac paramAc)
  {
    aj.a(new Runnable()
    {
      public void run()
      {
        ak.i.b.a(this.a);
      }
    });
  }
  
  public static void a(ah paramAh)
  {
    if (b == null)
    {
      a(i.c, "OneSignal.init has not been called. Could not add subscription observer");
      return;
    }
    b().a(paramAh);
    if (i(b).a(j(b))) {
      OSSubscriptionChangedInternalObserver.a(i(b));
    }
  }
  
  private static void a(f paramF)
  {
    if (paramF == null) {
      return;
    }
    new Thread(new Runnable()
    {
      public void run()
      {
        bh.a localA = aq.c(ak.F() ^ true);
        if (localA.a) {
          ak.h(true);
        }
        if ((localA.b != null) && (!localA.toString().equals("{}")))
        {
          this.a.a(localA.b);
          return;
        }
        this.a.a(null);
      }
    }, "OS_GETTAGS_CALLBACK").start();
  }
  
  static void a(i paramI, String paramString)
  {
    a(paramI, paramString, null);
  }
  
  static void a(i paramI, final String paramString, Throwable paramThrowable)
  {
    if (paramI.compareTo(t) < 1) {
      if (paramI == i.g) {
        Log.v("OneSignal", paramString, paramThrowable);
      } else if (paramI == i.f) {
        Log.d("OneSignal", paramString, paramThrowable);
      } else if (paramI == i.e) {
        Log.i("OneSignal", paramString, paramThrowable);
      } else if (paramI == i.d) {
        Log.w("OneSignal", paramString, paramThrowable);
      } else if ((paramI == i.c) || (paramI == i.b)) {
        Log.e("OneSignal", paramString, paramThrowable);
      }
    }
    if ((paramI.compareTo(s) < 1) && (a.b != null)) {
      try
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("\n");
        localObject = ((StringBuilder)localObject).toString();
        paramString = (String)localObject;
        if (paramThrowable != null)
        {
          paramString = new StringBuilder();
          paramString.append((String)localObject);
          paramString.append(paramThrowable.getMessage());
          paramString = paramString.toString();
          localObject = new StringWriter();
          paramThrowable.printStackTrace(new PrintWriter((Writer)localObject));
          paramThrowable = new StringBuilder();
          paramThrowable.append(paramString);
          paramThrowable.append(((StringWriter)localObject).toString());
          paramString = paramThrowable.toString();
        }
        aj.a(new Runnable()
        {
          public void run()
          {
            if (a.b != null) {
              new AlertDialog.Builder(a.b).setTitle(this.a.toString()).setMessage(paramString).show();
            }
          }
        });
        return;
      }
      catch (Throwable paramI)
      {
        Log.e("OneSignal", "Error showing logging message.", paramI);
      }
    }
  }
  
  private static void a(String paramString, JSONObject paramJSONObject, boolean paramBoolean)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("players/");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("/on_focus");
    paramString = ((StringBuilder)localObject).toString();
    localObject = new ap.a()
    {
      void a(int paramAnonymousInt, String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        ak.a("sending on_focus Failed", paramAnonymousInt, paramAnonymousThrowable, paramAnonymousString);
      }
      
      void a(String paramAnonymousString)
      {
        ak.b(0L);
      }
    };
    if (paramBoolean)
    {
      ap.d(paramString, paramJSONObject, (ap.a)localObject);
      return;
    }
    ap.b(paramString, paramJSONObject, (ap.a)localObject);
  }
  
  static void a(JSONArray paramJSONArray, boolean paramBoolean, ap.a paramA)
  {
    if (a("sendPurchases()")) {
      return;
    }
    if (l() == null)
    {
      aa = new g(paramJSONArray);
      paramJSONArray = aa;
      paramJSONArray.b = paramBoolean;
      paramJSONArray.c = paramA;
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("app_id", a);
      if (paramBoolean) {
        localJSONObject.put("existing", true);
      }
      localJSONObject.put("purchases", paramJSONArray);
      paramJSONArray = new StringBuilder();
      paramJSONArray.append("players/");
      paramJSONArray.append(l());
      paramJSONArray.append("/on_purchase");
      ap.b(paramJSONArray.toString(), localJSONObject, paramA);
      if (m() != null)
      {
        paramJSONArray = new StringBuilder();
        paramJSONArray.append("players/");
        paramJSONArray.append(m());
        paramJSONArray.append("/on_purchase");
        ap.b(paramJSONArray.toString(), localJSONObject, null);
        return;
      }
    }
    catch (Throwable paramJSONArray)
    {
      a(i.c, "Failed to generate JSON for sendPurchases.", paramJSONArray);
    }
  }
  
  static void a(JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramJSONArray = c(paramJSONArray, paramBoolean1, paramBoolean2);
    if ((D != null) && (d(b))) {
      D.b(paramJSONArray);
    }
    a localA = i;
    if (localA != null)
    {
      if (localA.c == null) {
        return;
      }
      i.c.a(paramJSONArray.a);
      return;
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    if ((k) && (!paramBoolean))
    {
      a(i.c, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
      return;
    }
    k = paramBoolean;
  }
  
  private static boolean a(Context paramContext, JSONArray paramJSONArray)
  {
    boolean bool1 = a(null);
    int i1 = 0;
    if (bool1) {
      return false;
    }
    int i2 = paramJSONArray.length();
    boolean bool2;
    for (bool1 = false; i1 < i2; bool1 = bool2)
    {
      try
      {
        Object localObject1 = paramJSONArray.getJSONObject(i1);
        if (!((JSONObject)localObject1).has("custom"))
        {
          bool2 = bool1;
        }
        else
        {
          localObject1 = new JSONObject(((JSONObject)localObject1).optString("custom"));
          bool2 = bool1;
          if (((JSONObject)localObject1).has("u"))
          {
            localObject2 = ((JSONObject)localObject1).optString("u", null);
            localObject1 = localObject2;
            if (!((String)localObject2).contains("://"))
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("http://");
              ((StringBuilder)localObject1).append((String)localObject2);
              localObject1 = ((StringBuilder)localObject1).toString();
            }
            localObject1 = new Intent("android.intent.action.VIEW", Uri.parse(((String)localObject1).trim()));
            ((Intent)localObject1).addFlags(1476919296);
            paramContext.startActivity((Intent)localObject1);
            bool2 = true;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject2 = i.c;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Error parsing JSON item ");
        localStringBuilder.append(i1);
        localStringBuilder.append("/");
        localStringBuilder.append(i2);
        localStringBuilder.append(" for launching a web URL.");
        a((i)localObject2, localStringBuilder.toString(), localThrowable);
        bool2 = bool1;
      }
      i1 += 1;
    }
    return bool1;
  }
  
  static boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    paramJSONObject = c(paramJSONObject);
    return (paramJSONObject == null) || (a(paramJSONObject, paramContext));
  }
  
  private static boolean a(i paramI)
  {
    int i1 = paramI.compareTo(s);
    boolean bool = true;
    if (i1 >= 1)
    {
      if (paramI.compareTo(t) < 1) {
        return true;
      }
      bool = false;
    }
    return bool;
  }
  
  static boolean a(String paramString)
  {
    if ((k) && (!d()))
    {
      if (paramString != null)
      {
        i localI = i.d;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Method ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        a(localI, localStringBuilder.toString());
      }
      return true;
    }
    return false;
  }
  
  /* Error */
  private static boolean a(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +189 -> 190
    //   4: ldc_w 1031
    //   7: aload_0
    //   8: invokevirtual 767	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   11: ifeq +5 -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: invokestatic 1036	com/onesignal/am:a	(Landroid/content/Context;)Lcom/onesignal/am;
    //   20: astore 5
    //   22: aconst_null
    //   23: astore 4
    //   25: aconst_null
    //   26: astore_1
    //   27: aload 5
    //   29: invokevirtual 1039	com/onesignal/am:b	()Landroid/database/sqlite/SQLiteDatabase;
    //   32: ldc_w 1041
    //   35: iconst_1
    //   36: anewarray 494	java/lang/String
    //   39: dup
    //   40: iconst_0
    //   41: ldc_w 1043
    //   44: aastore
    //   45: ldc_w 1045
    //   48: iconst_1
    //   49: anewarray 494	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: aload_0
    //   55: aastore
    //   56: aconst_null
    //   57: aconst_null
    //   58: aconst_null
    //   59: invokevirtual 1051	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore 5
    //   64: aload 5
    //   66: astore_1
    //   67: aload 5
    //   69: astore 4
    //   71: aload 5
    //   73: invokeinterface 1056 1 0
    //   78: istore_3
    //   79: iload_3
    //   80: istore_2
    //   81: aload 5
    //   83: ifnull +49 -> 132
    //   86: aload 5
    //   88: invokeinterface 1059 1 0
    //   93: iload_3
    //   94: istore_2
    //   95: goto +37 -> 132
    //   98: astore_0
    //   99: goto +79 -> 178
    //   102: astore 5
    //   104: aload 4
    //   106: astore_1
    //   107: getstatic 664	com/onesignal/ak$i:c	Lcom/onesignal/ak$i;
    //   110: ldc_w 1061
    //   113: aload 5
    //   115: invokestatic 634	com/onesignal/ak:a	(Lcom/onesignal/ak$i;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: aload 4
    //   120: ifnull +10 -> 130
    //   123: aload 4
    //   125: invokeinterface 1059 1 0
    //   130: iconst_0
    //   131: istore_2
    //   132: iload_2
    //   133: ifeq +43 -> 176
    //   136: getstatic 316	com/onesignal/ak$i:f	Lcom/onesignal/ak$i;
    //   139: astore_1
    //   140: new 296	java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   147: astore 4
    //   149: aload 4
    //   151: ldc_w 1063
    //   154: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload 4
    //   160: aload_0
    //   161: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload_1
    //   166: aload 4
    //   168: invokevirtual 310	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 321	com/onesignal/ak:a	(Lcom/onesignal/ak$i;Ljava/lang/String;)V
    //   174: iconst_1
    //   175: ireturn
    //   176: iconst_0
    //   177: ireturn
    //   178: aload_1
    //   179: ifnull +9 -> 188
    //   182: aload_1
    //   183: invokeinterface 1059 1 0
    //   188: aload_0
    //   189: athrow
    //   190: iconst_0
    //   191: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	paramString	String
    //   0	192	1	paramContext	Context
    //   80	53	2	bool1	boolean
    //   78	16	3	bool2	boolean
    //   23	144	4	localObject1	Object
    //   20	67	5	localObject2	Object
    //   102	12	5	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   27	64	98	finally
    //   71	79	98	finally
    //   107	118	98	finally
    //   27	64	102	java/lang/Throwable
    //   71	79	102	java/lang/Throwable
  }
  
  static ae<ah, ai> b()
  {
    if (Y == null) {
      Y = new ae("onOSSubscriptionChanged", true);
    }
    return Y;
  }
  
  public static a b(Context paramContext)
  {
    return new a(paramContext, null);
  }
  
  private static void b(Context paramContext, JSONArray paramJSONArray)
  {
    int i1 = 0;
    while (i1 < paramJSONArray.length())
    {
      try
      {
        String str = new JSONObject(paramJSONArray.getJSONObject(i1).optString("custom", null)).optString("i", null);
        if (!O.contains(str))
        {
          O.add(str);
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("app_id", m(paramContext));
          localJSONObject.put("player_id", n(paramContext));
          localJSONObject.put("opened", true);
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("notifications/");
          localStringBuilder.append(str);
          ap.a(localStringBuilder.toString(), localJSONObject, new ap.a()
          {
            void a(int paramAnonymousInt, String paramAnonymousString, Throwable paramAnonymousThrowable)
            {
              ak.a("sending Notification Opened Failed", paramAnonymousInt, paramAnonymousThrowable, paramAnonymousString);
            }
          });
        }
      }
      catch (Throwable localThrowable)
      {
        a(i.c, "Failed to generate JSON to send notification opened.", localThrowable);
      }
      i1 += 1;
    }
  }
  
  private static void b(a paramA)
  {
    if (c().h) {
      paramA.i = c().i;
    }
    i = paramA;
    Context localContext = i.a;
    i.a = null;
    try
    {
      Bundle localBundle = localContext.getPackageManager().getApplicationInfo(localContext.getPackageName(), 128).metaData;
      String str = localBundle.getString("onesignal_google_project_number");
      paramA = str;
      if (str != null)
      {
        paramA = str;
        if (str.length() > 4) {
          paramA = str.substring(4);
        }
      }
      a("ENABLE".equalsIgnoreCase(localBundle.getString("com.onesignal.PrivacyConsent")));
      a(localContext, paramA, localBundle.getString("onesignal_app_id"), i.b, i.c);
      return;
    }
    catch (Throwable paramA)
    {
      paramA.printStackTrace();
    }
  }
  
  static void b(String paramString)
  {
    u = paramString;
    if (b == null) {
      return;
    }
    ao.a(ao.a, "GT_PLAYER_ID", u);
  }
  
  private static void b(String paramString1, int paramInt, Throwable paramThrowable, String paramString2)
  {
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (paramString2 != null)
    {
      localObject1 = localObject2;
      if (a(i.e))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append(paramString2);
        ((StringBuilder)localObject1).append("\n");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    paramString2 = i.d;
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("HTTP code: ");
    ((StringBuilder)localObject2).append(paramInt);
    ((StringBuilder)localObject2).append(" ");
    ((StringBuilder)localObject2).append(paramString1);
    ((StringBuilder)localObject2).append((String)localObject1);
    a(paramString2, ((StringBuilder)localObject2).toString(), paramThrowable);
  }
  
  private static void b(JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    a localA = i;
    if ((localA != null) && (localA.b != null))
    {
      a(c(paramJSONArray, paramBoolean1, paramBoolean2));
      return;
    }
    N.add(paramJSONArray);
  }
  
  private static void b(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject.put("net_type", G.d());
      return;
    }
    catch (Throwable paramJSONObject) {}
  }
  
  static void b(boolean paramBoolean)
  {
    if (b == null) {
      return;
    }
    ao.a(ao.a, "OS_FILTER_OTHER_GCM_RECEIVERS", paramBoolean);
  }
  
  private static ac c(JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i3 = paramJSONArray.length();
    ac localAc = new ac();
    aa localAa = new aa();
    localAa.a = q();
    localAa.b = paramBoolean1;
    localAa.c = paramJSONArray.optJSONObject(0).optInt("notificationId");
    Object localObject1 = null;
    int i1 = 0;
    int i2 = 1;
    Object localObject4;
    Object localObject3;
    if (i1 < i3)
    {
      localObject4 = localObject1;
      try
      {
        localObject5 = paramJSONArray.getJSONObject(i1);
        localObject4 = localObject1;
        localAa.d = q.a((JSONObject)localObject5);
        localObject3 = localObject1;
        if (localObject1 != null) {
          break label365;
        }
        localObject4 = localObject1;
        localObject3 = localObject1;
        if (!((JSONObject)localObject5).has("actionSelected")) {
          break label365;
        }
        localObject4 = localObject1;
        localObject3 = ((JSONObject)localObject5).optString("actionSelected", null);
      }
      catch (Throwable localThrowable)
      {
        label139:
        localObject3 = i.c;
        Object localObject5 = new StringBuilder();
        ((StringBuilder)localObject5).append("Error parsing JSON item ");
        ((StringBuilder)localObject5).append(i1);
        ((StringBuilder)localObject5).append("/");
        ((StringBuilder)localObject5).append(i3);
        ((StringBuilder)localObject5).append(" for callback.");
        a((i)localObject3, ((StringBuilder)localObject5).toString(), localThrowable);
        localObject2 = localObject4;
      }
      localObject4 = localObject3;
      if (localAa.f == null)
      {
        localObject4 = localObject3;
        localAa.f = new ArrayList();
      }
      localObject4 = localObject3;
      localAa.f.add(localAa.d);
      localObject1 = localObject3;
    }
    for (;;)
    {
      i1 += 1;
      break;
      localAc.a = localAa;
      localAc.b = new ab();
      localAc.b.b = localObject2;
      localObject3 = localAc.b;
      if (localObject2 != null) {
        paramJSONArray = ab.a.b;
      } else {
        paramJSONArray = ab.a.a;
      }
      ((ab)localObject3).a = paramJSONArray;
      if (paramBoolean2)
      {
        localAc.a.e = aa.a.b;
        return localAc;
      }
      localAc.a.e = aa.a.a;
      return localAc;
      label365:
      if (i2 == 0) {
        break label139;
      }
      i2 = 0;
      Object localObject2 = localObject3;
    }
  }
  
  public static a c()
  {
    if (i == null) {
      i = new a(null);
    }
    return i;
  }
  
  private static String c(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = new JSONObject(paramJSONObject.optString("custom")).optString("i", null);
      return paramJSONObject;
    }
    catch (Throwable paramJSONObject) {}
    return null;
  }
  
  private static void c(long paramLong)
  {
    A = paramLong;
    if (b == null) {
      return;
    }
    i localI = i.e;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SaveUnsentActiveTime: ");
    localStringBuilder.append(A);
    a(localI, localStringBuilder.toString());
    ao.a(ao.a, "GT_UNSENT_ACTIVE_TIME", paramLong);
  }
  
  static void c(String paramString)
  {
    v = paramString;
    if (b == null) {
      return;
    }
    String str = ao.a;
    if ("".equals(v)) {
      paramString = null;
    } else {
      paramString = v;
    }
    ao.a(str, "OS_EMAIL_ID", paramString);
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt < -6;
  }
  
  static boolean c(Context paramContext)
  {
    return ao.b(ao.a, "OS_FILTER_OTHER_GCM_RECEIVERS", false);
  }
  
  static void d(String paramString)
  {
    b(paramString);
    i();
    a(P);
    i(b).a(paramString);
    g localG = aa;
    if (localG != null)
    {
      a(localG.a, aa.b, aa.c);
      aa = null;
    }
    aq.i();
    al.a(b, a, paramString, c.a());
  }
  
  public static boolean d()
  {
    return k();
  }
  
  static boolean d(Context paramContext)
  {
    return ao.b(ao.a, "GT_FIREBASE_TRACKING_ENABLED", false);
  }
  
  static void e(String paramString)
  {
    c(paramString);
    k(b).a(paramString);
    try
    {
      aq.b(new JSONObject().put("parent_player_id", paramString));
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  static boolean e()
  {
    boolean bool2 = false;
    x = false;
    p.c();
    if (!c) {
      return false;
    }
    az localAz = C;
    if (localAz != null) {
      localAz.a();
    }
    if (z == -1L) {
      return false;
    }
    long l1 = ((SystemClock.elapsedRealtime() - z) / 1000.0D + 0.5D);
    z = SystemClock.elapsedRealtime();
    if (l1 >= 0L)
    {
      if (l1 > 86400L) {
        return false;
      }
      if (b == null)
      {
        a(i.c, "Android Context not found, please call OneSignal.init when your app starts.");
        return false;
      }
      boolean bool3 = f();
      a(System.currentTimeMillis());
      l1 = p() + l1;
      c(l1);
      boolean bool1 = l1 < 60L;
      if ((!bool1) && (l() != null))
      {
        if (!bool3) {
          ar.a(b);
        }
        ar.a();
        return false;
      }
      if (!bool1) {
        bool2 = true;
      }
      return bool2;
    }
    return false;
  }
  
  static boolean e(Context paramContext)
  {
    return ao.b(ao.a, "GT_VIBRATE_ENABLED", true);
  }
  
  static boolean f()
  {
    boolean bool = aq.c();
    if (bool) {
      ar.a(b);
    }
    return (p.a(b)) || (bool);
  }
  
  static boolean f(Context paramContext)
  {
    return ao.b(ao.a, "GT_SOUND_ENABLED", true);
  }
  
  static void g()
  {
    x = true;
    p.c();
    z = SystemClock.elapsedRealtime();
    S = S();
    a(System.currentTimeMillis());
    I();
    bb localBb = B;
    if (localBb != null) {
      localBb.a();
    }
    w.a(b);
    h(b).a();
    if ((D != null) && (d(b))) {
      D.b();
    }
    ar.b(b);
  }
  
  private static af h(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if (V == null)
    {
      V = new af(false);
      V.a.b(new OSPermissionChangedInternalObserver());
    }
    return V;
  }
  
  private static void h(String paramString)
  {
    if (b == null) {
      return;
    }
    ao.a(ao.a, "GT_APP_ID", paramString);
  }
  
  static boolean h()
  {
    return x;
  }
  
  private static OSSubscriptionState i(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if (X == null)
    {
      X = new OSSubscriptionState(false, h(paramContext).b());
      h(paramContext).a.a(X);
      X.a.b(new OSSubscriptionChangedInternalObserver());
    }
    return X;
  }
  
  static void i()
  {
    if (y != null) {
      aj.a(new Runnable()
      {
        public void run() {}
      });
    }
  }
  
  private static OSSubscriptionState j(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if (n == null) {
      n = new OSSubscriptionState(true, false);
    }
    return n;
  }
  
  static String j()
  {
    return m(b);
  }
  
  private static z k(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if (Z == null)
    {
      Z = new z(false);
      Z.a.b(new y());
    }
    return Z;
  }
  
  static boolean k()
  {
    return ao.b(ao.a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
  }
  
  static String l()
  {
    if ((u == null) && (b != null)) {
      u = ao.b(ao.a, "GT_PLAYER_ID", null);
    }
    return u;
  }
  
  private static void l(Context paramContext)
  {
    if (a(null)) {
      return;
    }
    Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage(paramContext.getPackageName());
    if (localIntent != null)
    {
      localIntent.setFlags(268566528);
      paramContext.startActivity(localIntent);
    }
  }
  
  static String m()
  {
    if ("".equals(v)) {
      return null;
    }
    if ((v == null) && (b != null)) {
      v = ao.b(ao.a, "OS_EMAIL_ID", null);
    }
    return v;
  }
  
  private static String m(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    return ao.b(ao.a, "GT_APP_ID", null);
  }
  
  private static String n(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    return ao.b(ao.a, "GT_PLAYER_ID", null);
  }
  
  static boolean n()
  {
    a localA = i;
    if (localA == null) {
      return true;
    }
    return localA.i == l.c;
  }
  
  private static long o(Context paramContext)
  {
    return ao.b(ao.a, "OS_LAST_SESSION_TIME", -31000L);
  }
  
  static boolean o()
  {
    a localA = i;
    boolean bool = false;
    if (localA == null) {
      return false;
    }
    if (localA.i == l.b) {
      bool = true;
    }
    return bool;
  }
  
  static long p()
  {
    if ((A == -1L) && (b != null)) {
      A = ao.b(ao.a, "GT_UNSENT_ACTIVE_TIME", 0L);
    }
    i localI = i.e;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GetUnsentActiveTime: ");
    localStringBuilder.append(A);
    a(localI, localStringBuilder.toString());
    return A;
  }
  
  static boolean q()
  {
    return (c) && (h());
  }
  
  static void r()
  {
    S = false;
    a(System.currentTimeMillis());
  }
  
  static boolean s()
  {
    if (i.f) {
      return aj.a(b);
    }
    return true;
  }
  
  static void t()
  {
    e localE = p;
    if (localE != null)
    {
      localE.a();
      p = null;
    }
  }
  
  static void u()
  {
    e localE = p;
    if (localE != null)
    {
      localE.a(new d(c.d, "Failed due to network failure. Will retry on next sync."));
      p = null;
    }
  }
  
  static void v()
  {
    e localE = o;
    if (localE != null)
    {
      localE.a();
      o = null;
    }
  }
  
  static void w()
  {
    e localE = o;
    if (localE != null)
    {
      localE.a(new d(c.d, "Failed due to network failure. Will retry on next sync."));
      o = null;
    }
  }
  
  public static class a
  {
    Context a;
    ak.j b;
    ak.k c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    ak.l i = ak.l.b;
    
    private a() {}
    
    private a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public a a(ak.l paramL)
    {
      ak.c().h = false;
      this.i = paramL;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.f = paramBoolean;
      return this;
    }
    
    public void a()
    {
      ak.a(this);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(ak.m paramM);
    
    public abstract void a(JSONObject paramJSONObject);
  }
  
  public static enum c
  {
    private c() {}
  }
  
  public static class d
  {
    private ak.c a;
    private String b;
    
    d(ak.c paramC, String paramString)
    {
      this.a = paramC;
      this.b = paramString;
    }
  }
  
  public static abstract interface e
  {
    public abstract void a();
    
    public abstract void a(ak.d paramD);
  }
  
  public static abstract interface f
  {
    public abstract void a(JSONObject paramJSONObject);
  }
  
  private static class g
  {
    JSONArray a;
    boolean b;
    ap.a c;
    
    g(JSONArray paramJSONArray)
    {
      this.a = paramJSONArray;
    }
  }
  
  public static abstract interface h
  {
    public abstract void a(String paramString1, String paramString2);
  }
  
  public static enum i
  {
    private i() {}
  }
  
  public static abstract interface j
  {
    public abstract void a(ac paramAc);
  }
  
  public static abstract interface k
  {
    public abstract void a(aa paramAa);
  }
  
  public static enum l
  {
    private l() {}
  }
  
  public static class m
  {
    private String a;
    private int b;
    
    m(int paramInt, String paramString)
    {
      this.a = paramString;
      this.b = paramInt;
    }
  }
}