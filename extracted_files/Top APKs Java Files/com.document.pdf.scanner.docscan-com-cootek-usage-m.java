package com.cootek.usage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.a.a.a.a.a.a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class m
{
  private b a;
  
  m(b paramB)
  {
    this.a = paramB;
  }
  
  /* Error */
  private s a()
  {
    // Byte code:
    //   0: new 23	com/cootek/usage/s
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 26	com/cootek/usage/s:<init>	(Lcom/cootek/usage/m;)V
    //   8: astore 6
    //   10: aload_0
    //   11: getfield 13	com/cootek/usage/m:a	Lcom/cootek/usage/b;
    //   14: invokevirtual 32	com/cootek/usage/b:getContext	()Landroid/content/Context;
    //   17: invokevirtual 38	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore 4
    //   22: new 40	java/util/Hashtable
    //   25: dup
    //   26: invokespecial 41	java/util/Hashtable:<init>	()V
    //   29: astore 7
    //   31: aload 4
    //   33: getstatic 47	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   36: iconst_2
    //   37: anewarray 49	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: ldc 51
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: ldc 53
    //   49: aastore
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: invokevirtual 59	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore_3
    //   57: aload_3
    //   58: ifnull +180 -> 238
    //   61: aload_3
    //   62: invokeinterface 65 1 0
    //   67: ifeq +171 -> 238
    //   70: new 67	com/cootek/usage/o
    //   73: dup
    //   74: aload_0
    //   75: iconst_0
    //   76: invokespecial 70	com/cootek/usage/o:<init>	(Lcom/cootek/usage/m;B)V
    //   79: astore 5
    //   81: aload 5
    //   83: aload_3
    //   84: iconst_0
    //   85: invokeinterface 74 2 0
    //   90: putfield 77	com/cootek/usage/o:a	J
    //   93: aload 5
    //   95: aload_3
    //   96: iconst_1
    //   97: invokeinterface 81 2 0
    //   102: putfield 85	com/cootek/usage/o:b	Ljava/lang/String;
    //   105: aload 5
    //   107: new 87	java/util/HashSet
    //   110: dup
    //   111: invokespecial 88	java/util/HashSet:<init>	()V
    //   114: putfield 92	com/cootek/usage/o:c	Ljava/util/HashSet;
    //   117: aload 5
    //   119: new 87	java/util/HashSet
    //   122: dup
    //   123: invokespecial 88	java/util/HashSet:<init>	()V
    //   126: putfield 95	com/cootek/usage/o:d	Ljava/util/HashSet;
    //   129: aload 5
    //   131: new 87	java/util/HashSet
    //   134: dup
    //   135: invokespecial 88	java/util/HashSet:<init>	()V
    //   138: putfield 98	com/cootek/usage/o:e	Ljava/util/HashSet;
    //   141: aload 5
    //   143: new 87	java/util/HashSet
    //   146: dup
    //   147: invokespecial 88	java/util/HashSet:<init>	()V
    //   150: putfield 101	com/cootek/usage/o:f	Ljava/util/HashSet;
    //   153: aload 5
    //   155: new 87	java/util/HashSet
    //   158: dup
    //   159: invokespecial 88	java/util/HashSet:<init>	()V
    //   162: putfield 104	com/cootek/usage/o:g	Ljava/util/HashSet;
    //   165: aload 5
    //   167: new 87	java/util/HashSet
    //   170: dup
    //   171: invokespecial 88	java/util/HashSet:<init>	()V
    //   174: putfield 107	com/cootek/usage/o:h	Ljava/util/HashSet;
    //   177: aload 5
    //   179: new 87	java/util/HashSet
    //   182: dup
    //   183: invokespecial 88	java/util/HashSet:<init>	()V
    //   186: putfield 110	com/cootek/usage/o:i	Ljava/util/HashSet;
    //   189: aload 7
    //   191: aload 5
    //   193: getfield 77	com/cootek/usage/o:a	J
    //   196: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   199: aload 5
    //   201: invokevirtual 120	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: aload_3
    //   206: invokeinterface 123 1 0
    //   211: istore_2
    //   212: iload_2
    //   213: ifne -143 -> 70
    //   216: goto +22 -> 238
    //   219: astore 4
    //   221: goto +2648 -> 2869
    //   224: astore 5
    //   226: aload_3
    //   227: astore 4
    //   229: goto +2563 -> 2792
    //   232: aload_3
    //   233: astore 4
    //   235: goto +2600 -> 2835
    //   238: aload_3
    //   239: ifnull +17 -> 256
    //   242: aload_3
    //   243: invokeinterface 126 1 0
    //   248: goto +8 -> 256
    //   251: astore_3
    //   252: aload_3
    //   253: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   256: aload 4
    //   258: getstatic 134	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   261: bipush 12
    //   263: anewarray 49	java/lang/String
    //   266: dup
    //   267: iconst_0
    //   268: ldc -120
    //   270: aastore
    //   271: dup
    //   272: iconst_1
    //   273: ldc -118
    //   275: aastore
    //   276: dup
    //   277: iconst_2
    //   278: ldc -116
    //   280: aastore
    //   281: dup
    //   282: iconst_3
    //   283: ldc -114
    //   285: aastore
    //   286: dup
    //   287: iconst_4
    //   288: ldc -112
    //   290: aastore
    //   291: dup
    //   292: iconst_5
    //   293: ldc -110
    //   295: aastore
    //   296: dup
    //   297: bipush 6
    //   299: ldc -108
    //   301: aastore
    //   302: dup
    //   303: bipush 7
    //   305: ldc -106
    //   307: aastore
    //   308: dup
    //   309: bipush 8
    //   311: ldc -104
    //   313: aastore
    //   314: dup
    //   315: bipush 9
    //   317: ldc -102
    //   319: aastore
    //   320: dup
    //   321: bipush 10
    //   323: ldc -100
    //   325: aastore
    //   326: dup
    //   327: bipush 11
    //   329: ldc -98
    //   331: aastore
    //   332: ldc -96
    //   334: bipush 7
    //   336: anewarray 49	java/lang/String
    //   339: dup
    //   340: iconst_0
    //   341: ldc -94
    //   343: aastore
    //   344: dup
    //   345: iconst_1
    //   346: ldc -92
    //   348: aastore
    //   349: dup
    //   350: iconst_2
    //   351: ldc -90
    //   353: aastore
    //   354: dup
    //   355: iconst_3
    //   356: ldc -88
    //   358: aastore
    //   359: dup
    //   360: iconst_4
    //   361: ldc -86
    //   363: aastore
    //   364: dup
    //   365: iconst_5
    //   366: ldc -84
    //   368: aastore
    //   369: dup
    //   370: bipush 6
    //   372: ldc -82
    //   374: aastore
    //   375: aconst_null
    //   376: invokevirtual 59	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   379: astore 5
    //   381: aload 5
    //   383: ifnull +1015 -> 1398
    //   386: aload 5
    //   388: invokeinterface 65 1 0
    //   393: istore_2
    //   394: iload_2
    //   395: ifeq +1003 -> 1398
    //   398: aload 7
    //   400: aload 5
    //   402: iconst_0
    //   403: invokeinterface 74 2 0
    //   408: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   411: invokevirtual 178	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   414: checkcast 67	com/cootek/usage/o
    //   417: astore 8
    //   419: aload 8
    //   421: ifnonnull +6 -> 427
    //   424: goto +2483 -> 2907
    //   427: aload 5
    //   429: iconst_1
    //   430: invokeinterface 81 2 0
    //   435: astore_3
    //   436: ldc -94
    //   438: aload_3
    //   439: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   442: istore_2
    //   443: iload_2
    //   444: ifeq +33 -> 477
    //   447: aload 5
    //   449: iconst_2
    //   450: invokeinterface 81 2 0
    //   455: astore 4
    //   457: aload 8
    //   459: getfield 92	com/cootek/usage/o:c	Ljava/util/HashSet;
    //   462: astore_3
    //   463: aload_3
    //   464: aload 4
    //   466: invokevirtual 185	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   469: pop
    //   470: goto +2437 -> 2907
    //   473: astore_3
    //   474: goto +883 -> 1357
    //   477: ldc -92
    //   479: aload_3
    //   480: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   483: istore_2
    //   484: iload_2
    //   485: ifeq +107 -> 592
    //   488: new 187	com/cootek/usage/p
    //   491: dup
    //   492: aload_0
    //   493: iconst_0
    //   494: invokespecial 188	com/cootek/usage/p:<init>	(Lcom/cootek/usage/m;B)V
    //   497: astore 4
    //   499: aload 4
    //   501: aload 5
    //   503: iconst_2
    //   504: invokeinterface 81 2 0
    //   509: putfield 190	com/cootek/usage/p:a	Ljava/lang/String;
    //   512: aload 5
    //   514: iconst_3
    //   515: invokeinterface 194 2 0
    //   520: tableswitch	default:+2390->2910, 0:+2422->2942, 1:+2416->2936, 2:+2409->2929, 3:+2403->2923, 4:+2396->2916
    //   556: aload 4
    //   558: aload_3
    //   559: putfield 195	com/cootek/usage/p:b	Ljava/lang/String;
    //   562: aload 4
    //   564: getfield 195	com/cootek/usage/p:b	Ljava/lang/String;
    //   567: ifnonnull +16 -> 583
    //   570: aload 4
    //   572: aload 5
    //   574: iconst_4
    //   575: invokeinterface 81 2 0
    //   580: putfield 195	com/cootek/usage/p:b	Ljava/lang/String;
    //   583: aload 8
    //   585: getfield 95	com/cootek/usage/o:d	Ljava/util/HashSet;
    //   588: astore_3
    //   589: goto -126 -> 463
    //   592: ldc -90
    //   594: aload_3
    //   595: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   598: istore_2
    //   599: iload_2
    //   600: ifeq +132 -> 732
    //   603: new 197	com/cootek/usage/t
    //   606: dup
    //   607: aload_0
    //   608: iconst_0
    //   609: invokespecial 198	com/cootek/usage/t:<init>	(Lcom/cootek/usage/m;B)V
    //   612: astore 4
    //   614: aload 4
    //   616: aload 5
    //   618: iconst_2
    //   619: invokeinterface 81 2 0
    //   624: putfield 199	com/cootek/usage/t:b	Ljava/lang/String;
    //   627: aload 4
    //   629: aload 5
    //   631: iconst_5
    //   632: invokeinterface 81 2 0
    //   637: putfield 201	com/cootek/usage/t:c	Ljava/lang/String;
    //   640: aload 5
    //   642: bipush 6
    //   644: invokeinterface 81 2 0
    //   649: astore_3
    //   650: aload 4
    //   652: aload_3
    //   653: putfield 203	com/cootek/usage/t:d	Ljava/lang/String;
    //   656: aload 5
    //   658: iconst_3
    //   659: invokeinterface 194 2 0
    //   664: tableswitch	default:+2283->2947, 0:+2302->2966, 1:+2295->2959, 2:+2289->2953
    //   692: aload 4
    //   694: aload_3
    //   695: putfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   698: aload 4
    //   700: getfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   703: ifnonnull +16 -> 719
    //   706: aload 4
    //   708: aload 5
    //   710: iconst_4
    //   711: invokeinterface 81 2 0
    //   716: putfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   719: aload 8
    //   721: getfield 98	com/cootek/usage/o:e	Ljava/util/HashSet;
    //   724: astore_3
    //   725: goto -262 -> 463
    //   728: astore_3
    //   729: goto -255 -> 474
    //   732: ldc -88
    //   734: aload_3
    //   735: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   738: ifeq +247 -> 985
    //   741: new 206	com/cootek/usage/r
    //   744: dup
    //   745: aload_0
    //   746: iconst_0
    //   747: invokespecial 207	com/cootek/usage/r:<init>	(Lcom/cootek/usage/m;B)V
    //   750: astore 4
    //   752: aload 4
    //   754: aload 5
    //   756: iconst_2
    //   757: invokeinterface 81 2 0
    //   762: putfield 208	com/cootek/usage/r:a	Ljava/lang/String;
    //   765: aload 5
    //   767: iconst_3
    //   768: invokeinterface 194 2 0
    //   773: tableswitch	default:+2198->2971, 0:+49->822, 1:+43->816, 2:+2201->2974, 3:+37->810
    //   804: ldc -46
    //   806: astore_3
    //   807: goto +17 -> 824
    //   810: ldc -44
    //   812: astore_3
    //   813: goto +11 -> 824
    //   816: ldc -42
    //   818: astore_3
    //   819: goto +5 -> 824
    //   822: aconst_null
    //   823: astore_3
    //   824: aload 4
    //   826: aload_3
    //   827: putfield 215	com/cootek/usage/r:b	Ljava/lang/String;
    //   830: aload 4
    //   832: getfield 215	com/cootek/usage/r:b	Ljava/lang/String;
    //   835: astore_3
    //   836: aload_3
    //   837: ifnonnull +16 -> 853
    //   840: aload 4
    //   842: aload 5
    //   844: iconst_4
    //   845: invokeinterface 81 2 0
    //   850: putfield 215	com/cootek/usage/r:b	Ljava/lang/String;
    //   853: aload 5
    //   855: bipush 6
    //   857: invokeinterface 194 2 0
    //   862: tableswitch	default:+2119->2981, -1:+72->934, 0:+66->928, 1:+2164->3026, 2:+2157->3019, 3:+2150->3012, 4:+2143->3005, 5:+2136->2998, 6:+2129->2991, 7:+2122->2984, 8:+60->922
    //   916: ldc -46
    //   918: astore_3
    //   919: goto +17 -> 936
    //   922: ldc -39
    //   924: astore_3
    //   925: goto +11 -> 936
    //   928: ldc -37
    //   930: astore_3
    //   931: goto +5 -> 936
    //   934: aconst_null
    //   935: astore_3
    //   936: aload 4
    //   938: aload_3
    //   939: putfield 220	com/cootek/usage/r:c	Ljava/lang/String;
    //   942: aload 4
    //   944: getfield 220	com/cootek/usage/r:c	Ljava/lang/String;
    //   947: astore_3
    //   948: aload_3
    //   949: ifnonnull +2084 -> 3033
    //   952: aload 4
    //   954: aload 5
    //   956: bipush 7
    //   958: invokeinterface 81 2 0
    //   963: putfield 220	com/cootek/usage/r:c	Ljava/lang/String;
    //   966: goto +3 -> 969
    //   969: aload 8
    //   971: getfield 101	com/cootek/usage/o:f	Ljava/util/HashSet;
    //   974: astore_3
    //   975: aload_3
    //   976: aload 4
    //   978: invokevirtual 185	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   981: pop
    //   982: goto +379 -> 1361
    //   985: ldc -86
    //   987: aload_3
    //   988: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   991: ifeq +101 -> 1092
    //   994: new 222	com/cootek/usage/n
    //   997: dup
    //   998: aload_0
    //   999: iconst_0
    //   1000: invokespecial 223	com/cootek/usage/n:<init>	(Lcom/cootek/usage/m;B)V
    //   1003: astore 4
    //   1005: aload 4
    //   1007: aload 5
    //   1009: iconst_2
    //   1010: invokeinterface 81 2 0
    //   1015: putfield 224	com/cootek/usage/n:a	Ljava/lang/String;
    //   1018: aload 5
    //   1020: iconst_3
    //   1021: invokeinterface 194 2 0
    //   1026: tableswitch	default:+2014->3040, 0:+2039->3065, 1:+2033->3059, 2:+2026->3052, 3:+2020->3046
    //   1056: aload 4
    //   1058: aload_3
    //   1059: putfield 225	com/cootek/usage/n:b	Ljava/lang/String;
    //   1062: aload 4
    //   1064: getfield 225	com/cootek/usage/n:b	Ljava/lang/String;
    //   1067: ifnonnull +16 -> 1083
    //   1070: aload 4
    //   1072: aload 5
    //   1074: iconst_4
    //   1075: invokeinterface 81 2 0
    //   1080: putfield 225	com/cootek/usage/n:b	Ljava/lang/String;
    //   1083: aload 8
    //   1085: getfield 104	com/cootek/usage/o:g	Ljava/util/HashSet;
    //   1088: astore_3
    //   1089: goto -114 -> 975
    //   1092: ldc -84
    //   1094: aload_3
    //   1095: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1098: ifeq +102 -> 1200
    //   1101: new 227	com/cootek/usage/q
    //   1104: dup
    //   1105: aload_0
    //   1106: iconst_0
    //   1107: invokespecial 228	com/cootek/usage/q:<init>	(Lcom/cootek/usage/m;B)V
    //   1110: astore 4
    //   1112: aload 4
    //   1114: aload 5
    //   1116: iconst_2
    //   1117: invokeinterface 81 2 0
    //   1122: putfield 229	com/cootek/usage/q:a	Ljava/lang/String;
    //   1125: aload 5
    //   1127: iconst_3
    //   1128: invokeinterface 194 2 0
    //   1133: tableswitch	default:+1937->3070, 0:+1963->3096, 1:+1956->3089, 2:+1950->3083, 3:+1943->3076
    //   1164: aload 4
    //   1166: aload_3
    //   1167: putfield 230	com/cootek/usage/q:b	Ljava/lang/String;
    //   1170: aload 4
    //   1172: getfield 230	com/cootek/usage/q:b	Ljava/lang/String;
    //   1175: ifnonnull +16 -> 1191
    //   1178: aload 4
    //   1180: aload 5
    //   1182: iconst_4
    //   1183: invokeinterface 81 2 0
    //   1188: putfield 230	com/cootek/usage/q:b	Ljava/lang/String;
    //   1191: aload 8
    //   1193: getfield 107	com/cootek/usage/o:h	Ljava/util/HashSet;
    //   1196: astore_3
    //   1197: goto -222 -> 975
    //   1200: ldc -82
    //   1202: aload_3
    //   1203: invokevirtual 182	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1206: ifeq +155 -> 1361
    //   1209: new 232	com/cootek/usage/u
    //   1212: dup
    //   1213: aload_0
    //   1214: iconst_0
    //   1215: invokespecial 233	com/cootek/usage/u:<init>	(Lcom/cootek/usage/m;B)V
    //   1218: astore 4
    //   1220: aload 4
    //   1222: aload 5
    //   1224: iconst_2
    //   1225: invokeinterface 81 2 0
    //   1230: putfield 234	com/cootek/usage/u:a	Ljava/lang/String;
    //   1233: aload 5
    //   1235: iconst_3
    //   1236: invokeinterface 194 2 0
    //   1241: tableswitch	default:+1860->3101, 0:+1964->3205, 1:+1957->3198, 2:+1950->3191, 3:+1943->3184, 4:+1936->3177, 5:+1929->3170, 6:+1922->3163, 7:+1915->3156, 8:+1908->3149, 9:+1901->3142, 10:+1894->3135, 11:+1887->3128, 12:+1880->3121, 13:+1873->3114, 14:+1866->3107
    //   1316: aload 4
    //   1318: aload_3
    //   1319: putfield 235	com/cootek/usage/u:b	Ljava/lang/String;
    //   1322: aload 4
    //   1324: getfield 235	com/cootek/usage/u:b	Ljava/lang/String;
    //   1327: ifnonnull +16 -> 1343
    //   1330: aload 4
    //   1332: aload 5
    //   1334: iconst_4
    //   1335: invokeinterface 81 2 0
    //   1340: putfield 235	com/cootek/usage/u:b	Ljava/lang/String;
    //   1343: aload 8
    //   1345: getfield 110	com/cootek/usage/o:i	Ljava/util/HashSet;
    //   1348: astore_3
    //   1349: goto -374 -> 975
    //   1352: astore_3
    //   1353: goto +4 -> 1357
    //   1356: astore_3
    //   1357: aload_3
    //   1358: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   1361: aload 5
    //   1363: invokeinterface 123 1 0
    //   1368: istore_2
    //   1369: iload_2
    //   1370: ifne -972 -> 398
    //   1373: goto +25 -> 1398
    //   1376: astore_3
    //   1377: goto +1379 -> 2756
    //   1380: astore_3
    //   1381: aload 5
    //   1383: astore 4
    //   1385: aload_3
    //   1386: astore 5
    //   1388: goto +1285 -> 2673
    //   1391: aload 5
    //   1393: astore 4
    //   1395: goto +1321 -> 2716
    //   1398: aload 5
    //   1400: ifnull +18 -> 1418
    //   1403: aload 5
    //   1405: invokeinterface 126 1 0
    //   1410: goto +8 -> 1418
    //   1413: astore_3
    //   1414: aload_3
    //   1415: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   1418: new 237	org/json/JSONArray
    //   1421: dup
    //   1422: invokespecial 238	org/json/JSONArray:<init>	()V
    //   1425: astore_3
    //   1426: aload 7
    //   1428: invokevirtual 242	java/util/Hashtable:values	()Ljava/util/Collection;
    //   1431: invokeinterface 248 1 0
    //   1436: astore 4
    //   1438: aload 4
    //   1440: invokeinterface 253 1 0
    //   1445: ifeq +1078 -> 2523
    //   1448: aload 4
    //   1450: invokeinterface 257 1 0
    //   1455: checkcast 67	com/cootek/usage/o
    //   1458: astore 7
    //   1460: new 259	org/json/JSONObject
    //   1463: dup
    //   1464: invokespecial 260	org/json/JSONObject:<init>	()V
    //   1467: astore 5
    //   1469: aload 5
    //   1471: ldc_w 262
    //   1474: aload 7
    //   1476: getfield 85	com/cootek/usage/o:b	Ljava/lang/String;
    //   1479: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1482: pop
    //   1483: aload 7
    //   1485: getfield 92	com/cootek/usage/o:c	Ljava/util/HashSet;
    //   1488: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   1491: ifne +70 -> 1561
    //   1494: new 237	org/json/JSONArray
    //   1497: dup
    //   1498: invokespecial 238	org/json/JSONArray:<init>	()V
    //   1501: astore 8
    //   1503: aload 7
    //   1505: getfield 92	com/cootek/usage/o:c	Ljava/util/HashSet;
    //   1508: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1511: astore 9
    //   1513: aload 9
    //   1515: invokeinterface 253 1 0
    //   1520: ifeq +22 -> 1542
    //   1523: aload 8
    //   1525: aload 9
    //   1527: invokeinterface 257 1 0
    //   1532: checkcast 49	java/lang/String
    //   1535: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   1538: pop
    //   1539: goto -26 -> 1513
    //   1542: aload 8
    //   1544: invokevirtual 276	org/json/JSONArray:length	()I
    //   1547: ifle +14 -> 1561
    //   1550: aload 5
    //   1552: ldc_w 278
    //   1555: aload 8
    //   1557: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1560: pop
    //   1561: aload 7
    //   1563: getfield 95	com/cootek/usage/o:d	Ljava/util/HashSet;
    //   1566: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   1569: ifne +133 -> 1702
    //   1572: new 237	org/json/JSONArray
    //   1575: dup
    //   1576: invokespecial 238	org/json/JSONArray:<init>	()V
    //   1579: astore 8
    //   1581: aload 7
    //   1583: getfield 95	com/cootek/usage/o:d	Ljava/util/HashSet;
    //   1586: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1589: astore 9
    //   1591: aload 9
    //   1593: invokeinterface 253 1 0
    //   1598: ifeq +85 -> 1683
    //   1601: aload 9
    //   1603: invokeinterface 257 1 0
    //   1608: checkcast 187	com/cootek/usage/p
    //   1611: astore 10
    //   1613: new 259	org/json/JSONObject
    //   1616: dup
    //   1617: invokespecial 260	org/json/JSONObject:<init>	()V
    //   1620: astore 11
    //   1622: aload 10
    //   1624: getfield 190	com/cootek/usage/p:a	Ljava/lang/String;
    //   1627: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1630: ifne -39 -> 1591
    //   1633: aload 11
    //   1635: ldc_w 285
    //   1638: aload 10
    //   1640: getfield 190	com/cootek/usage/p:a	Ljava/lang/String;
    //   1643: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1646: pop
    //   1647: aload 10
    //   1649: getfield 195	com/cootek/usage/p:b	Ljava/lang/String;
    //   1652: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1655: ifne +17 -> 1672
    //   1658: aload 11
    //   1660: ldc_w 287
    //   1663: aload 10
    //   1665: getfield 195	com/cootek/usage/p:b	Ljava/lang/String;
    //   1668: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1671: pop
    //   1672: aload 8
    //   1674: aload 11
    //   1676: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   1679: pop
    //   1680: goto -89 -> 1591
    //   1683: aload 8
    //   1685: invokevirtual 276	org/json/JSONArray:length	()I
    //   1688: ifle +14 -> 1702
    //   1691: aload 5
    //   1693: ldc_w 289
    //   1696: aload 8
    //   1698: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1701: pop
    //   1702: aload 7
    //   1704: getfield 98	com/cootek/usage/o:e	Ljava/util/HashSet;
    //   1707: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   1710: ifne +198 -> 1908
    //   1713: new 237	org/json/JSONArray
    //   1716: dup
    //   1717: invokespecial 238	org/json/JSONArray:<init>	()V
    //   1720: astore 8
    //   1722: aload 7
    //   1724: getfield 98	com/cootek/usage/o:e	Ljava/util/HashSet;
    //   1727: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1730: astore 9
    //   1732: aload 9
    //   1734: invokeinterface 253 1 0
    //   1739: ifeq +150 -> 1889
    //   1742: aload 9
    //   1744: invokeinterface 257 1 0
    //   1749: checkcast 197	com/cootek/usage/t
    //   1752: astore 10
    //   1754: new 259	org/json/JSONObject
    //   1757: dup
    //   1758: invokespecial 260	org/json/JSONObject:<init>	()V
    //   1761: astore 11
    //   1763: aload 10
    //   1765: getfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   1768: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1771: ifne +1439 -> 3210
    //   1774: aload 11
    //   1776: ldc_w 287
    //   1779: aload 10
    //   1781: getfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   1784: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1787: pop
    //   1788: iconst_1
    //   1789: istore_1
    //   1790: goto +3 -> 1793
    //   1793: aload 10
    //   1795: getfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   1798: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1801: ifne +19 -> 1820
    //   1804: aload 11
    //   1806: ldc_w 291
    //   1809: aload 10
    //   1811: getfield 199	com/cootek/usage/t:b	Ljava/lang/String;
    //   1814: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1817: pop
    //   1818: iconst_1
    //   1819: istore_1
    //   1820: aload 10
    //   1822: getfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   1825: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1828: ifne +19 -> 1847
    //   1831: aload 11
    //   1833: ldc_w 293
    //   1836: aload 10
    //   1838: getfield 201	com/cootek/usage/t:c	Ljava/lang/String;
    //   1841: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1844: pop
    //   1845: iconst_1
    //   1846: istore_1
    //   1847: aload 10
    //   1849: getfield 204	com/cootek/usage/t:a	Ljava/lang/String;
    //   1852: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1855: ifne +19 -> 1874
    //   1858: aload 11
    //   1860: ldc_w 295
    //   1863: aload 10
    //   1865: getfield 203	com/cootek/usage/t:d	Ljava/lang/String;
    //   1868: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1871: pop
    //   1872: iconst_1
    //   1873: istore_1
    //   1874: iload_1
    //   1875: ifeq -143 -> 1732
    //   1878: aload 8
    //   1880: aload 11
    //   1882: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   1885: pop
    //   1886: goto -154 -> 1732
    //   1889: aload 8
    //   1891: invokevirtual 276	org/json/JSONArray:length	()I
    //   1894: ifle +14 -> 1908
    //   1897: aload 5
    //   1899: ldc_w 297
    //   1902: aload 8
    //   1904: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1907: pop
    //   1908: aload 7
    //   1910: getfield 101	com/cootek/usage/o:f	Ljava/util/HashSet;
    //   1913: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   1916: ifne +158 -> 2074
    //   1919: new 237	org/json/JSONArray
    //   1922: dup
    //   1923: invokespecial 238	org/json/JSONArray:<init>	()V
    //   1926: astore 8
    //   1928: aload 7
    //   1930: getfield 101	com/cootek/usage/o:f	Ljava/util/HashSet;
    //   1933: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   1936: astore 9
    //   1938: aload 9
    //   1940: invokeinterface 253 1 0
    //   1945: ifeq +118 -> 2063
    //   1948: aload 9
    //   1950: invokeinterface 257 1 0
    //   1955: checkcast 206	com/cootek/usage/r
    //   1958: astore 10
    //   1960: new 259	org/json/JSONObject
    //   1963: dup
    //   1964: invokespecial 260	org/json/JSONObject:<init>	()V
    //   1967: astore 11
    //   1969: aload 10
    //   1971: getfield 208	com/cootek/usage/r:a	Ljava/lang/String;
    //   1974: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1977: ifne -39 -> 1938
    //   1980: aload 11
    //   1982: ldc_w 299
    //   1985: aload 10
    //   1987: getfield 208	com/cootek/usage/r:a	Ljava/lang/String;
    //   1990: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1993: pop
    //   1994: aload 10
    //   1996: getfield 215	com/cootek/usage/r:b	Ljava/lang/String;
    //   1999: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2002: ifne +17 -> 2019
    //   2005: aload 11
    //   2007: ldc_w 287
    //   2010: aload 10
    //   2012: getfield 215	com/cootek/usage/r:b	Ljava/lang/String;
    //   2015: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2018: pop
    //   2019: aload 10
    //   2021: getfield 220	com/cootek/usage/r:c	Ljava/lang/String;
    //   2024: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2027: ifne +17 -> 2044
    //   2030: aload 11
    //   2032: ldc_w 301
    //   2035: aload 10
    //   2037: getfield 220	com/cootek/usage/r:c	Ljava/lang/String;
    //   2040: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2043: pop
    //   2044: aload 8
    //   2046: invokevirtual 276	org/json/JSONArray:length	()I
    //   2049: ifle -111 -> 1938
    //   2052: aload 8
    //   2054: aload 11
    //   2056: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2059: pop
    //   2060: goto -122 -> 1938
    //   2063: aload 5
    //   2065: ldc_w 303
    //   2068: aload 8
    //   2070: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2073: pop
    //   2074: aload 7
    //   2076: getfield 104	com/cootek/usage/o:g	Ljava/util/HashSet;
    //   2079: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   2082: ifne +133 -> 2215
    //   2085: new 237	org/json/JSONArray
    //   2088: dup
    //   2089: invokespecial 238	org/json/JSONArray:<init>	()V
    //   2092: astore 8
    //   2094: aload 7
    //   2096: getfield 104	com/cootek/usage/o:g	Ljava/util/HashSet;
    //   2099: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   2102: astore 9
    //   2104: aload 9
    //   2106: invokeinterface 253 1 0
    //   2111: ifeq +85 -> 2196
    //   2114: aload 9
    //   2116: invokeinterface 257 1 0
    //   2121: checkcast 222	com/cootek/usage/n
    //   2124: astore 10
    //   2126: new 259	org/json/JSONObject
    //   2129: dup
    //   2130: invokespecial 260	org/json/JSONObject:<init>	()V
    //   2133: astore 11
    //   2135: aload 10
    //   2137: getfield 224	com/cootek/usage/n:a	Ljava/lang/String;
    //   2140: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2143: ifne -39 -> 2104
    //   2146: aload 11
    //   2148: ldc_w 305
    //   2151: aload 10
    //   2153: getfield 224	com/cootek/usage/n:a	Ljava/lang/String;
    //   2156: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2159: pop
    //   2160: aload 10
    //   2162: getfield 225	com/cootek/usage/n:b	Ljava/lang/String;
    //   2165: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2168: ifne +17 -> 2185
    //   2171: aload 11
    //   2173: ldc_w 287
    //   2176: aload 10
    //   2178: getfield 225	com/cootek/usage/n:b	Ljava/lang/String;
    //   2181: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2184: pop
    //   2185: aload 8
    //   2187: aload 11
    //   2189: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2192: pop
    //   2193: goto -89 -> 2104
    //   2196: aload 8
    //   2198: invokevirtual 276	org/json/JSONArray:length	()I
    //   2201: ifle +14 -> 2215
    //   2204: aload 5
    //   2206: ldc_w 285
    //   2209: aload 8
    //   2211: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2214: pop
    //   2215: aload 7
    //   2217: getfield 107	com/cootek/usage/o:h	Ljava/util/HashSet;
    //   2220: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   2223: ifne +133 -> 2356
    //   2226: new 237	org/json/JSONArray
    //   2229: dup
    //   2230: invokespecial 238	org/json/JSONArray:<init>	()V
    //   2233: astore 8
    //   2235: aload 7
    //   2237: getfield 107	com/cootek/usage/o:h	Ljava/util/HashSet;
    //   2240: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   2243: astore 9
    //   2245: aload 9
    //   2247: invokeinterface 253 1 0
    //   2252: ifeq +85 -> 2337
    //   2255: aload 9
    //   2257: invokeinterface 257 1 0
    //   2262: checkcast 227	com/cootek/usage/q
    //   2265: astore 10
    //   2267: new 259	org/json/JSONObject
    //   2270: dup
    //   2271: invokespecial 260	org/json/JSONObject:<init>	()V
    //   2274: astore 11
    //   2276: aload 10
    //   2278: getfield 229	com/cootek/usage/q:a	Ljava/lang/String;
    //   2281: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2284: ifne -39 -> 2245
    //   2287: aload 11
    //   2289: ldc_w 307
    //   2292: aload 10
    //   2294: getfield 229	com/cootek/usage/q:a	Ljava/lang/String;
    //   2297: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2300: pop
    //   2301: aload 10
    //   2303: getfield 230	com/cootek/usage/q:b	Ljava/lang/String;
    //   2306: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2309: ifne +17 -> 2326
    //   2312: aload 11
    //   2314: ldc_w 287
    //   2317: aload 10
    //   2319: getfield 230	com/cootek/usage/q:b	Ljava/lang/String;
    //   2322: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2325: pop
    //   2326: aload 8
    //   2328: aload 11
    //   2330: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2333: pop
    //   2334: goto -89 -> 2245
    //   2337: aload 8
    //   2339: invokevirtual 276	org/json/JSONArray:length	()I
    //   2342: ifle +14 -> 2356
    //   2345: aload 5
    //   2347: ldc_w 309
    //   2350: aload 8
    //   2352: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2355: pop
    //   2356: aload 7
    //   2358: getfield 110	com/cootek/usage/o:i	Ljava/util/HashSet;
    //   2361: invokevirtual 268	java/util/HashSet:isEmpty	()Z
    //   2364: ifne +143 -> 2507
    //   2367: new 237	org/json/JSONArray
    //   2370: dup
    //   2371: invokespecial 238	org/json/JSONArray:<init>	()V
    //   2374: astore 8
    //   2376: aload 7
    //   2378: getfield 110	com/cootek/usage/o:i	Ljava/util/HashSet;
    //   2381: invokevirtual 269	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   2384: astore 7
    //   2386: aload 7
    //   2388: invokeinterface 253 1 0
    //   2393: ifeq +85 -> 2478
    //   2396: aload 7
    //   2398: invokeinterface 257 1 0
    //   2403: checkcast 232	com/cootek/usage/u
    //   2406: astore 9
    //   2408: new 259	org/json/JSONObject
    //   2411: dup
    //   2412: invokespecial 260	org/json/JSONObject:<init>	()V
    //   2415: astore 10
    //   2417: aload 9
    //   2419: getfield 234	com/cootek/usage/u:a	Ljava/lang/String;
    //   2422: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2425: ifne -39 -> 2386
    //   2428: aload 10
    //   2430: ldc_w 262
    //   2433: aload 9
    //   2435: getfield 234	com/cootek/usage/u:a	Ljava/lang/String;
    //   2438: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2441: pop
    //   2442: aload 9
    //   2444: getfield 235	com/cootek/usage/u:b	Ljava/lang/String;
    //   2447: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2450: ifne +17 -> 2467
    //   2453: aload 10
    //   2455: ldc_w 287
    //   2458: aload 9
    //   2460: getfield 235	com/cootek/usage/u:b	Ljava/lang/String;
    //   2463: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2466: pop
    //   2467: aload 8
    //   2469: aload 10
    //   2471: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2474: pop
    //   2475: goto -89 -> 2386
    //   2478: aload 8
    //   2480: invokevirtual 276	org/json/JSONArray:length	()I
    //   2483: ifle +24 -> 2507
    //   2486: aload 5
    //   2488: ldc_w 311
    //   2491: aload 8
    //   2493: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2496: pop
    //   2497: goto +10 -> 2507
    //   2500: astore 7
    //   2502: aload 7
    //   2504: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2507: aload_3
    //   2508: aload 5
    //   2510: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2513: pop
    //   2514: aload 6
    //   2516: iconst_1
    //   2517: putfield 314	com/cootek/usage/s:d	Z
    //   2520: goto -1082 -> 1438
    //   2523: aload_0
    //   2524: getfield 13	com/cootek/usage/m:a	Lcom/cootek/usage/b;
    //   2527: invokevirtual 318	com/cootek/usage/b:getPhoneAccount	()Ljava/lang/String;
    //   2530: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2533: ifne +74 -> 2607
    //   2536: new 259	org/json/JSONObject
    //   2539: dup
    //   2540: invokespecial 260	org/json/JSONObject:<init>	()V
    //   2543: astore 4
    //   2545: aload 4
    //   2547: ldc_w 262
    //   2550: ldc_w 320
    //   2553: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2556: pop
    //   2557: new 237	org/json/JSONArray
    //   2560: dup
    //   2561: invokespecial 238	org/json/JSONArray:<init>	()V
    //   2564: astore 5
    //   2566: aload 5
    //   2568: aload_0
    //   2569: getfield 13	com/cootek/usage/m:a	Lcom/cootek/usage/b;
    //   2572: invokevirtual 318	com/cootek/usage/b:getPhoneAccount	()Ljava/lang/String;
    //   2575: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2578: pop
    //   2579: aload 4
    //   2581: ldc_w 278
    //   2584: aload 5
    //   2586: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   2589: pop
    //   2590: goto +10 -> 2600
    //   2593: astore 5
    //   2595: aload 5
    //   2597: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2600: aload_3
    //   2601: aload 4
    //   2603: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   2606: pop
    //   2607: new 322	com/cootek/usage/UsageData
    //   2610: dup
    //   2611: invokespecial 323	com/cootek/usage/UsageData:<init>	()V
    //   2614: astore 4
    //   2616: aload 4
    //   2618: ldc_w 325
    //   2621: putfield 327	com/cootek/usage/UsageData:type	Ljava/lang/String;
    //   2624: aload 4
    //   2626: iconst_0
    //   2627: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   2630: putfield 332	com/cootek/usage/UsageData:path	Ljava/lang/String;
    //   2633: aload 4
    //   2635: aload_3
    //   2636: invokevirtual 335	org/json/JSONArray:toString	()Ljava/lang/String;
    //   2639: putfield 338	com/cootek/usage/UsageData:value	Ljava/lang/String;
    //   2642: aload 6
    //   2644: aload 4
    //   2646: putfield 341	com/cootek/usage/s:a	Lcom/cootek/usage/UsageData;
    //   2649: aload 6
    //   2651: iconst_0
    //   2652: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   2655: putfield 342	com/cootek/usage/s:c	Ljava/lang/String;
    //   2658: aload 6
    //   2660: areturn
    //   2661: astore_3
    //   2662: aconst_null
    //   2663: astore 5
    //   2665: goto +91 -> 2756
    //   2668: astore 5
    //   2670: aconst_null
    //   2671: astore 4
    //   2673: aload 4
    //   2675: astore_3
    //   2676: aload 5
    //   2678: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2681: aload 4
    //   2683: astore_3
    //   2684: aload 6
    //   2686: iconst_0
    //   2687: putfield 314	com/cootek/usage/s:d	Z
    //   2690: aload 4
    //   2692: ifnull +18 -> 2710
    //   2695: aload 4
    //   2697: invokeinterface 126 1 0
    //   2702: aload 6
    //   2704: areturn
    //   2705: astore_3
    //   2706: aload_3
    //   2707: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2710: aload 6
    //   2712: areturn
    //   2713: aconst_null
    //   2714: astore 4
    //   2716: aload 4
    //   2718: astore_3
    //   2719: aload 6
    //   2721: iconst_0
    //   2722: putfield 314	com/cootek/usage/s:d	Z
    //   2725: aload 4
    //   2727: ifnull +18 -> 2745
    //   2730: aload 4
    //   2732: invokeinterface 126 1 0
    //   2737: aload 6
    //   2739: areturn
    //   2740: astore_3
    //   2741: aload_3
    //   2742: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2745: aload 6
    //   2747: areturn
    //   2748: astore 4
    //   2750: aload_3
    //   2751: astore 5
    //   2753: aload 4
    //   2755: astore_3
    //   2756: aload 5
    //   2758: ifnull +20 -> 2778
    //   2761: aload 5
    //   2763: invokeinterface 126 1 0
    //   2768: goto +10 -> 2778
    //   2771: astore 4
    //   2773: aload 4
    //   2775: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2778: aload_3
    //   2779: athrow
    //   2780: astore 4
    //   2782: aconst_null
    //   2783: astore_3
    //   2784: goto +85 -> 2869
    //   2787: astore 5
    //   2789: aconst_null
    //   2790: astore 4
    //   2792: aload 4
    //   2794: astore_3
    //   2795: aload 5
    //   2797: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2800: aload 4
    //   2802: astore_3
    //   2803: aload 6
    //   2805: iconst_0
    //   2806: putfield 314	com/cootek/usage/s:d	Z
    //   2809: aload 4
    //   2811: ifnull +18 -> 2829
    //   2814: aload 4
    //   2816: invokeinterface 126 1 0
    //   2821: aload 6
    //   2823: areturn
    //   2824: astore_3
    //   2825: aload_3
    //   2826: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2829: aload 6
    //   2831: areturn
    //   2832: aconst_null
    //   2833: astore 4
    //   2835: aload 4
    //   2837: astore_3
    //   2838: aload 6
    //   2840: iconst_0
    //   2841: putfield 314	com/cootek/usage/s:d	Z
    //   2844: aload 4
    //   2846: ifnull +18 -> 2864
    //   2849: aload 4
    //   2851: invokeinterface 126 1 0
    //   2856: aload 6
    //   2858: areturn
    //   2859: astore_3
    //   2860: aload_3
    //   2861: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2864: aload 6
    //   2866: areturn
    //   2867: astore 4
    //   2869: aload_3
    //   2870: ifnull +17 -> 2887
    //   2873: aload_3
    //   2874: invokeinterface 126 1 0
    //   2879: goto +8 -> 2887
    //   2882: astore_3
    //   2883: aload_3
    //   2884: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   2887: aload 4
    //   2889: athrow
    //   2890: astore_3
    //   2891: goto -59 -> 2832
    //   2894: astore 4
    //   2896: goto -2664 -> 232
    //   2899: astore_3
    //   2900: goto -187 -> 2713
    //   2903: astore_3
    //   2904: goto -1513 -> 1391
    //   2907: goto -1546 -> 1361
    //   2910: ldc -46
    //   2912: astore_3
    //   2913: goto -2357 -> 556
    //   2916: ldc_w 344
    //   2919: astore_3
    //   2920: goto -2364 -> 556
    //   2923: ldc -44
    //   2925: astore_3
    //   2926: goto -2370 -> 556
    //   2929: ldc_w 346
    //   2932: astore_3
    //   2933: goto -2377 -> 556
    //   2936: ldc -42
    //   2938: astore_3
    //   2939: goto -2383 -> 556
    //   2942: aconst_null
    //   2943: astore_3
    //   2944: goto -2388 -> 556
    //   2947: ldc -46
    //   2949: astore_3
    //   2950: goto -2258 -> 692
    //   2953: ldc -44
    //   2955: astore_3
    //   2956: goto -2264 -> 692
    //   2959: ldc_w 346
    //   2962: astore_3
    //   2963: goto -2271 -> 692
    //   2966: aconst_null
    //   2967: astore_3
    //   2968: goto -2276 -> 692
    //   2971: goto -2167 -> 804
    //   2974: ldc_w 346
    //   2977: astore_3
    //   2978: goto -2154 -> 824
    //   2981: goto -2065 -> 916
    //   2984: ldc_w 348
    //   2987: astore_3
    //   2988: goto -2052 -> 936
    //   2991: ldc_w 350
    //   2994: astore_3
    //   2995: goto -2059 -> 936
    //   2998: ldc_w 352
    //   3001: astore_3
    //   3002: goto -2066 -> 936
    //   3005: ldc_w 354
    //   3008: astore_3
    //   3009: goto -2073 -> 936
    //   3012: ldc_w 356
    //   3015: astore_3
    //   3016: goto -2080 -> 936
    //   3019: ldc_w 358
    //   3022: astore_3
    //   3023: goto -2087 -> 936
    //   3026: ldc_w 360
    //   3029: astore_3
    //   3030: goto -2094 -> 936
    //   3033: goto -2064 -> 969
    //   3036: astore_3
    //   3037: goto -1680 -> 1357
    //   3040: ldc -46
    //   3042: astore_3
    //   3043: goto -1987 -> 1056
    //   3046: ldc -44
    //   3048: astore_3
    //   3049: goto -1993 -> 1056
    //   3052: ldc_w 346
    //   3055: astore_3
    //   3056: goto -2000 -> 1056
    //   3059: ldc -42
    //   3061: astore_3
    //   3062: goto -2006 -> 1056
    //   3065: aconst_null
    //   3066: astore_3
    //   3067: goto -2011 -> 1056
    //   3070: ldc -46
    //   3072: astore_3
    //   3073: goto -1909 -> 1164
    //   3076: ldc_w 362
    //   3079: astore_3
    //   3080: goto -1916 -> 1164
    //   3083: ldc -44
    //   3085: astore_3
    //   3086: goto -1922 -> 1164
    //   3089: ldc_w 364
    //   3092: astore_3
    //   3093: goto -1929 -> 1164
    //   3096: aconst_null
    //   3097: astore_3
    //   3098: goto -1934 -> 1164
    //   3101: ldc -46
    //   3103: astore_3
    //   3104: goto -1788 -> 1316
    //   3107: ldc_w 366
    //   3110: astore_3
    //   3111: goto -1795 -> 1316
    //   3114: ldc_w 368
    //   3117: astore_3
    //   3118: goto -1802 -> 1316
    //   3121: ldc_w 370
    //   3124: astore_3
    //   3125: goto -1809 -> 1316
    //   3128: ldc_w 372
    //   3131: astore_3
    //   3132: goto -1816 -> 1316
    //   3135: ldc_w 374
    //   3138: astore_3
    //   3139: goto -1823 -> 1316
    //   3142: ldc_w 376
    //   3145: astore_3
    //   3146: goto -1830 -> 1316
    //   3149: ldc_w 378
    //   3152: astore_3
    //   3153: goto -1837 -> 1316
    //   3156: ldc_w 380
    //   3159: astore_3
    //   3160: goto -1844 -> 1316
    //   3163: ldc_w 382
    //   3166: astore_3
    //   3167: goto -1851 -> 1316
    //   3170: ldc_w 384
    //   3173: astore_3
    //   3174: goto -1858 -> 1316
    //   3177: ldc_w 386
    //   3180: astore_3
    //   3181: goto -1865 -> 1316
    //   3184: ldc_w 388
    //   3187: astore_3
    //   3188: goto -1872 -> 1316
    //   3191: ldc_w 390
    //   3194: astore_3
    //   3195: goto -1879 -> 1316
    //   3198: ldc_w 392
    //   3201: astore_3
    //   3202: goto -1886 -> 1316
    //   3205: aconst_null
    //   3206: astore_3
    //   3207: goto -1891 -> 1316
    //   3210: iconst_0
    //   3211: istore_1
    //   3212: goto -1419 -> 1793
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	3215	0	this	m
    //   1789	1423	1	i	int
    //   211	1159	2	bool	boolean
    //   56	187	3	localCursor	android.database.Cursor
    //   251	2	3	localRuntimeException1	RuntimeException
    //   435	29	3	localObject1	Object
    //   473	86	3	localRuntimeException2	RuntimeException
    //   588	137	3	localObject2	Object
    //   728	7	3	localRuntimeException3	RuntimeException
    //   806	543	3	localObject3	Object
    //   1352	1	3	localRuntimeException4	RuntimeException
    //   1356	2	3	localRuntimeException5	RuntimeException
    //   1376	1	3	localObject4	Object
    //   1380	6	3	localRuntimeException6	RuntimeException
    //   1413	2	3	localRuntimeException7	RuntimeException
    //   1425	1211	3	localJSONArray	JSONArray
    //   2661	1	3	localObject5	Object
    //   2675	9	3	localObject6	Object
    //   2705	2	3	localRuntimeException8	RuntimeException
    //   2718	1	3	localObject7	Object
    //   2740	11	3	localRuntimeException9	RuntimeException
    //   2755	48	3	localObject8	Object
    //   2824	2	3	localRuntimeException10	RuntimeException
    //   2837	1	3	localObject9	Object
    //   2859	15	3	localRuntimeException11	RuntimeException
    //   2882	2	3	localRuntimeException12	RuntimeException
    //   2890	1	3	localSecurityException1	SecurityException
    //   2899	1	3	localSecurityException2	SecurityException
    //   2903	1	3	localSecurityException3	SecurityException
    //   2912	118	3	str1	String
    //   3036	1	3	localRuntimeException13	RuntimeException
    //   3042	165	3	str2	String
    //   20	12	4	localContentResolver	android.content.ContentResolver
    //   219	1	4	localObject10	Object
    //   227	2504	4	localObject11	Object
    //   2748	6	4	localObject12	Object
    //   2771	3	4	localRuntimeException14	RuntimeException
    //   2780	1	4	localObject13	Object
    //   2790	60	4	localObject14	Object
    //   2867	21	4	localObject15	Object
    //   2894	1	4	localSecurityException4	SecurityException
    //   79	121	5	localO	o
    //   224	1	5	localRuntimeException15	RuntimeException
    //   379	2206	5	localObject16	Object
    //   2593	3	5	localJSONException1	JSONException
    //   2663	1	5	localObject17	Object
    //   2668	9	5	localRuntimeException16	RuntimeException
    //   2751	11	5	localRuntimeException17	RuntimeException
    //   2787	9	5	localRuntimeException18	RuntimeException
    //   8	2857	6	localS	s
    //   29	2368	7	localObject18	Object
    //   2500	3	7	localJSONException2	JSONException
    //   417	2075	8	localObject19	Object
    //   1511	948	9	localObject20	Object
    //   1611	859	10	localObject21	Object
    //   1620	709	11	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   61	70	219	finally
    //   70	212	219	finally
    //   61	70	224	java/lang/RuntimeException
    //   70	212	224	java/lang/RuntimeException
    //   242	248	251	java/lang/RuntimeException
    //   447	463	473	java/lang/RuntimeException
    //   463	470	473	java/lang/RuntimeException
    //   488	556	473	java/lang/RuntimeException
    //   556	583	473	java/lang/RuntimeException
    //   583	589	473	java/lang/RuntimeException
    //   603	640	473	java/lang/RuntimeException
    //   650	692	473	java/lang/RuntimeException
    //   692	719	473	java/lang/RuntimeException
    //   719	725	473	java/lang/RuntimeException
    //   840	853	473	java/lang/RuntimeException
    //   640	650	728	java/lang/RuntimeException
    //   952	966	1352	java/lang/RuntimeException
    //   969	975	1352	java/lang/RuntimeException
    //   975	982	1352	java/lang/RuntimeException
    //   985	1056	1352	java/lang/RuntimeException
    //   1056	1083	1352	java/lang/RuntimeException
    //   1083	1089	1352	java/lang/RuntimeException
    //   1092	1164	1352	java/lang/RuntimeException
    //   1164	1191	1352	java/lang/RuntimeException
    //   1191	1197	1352	java/lang/RuntimeException
    //   1200	1316	1352	java/lang/RuntimeException
    //   1316	1343	1352	java/lang/RuntimeException
    //   1343	1349	1352	java/lang/RuntimeException
    //   398	419	1356	java/lang/RuntimeException
    //   427	443	1356	java/lang/RuntimeException
    //   477	484	1356	java/lang/RuntimeException
    //   592	599	1356	java/lang/RuntimeException
    //   732	804	1356	java/lang/RuntimeException
    //   824	836	1356	java/lang/RuntimeException
    //   386	394	1376	finally
    //   398	419	1376	finally
    //   427	443	1376	finally
    //   447	463	1376	finally
    //   463	470	1376	finally
    //   477	484	1376	finally
    //   488	556	1376	finally
    //   556	583	1376	finally
    //   583	589	1376	finally
    //   592	599	1376	finally
    //   603	640	1376	finally
    //   640	650	1376	finally
    //   650	692	1376	finally
    //   692	719	1376	finally
    //   719	725	1376	finally
    //   732	804	1376	finally
    //   824	836	1376	finally
    //   840	853	1376	finally
    //   853	916	1376	finally
    //   936	948	1376	finally
    //   952	966	1376	finally
    //   969	975	1376	finally
    //   975	982	1376	finally
    //   985	1056	1376	finally
    //   1056	1083	1376	finally
    //   1083	1089	1376	finally
    //   1092	1164	1376	finally
    //   1164	1191	1376	finally
    //   1191	1197	1376	finally
    //   1200	1316	1376	finally
    //   1316	1343	1376	finally
    //   1343	1349	1376	finally
    //   1357	1361	1376	finally
    //   1361	1369	1376	finally
    //   386	394	1380	java/lang/RuntimeException
    //   1357	1361	1380	java/lang/RuntimeException
    //   1361	1369	1380	java/lang/RuntimeException
    //   1403	1410	1413	java/lang/RuntimeException
    //   1469	1513	2500	org/json/JSONException
    //   1513	1539	2500	org/json/JSONException
    //   1542	1561	2500	org/json/JSONException
    //   1561	1591	2500	org/json/JSONException
    //   1591	1672	2500	org/json/JSONException
    //   1672	1680	2500	org/json/JSONException
    //   1683	1702	2500	org/json/JSONException
    //   1702	1732	2500	org/json/JSONException
    //   1732	1788	2500	org/json/JSONException
    //   1793	1818	2500	org/json/JSONException
    //   1820	1845	2500	org/json/JSONException
    //   1847	1872	2500	org/json/JSONException
    //   1878	1886	2500	org/json/JSONException
    //   1889	1908	2500	org/json/JSONException
    //   1908	1938	2500	org/json/JSONException
    //   1938	2019	2500	org/json/JSONException
    //   2019	2044	2500	org/json/JSONException
    //   2044	2060	2500	org/json/JSONException
    //   2063	2074	2500	org/json/JSONException
    //   2074	2104	2500	org/json/JSONException
    //   2104	2185	2500	org/json/JSONException
    //   2185	2193	2500	org/json/JSONException
    //   2196	2215	2500	org/json/JSONException
    //   2215	2245	2500	org/json/JSONException
    //   2245	2326	2500	org/json/JSONException
    //   2326	2334	2500	org/json/JSONException
    //   2337	2356	2500	org/json/JSONException
    //   2356	2386	2500	org/json/JSONException
    //   2386	2467	2500	org/json/JSONException
    //   2467	2475	2500	org/json/JSONException
    //   2478	2497	2500	org/json/JSONException
    //   2545	2590	2593	org/json/JSONException
    //   256	381	2661	finally
    //   256	381	2668	java/lang/RuntimeException
    //   2695	2702	2705	java/lang/RuntimeException
    //   2730	2737	2740	java/lang/RuntimeException
    //   2676	2681	2748	finally
    //   2684	2690	2748	finally
    //   2719	2725	2748	finally
    //   2761	2768	2771	java/lang/RuntimeException
    //   31	57	2780	finally
    //   31	57	2787	java/lang/RuntimeException
    //   2814	2821	2824	java/lang/RuntimeException
    //   2849	2856	2859	java/lang/RuntimeException
    //   2795	2800	2867	finally
    //   2803	2809	2867	finally
    //   2838	2844	2867	finally
    //   2873	2879	2882	java/lang/RuntimeException
    //   31	57	2890	java/lang/SecurityException
    //   61	70	2894	java/lang/SecurityException
    //   70	212	2894	java/lang/SecurityException
    //   256	381	2899	java/lang/SecurityException
    //   386	394	2903	java/lang/SecurityException
    //   398	419	2903	java/lang/SecurityException
    //   427	443	2903	java/lang/SecurityException
    //   447	463	2903	java/lang/SecurityException
    //   463	470	2903	java/lang/SecurityException
    //   477	484	2903	java/lang/SecurityException
    //   488	556	2903	java/lang/SecurityException
    //   556	583	2903	java/lang/SecurityException
    //   583	589	2903	java/lang/SecurityException
    //   592	599	2903	java/lang/SecurityException
    //   603	640	2903	java/lang/SecurityException
    //   640	650	2903	java/lang/SecurityException
    //   650	692	2903	java/lang/SecurityException
    //   692	719	2903	java/lang/SecurityException
    //   719	725	2903	java/lang/SecurityException
    //   732	804	2903	java/lang/SecurityException
    //   824	836	2903	java/lang/SecurityException
    //   840	853	2903	java/lang/SecurityException
    //   853	916	2903	java/lang/SecurityException
    //   936	948	2903	java/lang/SecurityException
    //   952	966	2903	java/lang/SecurityException
    //   969	975	2903	java/lang/SecurityException
    //   975	982	2903	java/lang/SecurityException
    //   985	1056	2903	java/lang/SecurityException
    //   1056	1083	2903	java/lang/SecurityException
    //   1083	1089	2903	java/lang/SecurityException
    //   1092	1164	2903	java/lang/SecurityException
    //   1164	1191	2903	java/lang/SecurityException
    //   1191	1197	2903	java/lang/SecurityException
    //   1200	1316	2903	java/lang/SecurityException
    //   1316	1343	2903	java/lang/SecurityException
    //   1343	1349	2903	java/lang/SecurityException
    //   1357	1361	2903	java/lang/SecurityException
    //   1361	1369	2903	java/lang/SecurityException
    //   853	916	3036	java/lang/RuntimeException
    //   936	948	3036	java/lang/RuntimeException
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder("error info value: ");
      localStringBuilder.append(paramInt);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 5: 
      return "noah_reserve_05";
    case 4: 
      return "noah_reserve_04";
    case 3: 
      return "noah_reserve_03";
    case 2: 
      return "noah_reserve_02";
    case 1: 
      return "noah_reserve_01";
    }
    return "noah_reserve_00";
  }
  
  /* Error */
  private s b()
  {
    // Byte code:
    //   0: new 23	com/cootek/usage/s
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 26	com/cootek/usage/s:<init>	(Lcom/cootek/usage/m;)V
    //   8: astore 11
    //   10: aload_0
    //   11: getfield 13	com/cootek/usage/m:a	Lcom/cootek/usage/b;
    //   14: invokevirtual 32	com/cootek/usage/b:getContext	()Landroid/content/Context;
    //   17: invokevirtual 38	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore 13
    //   22: new 237	org/json/JSONArray
    //   25: dup
    //   26: invokespecial 238	org/json/JSONArray:<init>	()V
    //   29: astore 12
    //   31: aconst_null
    //   32: astore 10
    //   34: aconst_null
    //   35: astore 9
    //   37: aconst_null
    //   38: astore 8
    //   40: aload 8
    //   42: astore 7
    //   44: invokestatic 424	com/cootek/usage/z:a	()Lcom/cootek/usage/z;
    //   47: iconst_1
    //   48: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   51: invokevirtual 427	com/cootek/usage/z:c	(Ljava/lang/String;)J
    //   54: lstore_2
    //   55: aload 8
    //   57: astore 7
    //   59: aload 13
    //   61: getstatic 430	android/provider/CallLog$Calls:CONTENT_URI	Landroid/net/Uri;
    //   64: bipush 6
    //   66: anewarray 49	java/lang/String
    //   69: dup
    //   70: iconst_0
    //   71: ldc 51
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: ldc_w 432
    //   79: aastore
    //   80: dup
    //   81: iconst_2
    //   82: ldc_w 307
    //   85: aastore
    //   86: dup
    //   87: iconst_3
    //   88: ldc_w 434
    //   91: aastore
    //   92: dup
    //   93: iconst_4
    //   94: ldc_w 287
    //   97: aastore
    //   98: dup
    //   99: iconst_5
    //   100: ldc_w 262
    //   103: aastore
    //   104: ldc_w 436
    //   107: iconst_1
    //   108: anewarray 49	java/lang/String
    //   111: dup
    //   112: iconst_0
    //   113: lload_2
    //   114: invokestatic 439	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   117: aastore
    //   118: ldc_w 441
    //   121: invokevirtual 59	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   124: astore 8
    //   126: aload 8
    //   128: ifnull +233 -> 361
    //   131: aload 8
    //   133: invokeinterface 65 1 0
    //   138: ifeq +223 -> 361
    //   141: aload 11
    //   143: aload 8
    //   145: iconst_0
    //   146: invokeinterface 74 2 0
    //   151: putfield 443	com/cootek/usage/s:b	J
    //   154: aload 8
    //   156: iconst_1
    //   157: invokeinterface 81 2 0
    //   162: astore 7
    //   164: aload 8
    //   166: iconst_2
    //   167: invokeinterface 74 2 0
    //   172: lstore 4
    //   174: aload 8
    //   176: iconst_3
    //   177: invokeinterface 74 2 0
    //   182: lstore_2
    //   183: aload 8
    //   185: iconst_4
    //   186: invokeinterface 194 2 0
    //   191: istore_1
    //   192: aload 8
    //   194: iconst_5
    //   195: invokeinterface 81 2 0
    //   200: astore 9
    //   202: new 259	org/json/JSONObject
    //   205: dup
    //   206: invokespecial 260	org/json/JSONObject:<init>	()V
    //   209: astore 10
    //   211: aload 10
    //   213: ldc_w 445
    //   216: aload 7
    //   218: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   221: pop
    //   222: aload 10
    //   224: ldc_w 307
    //   227: lload 4
    //   229: ldc2_w 446
    //   232: ldiv
    //   233: invokevirtual 450	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   236: pop
    //   237: iload_1
    //   238: iconst_2
    //   239: if_icmpne +11 -> 250
    //   242: ldc_w 452
    //   245: astore 7
    //   247: goto +8 -> 255
    //   250: ldc_w 454
    //   253: astore 7
    //   255: aload 10
    //   257: ldc_w 287
    //   260: aload 7
    //   262: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   265: pop
    //   266: iconst_3
    //   267: iload_1
    //   268: if_icmpne +5 -> 273
    //   271: lconst_0
    //   272: lstore_2
    //   273: aload 10
    //   275: ldc_w 434
    //   278: lload_2
    //   279: invokevirtual 450	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   282: pop
    //   283: aload 10
    //   285: ldc_w 456
    //   288: aload 9
    //   290: invokestatic 283	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   293: iconst_1
    //   294: ixor
    //   295: invokevirtual 459	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   298: pop
    //   299: aload 12
    //   301: aload 10
    //   303: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   306: pop
    //   307: aload 11
    //   309: iconst_1
    //   310: putfield 314	com/cootek/usage/s:d	Z
    //   313: goto +15 -> 328
    //   316: astore 7
    //   318: goto +5 -> 323
    //   321: astore 7
    //   323: aload 7
    //   325: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   328: aload 8
    //   330: invokeinterface 123 1 0
    //   335: istore 6
    //   337: iload 6
    //   339: ifne +6 -> 345
    //   342: goto +19 -> 361
    //   345: goto -191 -> 154
    //   348: astore 7
    //   350: goto +220 -> 570
    //   353: astore 9
    //   355: goto +136 -> 491
    //   358: goto +177 -> 535
    //   361: aload 8
    //   363: ifnull +20 -> 383
    //   366: aload 8
    //   368: invokeinterface 126 1 0
    //   373: goto +10 -> 383
    //   376: astore 7
    //   378: aload 7
    //   380: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   383: new 259	org/json/JSONObject
    //   386: dup
    //   387: invokespecial 260	org/json/JSONObject:<init>	()V
    //   390: astore 7
    //   392: aload 7
    //   394: ldc_w 461
    //   397: aload 12
    //   399: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   402: pop
    //   403: goto +10 -> 413
    //   406: astore 8
    //   408: aload 8
    //   410: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   413: new 322	com/cootek/usage/UsageData
    //   416: dup
    //   417: invokespecial 323	com/cootek/usage/UsageData:<init>	()V
    //   420: astore 8
    //   422: aload 8
    //   424: ldc_w 325
    //   427: putfield 327	com/cootek/usage/UsageData:type	Ljava/lang/String;
    //   430: aload 8
    //   432: iconst_1
    //   433: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   436: putfield 332	com/cootek/usage/UsageData:path	Ljava/lang/String;
    //   439: aload 8
    //   441: aload 7
    //   443: invokevirtual 462	org/json/JSONObject:toString	()Ljava/lang/String;
    //   446: putfield 338	com/cootek/usage/UsageData:value	Ljava/lang/String;
    //   449: aload 11
    //   451: aload 8
    //   453: putfield 341	com/cootek/usage/s:a	Lcom/cootek/usage/UsageData;
    //   456: aload 11
    //   458: iconst_1
    //   459: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   462: putfield 342	com/cootek/usage/s:c	Ljava/lang/String;
    //   465: aload 11
    //   467: areturn
    //   468: astore 8
    //   470: aload 7
    //   472: astore 9
    //   474: aload 8
    //   476: astore 7
    //   478: aload 9
    //   480: astore 8
    //   482: goto +88 -> 570
    //   485: astore 9
    //   487: aload 10
    //   489: astore 8
    //   491: aload 8
    //   493: astore 7
    //   495: aload 9
    //   497: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   500: aload 8
    //   502: astore 7
    //   504: aload 11
    //   506: iconst_0
    //   507: putfield 314	com/cootek/usage/s:d	Z
    //   510: aload 8
    //   512: ifnull +20 -> 532
    //   515: aload 8
    //   517: invokeinterface 126 1 0
    //   522: aload 11
    //   524: areturn
    //   525: astore 7
    //   527: aload 7
    //   529: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   532: aload 11
    //   534: areturn
    //   535: aload 8
    //   537: astore 7
    //   539: aload 11
    //   541: iconst_0
    //   542: putfield 314	com/cootek/usage/s:d	Z
    //   545: aload 8
    //   547: ifnull +20 -> 567
    //   550: aload 8
    //   552: invokeinterface 126 1 0
    //   557: aload 11
    //   559: areturn
    //   560: astore 7
    //   562: aload 7
    //   564: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   567: aload 11
    //   569: areturn
    //   570: aload 8
    //   572: ifnull +20 -> 592
    //   575: aload 8
    //   577: invokeinterface 126 1 0
    //   582: goto +10 -> 592
    //   585: astore 8
    //   587: aload 8
    //   589: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   592: aload 7
    //   594: athrow
    //   595: astore 7
    //   597: aload 9
    //   599: astore 8
    //   601: goto -66 -> 535
    //   604: astore 7
    //   606: goto -248 -> 358
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	609	0	this	m
    //   191	78	1	i	int
    //   54	225	2	l1	long
    //   172	56	4	l2	long
    //   335	3	6	bool	boolean
    //   42	219	7	localObject1	Object
    //   316	1	7	localJSONException1	JSONException
    //   321	3	7	localJSONException2	JSONException
    //   348	1	7	localObject2	Object
    //   376	3	7	localRuntimeException1	RuntimeException
    //   390	113	7	localObject3	Object
    //   525	3	7	localRuntimeException2	RuntimeException
    //   537	1	7	localObject4	Object
    //   560	33	7	localRuntimeException3	RuntimeException
    //   595	1	7	localSecurityException1	SecurityException
    //   604	1	7	localSecurityException2	SecurityException
    //   38	329	8	localCursor	android.database.Cursor
    //   406	3	8	localJSONException3	JSONException
    //   420	32	8	localUsageData	UsageData
    //   468	7	8	localObject5	Object
    //   480	96	8	localObject6	Object
    //   585	3	8	localRuntimeException4	RuntimeException
    //   599	1	8	localRuntimeException5	RuntimeException
    //   35	254	9	str	String
    //   353	1	9	localRuntimeException6	RuntimeException
    //   472	7	9	localObject7	Object
    //   485	113	9	localRuntimeException7	RuntimeException
    //   32	456	10	localJSONObject	JSONObject
    //   8	560	11	localS	s
    //   29	369	12	localJSONArray	JSONArray
    //   20	40	13	localContentResolver	android.content.ContentResolver
    // Exception table:
    //   from	to	target	type
    //   273	313	316	org/json/JSONException
    //   211	237	321	org/json/JSONException
    //   255	266	321	org/json/JSONException
    //   131	154	348	finally
    //   154	211	348	finally
    //   211	237	348	finally
    //   255	266	348	finally
    //   273	313	348	finally
    //   323	328	348	finally
    //   328	337	348	finally
    //   131	154	353	java/lang/RuntimeException
    //   154	211	353	java/lang/RuntimeException
    //   211	237	353	java/lang/RuntimeException
    //   255	266	353	java/lang/RuntimeException
    //   273	313	353	java/lang/RuntimeException
    //   323	328	353	java/lang/RuntimeException
    //   328	337	353	java/lang/RuntimeException
    //   366	373	376	java/lang/RuntimeException
    //   392	403	406	org/json/JSONException
    //   44	55	468	finally
    //   59	126	468	finally
    //   495	500	468	finally
    //   504	510	468	finally
    //   539	545	468	finally
    //   44	55	485	java/lang/RuntimeException
    //   59	126	485	java/lang/RuntimeException
    //   515	522	525	java/lang/RuntimeException
    //   550	557	560	java/lang/RuntimeException
    //   575	582	585	java/lang/RuntimeException
    //   44	55	595	java/lang/SecurityException
    //   59	126	595	java/lang/SecurityException
    //   131	154	604	java/lang/SecurityException
    //   154	211	604	java/lang/SecurityException
    //   211	237	604	java/lang/SecurityException
    //   255	266	604	java/lang/SecurityException
    //   273	313	604	java/lang/SecurityException
    //   323	328	604	java/lang/SecurityException
    //   328	337	604	java/lang/SecurityException
  }
  
  /* Error */
  private s c()
  {
    // Byte code:
    //   0: new 23	com/cootek/usage/s
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 26	com/cootek/usage/s:<init>	(Lcom/cootek/usage/m;)V
    //   8: astore 12
    //   10: aload_0
    //   11: getfield 13	com/cootek/usage/m:a	Lcom/cootek/usage/b;
    //   14: invokevirtual 32	com/cootek/usage/b:getContext	()Landroid/content/Context;
    //   17: invokevirtual 38	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore 14
    //   22: new 237	org/json/JSONArray
    //   25: dup
    //   26: invokespecial 238	org/json/JSONArray:<init>	()V
    //   29: astore 13
    //   31: aconst_null
    //   32: astore 11
    //   34: aconst_null
    //   35: astore 10
    //   37: aconst_null
    //   38: astore 9
    //   40: iconst_1
    //   41: istore_1
    //   42: aload 9
    //   44: astore 8
    //   46: invokestatic 424	com/cootek/usage/z:a	()Lcom/cootek/usage/z;
    //   49: iconst_2
    //   50: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   53: invokevirtual 427	com/cootek/usage/z:c	(Ljava/lang/String;)J
    //   56: lstore_3
    //   57: aload 9
    //   59: astore 8
    //   61: aload 14
    //   63: ldc_w 464
    //   66: invokestatic 470	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   69: bipush 6
    //   71: anewarray 49	java/lang/String
    //   74: dup
    //   75: iconst_0
    //   76: ldc 51
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: ldc_w 285
    //   84: aastore
    //   85: dup
    //   86: iconst_2
    //   87: ldc_w 472
    //   90: aastore
    //   91: dup
    //   92: iconst_3
    //   93: ldc_w 307
    //   96: aastore
    //   97: dup
    //   98: iconst_4
    //   99: ldc_w 474
    //   102: aastore
    //   103: dup
    //   104: iconst_5
    //   105: ldc_w 476
    //   108: aastore
    //   109: ldc_w 436
    //   112: iconst_1
    //   113: anewarray 49	java/lang/String
    //   116: dup
    //   117: iconst_0
    //   118: lload_3
    //   119: invokestatic 439	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   122: aastore
    //   123: ldc_w 478
    //   126: invokevirtual 59	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   129: astore 9
    //   131: aload 9
    //   133: ifnull +251 -> 384
    //   136: aload 9
    //   138: invokeinterface 65 1 0
    //   143: ifeq +241 -> 384
    //   146: aload 12
    //   148: aload 9
    //   150: iconst_0
    //   151: invokeinterface 74 2 0
    //   156: putfield 443	com/cootek/usage/s:b	J
    //   159: aload 9
    //   161: iload_1
    //   162: invokeinterface 81 2 0
    //   167: astore 8
    //   169: aload 9
    //   171: iconst_2
    //   172: invokeinterface 74 2 0
    //   177: lstore_3
    //   178: lload_3
    //   179: lconst_0
    //   180: lcmp
    //   181: ifgt +457 -> 638
    //   184: aload 9
    //   186: iconst_3
    //   187: invokeinterface 74 2 0
    //   192: lstore 5
    //   194: aload 9
    //   196: iconst_4
    //   197: invokeinterface 81 2 0
    //   202: astore 10
    //   204: aload 9
    //   206: iconst_5
    //   207: invokeinterface 81 2 0
    //   212: astore 11
    //   214: new 259	org/json/JSONObject
    //   217: dup
    //   218: invokespecial 260	org/json/JSONObject:<init>	()V
    //   221: astore 14
    //   223: aload 14
    //   225: ldc_w 445
    //   228: aload 8
    //   230: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   233: pop
    //   234: aload 14
    //   236: ldc_w 307
    //   239: lload 5
    //   241: ldc2_w 446
    //   244: ldiv
    //   245: invokevirtual 450	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   248: pop
    //   249: aload 14
    //   251: ldc_w 287
    //   254: ldc_w 454
    //   257: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   260: pop
    //   261: lload_3
    //   262: lconst_0
    //   263: lcmp
    //   264: ifle +368 -> 632
    //   267: iconst_1
    //   268: istore 7
    //   270: goto +3 -> 273
    //   273: aload 14
    //   275: ldc_w 456
    //   278: iload 7
    //   280: invokevirtual 459	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   283: pop
    //   284: aload 14
    //   286: ldc_w 480
    //   289: aload 10
    //   291: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   294: pop
    //   295: aload 14
    //   297: ldc_w 476
    //   300: aload 11
    //   302: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   305: pop
    //   306: aload 13
    //   308: aload 14
    //   310: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   313: pop
    //   314: iconst_1
    //   315: istore_2
    //   316: iconst_1
    //   317: istore_1
    //   318: aload 12
    //   320: iconst_1
    //   321: putfield 314	com/cootek/usage/s:d	Z
    //   324: iload_2
    //   325: istore_1
    //   326: goto +25 -> 351
    //   329: astore 8
    //   331: goto +12 -> 343
    //   334: astore 8
    //   336: iconst_1
    //   337: istore_1
    //   338: goto +5 -> 343
    //   341: astore 8
    //   343: aload 8
    //   345: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   348: goto +3 -> 351
    //   351: aload 9
    //   353: invokeinterface 123 1 0
    //   358: istore 7
    //   360: iload 7
    //   362: ifne +6 -> 368
    //   365: goto +19 -> 384
    //   368: goto -209 -> 159
    //   371: astore 8
    //   373: goto +220 -> 593
    //   376: astore 10
    //   378: goto +136 -> 514
    //   381: goto +177 -> 558
    //   384: aload 9
    //   386: ifnull +20 -> 406
    //   389: aload 9
    //   391: invokeinterface 126 1 0
    //   396: goto +10 -> 406
    //   399: astore 8
    //   401: aload 8
    //   403: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   406: new 259	org/json/JSONObject
    //   409: dup
    //   410: invokespecial 260	org/json/JSONObject:<init>	()V
    //   413: astore 8
    //   415: aload 8
    //   417: ldc_w 461
    //   420: aload 13
    //   422: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   425: pop
    //   426: goto +10 -> 436
    //   429: astore 9
    //   431: aload 9
    //   433: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   436: new 322	com/cootek/usage/UsageData
    //   439: dup
    //   440: invokespecial 323	com/cootek/usage/UsageData:<init>	()V
    //   443: astore 9
    //   445: aload 9
    //   447: ldc_w 325
    //   450: putfield 327	com/cootek/usage/UsageData:type	Ljava/lang/String;
    //   453: aload 9
    //   455: iconst_2
    //   456: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   459: putfield 332	com/cootek/usage/UsageData:path	Ljava/lang/String;
    //   462: aload 9
    //   464: aload 8
    //   466: invokevirtual 462	org/json/JSONObject:toString	()Ljava/lang/String;
    //   469: putfield 338	com/cootek/usage/UsageData:value	Ljava/lang/String;
    //   472: aload 12
    //   474: aload 9
    //   476: putfield 341	com/cootek/usage/s:a	Lcom/cootek/usage/UsageData;
    //   479: aload 12
    //   481: iconst_2
    //   482: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   485: putfield 342	com/cootek/usage/s:c	Ljava/lang/String;
    //   488: aload 12
    //   490: areturn
    //   491: astore 9
    //   493: aload 8
    //   495: astore 10
    //   497: aload 9
    //   499: astore 8
    //   501: aload 10
    //   503: astore 9
    //   505: goto +88 -> 593
    //   508: astore 10
    //   510: aload 11
    //   512: astore 9
    //   514: aload 9
    //   516: astore 8
    //   518: aload 10
    //   520: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   523: aload 9
    //   525: astore 8
    //   527: aload 12
    //   529: iconst_0
    //   530: putfield 314	com/cootek/usage/s:d	Z
    //   533: aload 9
    //   535: ifnull +20 -> 555
    //   538: aload 9
    //   540: invokeinterface 126 1 0
    //   545: aload 12
    //   547: areturn
    //   548: astore 8
    //   550: aload 8
    //   552: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   555: aload 12
    //   557: areturn
    //   558: aload 9
    //   560: astore 8
    //   562: aload 12
    //   564: iconst_0
    //   565: putfield 314	com/cootek/usage/s:d	Z
    //   568: aload 9
    //   570: ifnull +20 -> 590
    //   573: aload 9
    //   575: invokeinterface 126 1 0
    //   580: aload 12
    //   582: areturn
    //   583: astore 8
    //   585: aload 8
    //   587: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   590: aload 12
    //   592: areturn
    //   593: aload 9
    //   595: ifnull +20 -> 615
    //   598: aload 9
    //   600: invokeinterface 126 1 0
    //   605: goto +10 -> 615
    //   608: astore 9
    //   610: aload 9
    //   612: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   615: aload 8
    //   617: athrow
    //   618: astore 8
    //   620: aload 10
    //   622: astore 9
    //   624: goto -66 -> 558
    //   627: astore 8
    //   629: goto -248 -> 381
    //   632: iconst_0
    //   633: istore 7
    //   635: goto -362 -> 273
    //   638: goto -287 -> 351
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	641	0	this	m
    //   41	297	1	i	int
    //   315	10	2	j	int
    //   56	206	3	l1	long
    //   192	48	5	l2	long
    //   268	366	7	bool	boolean
    //   44	185	8	localObject1	Object
    //   329	1	8	localJSONException1	JSONException
    //   334	1	8	localJSONException2	JSONException
    //   341	3	8	localJSONException3	JSONException
    //   371	1	8	localObject2	Object
    //   399	3	8	localRuntimeException1	RuntimeException
    //   413	113	8	localObject3	Object
    //   548	3	8	localRuntimeException2	RuntimeException
    //   560	1	8	localObject4	Object
    //   583	33	8	localRuntimeException3	RuntimeException
    //   618	1	8	localSecurityException1	SecurityException
    //   627	1	8	localSecurityException2	SecurityException
    //   38	352	9	localCursor	android.database.Cursor
    //   429	3	9	localJSONException4	JSONException
    //   443	32	9	localUsageData	UsageData
    //   491	7	9	localObject5	Object
    //   503	96	9	localObject6	Object
    //   608	3	9	localRuntimeException4	RuntimeException
    //   622	1	9	localRuntimeException5	RuntimeException
    //   35	255	10	str1	String
    //   376	1	10	localRuntimeException6	RuntimeException
    //   495	7	10	localObject7	Object
    //   508	113	10	localRuntimeException7	RuntimeException
    //   32	479	11	str2	String
    //   8	583	12	localS	s
    //   29	392	13	localJSONArray	JSONArray
    //   20	289	14	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   318	324	329	org/json/JSONException
    //   234	261	334	org/json/JSONException
    //   273	314	334	org/json/JSONException
    //   223	234	341	org/json/JSONException
    //   136	159	371	finally
    //   159	178	371	finally
    //   184	223	371	finally
    //   223	234	371	finally
    //   234	261	371	finally
    //   273	314	371	finally
    //   318	324	371	finally
    //   343	348	371	finally
    //   351	360	371	finally
    //   136	159	376	java/lang/RuntimeException
    //   159	178	376	java/lang/RuntimeException
    //   184	223	376	java/lang/RuntimeException
    //   223	234	376	java/lang/RuntimeException
    //   234	261	376	java/lang/RuntimeException
    //   273	314	376	java/lang/RuntimeException
    //   318	324	376	java/lang/RuntimeException
    //   343	348	376	java/lang/RuntimeException
    //   351	360	376	java/lang/RuntimeException
    //   389	396	399	java/lang/RuntimeException
    //   415	426	429	org/json/JSONException
    //   46	57	491	finally
    //   61	131	491	finally
    //   518	523	491	finally
    //   527	533	491	finally
    //   562	568	491	finally
    //   46	57	508	java/lang/RuntimeException
    //   61	131	508	java/lang/RuntimeException
    //   538	545	548	java/lang/RuntimeException
    //   573	580	583	java/lang/RuntimeException
    //   598	605	608	java/lang/RuntimeException
    //   46	57	618	java/lang/SecurityException
    //   61	131	618	java/lang/SecurityException
    //   136	159	627	java/lang/SecurityException
    //   159	178	627	java/lang/SecurityException
    //   184	223	627	java/lang/SecurityException
    //   223	234	627	java/lang/SecurityException
    //   234	261	627	java/lang/SecurityException
    //   273	314	627	java/lang/SecurityException
    //   318	324	627	java/lang/SecurityException
    //   343	348	627	java/lang/SecurityException
    //   351	360	627	java/lang/SecurityException
  }
  
  private s d()
  {
    s localS = new s(this);
    Object localObject1 = this.a.getContext().getPackageManager();
    int i = 0;
    List localList = ((PackageManager)localObject1).getInstalledPackages(0);
    JSONArray localJSONArray = new JSONArray();
    while (i < localList.size())
    {
      Object localObject2 = (PackageInfo)localList.get(i);
      if (((((PackageInfo)localObject2).applicationInfo.flags & 0x1) == 0) || ((((PackageInfo)localObject2).applicationInfo.flags & 0x80) != 0))
      {
        String str = ((PackageInfo)localObject2).applicationInfo.loadLabel((PackageManager)localObject1).toString();
        localObject2 = ((PackageInfo)localObject2).packageName;
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("name", str);
          localJSONObject.put("package_name", localObject2);
          localJSONArray.put(localJSONObject);
          localS.d = true;
        }
        catch (JSONException localJSONException2)
        {
          a.a(localJSONException2);
        }
      }
      i += 1;
    }
    localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("data", localJSONArray);
    }
    catch (JSONException localJSONException1)
    {
      a.a(localJSONException1);
    }
    UsageData localUsageData = new UsageData();
    localUsageData.type = "noah_info";
    localUsageData.path = a(3);
    localUsageData.value = ((JSONObject)localObject1).toString();
    localS.a = localUsageData;
    localS.c = a(3);
    return localS;
  }
  
  /* Error */
  private s e()
  {
    // Byte code:
    //   0: new 23	com/cootek/usage/s
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 26	com/cootek/usage/s:<init>	(Lcom/cootek/usage/m;)V
    //   8: astore 13
    //   10: aload_0
    //   11: getfield 13	com/cootek/usage/m:a	Lcom/cootek/usage/b;
    //   14: invokevirtual 32	com/cootek/usage/b:getContext	()Landroid/content/Context;
    //   17: invokevirtual 38	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore 10
    //   22: new 237	org/json/JSONArray
    //   25: dup
    //   26: invokespecial 238	org/json/JSONArray:<init>	()V
    //   29: astore 12
    //   31: ldc_w 524
    //   34: invokestatic 470	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   37: astore 11
    //   39: invokestatic 424	com/cootek/usage/z:a	()Lcom/cootek/usage/z;
    //   42: iconst_1
    //   43: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   46: invokevirtual 427	com/cootek/usage/z:c	(Ljava/lang/String;)J
    //   49: lstore_3
    //   50: aload 10
    //   52: aload 11
    //   54: bipush 7
    //   56: anewarray 49	java/lang/String
    //   59: dup
    //   60: iconst_0
    //   61: ldc 51
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: ldc_w 432
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: ldc_w 307
    //   75: aastore
    //   76: dup
    //   77: iconst_3
    //   78: ldc_w 434
    //   81: aastore
    //   82: dup
    //   83: iconst_4
    //   84: ldc_w 287
    //   87: aastore
    //   88: dup
    //   89: iconst_5
    //   90: ldc -120
    //   92: aastore
    //   93: dup
    //   94: bipush 6
    //   96: ldc_w 526
    //   99: aastore
    //   100: ldc_w 436
    //   103: iconst_1
    //   104: anewarray 49	java/lang/String
    //   107: dup
    //   108: iconst_0
    //   109: lload_3
    //   110: invokestatic 439	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   113: aastore
    //   114: ldc_w 441
    //   117: invokevirtual 59	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   120: astore 10
    //   122: aload 10
    //   124: ifnull +318 -> 442
    //   127: aload 10
    //   129: invokeinterface 65 1 0
    //   134: ifeq +308 -> 442
    //   137: aload 13
    //   139: aload 10
    //   141: iconst_0
    //   142: invokeinterface 74 2 0
    //   147: putfield 443	com/cootek/usage/s:b	J
    //   150: aload 10
    //   152: iconst_1
    //   153: invokeinterface 81 2 0
    //   158: astore 11
    //   160: aload 10
    //   162: iconst_2
    //   163: invokeinterface 74 2 0
    //   168: lstore 7
    //   170: aload 10
    //   172: iconst_3
    //   173: invokeinterface 74 2 0
    //   178: lstore_3
    //   179: aload 10
    //   181: iconst_4
    //   182: invokeinterface 194 2 0
    //   187: istore_1
    //   188: aload 10
    //   190: iconst_5
    //   191: invokeinterface 74 2 0
    //   196: lstore 5
    //   198: aload 10
    //   200: bipush 6
    //   202: invokeinterface 194 2 0
    //   207: istore_2
    //   208: new 259	org/json/JSONObject
    //   211: dup
    //   212: invokespecial 260	org/json/JSONObject:<init>	()V
    //   215: astore 14
    //   217: aload 14
    //   219: ldc_w 445
    //   222: aload 11
    //   224: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   227: pop
    //   228: aload 14
    //   230: ldc_w 307
    //   233: lload 7
    //   235: ldc2_w 446
    //   238: ldiv
    //   239: invokevirtual 450	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   242: pop
    //   243: iconst_3
    //   244: iload_1
    //   245: if_icmpne +436 -> 681
    //   248: lconst_0
    //   249: lstore_3
    //   250: goto +3 -> 253
    //   253: aload 14
    //   255: ldc_w 434
    //   258: lload_3
    //   259: invokevirtual 450	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   262: pop
    //   263: lload 5
    //   265: lconst_0
    //   266: lcmp
    //   267: ifeq +417 -> 684
    //   270: iconst_1
    //   271: istore 9
    //   273: goto +3 -> 276
    //   276: aload 14
    //   278: ldc_w 456
    //   281: iload 9
    //   283: invokevirtual 459	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   286: pop
    //   287: iload_1
    //   288: iconst_2
    //   289: if_icmpne +16 -> 305
    //   292: ldc_w 452
    //   295: astore 11
    //   297: goto +13 -> 310
    //   300: astore 11
    //   302: goto +94 -> 396
    //   305: ldc_w 454
    //   308: astore 11
    //   310: aload 14
    //   312: ldc_w 287
    //   315: aload 11
    //   317: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   320: pop
    //   321: iload_2
    //   322: ifne +368 -> 690
    //   325: ldc_w 528
    //   328: astore 11
    //   330: aload 14
    //   332: ldc_w 530
    //   335: aload 11
    //   337: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   340: pop
    //   341: goto +36 -> 377
    //   344: iload_2
    //   345: iconst_2
    //   346: if_icmpne +11 -> 357
    //   349: ldc_w 532
    //   352: astore 11
    //   354: goto -24 -> 330
    //   357: iload_2
    //   358: iconst_3
    //   359: if_icmpne +18 -> 377
    //   362: aload 14
    //   364: ldc_w 530
    //   367: ldc_w 534
    //   370: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   373: pop
    //   374: goto +3 -> 377
    //   377: aload 12
    //   379: aload 14
    //   381: invokevirtual 272	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   384: pop
    //   385: aload 13
    //   387: iconst_1
    //   388: putfield 314	com/cootek/usage/s:d	Z
    //   391: goto +10 -> 401
    //   394: astore 11
    //   396: aload 11
    //   398: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   401: aload 10
    //   403: invokeinterface 123 1 0
    //   408: istore 9
    //   410: iload 9
    //   412: ifne +6 -> 418
    //   415: goto +27 -> 442
    //   418: goto -268 -> 150
    //   421: astore 11
    //   423: goto +223 -> 646
    //   426: astore 12
    //   428: aload 10
    //   430: astore 11
    //   432: goto +130 -> 562
    //   435: aload 10
    //   437: astore 11
    //   439: goto +170 -> 609
    //   442: aload 10
    //   444: ifnull +20 -> 464
    //   447: aload 10
    //   449: invokeinterface 126 1 0
    //   454: goto +10 -> 464
    //   457: astore 10
    //   459: aload 10
    //   461: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   464: new 259	org/json/JSONObject
    //   467: dup
    //   468: invokespecial 260	org/json/JSONObject:<init>	()V
    //   471: astore 10
    //   473: aload 10
    //   475: ldc_w 461
    //   478: aload 12
    //   480: invokevirtual 265	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   483: pop
    //   484: goto +10 -> 494
    //   487: astore 11
    //   489: aload 11
    //   491: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   494: new 322	com/cootek/usage/UsageData
    //   497: dup
    //   498: invokespecial 323	com/cootek/usage/UsageData:<init>	()V
    //   501: astore 11
    //   503: aload 11
    //   505: ldc_w 325
    //   508: putfield 327	com/cootek/usage/UsageData:type	Ljava/lang/String;
    //   511: aload 11
    //   513: iconst_4
    //   514: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   517: putfield 332	com/cootek/usage/UsageData:path	Ljava/lang/String;
    //   520: aload 11
    //   522: aload 10
    //   524: invokevirtual 462	org/json/JSONObject:toString	()Ljava/lang/String;
    //   527: putfield 338	com/cootek/usage/UsageData:value	Ljava/lang/String;
    //   530: aload 13
    //   532: aload 11
    //   534: putfield 341	com/cootek/usage/s:a	Lcom/cootek/usage/UsageData;
    //   537: aload 13
    //   539: iconst_4
    //   540: invokestatic 329	com/cootek/usage/m:a	(I)Ljava/lang/String;
    //   543: putfield 342	com/cootek/usage/s:c	Ljava/lang/String;
    //   546: aload 13
    //   548: areturn
    //   549: astore 11
    //   551: aconst_null
    //   552: astore 10
    //   554: goto +92 -> 646
    //   557: astore 12
    //   559: aconst_null
    //   560: astore 11
    //   562: aload 11
    //   564: astore 10
    //   566: aload 12
    //   568: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   571: aload 11
    //   573: astore 10
    //   575: aload 13
    //   577: iconst_0
    //   578: putfield 314	com/cootek/usage/s:d	Z
    //   581: aload 11
    //   583: ifnull +20 -> 603
    //   586: aload 11
    //   588: invokeinterface 126 1 0
    //   593: aload 13
    //   595: areturn
    //   596: astore 10
    //   598: aload 10
    //   600: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   603: aload 13
    //   605: areturn
    //   606: aconst_null
    //   607: astore 11
    //   609: aload 11
    //   611: astore 10
    //   613: aload 13
    //   615: iconst_0
    //   616: putfield 314	com/cootek/usage/s:d	Z
    //   619: aload 11
    //   621: ifnull +20 -> 641
    //   624: aload 11
    //   626: invokeinterface 126 1 0
    //   631: aload 13
    //   633: areturn
    //   634: astore 10
    //   636: aload 10
    //   638: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   641: aload 13
    //   643: areturn
    //   644: astore 11
    //   646: aload 10
    //   648: ifnull +20 -> 668
    //   651: aload 10
    //   653: invokeinterface 126 1 0
    //   658: goto +10 -> 668
    //   661: astore 10
    //   663: aload 10
    //   665: invokestatic 131	com/google/a/a/a/a/a/a:a	(Ljava/lang/Throwable;)V
    //   668: aload 11
    //   670: athrow
    //   671: astore 10
    //   673: goto -67 -> 606
    //   676: astore 11
    //   678: goto -243 -> 435
    //   681: goto -428 -> 253
    //   684: iconst_0
    //   685: istore 9
    //   687: goto -411 -> 276
    //   690: iload_2
    //   691: iconst_1
    //   692: if_icmpne -348 -> 344
    //   695: ldc_w 536
    //   698: astore 11
    //   700: goto -370 -> 330
    //   703: astore 11
    //   705: goto -309 -> 396
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	708	0	this	m
    //   187	103	1	i	int
    //   207	486	2	j	int
    //   49	210	3	l1	long
    //   196	68	5	l2	long
    //   168	66	7	l3	long
    //   271	415	9	bool	boolean
    //   20	428	10	localObject1	Object
    //   457	3	10	localRuntimeException1	RuntimeException
    //   471	103	10	localObject2	Object
    //   596	3	10	localRuntimeException2	RuntimeException
    //   611	1	10	localObject3	Object
    //   634	18	10	localRuntimeException3	RuntimeException
    //   661	3	10	localRuntimeException4	RuntimeException
    //   671	1	10	localSecurityException1	SecurityException
    //   37	259	11	localObject4	Object
    //   300	1	11	localJSONException1	JSONException
    //   308	45	11	str1	String
    //   394	3	11	localJSONException2	JSONException
    //   421	1	11	localObject5	Object
    //   430	8	11	localObject6	Object
    //   487	3	11	localJSONException3	JSONException
    //   501	32	11	localUsageData	UsageData
    //   549	1	11	localObject7	Object
    //   560	65	11	localObject8	Object
    //   644	25	11	localObject9	Object
    //   676	1	11	localSecurityException2	SecurityException
    //   698	1	11	str2	String
    //   703	1	11	localJSONException4	JSONException
    //   29	349	12	localJSONArray	JSONArray
    //   426	53	12	localRuntimeException5	RuntimeException
    //   557	10	12	localRuntimeException6	RuntimeException
    //   8	634	13	localS	s
    //   215	165	14	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   330	341	300	org/json/JSONException
    //   217	243	394	org/json/JSONException
    //   253	263	394	org/json/JSONException
    //   276	287	394	org/json/JSONException
    //   310	321	394	org/json/JSONException
    //   127	150	421	finally
    //   150	217	421	finally
    //   217	243	421	finally
    //   253	263	421	finally
    //   276	287	421	finally
    //   310	321	421	finally
    //   330	341	421	finally
    //   362	374	421	finally
    //   377	391	421	finally
    //   396	401	421	finally
    //   401	410	421	finally
    //   127	150	426	java/lang/RuntimeException
    //   150	217	426	java/lang/RuntimeException
    //   217	243	426	java/lang/RuntimeException
    //   253	263	426	java/lang/RuntimeException
    //   276	287	426	java/lang/RuntimeException
    //   310	321	426	java/lang/RuntimeException
    //   330	341	426	java/lang/RuntimeException
    //   362	374	426	java/lang/RuntimeException
    //   377	391	426	java/lang/RuntimeException
    //   396	401	426	java/lang/RuntimeException
    //   401	410	426	java/lang/RuntimeException
    //   447	454	457	java/lang/RuntimeException
    //   473	484	487	org/json/JSONException
    //   31	122	549	finally
    //   31	122	557	java/lang/RuntimeException
    //   586	593	596	java/lang/RuntimeException
    //   624	631	634	java/lang/RuntimeException
    //   566	571	644	finally
    //   575	581	644	finally
    //   613	619	644	finally
    //   651	658	661	java/lang/RuntimeException
    //   31	122	671	java/lang/SecurityException
    //   127	150	676	java/lang/SecurityException
    //   150	217	676	java/lang/SecurityException
    //   217	243	676	java/lang/SecurityException
    //   253	263	676	java/lang/SecurityException
    //   276	287	676	java/lang/SecurityException
    //   310	321	676	java/lang/SecurityException
    //   330	341	676	java/lang/SecurityException
    //   362	374	676	java/lang/SecurityException
    //   377	391	676	java/lang/SecurityException
    //   396	401	676	java/lang/SecurityException
    //   401	410	676	java/lang/SecurityException
    //   362	374	703	org/json/JSONException
    //   377	391	703	org/json/JSONException
  }
  
  private s f()
  {
    s localS = new s(this);
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      String str1 = x.a(f.a.getContext());
      String str2 = x.b(f.a.getContext());
      localJSONObject1.put("phone", str1);
      localJSONObject1.put("IMSI", str2);
      localJSONArray.put(localJSONObject1);
      localS.d = true;
    }
    catch (JSONException localJSONException2)
    {
      a.a(localJSONException2);
    }
    JSONObject localJSONObject2 = new JSONObject();
    try
    {
      localJSONObject2.put("data", localJSONArray);
    }
    catch (JSONException localJSONException1)
    {
      a.a(localJSONException1);
    }
    UsageData localUsageData = new UsageData();
    localUsageData.type = "noah_info";
    localUsageData.path = a(5);
    localUsageData.value = localJSONObject2.toString();
    localS.a = localUsageData;
    localS.c = a(5);
    return localS;
  }
  
  final s b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder("error info value: ");
      localStringBuilder.append(paramInt);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 5: 
      return f();
    case 4: 
      return e();
    case 3: 
      return d();
    case 2: 
      return c();
    case 1: 
      return b();
    }
    return a();
  }
}