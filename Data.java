import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author 
 * This class to mapping data from xml or access table to object
 * Doi tuong nay tao ra de giu data tam thoi va tinh toan cung nhu 
 * dung de lay du lieu ra dua vao cac text box 
 *
 */
public class Data {

  /**
   * Day chinh la khai niem cua tu khoa static va final 
   * khai bao 1 lan va dung mai mai trong bo nho, giup ta khong phai tao ra
   * qua nhieu object ma chi can dung lai. Khi khoi tao 1 doi tuong la static no se
   * nam san trong bo nho
   * con dung tu khoa final thi se khong set lai value cho bien do duoc nua de dam bao
   * bien do khong bi thay doi
   * 
   *ham intern() trong string de dam bao la luon luon tra ve doi tuong da khoi tao ma khong 
   *tao ra doi tuong khac
   */
  public static final String TYPE_XML = "xml".intern() ;
  public static final String TYPE_ACESS = "mdb".intern() ;
  
  /**
   * Nhung bien chi dung trong class thi dung private, va viet ham get, set cho bien nay neu muon
   * truy xuat tu ngoai vao, cai nay la coding convention, khong nen viet 1 bien la public va truy 
   * xuat truc tiep, nen truy xuat qua setter va getter  
   *
   */
  private String datatype_ = TYPE_XML;

  /**
   * kieu khai bao nay tiet kiem bo nho cho java bang cach dua luong so luong 
   * cac so co the co trong moi mang du lueu cu the
   * lam java quan trong nhat la memory (bo nho) nen khi viet code tranh viet thua, 
   * dung du lieu thua thai
   */
  protected long[] giaidacbiet = new long[1];
  protected long[] giainhat  = new long[1];
  protected long[] giainhi  = new long[2];
  protected long[] giaiba  = new long[6];
  protected long[] giaitu  = new long[4];
  protected long[] giainam  = new long[6];
  protected long[] giaisau  = new long[3];
  protected long[] giaibay  = new long[4];

  public static final String KEY_DB = "dacbiet".intern();
  public static final String KEY_NHAT = "nhat".intern(); 
  public static final String KEY_NHI = "nhi".intern();
  public static final String KEY_BA = "ba".intern();  
  public static final String KEY_TU = "tu".intern();
  public static final String KEY_NAM = "nam".intern();
  public static final String KEY_SAU = "sau".intern();
  public static final String KEY_BAY = "bay".intern();

  public static final String KEY_NHI1 = "nhi1".intern();
  public static final String KEY_NHI2 = "nhi2".intern();

  public static final String KEY_BA1 = "ba1".intern();
  public static final String KEY_BA2 = "ba2".intern();
  public static final String KEY_BA3 = "ba3".intern();
  public static final String KEY_BA4 = "ba4".intern();
  public static final String KEY_BA5 = "ba5".intern();
  public static final String KEY_BA6 = "ba6".intern();

  public static final String KEY_TU1 = "tu1".intern();
  public static final String KEY_TU2 = "tu2".intern();
  public static final String KEY_TU3 = "tu3".intern();
  public static final String KEY_TU4 = "tu4".intern();

  public static final String KEY_NAM1 = "nam1".intern();
  public static final String KEY_NAM2 = "nam2".intern();
  public static final String KEY_NAM3 = "nam3".intern();
  public static final String KEY_NAM4 = "nam4".intern();
  public static final String KEY_NAM5 = "nam5".intern();
  public static final String KEY_NAM6 = "nam6".intern();

  public static final String KEY_SAU1 = "sau1".intern();
  public static final String KEY_SAU2 = "sau2".intern();
  public static final String KEY_SAU3 = "sau3".intern();

  public static final String KEY_BAY1 = "bay1".intern();;  
  public static final String KEY_BAY2 = "bay2".intern();;
  public static final String KEY_BAY3 = "bay3".intern();;
  public static final String KEY_BAY4 = "bay4".intern();;

  private long[] capsochuara = new long [100];

  private long[] capsodara = new long [27];

  private long[] tongso = new long[100];

  /**
   * o day the hien dac tinh tien ich cua map giup ta linh hoat hon trong viec su dung data 
   * theo kieu cap gia tri : key va value. Dieu nay cung noi len su khac nhau cua Map va Set
   * Map thi gia tri khong duoc sap xep, va co cap gia tri, cho phep la neu trung` key thi se replace value
   * Set thi chi co element (phan tu) chu kg co cap gia tri, du lieu trong set thi co sap xep va khong
   * cho phep trung` nhau
   * O day anh dung LinkedHashMap vi LinkedHashMap da giup ta sap xep phan tu nao duoc add vao truoc thi 
   * xep truoc, add vao sau thi xep sau , co sap xep thu tu
   */
  private Map<Long, Integer> tempdata = new LinkedHashMap<Long, Integer>();

  /**
   * Ham khoi tao mac dinh cua doi tuong khong co tham so
   * 
   */
  public Data() { 
    taodulieu();
  }

  /**
   * ham khoi tao cua doi tuong co tham so 
   * @param type
   */
  public Data(String type) { 
    taodulieu();
    datatype_ = type; 
  }
  /**
   * day cung la ham khoi tao doi tuong co tham so
   * 2 ham nay the hien tinh overloading trong java, 2 ham giong nhau co cung so luong tham so
   * nhung kieu du lieu tham so khac nhau thi cai dat hoac goi cac ham khac nhau
   * @param capsodara
   */
  public Data(long[] capsodara) { 
    taodulieu();
    this.capsodara = capsodara; 
  }
  
  /**
   * day cung la ham khoi tao doi tuong co tham so
   * 2 ham nay the hien tinh overloading trong java, 2 ham giong nhau nhung khac 
   * nhau ve so luong tham so thi cai dat thuc thi khac nhau
   * @param capsodara
   */
  public Data(long[] capsodara, long[] tongso) { 
    this.tongso = tongso;
    this.capsodara = capsodara; 
  }

  public long[] taodulieu() {

    for (int i =0 ; i < tongso.length ; i++ ) {
      tongso[i] = i ;
      tempdata.put(new Long(i), 0);
    }
    return tongso ;
  }

  public void setTongso(long[] tongso) {
    this.tongso = tongso;
  }

  public long[] getTongso() {
    return tongso;
  }

  /**
   * ham nay duoc viet rieng ra boi vi no lam 1 cong viec giong nhau va lam nhieu lan
   * chinh vi vay nen viet nhung ham hay phai dung den ra 1 ham rieng va tham so hoa 
   * len de lam viec tien ich hon nhieu
   * @param so
   * @return
   */
  private long kiemtraso(long so) {

    String st = String.valueOf(so);
    if (st.length() > 1) {
      so = Long.valueOf(st.substring(st.length()-2));

    }
    return so ;
  }

  /**
   * ban than ham nay goi rat nhieu den viec chuyen dinh dang string sang long  
   * vi the nen minh da dung lai ham kiemtraso
   * @return
   */
  public long[] tinhtoanSodara() {

    getCapsodara()[0] = kiemtraso(giaidacbiet[0]) ;

    getCapsodara()[1] = kiemtraso(giainhat[0]) ;

    getCapsodara()[2] = kiemtraso(giainhi[0]) ;
    getCapsodara()[3] = kiemtraso(giainhi[1]) ;

    getCapsodara()[4] = kiemtraso(giaiba[0]) ;
    getCapsodara()[5] = kiemtraso(giaiba[1]) ;
    getCapsodara()[6] = kiemtraso(giaiba[2]) ;
    getCapsodara()[7] = kiemtraso(giaiba[3]) ;
    getCapsodara()[8] = kiemtraso(giaiba[4]) ;
    getCapsodara()[9] = kiemtraso(giaiba[5]) ;

    getCapsodara()[10] = kiemtraso(giaitu[0]);
    getCapsodara()[11] = kiemtraso(giaitu[1]);
    getCapsodara()[12] = kiemtraso(giaitu[2]);
    getCapsodara()[13] = kiemtraso(giaitu[3]);

    getCapsodara()[14] = kiemtraso(giainam[0]);
    getCapsodara()[15] = kiemtraso(giainam[1]);
    getCapsodara()[16] = kiemtraso(giainam[2]);
    getCapsodara()[17] = kiemtraso(giainam[3]);
    getCapsodara()[18] = kiemtraso(giainam[4]);
    getCapsodara()[19] = kiemtraso(giainam[5]);

    getCapsodara()[20] = kiemtraso(giaisau[0]);
    getCapsodara()[21] = kiemtraso(giaisau[1]);
    getCapsodara()[22] = kiemtraso(giaisau[2]);

    getCapsodara()[23] = kiemtraso(giaibay[0]);
    getCapsodara()[24] = kiemtraso(giaibay[1]);
    getCapsodara()[25] = kiemtraso(giaibay[2]);
    getCapsodara()[26] = kiemtraso(giaibay[3]);

    return getCapsodara();
  }


  public long[] capnhatSodara() {

    for(long i : tongso) {
      for(long j : getCapsodara()) {
        if(i == j ) tempdata.put(i, tempdata.get(i) + 1) ;
      }

    }
    return getCapsochuara() ;
  }

  public void setCapsodara(long[] capsodara) {
    this.capsodara = capsodara;
  }

  public long[] getCapsodara() {
    return capsodara;
  }

  public void setCapsochuara(long[] capsochuara) {
    this.capsochuara = capsochuara;
  }

  public long[] getCapsochuara() {
    return capsochuara;
  }

  public void setDatatype(String datatype_) {
    this.datatype_ = datatype_;
  }

  public String getDatatype() {
    return datatype_;
  }

  public void setTempdata(Map<Long, Integer> tempdata) {
    this.tempdata = tempdata;
  }

  public Map<Long, Integer> getTempdata() {
    return tempdata;
  }

}
