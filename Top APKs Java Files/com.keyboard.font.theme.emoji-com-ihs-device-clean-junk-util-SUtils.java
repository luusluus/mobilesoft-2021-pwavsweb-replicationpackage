package com.ihs.device.clean.junk.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import com.ihs.app.framework.a;
import com.ihs.commons.g.f;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SUtils
{
  public static final String EXTERNAL_STORAGE_DIRECTORY_ABSOLUTE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
  
  public SUtils() {}
  
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null) || (paramArrayOfByte3 == null))
    {
      f.e("JDC", "encryptBytes or key or iv can't be null");
      return null;
    }
    try
    {
      paramArrayOfByte2 = new SecretKeySpec(paramArrayOfByte2, "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/NoPadding");
      localCipher.init(2, paramArrayOfByte2, new IvParameterSpec(paramArrayOfByte3));
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
      int i = paramArrayOfByte1[(paramArrayOfByte1.length - 1)];
      paramArrayOfByte2 = new byte[paramArrayOfByte1.length - i];
      System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 0, paramArrayOfByte2.length);
      return paramArrayOfByte2;
    }
    catch (GeneralSecurityException paramArrayOfByte1)
    {
      ThrowableExtension.printStackTrace(paramArrayOfByte1);
    }
    return null;
  }
  
  /* Error */
  public static byte[] b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 103	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   4: aload_1
    //   5: invokevirtual 109	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   8: astore_1
    //   9: aload_1
    //   10: astore_3
    //   11: aload_1
    //   12: invokevirtual 115	java/io/InputStream:available	()I
    //   15: newarray byte
    //   17: astore_0
    //   18: aload_1
    //   19: astore_3
    //   20: aload_1
    //   21: aload_0
    //   22: invokevirtual 119	java/io/InputStream:read	([B)I
    //   25: istore_2
    //   26: iload_2
    //   27: iconst_m1
    //   28: if_icmpne -10 -> 18
    //   31: aload_0
    //   32: astore_3
    //   33: aload_1
    //   34: ifnull +9 -> 43
    //   37: aload_1
    //   38: invokevirtual 122	java/io/InputStream:close	()V
    //   41: aload_0
    //   42: astore_3
    //   43: aload_3
    //   44: areturn
    //   45: astore_1
    //   46: aload_1
    //   47: invokestatic 93	com/google/devtools/build/android/desugar/runtime/ThrowableExtension:printStackTrace	(Ljava/lang/Throwable;)V
    //   50: aload_0
    //   51: areturn
    //   52: astore 4
    //   54: aconst_null
    //   55: astore_1
    //   56: aconst_null
    //   57: astore_0
    //   58: aload_1
    //   59: astore_3
    //   60: aload 4
    //   62: invokestatic 93	com/google/devtools/build/android/desugar/runtime/ThrowableExtension:printStackTrace	(Ljava/lang/Throwable;)V
    //   65: aload_0
    //   66: astore_3
    //   67: aload_1
    //   68: ifnull -25 -> 43
    //   71: aload_1
    //   72: invokevirtual 122	java/io/InputStream:close	()V
    //   75: aload_0
    //   76: areturn
    //   77: astore_1
    //   78: aload_1
    //   79: invokestatic 93	com/google/devtools/build/android/desugar/runtime/ThrowableExtension:printStackTrace	(Ljava/lang/Throwable;)V
    //   82: aload_0
    //   83: areturn
    //   84: astore_0
    //   85: aconst_null
    //   86: astore_3
    //   87: aload_3
    //   88: ifnull +7 -> 95
    //   91: aload_3
    //   92: invokevirtual 122	java/io/InputStream:close	()V
    //   95: aload_0
    //   96: athrow
    //   97: astore_1
    //   98: aload_1
    //   99: invokestatic 93	com/google/devtools/build/android/desugar/runtime/ThrowableExtension:printStackTrace	(Ljava/lang/Throwable;)V
    //   102: goto -7 -> 95
    //   105: astore_0
    //   106: goto -19 -> 87
    //   109: astore 4
    //   111: aconst_null
    //   112: astore_0
    //   113: goto -55 -> 58
    //   116: astore 4
    //   118: goto -60 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	paramContext	Context
    //   0	121	1	paramString	String
    //   25	4	2	i	int
    //   10	82	3	localObject	Object
    //   52	9	4	localIOException1	java.io.IOException
    //   109	1	4	localIOException2	java.io.IOException
    //   116	1	4	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   37	41	45	java/io/IOException
    //   0	9	52	java/io/IOException
    //   71	75	77	java/io/IOException
    //   0	9	84	finally
    //   91	95	97	java/io/IOException
    //   11	18	105	finally
    //   20	26	105	finally
    //   60	65	105	finally
    //   11	18	109	java/io/IOException
    //   20	26	116	java/io/IOException
  }
  
  public static HashSet<String> c()
  {
    localObject1 = null;
    try
    {
      localObject2 = a.a().getPackageManager().getInstalledPackages(128);
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        ThrowableExtension.printStackTrace(localException);
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        localException.add(((PackageInfo)((Iterator)localObject1).next()).packageName);
      }
      return localException;
    }
    localObject2 = new HashSet();
    if (localObject1 == null) {
      return localObject2;
    }
  }
}
