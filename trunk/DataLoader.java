import java.util.Properties;

/*
 * Copyright (C) 2003-2010 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * Oct 22, 2010  
 * interface nay la viet ra de em thay duoc y nghia cua interface
 * no chi la 1 loat cac  ham dinh nghia va quy tac de bat buoc cac lop cai dat 
 * phai cai dat cac ham tuogn ung tuan theo, trong interface se dat cac doan java docs 
 * de huong dan nguoi dung khi su dung interface
 * trong interface bat buoc phai khai bao ham o dang public va khong duoc cai dat gi ben trong
 * 
 */
public interface DataLoader {
  /**
   * Ham nay de save data tren giao dien nguoi dung (UI) xuong data base
   * @param d : la doi tuong mang du lieu
   * @throws Exception : co rat nhieu loai exception co the duoc tung ra, o day chi bat chung chung
   * vi du nhu FileNotFoundException, ... 
   */
  public void saveData(Data d) throws Exception;

  
  /**
   * Ham nay de load data tu trong file xml hoac trong file access vao doi tuong Data
   * @param filepath : duong dan den file du lieu
   * @return Data : tra ve doi tuong data da co day du cac thuoc tinh nhu giai nhat giai nhi ...
   * @throws Exception
   */
  public Data loadData(String filepath) throws Exception;
  
  /**
   * Cung la 1 ham cai dat viec save data voi nhieu tham so hon
   * @param type : kieu du lieu can save co the la xml access ms sql ..
   * @param data : doi tuong data muon save xuong
   * @throws Exception
   */
  public void saveData(String type, Data data) throws Exception;
  
  /**
   * Mot ham nua cai dat viec save du lieu thong qua Properties cua system chu kg phai doi tuong data
   * @param type : kieu du lieu save xuong
   * @param props : tham so cua doi tong Properties 
   * @throws Exception
   */
  public void saveData(String type, Properties props) throws Exception ;
}
